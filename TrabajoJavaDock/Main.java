/**
 * @author Bryan Cayetano
 */

package TrabajoJavaDock;
import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);

    /**
     * Sencillo creador de personajes con uno precreado por la máquina.
     * @see Personajes
     * @see Movimientos
     * @ver 0.1
     */

    public static void main(String[] args) {
        //ejemplo de un personaje completo creado con sus variables de ataques
        Personajes p1 = new Personajes("arturo", 32, -1, 1, 31);
        Movimientos p11 = new Movimientos("corte afilado", 5, 80);
        Movimientos p12 = new Movimientos("apuñalada", 15, 60);
        Movimientos p13 = new Movimientos("corte divino", 50, 20);
        Movimientos p14 = new Movimientos("agrietasuelos", 25, 70);


        /**
         * @return el ejemplo de los datos del personaje, mismo metodo usado en la funcion de la linea 40
         */
        System.out.println(p1.getNombre() + "\n-----------------\n" + p11.getNombre() + "\n" + p12.getNombre() + "\n" + p13.getNombre() + "\n" + p14.getNombre());

        System.out.println("¿Quieres crear un personaje? Si(1) No(2)");
        int x = 0;

        while (x < 1 || x > 2) {
            x = teclado.nextInt();
        }

        if (x == 1) {
            Personajes.crearPersonaje();
        }

    }

}
