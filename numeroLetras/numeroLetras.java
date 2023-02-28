package numeroLetras;

import javax.swing.JOptionPane;

public class numeroLetras {
    public static void main(String[] args) {
        
        // Declaración de variables:
        int numero;
        
        // Entrada 
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecciona un número del 1 al 9 para saber como se lee:\n\n1.\n2.\n3.\n4.\n5.\n6.\n7.\n 8.\n 9.\n "));

        switch(numero){
            case 1:
               
                JOptionPane.showMessageDialog(null, numero + " se lee Uno");
                break;

            case 2:
                
                JOptionPane.showMessageDialog(null, numero + " se lee Dos");    
                break;

            case 3:
                
                JOptionPane.showMessageDialog(null, numero + " se lee Tres");
                break;

            case 4:
                
                JOptionPane.showMessageDialog(null, numero +  " se lee Cuatro");
                break;

            case 5:
                
                JOptionPane.showMessageDialog(null, numero + " se lee Cinco");
                break;

            case 6:

                JOptionPane.showMessageDialog(null, numero + " se lee Seis");
                break;

            case 7: 

                JOptionPane.showMessageDialog(null, numero + " se lee Siete");
                break;

            case 8:

                JOptionPane.showMessageDialog(null, numero + " se lee Ocho");
                break;

            case 9:

                JOptionPane.showMessageDialog(null, numero + " se lee Nueve");
                break;
            
            default:
                
                JOptionPane.showMessageDialog(null, "Debe ser un número entre 1 y 9");
                break;
        }       


    }
    
}
