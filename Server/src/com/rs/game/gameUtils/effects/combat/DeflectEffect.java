package com.rs.game.gameUtils.effects.combat;

import com.rs.game.Hit;
import com.rs.game.gameUtils.effects.Effect;
import com.rs.game.world.Animation;
import com.rs.game.world.Entity;
import com.rs.game.world.Graphics;

/**
 * Created by Peng on 3.1.2017 16:08.
 */
public class DeflectEffect extends Effect {

    private double deflectAmount;

    private Graphics graphics;
    private Animation animation;
    private Hit.HitLook[] types;

    public DeflectEffect(double deflectAmount, int graphicsId, Hit.HitLook... toDeflect) {
        this.deflectAmount = deflectAmount;
        this.types = toDeflect;
        this.graphics = new Graphics(graphicsId);
        this.animation = new Animation(12573);
    }

    @Override
    public void processIncoming(final Hit hit, Entity target) {
        if (hit.getDamage() == 0) return;
        for (Hit.HitLook type : types) {
            if (type.equals(hit.getLook())) {
                hit.getSource().applyHit(new Hit(target, (int) Math.ceil(
                        hit.getDamage() * deflectAmount), Hit.HitLook.REFLECTED_DAMAGE));
                target.setNextAnimation(animation);
                target.setNextGraphics(graphics);
            }
        }
    }

    @Override
    public int getPriority() {
        return 0;
    }
}
