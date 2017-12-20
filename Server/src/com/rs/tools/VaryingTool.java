package com.rs.tools;

import com.google.gson.reflect.TypeToken;
import com.rs.cache.Cache;
import com.rs.game.player.content.skills.summoning.PouchData;
import com.rs.game.player.content.skills.summoning.SpecialAttack;
import com.rs.utils.IdSearch;
import com.rs.utils.files.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Peng on 5.1.2017 17:51.
 */
public class VaryingTool {

    private static Scanner input = new Scanner(System.in);

    private static ArrayList<String> results = new ArrayList<>();

    private static class SummoningData {

        int npcId, life, summoningCost, level, pouchId, scrollId, charmId, shardAmount, specialAmount;
        double summonExp, creationExp, scrollExp;

        int[] tertiaryIds;

        boolean aggressive;
        String pouchDataName, specialName, specialDescription;
        SpecialAttack specialAttack;

        SummoningData() {
            npcId = -1;
            life = -1;
            summonExp = 0;
            summoningCost = 0;
            aggressive = true;
            pouchDataName = "null";
            specialAttack = SpecialAttack.NONE;
            specialName = "null";
            specialDescription = "null";
            specialAmount = 1;
            level = 1;
            pouchId = -1;
            scrollId = -1;
            charmId = -1;
            shardAmount = 0;
        }

        void setScrollExp(double scrollExp) {
            this.scrollExp = scrollExp;
        }

        void setNpcId(int npcId) {
            this.npcId = npcId;
        }

        void setLife(int life) {
            this.life = life;
        }

        void setSummoningCost(int summoningCost) {
            this.summoningCost = summoningCost;
        }

        void setLevel(int level) {
            this.level = level;
        }

        void setPouchId(int pouchId) {
            this.pouchId = pouchId;
        }

        void setScrollId(int scrollId) {
            this.scrollId = scrollId;
        }

        void setCharmId(int charmId) {
            this.charmId = charmId;
        }

        void setShardAmount(int shardAmount) {
            this.shardAmount = shardAmount;
        }

        void setSpecialAmount(int specialAmount) {
            this.specialAmount = specialAmount;
        }

        void setSummonExp(double summonExp) {
            this.summonExp = summonExp;
        }

        void setAggressive(boolean aggressive) {
            this.aggressive = aggressive;
        }

        void setPouchDataName(String pouchDataName) {
            this.pouchDataName = pouchDataName;
        }

        void setSpecialName(String specialName) {
            this.specialName = specialName;
        }

        void setSpecialDescription(String specialDescription) {
            this.specialDescription = specialDescription;
        }

        void setSpecialAttack(SpecialAttack specialAttack) {
            this.specialAttack = specialAttack;
        }

        public void setCreationExp(double creationExp) {
            this.creationExp = creationExp;
        }

        public void setTertiaryIds(int[] tertiaryIds) {
            this.tertiaryIds = tertiaryIds;
        }

        public int getNpcId() {
            return npcId;
        }

        public int getLife() {
            return life;
        }

        public int getSummoningCost() {
            return summoningCost;
        }

        public int getLevel() {
            return level;
        }

        public int getPouchId() {
            return pouchId;
        }

        public int getScrollId() {
            return scrollId;
        }

        public int getCharmId() {
            return charmId;
        }

        public int getShardAmount() {
            return shardAmount;
        }

        public int getSpecialAmount() {
            return specialAmount;
        }

        public double getSummonExp() {
            return summonExp;
        }

        public double getCreationExp() {
            return creationExp;
        }

        public double getScrollExp() {
            return scrollExp;
        }

        public int[] getTertiaryIds() {
            return tertiaryIds;
        }

        public boolean isAggressive() {
            return aggressive;
        }

        public String getPouchDataName() {
            return pouchDataName;
        }

        public String getSpecialName() {
            return specialName;
        }

        public String getSpecialDescription() {
            return specialDescription;
        }

        public SpecialAttack getSpecialAttack() {
            return specialAttack;
        }
    }

    private static HashMap<String, SummoningData> dataMap = new HashMap<>();

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        dataMap = (HashMap<String, SummoningData>) JSONParser.load("data/summoningTemp.json", new
                TypeToken<HashMap<String, SummoningData>>() {
        }.getType());
        try {
            Cache.init();
        } catch (Exception e) {
            e.printStackTrace();
        }
        SummoningData data;
        for (String name : dataMap.keySet()) {
            if (!name.toUpperCase().equals(name)) continue;
            data = dataMap.get(name);
            System.out.println(name + "(" + data.getNpcId() + "," + data.getLife() + "," + data.getSummonExp() + ","
                               + data.getSummoningCost() + "," + data.aggressive + ",PouchData."
                               + PouchData.forPouchId(data.pouchId) + ",SpecialAttack.NONE ,\"" + data.specialName
                               + "\",\"" + data.specialDescription + "\"," + data.specialAmount + "),");
        }
        JSONParser.save(dataMap, "data/summoningTemp.json", new TypeToken<HashMap<String, SummoningData>>() {
        }.getType());
    }

    //int npcId, int life, double summoningExp, int summonCost, boolean aggressive, PouchData pouchData,
