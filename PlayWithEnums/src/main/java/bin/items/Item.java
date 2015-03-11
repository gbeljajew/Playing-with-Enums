/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin.items;

import java.util.List;

/**
 *
 * @author gbeljajew
 */
public interface Item 
{
    void callName();
    public abstract List<ActionEnum> getActions();
}
