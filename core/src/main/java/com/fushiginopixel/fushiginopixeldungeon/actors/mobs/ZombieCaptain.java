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

package com.fushiginopixel.fushiginopixeldungeon.actors.mobs;

import com.fushiginopixel.fushiginopixeldungeon.actors.Char;
import com.fushiginopixel.fushiginopixeldungeon.sprites.ZombieCaptainSprite;
import com.fushiginopixel.fushiginopixeldungeon.sprites.ZombieSprite;
import com.watabou.utils.Random;

public class ZombieCaptain extends Zombie {

	{
		spriteClass = ZombieCaptainSprite.class;
		
		HP = HT = 300;
		defenseSkill = 34;

		EXP = 22;
	}
	
	@Override
	public int damageRoll() {
		return Random.NormalIntRange( 40, 80 );
	}
	
	@Override
	public int attackSkill( Char target ) {
		return 75;
	}
	
	@Override
	public int drRoll() {
		return Random.NormalIntRange(2, 20);
	}
}
