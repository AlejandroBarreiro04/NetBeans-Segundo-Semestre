/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuanNegocio;

/**
 *
 * @author User
 */
public class coches extends Vehiculo{
    int puertas;

    public coches(int puertas, double precioCompra, String marca) {
        super(precioCompra, marca);
        this.puertas = puertas;
        this.precioVenta = precioVenta ();
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "coches{" + "puertas=" + puertas +  " , Precio compra = "   + precioCompra   + "  , Marca =" + marca + "     , y el precio final seria = " +precioVenta +'}';
    }

   
 
   
}
