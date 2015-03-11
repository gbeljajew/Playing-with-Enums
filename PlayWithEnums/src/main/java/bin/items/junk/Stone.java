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
public class Stone extends Junk
{
    
    @Override
    public void callName() 
    {
        System.out.println("Stone");
    }

    @Override
    public void throwAway() {
        System.out.println("throw away Stone");
    }

    @Override
    public void throwIt() {
        System.out.println("throw Stone");
    }

    @Override
    public void pickup() {
        System.out.println("pick up Stone");
    }
    
}
