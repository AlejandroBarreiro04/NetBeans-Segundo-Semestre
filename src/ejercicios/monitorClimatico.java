
/**
Una estación meteorológica en Huila registra temperaturas diarias durante una semana. Se requiere desarrollar una clase que permita no solo almacenar y analizar estos datos, sino también detectar patrones, anomalías y realizar simulaciones de rotación climática.
Crea una clase llamada MonitorClimatico con los siguientes métodos:
Métodos de análisis:
generarTemperaturas(int min, int max): Genera un array de 7 temperaturas aleatorias entre los valores mínimo y máximo.
temperaturaMinima(int[] temperaturas): Devuelve la temperatura más baja registrada.
temperaturaMaxima(int[] temperaturas): Devuelve la temperatura más alta registrada.
mediaTemperaturas(int[] temperaturas): Calcula la temperatura promedio de la semana.
desviacionEstandar(int[] temperaturas): Calcula la desviación estándar de las temperaturas (para detectar variabilidad).
hayTemperatura(int[] temperaturas, int valor): Indica si una temperatura específica fue registrada.
diaDeTemperatura(int[] temperaturas, int valor): Devuelve el índice del día en que se registró una temperatura específica (0 = lunes, 6 = domingo).
Métodos de transformación:
invertirTemperaturas(int[] temperaturas): Invierte el orden de las temperaturas (de domingo a lunes).
rotarTemperaturasDerecha(int[] temperaturas, int n): Rota las temperaturas n días hacia la derecha.
rotarTemperaturasIzquierda(int[] temperaturas, int n): Rota las temperaturas n días hacia la izquierda.
Métodos de interpretación:
clasificarTemperaturas(int[] temperaturas): Devuelve un array de etiquetas ("Frío", "Templado", "Caliente") según rangos definidos:
Frío: < 18°C
Templado: 18°C–25°C
Caliente: > 25°C
detectarAnomalias(int[] temperaturas): Devuelve un array con los días que tienen temperaturas que se desvían más de 1.5 veces la desviación estándar respecto a la media.

 */
