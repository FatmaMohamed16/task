/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

import java.math.BigDecimal;



public class Multiplier implements Multiplyinterface{

    @Override
    public BigDecimal multiply(BigDecimal value ,BigDecimal multiplicand) {
       
        if(value==null||multiplicand==null)
         return null;
     
     return value.multiply(multiplicand);
       
        
       
       
       
        
    }
    
}
