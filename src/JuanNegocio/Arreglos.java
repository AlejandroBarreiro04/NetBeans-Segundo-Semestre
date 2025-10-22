/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuanNegocio;

/**
 *
 * @author User
 */
public class Arreglos {
    public static void main(String[] args) {
       
        
        //Arreglo de furgonetas
        furgonetas[] Furgoneta = new furgonetas [2];
        Furgoneta [0]= new furgonetas (12,3000,"Audi");
        Furgoneta [1]= new furgonetas (14,3500,"Kia");
        System.out.println("---Precio de venta de furgonetas ---");
        for (furgonetas Furgo : Furgoneta){
            System.out.println(Furgo.marca + "  $  "+ Furgo.precioVenta);
        }
        
        //Arreglo de camiones
        camiones[] camion = new camiones [3];
         camion[0] = new camiones(120,12,3000,"Volvo");
        camion[1] = new camiones(111,11,3500,"Renault");
        camion[2] = new camiones(90,12,3200,"Kia");
        System.out.println("---Precio venta de camiones ---");
        for  (camiones array : camion ){
            System.out.println(array.marca +" $ " + array.precioVenta());
            
        }
        //Mejora del polimorfismo
        System.out.println("---Union de ambos arreglos ---");
        Vehiculo [] vehiculo = new Vehiculo [Furgoneta.length+camion.length];
        //Union de ambos arreglos
        int index = 0 ;
        for (furgonetas Furgo : Furgoneta)vehiculo[index++]=Furgo ;
        for (camiones array : camion)vehiculo [index++]=array ;
         for (Vehiculo v : vehiculo) {
            System.out.println(v.getClass().getSimpleName() + " (" + v.marca + ") → $" + v.precioVenta());
        }
    }
}