package ejercicios;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @author u20251230039
 */
    public class monitorClimatico {
     public static void main(String[] args) {
        int [] arreglo =  generarTemperaturas (45,0,7);
        muestraArray (arreglo);                
    }
     public static int [] generarTemperaturas (int max, int min, int t){
          int [] arreglo = new int[t];
          for (int i = 0; i < arreglo.length; i++){
              arreglo[i] = (int)(Math.random()*(max-min))+min;
          }
          return arreglo;  
     }   
   public static int  temperaturaMinima (int [] arreglo){
       int  min = arreglo [0];
       for (int num : arreglo){
           if (num < min){
               min = num;
           }   
       }
       return min;
   }   
    public static int  temperaturaMaxima (int [] arreglo){
       int  max = arreglo [0];
       for (int num : arreglo){
           if (num > max){
               max = num;
           }
           }            
     return max;
}
    public static double temperaturaMedia (int [] arreglo){
        int suma = 0;
        double total;
        for (int num : arreglo){
            suma += num;
        }
        total = suma /arreglo.length;
        return (double)suma / arreglo.length;
    }
    public static double desviacionEstandar ( int [] arreglo){
        double suma = 0;
        for ( int  num : arreglo){
            suma += num;      
        }
        double total = suma / arreglo.length;
        double sumaCuadrados = 0;
        for (int num : arreglo){
            sumaCuadrados += Math.pow(num - total, 2);           
        }
         return Math.sqrt(sumaCuadrados / arreglo.length);
    }   
   public static void hayTemperatura(int[] arreglo) {
        Random rand = new Random();
        int num = rand.nextInt(((45 - 0)+1) + 0);
        boolean hay = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (num == arreglo[i]) {
                hay = true;
            }
        }
        if (hay) {
            System.out.println("el numero: " + num + " si esta en el arreglo");
        } else {
            System.out.println("el numero: " + num + " no esta en el arreglo");
        }
   }
   public static void diaDeTemperatura (int[] arreglo){
        Random rand = new Random();
        int posicion = rand.nextInt(arreglo.length);
        int temperatura = arreglo[posicion];
        String [] semana = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
        String posiciondia = semana[posicion];
        
        System.out.println("la temperatura: "+temperatura+" esta en la posicion "+posicion+" que es el dia "+posiciondia);
    }
   public static int[] invertirTemperaturas(int[] arreglo){
        int [] alreves = new int[arreglo.length];
        for (int i=0; i<arreglo.length;i++){
        alreves[i] = arreglo[arreglo.length - 1 - i];
    }
        return alreves;
    }
   public static int [] rotarTemperaturasDerecha(int[] arreglo){
         Random rand = new Random();
         int n = rand.nextInt(arreglo.length)+1;
        int[] resultado = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            int nuevaPos = (i + n) % arreglo.length;
            resultado[nuevaPos] = arreglo [i];
        }
        return resultado;
    }
   public static int [] rotarTemperaturasIzquida(int[] arreglo){
         Random rand = new Random();
         int n = rand.nextInt(arreglo.length)+1;
         System.out.println("Se roto hacia la derecha "+  n  + "posiciones");
        int[] resultado = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            int nuevaPos = (i - n) % arreglo.length;
            resultado[nuevaPos] = arreglo[i];
        }

        return resultado;
    }
   public static int [] rotarTemperaturasIzquierda(int[] arreglo){
         Random rand = new Random();
         int n = rand.nextInt(arreglo.length)+1;
         System.out.println("se roto a la izquierda "+n+ " posiciones");
        int[] resultado = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            int nuevaPos = (i - n + arreglo.length) % arreglo.length;
            resultado[nuevaPos] = arreglo[i];
        }

        return resultado;
    }
   public static String[] clasificarTemperaturas(int[] arreglo) {
    String[] etiquetas = new String[arreglo.length];

    for (int i = 0; i < arreglo.length; i++) {
        if (arreglo[i] < 18) {
            etiquetas[i] = "Frío";
        } else if (arreglo[i] <= 25) {
            etiquetas[i] = "Templado";
        } else {
            etiquetas[i] = "Caliente";
        }
    }
    

    return etiquetas;
}
   public static String[] detectarAnomalias(int[] arreglo) {
    String[] semana = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
    double media = temperaturaMedia(arreglo);
    double sumaCuadrados = 0;
    for (int t : arreglo) {
        sumaCuadrados += Math.pow(t - media, 2);
    }
    double desviacionEstandar = Math.sqrt(sumaCuadrados / arreglo.length);
    double umbral = 1.5 * desviacionEstandar;
    ArrayList<String> diasAnomalos = new ArrayList<>();
    for (int i = 0; i < arreglo.length; i++) {
        if (Math.abs(arreglo[i] - media) > umbral) {
            diasAnomalos.add(semana[i] + " (" + arreglo[i] + "°C)");
        }
    }
    return diasAnomalos.toArray(new String[0]);
}
      public static void muestraArray (int [] arreglo){
         System.out.println("temperaturas :  "+Arrays.toString(arreglo));
         System.out.println(" temperatura min :  "+temperaturaMinima(arreglo)+"°");
         System.out.println(" temperatura max :  "+temperaturaMaxima(arreglo)+"°");
          System.out.println(" temperatura media :  "+temperaturaMedia(arreglo)+"°");
          System.out.println(" la desviacion estandar:   " +desviacionEstandar(arreglo)+"°");
          hayTemperatura (arreglo);
         diaDeTemperatura ( arreglo);
          System.out.println("Las temperaturas invetidas van a ser  :"+Arrays.toString(invertirTemperaturas(arreglo)));
          System.out.println("Las temperaturas movidas hacia la derecha quedaran asi :  "+Arrays.toString(rotarTemperaturasDerecha(arreglo))); 
           System.out.println("Las temperaturas movidas hacia la izquierda quedaran asi :  "+Arrays.toString(rotarTemperaturasIzquierda(arreglo)));
          System.out.println("La clasificacion de temperaturas son : "+Arrays.toString(clasificarTemperaturas(arreglo)));
          System.out.println("Los dias con anomalias fueron  : "+Arrays.toString(detectarAnomalias(arreglo)));
     }
}

