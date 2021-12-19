/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

import java.math.BigDecimal;

/**
 *
 * @author NoteBook
 */
public class DividerAdapter implements resultex {
    DivideInterface divideInterface;
     Multiplyinterface multiplyinterface;

     public DividerAdapter(String Type)
     {
         if(Type.equalsIgnoreCase("multiply"))
         {
             multiplyinterface=new Multiplier();
         }
         else if(Type.equalsIgnoreCase("divid"))
         {
             divideInterface =new Divider();
         }
                 
     }
     
    @Override
    public void expression(String type, String ex) {
        if(type.equalsIgnoreCase("multiply"))
        {
         multiplyinterface.multiply(BigDecimal.ONE, BigDecimal.TEN);
        }
        else if(type.equalsIgnoreCase("divid"))
        {
         divideInterface.Divide(BigDecimal.ONE, BigDecimal.ZERO);
        }
    }
    
}
