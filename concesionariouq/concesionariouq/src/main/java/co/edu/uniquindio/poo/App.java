package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {

    public static void mostrarMensaje(String mensaje) {
        System.out.println("Mensaje");
    }

    public static void main(String[] args) {

        Concesionario concesionario = new Concesionario("Concesionario UQ");

        Administrador administrador = new Administrador(null, null, null, null, null, null, null, false);

        Empleado empleado = new Empleado(null, null, null, null, null, null, null, false);

        Cliente cliente = new Cliente("Fernando", "Vallejo", "12342341", "fernando@gadsfa.co", "+57 314562143", false);

        concesionario.agregarAdministrador(administrador);

        concesionario.agregarEmpleado(empleado);

        concesionario.agregarCliente(cliente);

        Bus bus = new Bus(false, 0, false, 0, 0, 0, 0, 0, 0, false, 0, 0, null, null, null, false, 0);
        Camion camion = new Camion(false, 0, 0, 0, false, false, null, 0, 0, null, null, null, false, 0);
        Camioneta camioneta = new Camioneta(false, 0, false, 0, 0, 0, 0, false, false, false, false, false, false, 0, 0, null, null, null, false, 0);
        Deportivo deportivo = new Deportivo(0, 0, null, 0, 0, null, 0, 0, 0, null, null, null, false, 0);
        Moto moto = new Moto(0, 0, 0, null, null, null, false, 0);
        MotoElectrica motoElectrica = new MotoElectrica(0, 0, null, null, null, false, 0, 0, 0, 0);
        Sedan sedan = new Sedan(false, 0, false, 0, 0, 0, 0, false, false, false, false, 0, 0, null, null, null, false, 0);
        Van van = new Van(false, 0, false, 0, 0, 0, false, 0, 0, null, null, null, false, 0);
        PickUp pickUp = new PickUp(false, 0, false, 0, 0, 0, false, 0, 0, null, null, null, false, 0);
        MotoHibrida motoHibrida = new MotoHibrida(0, 0, null, null, null, false, 0, 0, 0, 0, 0);

        concesionario.agregarBus(bus);

        concesionario.agregarCamion(camion);

        concesionario.agregarCamioneta(camioneta);

        concesionario.agregarDeportivo(deportivo);

        concesionario.agregarMoto(moto);

        concesionario.agregarMotoElectrica(motoElectrica);

        concesionario.agregarMotoHibrida(motoHibrida);

        concesionario.agregarSedan(sedan);

        concesionario.agregarPickUp(pickUp);

        concesionario.agregarVan(van);

    }

}
