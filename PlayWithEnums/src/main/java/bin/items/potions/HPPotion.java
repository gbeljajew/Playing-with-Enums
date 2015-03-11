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
public class HPPotion extends Potion
{

    @Override
    public void callName() 
    {
        System.out.println("Healing Potion");
    }

    @Override
    public void throwaway() {
        System.out.println("why are you throwing your potions away, baka");
    }

    @Override
    public void throwit() {
        System.out.println("healing your enemies? interesting tactic, baka");
    }

    @Override
    public void use() {
        System.out.println("threating your wound with healing potion: not so effective, but quick and direct");
    }

    @Override
    public void breakit() {
        System.out.println("why are you breaking your potions, baka");
    }

    @Override
    public void drink() {
        System.out.println("Healing!");
    }
    
    
    
    
}
