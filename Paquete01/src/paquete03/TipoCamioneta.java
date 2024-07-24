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
public class TipoCamioneta extends Computador{
    private String marca;
    private double preciobase;
    private double porcentajefijo ;
    private double importacionporcentaje;
    
    
    @Override
    public void calcularPrecioFinal(){
        
    }

    public void establecerMarca(String x) {
        marca = x;
    }

    public void establecerPreciobase(double x) {
        preciobase = x;
    }

    public void establecerPorcentajefijo() {
        
    }

    public void establecerImportacionporcentaje(double x) {
        importacionporcentaje = x;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPreciobase() {
        return preciobase;
    }

    public double obtenerPorcentajefijo() {
        return porcentajefijo;
    }

    public double obtenerImportacionporcentaje() {
        return importacionporcentaje;
    }
    
        
    
}
