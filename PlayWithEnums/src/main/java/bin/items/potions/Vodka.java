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
public class Vodka extends Potion
{

    @Override
    public void callName() 
    {
        System.out.println("Vodka!!!");
    }

    @Override
    public void throwaway() {
        System.out.println("NOO!!! NOT Vodka!!!");
    }

    @Override
    public void throwit() {
        System.out.println("your enemy looks drunk, you unhappy");
    }

    @Override
    public void use() {
        System.out.println("you pour some vodka on you wounds\nyou know, there are better uses for vodka");
    }

    @Override
    public void breakit() {
        System.out.println("YOU MONSTER!!!");
    }

    @Override
    public void drink() {
        System.out.println("you are drunk");
    }
    
}
