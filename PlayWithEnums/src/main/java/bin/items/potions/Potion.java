/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.items.potions;

import bin.items.*;
import java.util.*;

/**
 *
 * @author gbeljajew
 */
public abstract class Potion implements Item
{
    public ArrayList<ActionEnum> actions = new ArrayList<>();
    
    public void drink()
    {
        System.out.println("ERROR! you can't drink it!");
    }
    
    public void breakit()
    {
        System.out.println("ERROR! you can't break it!");
    }
    
    public void use()
    {
        System.out.println("ERROR! you can't use it!");
    }
    
    public void throwit()
    {
        System.out.println("ERROR! you can't throw it!");
    }
    
    public void throwaway()
    {
        System.out.println("ERROR! you can't throw it away!");
    }
    
    
    @Override
    public List<ActionEnum> getActions()
    {
        return actions;
    }
    
}
