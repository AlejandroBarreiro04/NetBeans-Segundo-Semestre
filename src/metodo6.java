
import java.util.Arrays;
import java.util.Random;

/*
Crea una clase con los siguientes métodos para arrays de una dimensión y de números enteros:
1. generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y
máximo) se indica como parámetro.
2. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
3. maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
5. estaEnArrayInt: Dice si un número está o no dentro de un array.
6. posicionEnArray: Busca un número en un array y devuelve la posición (el índice) en la que se
encuentra.
7. volteaArrayInt: Le da la vuelta a un array.
8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.
9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un array.
 */

/**
 *
 * @author User
 */
public class metodo6 {
      public static int[] generaArrayInt(int n, int min, int max) {
        Random rand = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(max - min + 1) + min;
        }
        return array;
    }

    // 2. Devuelve el mínimo del array
    public static int minimoArrayInt(int[] array) {
        int min = array[0];
        for (int valor : array) {
            if (valor < min) {
                min = valor;
            }
        }
        return min;
    }

    // 3. Devuelve el máximo del array
    public static int maximoArrayInt(int[] array) {
        int max = array[0];
        for (int valor : array) {
            if (valor > max) {
                max = valor;
            }
        }
        return max;
    }

    // 4. Devuelve la media del array
    public static double mediaArrayInt(int[] array) {
        int suma = 0;
        for (int valor : array) {
            suma += valor;
        }
        return (double) suma / array.length;
    }

    // 5. Dice si un número está en el array
    public static boolean estaEnArrayInt(int[] array, int num) {
        for (int valor : array) {
            if (valor == num) {
                return true;
            }
        }
        return false;
    }

    // 6. Busca un número en el array y devuelve la posición, o -1 si no está
    public static int posicionEnArray(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }

    // 7. Le da la vuelta a un array
    public static int[] volteaArrayInt(int[] array) {
        int[] invertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - 1 - i];
        }
        return invertido;
    }

    // 8. Rota n posiciones a la derecha
    public static int[] rotaDerechaArrayInt(int[] array, int n) {
        int[] resultado = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            resultado[(i + n) % array.length] = array[i];
        }
        return resultado;
    }

    // 9. Rota n posiciones a la izquierda
    public static int[] rotaIzquierdaArrayInt(int[] array, int n) {
        int[] resultado = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            resultado[i] = array[(i + n) % array.length];
        }
        return resultado;
    }

    // Método main para probar los métodos
    public static void main(String[] args) {
        int[] miArray = generaArrayInt(10, 1, 100);
        System.out.println("Array generado: " + Arrays.toString(miArray));

        System.out.println("Mínimo: " + minimoArrayInt(miArray));
        System.out.println("Máximo: " + maximoArrayInt(miArray));
        System.out.println("Media: " + mediaArrayInt(miArray));
        System.out.println("¿Está el 50? " + estaEnArrayInt(miArray, 50));
        System.out.println("Posición del primer elemento: " + posicionEnArray(miArray, miArray[0]));
        System.out.println("Array invertido: " + Arrays.toString(volteaArrayInt(miArray)));
        System.out.println("Array rotado derecha 3: " + Arrays.toString(rotaDerechaArrayInt(miArray, 3)));
        System.out.println("Array rotado izquierda 2: " + Arrays.toString(rotaIzquierdaArrayInt(miArray, 2)));
    }
    
}
