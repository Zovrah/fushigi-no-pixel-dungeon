/*
 * Pixel Dungeon
 * Copyright (C) 2012-2015 Oleg Dolya
 *
 * Shattered Pixel Dungeon
 * Copyright (C) 2014-2018 Evan Debenham
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.fushiginopixel.fushiginopixeldungeon.items.weapon.melee;

import com.fushiginopixel.fushiginopixeldungeon.actors.Char;
import com.fushiginopixel.fushiginopixeldungeon.actors.hero.Hero;
import com.fushiginopixel.fushiginopixeldungeon.actors.mobs.Mob;
import com.fushiginopixel.fushiginopixeldungeon.items.weapon.properties.Assassination;
import com.fushiginopixel.fushiginopixeldungeon.sprites.ItemSpriteSheet;
import com.watabou.utils.Random;

import java.util.ArrayList;

public class Dagger extends MeleeWeapon {
	
	{
		image = ItemSpriteSheet.DAGGER;

		tier = 1;
		
		//bones = false;
		LIMIT = 4;

		properties = new ArrayList<Enchantment>(){
			{
				add(new Assassination());
			}
		};
	}

	@Override
	public int max(int lvl) {
		return  9 +    //8 base, down from 10
				lvl*UPGRADE_ATTACK;   //scaling unchanged
	}
	
	/*
	@Override
	public int damageRoll(Char owner) {
		if (owner instanceof Hero) {
			Hero hero = (Hero)owner;
			Char enemy = hero.enemy();
			if (enemy instanceof Mob && ((Mob) enemy).surprisedBy(hero)) {
				//deals 75% toward max to max on surprise, instead of min to max.
				int diff = max() - min();
				int damage = augment.damageFactor(Random.NormalIntRange(
						min() + Math.round(diff*0.75f),
						max()));
				int exStr = hero.STR() - STRReq();
				if (exStr > 0) {
					damage += Random.IntRange(0, exStr);
				}
				return damage;
			}
		}
		return super.damageRoll(owner);
	}*/

}
