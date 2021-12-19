/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author NoteBook
 */
public class otherEX implements resultex{

   DividerAdapter dividerAdapter;
    @Override
    public void expression(String type,String ex) {
        if(type.equalsIgnoreCase("addition"))
        {
            System.out.println(" this is the addition operation "+ex);
            
        }
        else if(type.equalsIgnoreCase("multiply")||type.equalsIgnoreCase("divider"))
        {
           dividerAdapter= new DividerAdapter(type);
           dividerAdapter.expression(type, ex);
        }
           else
        {
            System.out.println("invalid"+type);
        }
    }
    
}
