/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.items.potions;

import bin.items.ActionEnum;
import bin.items.Item;

/**
 *
 * @author gbeljajew
 */
public enum PotionActionEnum implements ActionEnum
{
    drink {

        @Override
        public void doIt(Potion p) 
        {
            p.drink();
        }
    },
    breakit {

        @Override
        public void doIt(Potion p) 
        {
            p.breakit();
        }
    },
    use {

        @Override
        public void doIt(Potion p) 
        {
            p.use();
        }
    }, 
    throwit {

        @Override
        public void doIt(Potion p) 
        {
            p.throwit();
        }
    }, 
    throwaway {

        @Override
        public void doIt(Potion p) 
        {
            p.throwaway();
        }
    }
    
    
    ;
    
    public abstract void doIt(Potion p);
        
        
    @Override
    public void doIt(Item it) 
    {
        if(it instanceof Potion)
            this.doIt((Potion)it);
        else
            System.out.println("ERROR");
    }
        
    
}
