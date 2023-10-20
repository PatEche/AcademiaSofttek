package ClaseOnce;

public class EjemploUno {

    public static void main(String[] args) {

        try {
            int resultado = 5 / 0;

            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println("Error: No puede dividir por cero");
        }

//        int edad = -5;
//
//        if (edad < 0) {
//            throw new IllegalArgumentException("La edad no puede ser negativa");
//        }

    }
}

