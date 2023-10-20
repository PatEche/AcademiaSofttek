package Actividad1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        //Creamos una instancia de la clase Scanner para poder pedirle al usuario que ingrese un numero por teclado.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero para sumar:");

        //Guardamos en la variable numUno el primer numero que el usuario ingresó.
        int numUno = scanner.nextInt();

        System.out.println("Ingrese el segundo numero para sumar");

        //Guardamos en la variable numDos el segundo numero que el usuario ingresó.
        int numDos = scanner.nextInt();

        //Guardamos en la variable resultado la suma de numUno y numDos.
        int resultado = numUno + numDos;

        //Imprimimos por consola el resultado de dicha operacion.
        System.out.println("El resultado de la suma es: " + resultado);

        //Cerramos la instancia de scanner.
        scanner.close();

    }

}
