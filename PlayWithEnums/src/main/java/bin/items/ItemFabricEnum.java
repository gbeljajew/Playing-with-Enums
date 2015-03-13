/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.items;

import bin.items.junk.JunkFabricEnum;
import bin.items.potions.PotionFabricEnum;
import bin.items.weapons.WeaponFabricEnum;
import bin.utils.Prototyp;

/**
 *this Enum contains all top level selections
 * each of its values makes then medium level selection in corresponding package and delegates creating instance to it
 * @author gbeljajew
 */
public enum ItemFabricEnum 
{
    
    junk{

        @Override
        public Item instance(Prototyp p) 
        {
            JunkFabricEnum e = JunkFabricEnum.valueOf(p.typ2);
            
            return e.instance(p);
        }
        
    },
    weapon{

        @Override
        public Item instance(Prototyp p) 
        {
            WeaponFabricEnum e = WeaponFabricEnum.valueOf(p.typ2);
            
            return e.instance(p);
        }
        
    },
    potion{

        @Override
        public Item instance(Prototyp p) 
        {
            PotionFabricEnum e = PotionFabricEnum.valueOf(p.typ2);
            
            return e.instance(p);
        }
        
    };
    
    ;
    public abstract Item instance(Prototyp p);
}
