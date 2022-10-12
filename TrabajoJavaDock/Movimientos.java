package TrabajoJavaDock;

public class Movimientos {
    private String nombre;
    private int ataque;
    private int precision;

    public Movimientos(String nombre, int ataque, int precision) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.precision = precision;
    }

    public Movimientos() {

    }


    /**
     * getters y setters
     * @return variables del nombre del ataque con sus atributos
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

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }
}
