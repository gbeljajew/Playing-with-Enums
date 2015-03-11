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
public class Molotow extends Potion
{

    @Override
    public void callName() 
    {
        System.out.println("Molotow");
    }

    @Override
    public void throwaway() {
        System.out.println("nice idea, but wrong direction");
    }

    @Override
    public void throwit() {
        System.out.println("burn! burn!!");
    }

    @Override
    public void use() {
        System.out.println("you pouring Molotow all over you... where is my lighter");
    }

    @Override
    public void breakit() {
        System.out.println("ash to ash, dust to dust");
    }

    @Override
    public void drink() {
        System.out.println("it tastes like oil");
    }
    
    
    
}
