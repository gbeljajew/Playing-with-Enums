/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.items.weapons;

/**
 *
 * @author gbeljajew
 */
public class Sword extends Weapon
{

    @Override
    public void callName() 
    {
        System.out.println("Sword");
    }

    @Override
    public void sharpen() {
        System.out.println("you sharpen your sword");
    }

    @Override
    public void slash() {
        System.out.println("slash your enemies");
    }

    @Override
    public void equip() {
        System.out.println("equip sword");
    }
    
}
