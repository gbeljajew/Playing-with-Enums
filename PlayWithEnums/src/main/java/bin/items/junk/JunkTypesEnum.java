/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.items.junk;

import bin.utils.Prototyp;

/**
 *
 * @author gbeljajew
 */
public enum JunkTypesEnum 
{
    stone{
        @Override
        public Junk instance(Prototyp p) 
        {
            Junk erg = new Stone();
            
            for(String s: p.actions)
            {
                erg.actions.add(JunkAction.valueOf(s));
            }
            return erg;
        }
    },
    pipe{
        @Override
        public Junk instance(Prototyp p) 
        {
            Junk erg = new Pipe();
            
            for(String s: p.actions)
            {
                erg.actions.add(JunkAction.valueOf(s));
            }
            return erg;
        }
    }
    ;
    
    public abstract Junk instance(Prototyp p);
}
