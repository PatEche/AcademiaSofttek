package ClaseSeis;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        //Instanciamos la clase y creamos el objeto
        Operacion op = new Operacion();

        op.leerNumero();
        op.suma();
        op.resta();
        op.multiplicacion();
        op.division();
        op.mostrarResultado();
        
        JOptionPane.showMessageDialog(null, "Gracias por utilizar la calculadora Java");
    }

}
