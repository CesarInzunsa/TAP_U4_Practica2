/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cesar
 */
public class Pizza {
    //Pizza: Nombre del producto, tamaño, precio, existencia.
    String nombrePizza;
    int tamaño;
    float precio;
    int existencia;
    
    public Pizza(String nombrePizza, int tamaño, float precio, int existencia){
        this.nombrePizza = nombrePizza;
        this.tamaño = tamaño;
        this.precio = precio;
        this.existencia = existencia;
    }
    
    public Pizza(){}
    
}
