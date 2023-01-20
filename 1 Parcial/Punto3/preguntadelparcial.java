
import java.util.Scanner;

import javax.swing.JOptionPane;
public class preguntadelparcial {
    int  numero;
    int posicion;
    public int getnumero() {
        return numero;
      }
    
      public int getposicion() {
        return posicion;
      
      }
    /**
     * @param args
     */
    public static void main(String[] args) {
        int N[]= new int[5];
        int posicion;
    
        for(int i=0; i<4;i++){

            N[i]= (int) (Math.random() * 10);
            //JOptionPane.showMessageDialog(null, "["+N[i]+"]\t");      
    }

        JOptionPane.showMessageDialog(null, "["+N[0]+"]    " + "["+N[1]+"]    " + "["+N[2]+"]    " + "["+N[3]+"]    " + "["+N[4]+"]    ");

      
        posicion =Integer.parseInt(JOptionPane.showInputDialog(" Ingrese la posicion a modificar"));
    if( posicion>=5){
    JOptionPane.showMessageDialog(null,"esa posicion no existe");

    }
    else{
        for(int i=posicion; i<N.length;i++){
            
        }
        N[posicion-1]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el nuevo valor de la posicion que elegiste ["+ posicion +"]"));
    }
    JOptionPane.showMessageDialog(null, "["+N[0]+"]    " + "["+N[1]+"]    " + "["+N[2]+"]    " + "["+N[3]+"]    " + "["+N[4]+"]    ");
  }
}
    
    

