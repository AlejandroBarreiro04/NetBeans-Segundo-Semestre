/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuanNegocio;

/**
 *
 * @author User
 */
public class camiones extends Vehiculo {
     private double tamañoRemolque;
     private int numeroDeEjes;

    public camiones(double tamañoRemolque, double numeroDeEjes, double precioCompra, String marca) {
        super(precioCompra, marca);
        this.tamañoRemolque = tamañoRemolque;
        this.numeroDeEjes = (int) numeroDeEjes;
        this.precioVenta = precioVenta ();
    }

    public double getTamañoRemolque() {
        return tamañoRemolque;
    }

    public void setTamañoRemolque(double tamañoRemolque) {
        this.tamañoRemolque = tamañoRemolque;
    }

    public double getNumeroDeEjes() {
        return numeroDeEjes;
    }

    public void setNumeroDeEjes(double numeroDeEjes) {
        this.numeroDeEjes = (int) numeroDeEjes;
    }

    @Override
    public String toString() {
        return "camiones{" + "tama\u00f1oRemolque=" + tamañoRemolque + ", numeroDeEjes=" + numeroDeEjes +  "  , precio de compra = " + precioCompra + " , marca = " + marca +  " , y el precio de venta es  = " +precioVenta +'}';
    }

    @Override
    public double precioVenta() {
        return this.precioCompra*numeroDeEjes; 
    }
     
    
}
