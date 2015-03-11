/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.items.junk;

import bin.items.ActionEnum;
import bin.items.Item;

/**
 *
 * @author gbeljajew
 */
public enum JunkActionEnum implements ActionEnum
{
    pickup{
        @Override
        public void doIt(Junk j) 
        {
            j.pickup();
        }

        @Override
        public void doIt(Item it) 
        {
            if(it instanceof Junk)
                this.doIt((Junk)it);
            else
                System.out.println("ERROR");
        }
    },
    
     throwit{
        @Override
        public void doIt(Junk j) 
        {
            j.throwIt();
        }

        @Override
        public void doIt(Item it) 
        {
            if(it instanceof Junk)
                this.doIt((Junk)it);
            else
                System.out.println("ERROR");
        }
    },
     
      throwaway{
        @Override
        public void doIt(Junk j) 
        {
            j.throwAway();
        }

        @Override
        public void doIt(Item it) 
        {
            if(it instanceof Junk)
                this.doIt((Junk)it);
            else
                System.out.println("ERROR");
        }
    },
      
       hit{
        @Override
        public void doIt(Junk j) 
        {
            j.hit();
        }

        @Override
        public void doIt(Item it) 
        {
            if(it instanceof Junk)
                this.doIt((Junk)it);
            else
                System.out.println("ERROR");
        }
    };
       

    @Override
    public abstract void doIt(Item it);
    abstract public void doIt(Junk j);
}
