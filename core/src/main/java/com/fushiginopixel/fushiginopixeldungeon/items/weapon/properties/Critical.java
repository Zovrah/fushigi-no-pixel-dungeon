package com.fushiginopixel.fushiginopixeldungeon.items.weapon.properties;

import com.fushiginopixel.fushiginopixeldungeon.actors.Char;
import com.fushiginopixel.fushiginopixeldungeon.actors.EffectType;
import com.fushiginopixel.fushiginopixeldungeon.effects.CellEmitter;
import com.fushiginopixel.fushiginopixeldungeon.effects.Speck;
import com.fushiginopixel.fushiginopixeldungeon.items.weapon.Weapon;
import com.fushiginopixel.fushiginopixeldungeon.sprites.ItemSprite;
import com.watabou.utils.Random;

public class Critical extends Weapon.Enchantment {

    private ItemSprite.Glowing RED = new ItemSprite.Glowing( 0xAA0000 );
    @Override
    public float proc(Weapon weapon, Char attacker, Char defender, int damage, EffectType type ) {

        int level = Math.max( 0, weapon.level() );

        if (Random.Int( level / 2 + 100 ) >= 88) {
            if(defender != null)
                CellEmitter.center(defender.pos).burst(Speck.factory(Speck.STAR), 14);
            return 1.5f;
        }
        else return 1f;
    }

    @Override
    public ItemSprite.Glowing glowing() {
        return RED;
    }
}
