/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.items.junk;

import bin.items.ActionEnum;
import bin.items.Item;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gbeljajew
 */
public abstract class Junk implements Item
{
    public ArrayList<ActionEnum> actions = new ArrayList<>();
    
    public void pickup()
    {
        System.out.println("error! this action can't be used!");
    }
    
    public void throwIt()
    {
        System.out.println("error! this action can't be used!");
    }
    
    public void throwAway()
    {
        System.out.println("error! this action can't be used!");
    }
    
    public void hit()
    {
        System.out.println("error! this action can't be used!");
    }

    @Override
    public List<ActionEnum> getActions()
    {
        return actions;
    }
    
    
}
