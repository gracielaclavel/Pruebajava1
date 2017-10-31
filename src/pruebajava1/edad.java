/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava1;
import javax.swing.JOptionPane;
/********************************************************************************
 *Graciela  Clavel 
 * @author lp12
 *Fecha: Octubre 30 de  2017
 * Preograma: pruebajava1
 * Responsabilidad: trabajando con edad
 * *******************************************************************************/


public class edad
{
    public static void main(String[] args){
        String nombre;
        int edad;
      
    nombre = (JOptionPane.showInputDialog("Ingrese su nombre")) ;
    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
      
       JOptionPane.showMessageDialog(null,"Bienvenido," +(nombre));
       
        JOptionPane.showMessageDialog(null," dentro  de 20 años usted tendra..."+(edad+20));
      
          
  }
 
          
      }




    
   



