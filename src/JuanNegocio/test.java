
package JuanNegocio;

/**
 *
 * @author User
 */
public class test {
    public static void main(String[] args) {
         Vehiculo vehiculo = new Vehiculo (4000, "Mazda");
         System.out.println(vehiculo.toString());
         
         coches coches1 = new coches (2,3000,"BMW");
         System.out.println(coches1.toString());
         
         furgonetas furgonetas1 = new furgonetas(12,3000,"Audi");
         System.out.println(furgonetas1.toString());
         
         camiones camiones1 = new camiones(120.5,12,3000,"Audi");
         System.out.println(camiones1.toString());
         
    }
    

}
