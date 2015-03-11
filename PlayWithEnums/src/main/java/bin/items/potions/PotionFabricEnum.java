/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.items.potions;

import bin.utils.Prototyp;

/**
 *
 * @author gbeljajew
 */
public enum PotionFabricEnum 
{
    hp {

        @Override
        public Potion instance(Prototyp p) 
        {
            Potion erg = new HPPotion();
            
            for(String s: p.actions)
            {
                erg.actions.add(PotionActionEnum.valueOf(s));
            }
            return erg;
        }
    }, mp {

        @Override
        public Potion instance(Prototyp p) 
        {
            Potion erg = new MPPotion();
            
            for(String s: p.actions)
            {
                erg.actions.add(PotionActionEnum.valueOf(s));
            }
            return erg;
        }
    }, vodka {

        @Override
        public Potion instance(Prototyp p) 
        {
            Potion erg = new Vodka();
            
            for(String s: p.actions)
            {
                erg.actions.add(PotionActionEnum.valueOf(s));
            }
            return erg;
        }
    }, molotow {

        @Override
        public Potion instance(Prototyp p) 
        {
            Potion erg = new Molotow();
            
            for(String s: p.actions)
            {
                erg.actions.add(PotionActionEnum.valueOf(s));
            }
            return erg;
        }
    }
    
    
    
    ;
    public abstract Potion instance(Prototyp p);
    
}
