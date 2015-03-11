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
public class Kalashnikow extends Weapon
{

    @Override
    public void callName() 
    {
        System.out.println("Kalashnikow");
    }

    @Override
    public void sharpen() {
        System.out.println("you sharpen blade on your Kalashnikow");
    }

    @Override
    public void clean() {
        System.out.println("you clean your Kalashnikow");
    }

    @Override
    public void shoot() {
        System.out.println("shoot shoot SHOOT!!!");
    }

    @Override
    public void slash() {
        System.out.println("Slash, slash, slash!!!");
    }

    @Override
    public void equip() {
        System.out.println("you equip your Kalashnikow");
    }
    
}
