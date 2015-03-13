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
 *this is medium level abstract class
 * all low level classes have to extend this class
 * 
 * it works like an adapter class: it implements all methods im minimal form 
 * and overrides one of methods needet for Item interface
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
