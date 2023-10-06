package ClaseSeis;

import javax.swing.JOptionPane;

public class Operacion {

    // Atributos
    int numero1;
    int numero2;

    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Metodo para pedirle al usuario que nos dijite dos numeros
    public void leerNumero() {

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));

    }

    //Metodo suma
    public void suma() {
        suma = numero1 + numero2;

    }
    //Metodo resta
    public void resta() {
        resta = numero1 - numero2;
    }
    
    //Metodo multiplicacion
    public void multiplicacion() {
        multiplicacion = numero1 * numero2;
    }
    
    //Metodo division
    public void division() {
        division = numero1 / numero2;
    }
    
    //Metodo mostrarResultado
    public void mostrarResultado() {
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la division es: " + division);
        
        
        

    }

}
