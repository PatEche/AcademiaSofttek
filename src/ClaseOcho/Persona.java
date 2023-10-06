package ClaseOcho;

//Encapsulamiento y modificadores de acceso (Setter y getter)
//Set == establecer / Getter == obtener
public class Persona {

    private int edad;
    private double altura;
    //Constante
    private final String nombre;

    public Persona(int edad, double altura, String nombre) {
        this.edad = edad;
        this.altura = altura;
        this.nombre = nombre;

    }

    //Metodo setter: establecemos edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metod getter: para obtener la edad
    public int getEdad() {
        return edad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void mostrarDatos() {
        System.out.println("Edad:" + getEdad());
        System.out.println("Altura: " + altura);
        System.out.println("Nombre: " + nombre);
    }

}
