package ClaseNueveBis;

public class Vehiculo {

    //Protected hace que pueda ser accedido por los hijos de esta misma 
    protected String matricula;
    protected String marca;
    protected String modelo;

    //Declaramos el metodo Constructor
    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    //Obtenemos los atributos mediante Getters
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String mostrarDatos() {
        return "VEHICULO" + "\nMatricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo;
    }

}
