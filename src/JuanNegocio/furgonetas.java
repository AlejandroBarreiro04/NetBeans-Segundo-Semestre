/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuanNegocio;

/**
 *
 * @author User
 */
public class furgonetas extends Vehiculo {
     private double capacidadDeCarga;

    public furgonetas(double capacidadDeCarga, double precioCompra, String marca) {
        super(precioCompra, marca);
        this.capacidadDeCarga = capacidadDeCarga;
        this.precioVenta = precioVenta ();
    }

  
    public double getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(double capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    @Override
    public String toString() {
        return "furgonetas{" + "   capacidadDeCarga=" + capacidadDeCarga + "    Precio de compra = " + precioCompra +  "  Marca = " + marca +  " , y por ultimo tenemos el precio final que es = "+ precioVenta + '}';
    }

    @Override
    public double precioVenta() {
        //Si la capacidad de carga es superior a 10 toneladas, el valor del precio aumentara
        
        if (capacidadDeCarga > 10){
            return this.precioCompra*1.60+600; //600 es el 20 % de 3000
            
        }
        return precioVenta;
        }

   
    
    
    }

   
     
   
    