//SpecialAttack specialAttack, String specialName, String specialDescription, int specialAmount
    private static void parseRsWikiPointCosts() throws IOException {
        Document document = Jsoup.connect("http://runescape.wikia.com/wiki/Familiar").get();
        Element familiarTable = document.select(".wikitable").get(0);
        for (Element row : familiarTable.select("tr")) {
            if (row.toString().contains("Combat Level")) continue;
            parseRsWikiPointCost(row);
        }
    }

    private static void parseRsWikiPointCost(Element row) {
        System.out.println(row.toString());
        Elements cells = row.select("td");
        int pointsCost = Integer.parseInt(cells.get(4).text());
        String name = cells.get(3).text().toUpperCase().replace(" ", "_").replace("-", "_");
        if (dataMap.containsKey(name)) dataMap.get(name).setSummoningCost(pointsCost);
    }

    private static void addDefaultValues() {
        SummoningData summoningData;
        for (PouchData data : PouchData.values()) {
            dataMap.putIfAbsent(data.name(), new SummoningData());
            summoningData = dataMap.get(data.name());
            summoningData.setLevel(data.getLevel());
            summoningData.setPouchId(data.getPouchId());
            summoningData.setScrollId(data.getScrollId());
            summoningData.setCharmId(data.getCharmId());
            summoningData.setShardAmount(data.getShardAmount());
            summoningData.setTertiaryIds(data.getTertiaryIds());
            summoningData.setCreationExp(data.getCreationExp());
            summoningData.setPouchDataName(data.name());
        }
    }

    private static void parseRuneHqScrolls() throws IOException {
        Document document = Jsoup.connect("http://www.runehq.com/skill/summoning").get();
        Element familiarTable = document.getElementById("summoningscrolls").parent().nextElementSibling()
                .nextElementSibling();
        Elements rows = familiarTable.select("tr");
        for (Element row : rows) {
            if (row.toString().toLowerCase().contains("scroll name")) continue;
            parseRuneHqRowScroll(row);
        }
    }

    private static void parseRuneHqRowScroll(Element row) {
        Elements cells = row.select("td");
        String scrollName = cells.get(0).text();
        String npcName = cells.get(2).text().toUpperCase().replace(" ", "_").replace("-", "_");
        int scrollId = selectId(scrollName.toLowerCase());
        String specialDescription = cells.get(4).text();
        int specialAmount = Integer.parseInt(cells.get(5).text());
        double scrollExp = Double.parseDouble(cells.get(6).text());
        SummoningData data;
        dataMap.putIfAbsent(npcName, new SummoningData());
        data = dataMap.get(npcName);
        data.setScrollId(scrollId);
        data.setSpecialDescription(specialDescription);
        data.setScrollExp(scrollExp);
        data.setSpecialAmount(specialAmount);
        data.setSpecialName(scrollName);
        dataMap.put(scrollName, data);
    }

    private static void parseRuneHq() throws IOException {
        Document document = Jsoup.connect("http://www.runehq.com/skill/summoning#summoningpouches").get();
        Element familiarTable = document.getElementById("summoningfamiliars").parent().nextElementSibling();
        Elements rows = familiarTable.select("tr");
        for (Element row : rows) {
            if (row.toString().toLowerCase().contains("familiar name")) continue;
            parseRuneHqRow(row);
        }
    }

    private static void parseRuneHqRow(Element row) {
        Elements cells = row.select("td");
        String name = cells.get(0).text();
        int npcId = selectNpcId(name.toLowerCase());
        name = name.toUpperCase().replace(" ", "_").replace("-", "_");
        int life = Integer.parseInt(cells.get(2).text());
        double summonExp = Double.parseDouble(cells.get(3).text());
        boolean aggressive = cells.get(4).text().toLowerCase().contains("combat");
        SummoningData data;
        dataMap.putIfAbsent(name, new SummoningData());
        data = dataMap.get(name);
        data.setLife(life);
        data.setSummonExp(summonExp);
        data.setAggressive(aggressive);
        data.setNpcId(npcId);
        data.setPouchDataName(name.toUpperCase().replaceAll(" ", "_").replaceAll("-", "_"));
        dataMap.put(name, data);
    }

    private static int selectNpcId(String keyWord) {
        ArrayList<String> items = IdSearch.searchForNpc(keyWord, false, 500, null);
        int id;
        if (items.size() == 1) id = Integer.parseInt(items.get(0).substring(
                items.get(0).indexOf("(") + "(Id: ".length(), items.get(0).length() - 1));
        else if (items.size() == 2) {
            id = Integer.parseInt(items.get(1).substring(
                    items.get(1).indexOf("(") + "(Id: ".length(), items.get(1).length() - 1));
        } else if (items.size() == 0) id = -1;
        else {
            for (String item : items) {
                System.out.println(item);
            }
            System.out.println("Enter id for " + keyWord + ": ");
            id = input.nextInt();
        }
        return id;
    }

    private static int selectId(String keyWord) {
        ArrayList<String> items = IdSearch.searchForItem(keyWord, false, 500, null);

        int id;
        if (items.size() == 1 || items.size() == 2 && items.get(1).contains("noted"))
            id = Integer.parseInt(items.get(0).substring(
                    items.get(0).indexOf("(") + "(Id: ".length(), items.get(0).length() - 1));
        else if (items.size() == 0) id = -1;
        else {
            for (String item : items) {
                System.out.println(item);
            }
            System.out.println("Enter id for " + keyWord + ": ");
            id = input.nextInt();
        }
        return id;
    }
    //int npcId, int life, double summonExp, int summonCost, boolean aggressive, PouchData pouchData,SpecialAttack
    // specialAttack, String specialName, String specialDescription, int specialAmount
}
