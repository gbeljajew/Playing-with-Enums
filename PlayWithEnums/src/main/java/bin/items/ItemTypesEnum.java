/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.items;

import bin.items.junk.JunkTypesEnum;
import bin.items.potions.PotionTypeEnum;
import bin.items.weapons.WeaponTypeEnum;
import bin.utils.Prototyp;

/**
 *
 * @author gbeljajew
 */
public enum ItemTypesEnum 
{
    
    junk{

        @Override
        public Item instance(Prototyp p) 
        {
            JunkTypesEnum e = JunkTypesEnum.valueOf(p.typ2);
            
            return e.instance(p);
        }
        
    },
    weapon{

        @Override
        public Item instance(Prototyp p) 
        {
            WeaponTypeEnum e = WeaponTypeEnum.valueOf(p.typ2);
            
            return e.instance(p);
        }
        
    },
    potion{

        @Override
        public Item instance(Prototyp p) 
        {
            PotionTypeEnum e = PotionTypeEnum.valueOf(p.typ2);
            
            return e.instance(p);
        }
        
    };
    
    ;
    public abstract Item instance(Prototyp p);
}
