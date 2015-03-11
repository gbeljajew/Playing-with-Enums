/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.items.weapons;

import bin.items.ActionEnum;
import bin.items.Item;

/**
 *
 * @author gbeljajew
 */
public enum WeaponActionEnum implements ActionEnum
{
    equip {

        @Override
        public void doIt(Weapon w) 
        {
            w.equip();
        }
    }, 
    slash {

        @Override
        public void doIt(Weapon w) 
        {
            w.slash();
        }
    }, 
    shoot {

        @Override
        public void doIt(Weapon w) 
        {
            w.shoot();
        }
    }, 
    clean {

        @Override
        public void doIt(Weapon w) 
        {
            w.clean();
        }
    }, 
    sharpen {

        @Override
        public void doIt(Weapon w) 
        {
            w.sharpen();
        }
    }
    ;

    @Override
    public void doIt(Item it) 
    {
        
        if(it instanceof Weapon)
            this.doIt((Weapon)it);
        else
            System.out.println("ERROR");
    }
    
    public abstract void doIt(Weapon w);
    
}
