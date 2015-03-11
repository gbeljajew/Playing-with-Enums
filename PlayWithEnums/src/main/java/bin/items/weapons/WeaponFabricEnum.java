/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.items.weapons;

import bin.utils.Prototyp;

/**
 *
 * @author gbeljajew
 */
public enum WeaponFabricEnum 
{
    sword {

        @Override
        public Weapon instance(Prototyp p) 
        {
            Weapon erg = new Sword();
            
            for(String s: p.actions)
            {
                erg.actions.add(WeaponActionEnum.valueOf(s));
            }
            return erg;
        }
    }, gun {

        @Override
        public Weapon instance(Prototyp p) 
        {
            Weapon erg = new Gun();
            
            for(String s: p.actions)
            {
                erg.actions.add(WeaponActionEnum.valueOf(s));
            }
            return erg;
        }
    }, kalashnikow {

        @Override
        public Weapon instance(Prototyp p) 
        {
            Weapon erg = new Kalashnikow();
            
            for(String s: p.actions)
            {
                erg.actions.add(WeaponActionEnum.valueOf(s));
            }
            return erg;
        }
    }
    
    
    
    ;
    public abstract Weapon instance(Prototyp p);
}
