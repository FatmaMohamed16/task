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
public class Divider implements DivideInterface{

   

    @Override
    public BigDecimal Divide(BigDecimal value ,BigDecimal Divider) {
    
  return value.divide(Divider);
    }
    
}
