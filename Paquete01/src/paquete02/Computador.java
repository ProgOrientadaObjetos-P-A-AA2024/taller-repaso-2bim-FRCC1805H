/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author LENOVO
 */
public abstract class Computador {
    protected String nombre;
    protected String cedula;
    protected double preciofinal;
    
    public void establecerNombre(String x){
        nombre = x;
    }
    
    public void establecerCedula(String x){
        cedula = x;
    }
    
    public abstract void calcularPrecioFinal();
}
