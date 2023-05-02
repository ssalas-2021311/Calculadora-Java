package org.shirosalas.bean;

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

public class Division {
    
    // Atributos
    private double numero1;
    private double numero2;
    private double resultado;
    
    // Constructores
    
    //Constructor nulo
    public Division(){
    }
    
    //Constructor con parámetros
    public Division(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    //Métodos Getter's and Setter's
    public double getNumero1() {
        return this.numero1;
    }
    
    public double getNumero2(){
        return this.numero2;
    }
    
    public double getResultado() {
        return this.resultado;
    }
    
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    //Métodos
    public double dividir() {
        this.resultado = this.numero1 * this.numero2;
        return this.resultado;
    }
    
    public double dividir(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = this.numero1 / this.numero2;
        return this.resultado;
    }
    
}
