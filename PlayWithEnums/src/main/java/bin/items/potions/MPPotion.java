/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.items.potions;

/**
 *
 * @author gbeljajew
 */
public class MPPotion extends Potion
{

    @Override
    public void callName() 
    {
        System.out.println("Mana Potion");
    }

    @Override
    public void throwaway() {
        System.out.println("don't throw away your potions, baka");
    }

    @Override
    public void throwit() {
        System.out.println("your enemy looks refreshed, nice, but stupid");
    }

    

    @Override
    public void breakit() {
        System.out.println("don't break your potions, baka");
    }

    @Override
    public void drink() {
        System.out.println("Energised");
    }
    
    
}
