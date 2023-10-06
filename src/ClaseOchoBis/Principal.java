package ClaseOchoBis;

public class Principal {

    public static void main(String[] args) {

        Estudiantes estudiante = new Estudiantes("Jose", "Perez", 24,12, 9.6f);
        estudiante.mostrarDatos();

        Estudiantes estudiante2 = new Estudiantes("Fernando", "Ortiz", 30,22, 8.8f);
        estudiante2.mostrarDatos();

    }

}
