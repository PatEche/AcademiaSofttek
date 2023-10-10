package ClaseNueveBis;

public class Principal {

    public static void main(String[] args) {

        Vehiculo misVehiculos1[] = new Vehiculo[4];
        misVehiculos1[0] = new Vehiculo("ADC325", "FIAT", "MOBY");
        misVehiculos1[1] = new VehiculoDeportivo(1200, "NEU836", "FERRARI", "TESTAROSA");
        misVehiculos1[2] = new VehiculoFurgoneta(2200, "ABC342", "RENAULT", "KANGOO");
        misVehiculos1[3] = new VehiculoTurismo(5, "AFB456", "RENAULT", "MASTER");

        //Mediante un ForEach recorre mi array para poder imprimir sus datos.
        for (Vehiculo vehiculos : misVehiculos1) {
            System.out.println(vehiculos.mostrarDatos());
            System.out.println(" ");
        }

    }
}
