/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author LENOVO
 */
public class TipoSuv {
    protected String marca;
    protected double preciobase;
    protected double seguroporcentaje;
    
    
    public void establecerMarca(String x){
        marca = x;
    }
    
    public void establecerPrecioBase(double x){
        preciobase = x;
    }
    
    public void establecerSeguroPorcentaje(double x){
        seguroporcentaje = x;
    }
    
    
    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPreciobase() {
        return preciobase;
    }

    public double obtenerSeguroporcentaje() {
        return seguroporcentaje;
    }
}
