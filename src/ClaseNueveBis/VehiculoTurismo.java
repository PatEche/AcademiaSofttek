package ClaseNueveBis;

public class VehiculoTurismo extends Vehiculo {

    private final int nPuertas;

    public VehiculoTurismo(int nPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }

    public int getNPuertas() {
        return nPuertas;
    }

    public String mostrarDatos() {
        return "VEHICULO TURISMO" + "\nMatricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo + "\nCantidad Puertas: " + nPuertas;
    }
}
