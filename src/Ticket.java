/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cesar
 */
public class Ticket {
    //Ticket: Numero de orden, nombre del producto, cantidad del producto,
    int numOrden;
    String productos;
    int cantidadProductos;
    
    public Ticket(int numOrden, String producto, int cantidadProductos){
        this.numOrden = numOrden;
        this.productos = producto;
        this.cantidadProductos = cantidadProductos;
    }
    
    public Ticket(){}
    
}
