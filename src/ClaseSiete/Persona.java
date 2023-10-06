package ClaseSiete;

public class Persona {

    //Atributos    
    String nombre;
    int edad;

    //Metodo Constructor, 
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    public void mostrarDatos() {
        System.out.println("El nombre es:" + nombre);
        System.out.println("Edad:" + edad);
    }

}
