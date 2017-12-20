package com.rs.utils.security;

import org.pmw.tinylog.Logger;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by Peng on 13.11.2016.
 */
public class Encryption {
    private static final Random SECURE_RANDOM = new SecureRandom();
    private static final Object ALGORITHM_LOCK = new Object();

    /**
     * Decrypt rsa bytes received from client
     */
    public static byte[] decryptRsa(byte[] data, BigInteger exponent, BigInteger modulus) {
        return new BigInteger(data).modPow(exponent, modulus).toByteArray();
    }

    /**
     * Generate a random salt, this should be saved with the password hashed so that it can be used to validate
     */
    public static String getSalt() {
        byte[] salt = new byte[16];
        SECURE_RANDOM.nextBytes(salt);
        return new String(salt);
    }

    /**
     * Hash a string with sha-2
     *
     * @param password the pass, should be salted by now
     */
    public static String getSHAHash(String password) {
        MessageDigest md = null;
        StringBuilder sb = new StringBuilder();
        try {
            md = MessageDigest.getInstance("SHA-256");
            md.update(password.getBytes());
            byte byteData[] = md.digest();
            for (byte aByteData : byteData) {
                sb.append(Integer.toString((aByteData & 0xff) + 0x100, 16).substring(1));
            }
        } catch (NoSuchAlgorithmException e) {
            Logger.error("Error hashing password!");
            return null;
        }
        return sb.toString();
    }

    /**
     * Used for comparing states, do not use this for password please.
     */
    public static byte[] encryptUsingMD5(byte[] buffer) {
        // prevents concurrency problems with the algorithm
        synchronized (ALGORITHM_LOCK) {
            try {
                MessageDigest algorithm = MessageDigest.getInstance("MD5");
                algorithm.update(buffer);
                byte[] digest = algorithm.digest();
                algorithm.reset();
                return digest;
            } catch (Throwable e) {
                Logger.error(e);
            }
            return null;
        }
    }
}
