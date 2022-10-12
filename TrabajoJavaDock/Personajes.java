package TrabajoJavaDock;

import static TrabajoJavaDock.Main.teclado;

public class Personajes {

    private String nombre;
    private int ataque;
    private int defensa;
    private int velocidad;
    private int inteligencia;


    public Personajes(String nombre, int ataque, int defensa, int velocidad, int inteligencia) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.inteligencia = inteligencia;
    }

    /**
     * getters y setters
     * @return variables del personaje, sin los movimientos
     * @see Movimientos
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public static void crearPersonaje() {
        System.out.println("Nombre:" + "\n");
        String nombre = teclado.next();
        System.out.println("Ataque:" + "\n");
        int ataque = teclado.nextInt();
        System.out.println("Defensa:" + "\n");
        int defensa = teclado.nextInt();
        System.out.println("Velocidad:" + "\n");
        int velocidad = teclado.nextInt();
        System.out.println("Inteligencia:" + "\n");
        int inteligencia = teclado.nextInt();
        System.out.println("\n");

        Personajes p2 = new Personajes(nombre, ataque, defensa, velocidad, inteligencia);
        System.out.println(p2.getNombre() + "\n-----------------\n" + p2.getNombre() + "\n"
                + p2.getAtaque() + "\n" + p2.getDefensa() + "\n" + p2.getVelocidad() + "\n" + p2.getInteligencia());

    }
}
