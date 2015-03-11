/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.items.weapons;

import bin.items.ActionEnum;
import bin.items.Item;
import java.util.*;

/**
 *
 * @author gbeljajew
 */
public abstract class Weapon implements Item
{
    public ArrayList<ActionEnum>actions = new ArrayList<>();
    @Override
    public List<ActionEnum> getActions()
    {
        return actions;
    }
    
    public void equip()
    {
        System.out.println("you can't equip it");
    }
    
    public void slash()
    {
        System.out.println("you can't slash with it");
    }
    
    public void shoot()
    {
        System.out.println("you can't shoot with it");
    }
    
    public void clean()
    {
        System.out.println("you can't clean it");
    }
    
    public void sharpen()
    {
        System.out.println("you can't sharpen it");
    }
    
    
    
}
