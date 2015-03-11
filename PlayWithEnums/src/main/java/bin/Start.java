/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin;

import bin.items.ActionEnum;
import bin.items.Item;
import bin.items.ItemFabricEnum;
import bin.utils.*;
import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gbeljajew
 */
public class Start 
{
    public static void main(String[] args) 
    {
        File f = new File("aaa.txt");
        List<String> readAllLines=null;
        try {
            readAllLines = Files.readAllLines(f.toPath());
        } catch (IOException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
        StringBuilder sb = new StringBuilder();
        
        if(readAllLines != null)
        {
            for(String s: readAllLines)
            {
                sb.append(s);
            }

            Gson gson = new Gson();

            PrototypHolder ph = gson.fromJson(sb.toString(), PrototypHolder.class);
            System.out.println(ph.list.size());
            
            ArrayList<Item> items = new ArrayList<>();
            
            for(Prototyp p: ph.list)
            {
                ItemFabricEnum ite = ItemFabricEnum.valueOf(p.typ1);
                Item i = ite.instance(p);
                items.add(i);
            }
            
            System.out.println(items.size());
            
            for(Item i: items)
            {
                System.out.println();
                i.callName();
                List<ActionEnum> actions = i.getActions();
                
                for(ActionEnum a: actions)
                {
                    a.doIt(i);
                }
            }
            
            
            
        }
        
        
    }
}
