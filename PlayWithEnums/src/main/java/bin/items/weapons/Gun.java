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
public class Gun extends Weapon
{

    @Override
    public void callName() 
    {
        System.out.println("Gun");
    }

    @Override
    public void clean() {
        System.out.println("you clean your gun");
    }

    @Override
    public void shoot() {
        System.out.println("shoot your enemies");
    }

    @Override
    public void equip() {
        System.out.println("you equip your gun");
    }
    
}
