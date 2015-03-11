/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.items.junk;

/**
 *
 * @author gbeljajew
 */
public class Pipe extends Junk
{
    
    
    @Override
    public void callName() 
    {
        System.out.println("Pipe");
    }

    @Override
    public void hit() {
        System.out.println(" hit with Pipe");
    }

    @Override
    public void throwAway() {
        System.out.println("throw Pipe away");
    }

    @Override
    public void throwIt() {
        System.out.println("throw Pipe");
    }

    @Override
    public void pickup() {
        System.out.println("picked up Pipe");
    }

    
    
}
