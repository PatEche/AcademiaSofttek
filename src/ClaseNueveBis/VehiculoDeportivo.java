package ClaseNueveBis;

public class VehiculoDeportivo extends Vehiculo {

    private int cilindrada;

    public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;

    }

    public String mostrarDatos() {
        return "VEHICULO DEPORTIVO " + "\nMatricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo + "\nCilindrada: " +
                cilindrada;
    }
    
}
