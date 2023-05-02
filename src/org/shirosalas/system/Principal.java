package org.shirosalas.system;

/**
 *
 * @author Shiro William Salas Pérez
 * ssalas-2021311@kinal.edu.gt
 * @date 04/03/2022.
 * 
 * Código técnico IN5BV
 * Grupo: 2
 * Carnet: 2021311
 */

import javax.swing.JOptionPane;
import org.shirosalas.bean.Suma;
import org.shirosalas.bean.Resta;
import org.shirosalas.bean.Multiplicacion;
import org.shirosalas.bean.Division;

public class Principal {
    public static void main(String[] args) {
        
        byte opcion;
        double numero1 = 0;
        double numero2 = 0;
        
        do{
            //Menu de opciones
            opcion = Byte.parseByte(JOptionPane.showInputDialog(" "
            + "\t \t \t \t \t \t \t \t \t MENÚ PRINCIPAL \n"
            + "1. Suma \n"
            + "2. Resta \n"
            + "3. Multiplicacion \n"
            + "4. Division \n"
            + "5. Salir \n"
            + "\nElija una opcion: \n"));
            
            if ((opcion >=1) && (opcion <=4)){
                
                numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar primer número"));
                numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar segundo número"));    
            }
            
            switch (opcion) {
                
                //Sumar
                case 1:
                    Suma objetoSuma = new Suma();
                    objetoSuma.setNumero1(numero1);
                    objetoSuma.setNumero2(numero2);
                    double resultSuma = objetoSuma.sumar(numero1, numero2);
                    JOptionPane.showMessageDialog(null, "El resultado de la suma " + numero1 + " + " + numero2 + " es: " + resultSuma);
                    break;
                
                //Restar
                case 2:
                    Resta objetoResta = new Resta();
                    objetoResta.setNumero1(numero1);
                    objetoResta.setNumero2(numero2);
                    double resultResta = objetoResta.restar(numero1, numero2);
                    JOptionPane.showMessageDialog(null, "El resultado de la resta " + numero1 + " - " + numero2 + " es: " + resultResta);
                    break;
                
                //Multiplicar
                case 3:
                    Multiplicacion objetoMultiplicacion = new Multiplicacion();
                    objetoMultiplicacion.setNumero1(numero2);
                    objetoMultiplicacion.setNumero2(numero2);
                    double resultMultiplicacion = objetoMultiplicacion.multiplicar(numero1, numero2);
                    JOptionPane.showMessageDialog(null, "El resultado de la multiplicación " + numero1 + " * " + numero2 + " es: " + resultMultiplicacion);
                    break;
                
                //Dividir    
                case 4:
                    Division objetoDivision = new Division();
                    objetoDivision.setNumero1(numero1);
                    objetoDivision.setNumero2(numero2);
                    double resultDivision = objetoDivision.dividir(numero1, numero2);
                    JOptionPane.showMessageDialog(null, "El resultado de la división " + numero1 + " / " + numero2 + " es: " + resultDivision);
                    break;
            
            }   
        
        }while(opcion <=4);
        
    }
}
