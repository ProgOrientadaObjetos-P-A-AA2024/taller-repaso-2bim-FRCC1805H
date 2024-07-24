/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import paquete02.Computador;

/**
 *
 * @author LENOVO
 */
public class TipoSedan extends Computador{
    private String marca;
    private double preciobase;
    private double porcentajefijo;
    private double porcentajedescuento;
    
    @Override
    public void calcularPrecioFinal(){
        
    }
    
    public void establecerMarca(String x){
        marca = x;
    }
    
    public void establecerPrecioBase(double x){
        preciobase = x;
    }
    
    public void establecerPorcentajeFijo(){
        
    }
    
    public void establecerPorcentajeDescuento(double x){
        porcentajedescuento = x;
    }
    
    public String obtenerMarca(){
        return marca;
    }
    
    public double obtenerPrecioBase(){
        return preciobase;
    }
    
    public double obtenerPorcentajeFijo(){
        return porcentajefijo;
    }
    
    public double obtenerPorcentajeDescuento(){
        return porcentajedescuento;
    }
}
