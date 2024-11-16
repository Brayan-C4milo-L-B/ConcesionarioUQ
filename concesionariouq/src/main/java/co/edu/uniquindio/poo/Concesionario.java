package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

/*
     * Clase principal donde se crean elementos nuevos para el concesionario
 */
public class Concesionario {

    /*
     * Atributo de la clase principal y conexion con las demas clases para crear listas de estas
     */
    public String nombre;
    public Collection<Cliente> clientes;
    public Collection<Administrador> administradores;
    public Collection<Empleado> empleados;
    public Collection<Bus> buses;
    public Collection<Camion> camiones;
    public Collection<Camioneta> camionetas;
    public Collection<Deportivo> deportivos;
    public Collection<Moto> motos;
    public Collection<PickUp> pickUps;
    public Collection<Sedan> sedans;
    public Collection<Van> vans;
    public Collection<Vehiculo> vehiculos;
    public Collection<Transaccion> transacciones;
    public Collection<MotoElectrica> motoElectricas;
    public Collection<MotoHibrida> motoHibridas;

    /**
     * Constructor con los atributos de la clase principal y sus listas
     *
     * @param nombre
     * @param clientes
     * @param administradores
     * @param empleados
     * @param buses
     * @param camiones
     * @param camionetas
     * @param deportivos
     * @param motos
     * @param pickUps
     * @param sedans
     * @param vans
     * @param vehiculos
     * @param transacciones
     */
    public Concesionario(String nombre, Collection<Cliente> clientes, Collection<Administrador> administradores,
            Collection<Empleado> empleados, Collection<Bus> buses, Collection<Camion> camiones,
            Collection<Camioneta> camionetas, Collection<Deportivo> deportivos, Collection<Moto> motos,
            Collection<PickUp> pickUps, Collection<Sedan> sedans, Collection<Van> vans, Collection<Vehiculo> vehiculos,
            Collection<Transaccion> transacciones, Collection<MotoElectrica> motoElectricas, Collection<MotoHibrida> motoHibridas) {
        this.nombre = nombre;
        clientes = new LinkedList<>();
        administradores = new LinkedList<>();
        empleados = new LinkedList<>();
        camiones = new LinkedList<>();
        camionetas = new LinkedList<>();
        motos = new LinkedList<>();
        sedans = new LinkedList<>();
        pickUps = new LinkedList<>();
        vans = new LinkedList<>();
        deportivos = new LinkedList<>();
        buses = new LinkedList<>();
        transacciones = new LinkedList<>();
        motoElectricas = new LinkedList<>();
        motoHibridas = new LinkedList<>();

    }

    /*Get
    * Metodo para obtener un dato
     */
    public Collection<MotoHibrida> getMotoHibridas() {
        return motoHibridas;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setMotoHibridas(Collection<MotoHibrida> motoHibridas) {
        this.motoHibridas = motoHibridas;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setMotos(Collection<Moto> motos) {
        this.motos = motos;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public Collection<MotoElectrica> getMotoElectricas() {
        return motoElectricas;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setMotoElectricas(Collection<MotoElectrica> motoElectricas) {
        this.motoElectricas = motoElectricas;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public String getNombre() {
        return nombre;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public Collection<Cliente> getClientes() {
        return clientes;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public Collection<Administrador> getAdministradores() {
        return administradores;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setAdministradores(Collection<Administrador> administradores) {
        this.administradores = administradores;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public Collection<Empleado> getEmpleados() {
        return empleados;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setEmpleados(Collection<Empleado> empleados) {
        this.empleados = empleados;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public Collection<Bus> getBuses() {
        return buses;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setBuses(Collection<Bus> buses) {
        this.buses = buses;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public Collection<Camion> getCamiones() {
        return camiones;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setCamiones(Collection<Camion> camiones) {
        this.camiones = camiones;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public Collection<Camioneta> getCamionetas() {
        return camionetas;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setCamionetas(Collection<Camioneta> camionetas) {
        this.camionetas = camionetas;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public Collection<Deportivo> getDeportivos() {
        return deportivos;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setDeportivos(Collection<Deportivo> deportivos) {
        this.deportivos = deportivos;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public Collection<Moto> getMotos() {
        return motos;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setMoto(Collection<Moto> motos) {
        this.motos = motos;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public Collection<PickUp> getPickUps() {
        return pickUps;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setPickUps(Collection<PickUp> pickUps) {
        this.pickUps = pickUps;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public Collection<Sedan> getSedans() {
        return sedans;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setSedans(Collection<Sedan> sedans) {
        this.sedans = sedans;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public Collection<Van> getVans() {
        return vans;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setVans(Collection<Van> vans) {
        this.vans = vans;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public Collection<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setVehiculos(Collection<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public Collection<Transaccion> getTransacciones() {
        return transacciones;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setTransacciones(Collection<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    /*
     * Metodo para verificar si exite ya un camion con la misma matricula
     */
    public boolean verificarCamioneta(String matricula) {
        boolean centinela = false;
        for (Camioneta camioneta : camionetas) {
            if (camioneta.getMatricula().equals(matricula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * Metodo para agregar un nuevo camioneta
     */
    public void agregarCamioneta(Camioneta camioneta) {
        if (!verificarCamioneta(camioneta.getMatricula())) {
            camioneta.add(camioneta);
        }
    }

    /*
     * Metodo para eliminar los datos de un camioneta en caso de ser vendido
     */
    public void eliminarCamioneta(String matricula) {
        for (Camioneta camioneta : camionetas) {
            if (camioneta.getMatricula().equals(matricula)) {
                camioneta.remove(camioneta);
                break;

            }
        }
    }

    /*
     * Metodo para verificar si exite ya una camioneta con la misma matricula
     */
    public boolean verificarCamion(String matricula) {
        boolean centinela = false;
        for (Camion camion : camiones) {
            if (camion.getMatricula().equals(matricula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * Metodo para agregar una nueva camioneta
     */
    public void agregarCamion(Camion camion) {
        if (!verificarCamion(camion.getMatricula())) {
            camion.add(camion);
        }
    }

    /*
     * Metodo para eliminar los datos de una camioneta en caso de ser vendido
     */
    public void eliminarCamion(String matricula) {
        for (Camion camion : camiones) {
            if (camion.getMatricula().equals(matricula)) {
                camion.remove(camion);
                break;

            }
        }
    }

    /*
     * Metodo para verificar si exite ya una moto con la misma matricula
     */
    public boolean verificarMoto(String matricula) {
        boolean centinela = false;
        for (Moto moto : motos) {
            if (moto.getMatricula().equals(matricula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * Metodo para agregar una nueva moto
     */
    public void agregarMoto(Moto moto) {
        if (!verificarMoto(moto.getMatricula())) {
            moto.add(moto);
        }
    }

    /*
     * Metodo para eliminar los datos de una moto en caso de ser vendida
     */
    public void eliminarMoto(String matricula) {
        for (Moto moto : motos) {
            if (moto.getMatricula().equals(matricula)) {
                moto.remove(moto);
                break;

            }
        }
    }

    /*
     * Metodo para verificar si exite ya un bus con la misma matricula
     */
    public boolean verificarBus(String matricula) {
        boolean centinela = false;
        for (Bus bus : buses) {
            if (bus.getMatricula().equals(matricula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * Metodo para agregar un nuevo bus
     */
    public void agregarBus(Bus bus) {
        if (!verificarBus(bus.getMatricula())) {
            bus.add(bus);
        }
    }

    /*
     * Metodo para eliminar los datos de un bus en caso de ser vendido
     */
    public void eliminarBus(String matricula) {
        for (Bus bus : buses) {
            if (bus.getMatricula().equals(matricula)) {
                bus.remove(bus);
                break;

            }
        }
    }

    /*
     * Metodo para verificar si exite ya un deportivo con la misma matricula
     */
    public boolean verificarDeportivo(String matricula) {
        boolean centinela = false;
        for (Deportivo deportivo : deportivos) {
            if (deportivo.getMatricula().equals(matricula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * Metodo para agregar un nuevo deportivo
     */
    public void agregarDeportivo(Deportivo deportivo) {
        if (!verificarDeportivo(deportivo.getMatricula())) {
            deportivo.add(deportivo);
        }
    }

    /*
     * Metodo para eliminar los datos de un deportivo en caso de ser vendido
     */
    public void eliminarDeportivo(String matricula) {
        for (Deportivo deportivo : deportivos) {
            if (deportivo.getMatricula().equals(matricula)) {
                deportivo.remove(deportivo);
                break;

            }
        }
    }

    /*
     * Metodo para verificar si exite ya un pickup con la misma matricula
     */
    public boolean verificarPickUp(String matricula) {
        boolean centinela = false;
        for (PickUp pickup : pickUps) {
            if (pickup.getMatricula().equals(matricula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * Metodo para agregar un nuevo pickup
     */
    public void agregarPickUp(PickUp pickUp) {
        if (!verificarPickUp(pickUp.getMatricula())) {
            pickUp.add(pickUp);
        }
    }

    /*
     * Metodo para eliminar los datos de un pickup en caso de ser vendida
     */
    public void eliminarPïckUp(String matricula) {
        for (PickUp pickup : pickUps) {
            if (pickup.getMatricula().equals(matricula)) {
                pickup.remove(pickup);
                break;

            }
        }
    }

    /*
     * Metodo para verificar si exite ya un sedan con la misma matricula
     */
    public boolean verificarSedan(String matricula) {
        boolean centinela = false;
        for (Sedan sedan : sedans) {
            if (sedan.getMatricula().equals(matricula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * Metodo para agregar un nuevo sedan
     */
    public void agregarSedan(Sedan sedan) {
        if (!verificarSedan(sedan.getMatricula())) {
            sedan.add(sedan);
        }
    }

    /*
     * Metodo para eliminar los datos de un sedan en caso de ser vendida
     */
    public void eliminarSedan(String matricula) {
        for (Sedan sedan : sedans) {
            if (sedan.getMatricula().equals(matricula)) {
                sedan.remove(sedan);
                break;

            }
        }
    }

    /*
     * Metodo para verificar si exite ya un empleado
     */
    public boolean verificarEmpleado(String idEmpleado) {
        boolean centinela = false;
        for (Empleado empleado : empleados) {
            if (empleado.getIdEmpleado().equals(idEmpleado)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * Metodo para agregar un nuevo empleado
     */
    public void agregarEmpleado(Empleado empleado) {
        if (!verificarEmpleado(empleado.getIdEmpleado())) {
            empleado.add(empleado);
        }
    }

    /*
     * Metodo para eliminar los datos de un empleado en caso de ser despedido
     */
    public void eliminarEmpleado(String idEmpleado) {
        for (Empleado empleado : empleados) {
            if (empleado.getIdEmpleado().equals(idEmpleado)) {
                empleado.remove(empleado);
                break;

            }
        }
    }

    /*
     * Metodo para verificar si exite ya un administrador con ese id
     */
    public boolean verificarAdministrador(String idEmpleado) {
        boolean centinela = false;
        for (Administrador administrador : administradores) {
            if (administrador.getIdEmpleado().equals(idEmpleado)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * Metodo para agregar un nuevo administrador
     */
    public void agregarAdministrador(Administrador administrador) {
        if (!verificarAdministrador(administrador.getIdEmpleado())) {
            administrador.add(administrador);
        }
    }

    /*
     * Metodo para eliminar los datos de un administrador en caso de ser despedido
     */
    public void eliminarAdministrador(String idEmpleado) {
        for (Administrador administrador : administradores) {
            if (administrador.getIdEmpleado().equals(idEmpleado)) {
                administrador.remove(administrador);
                break;

            }
        }
    }

    /*
     * Metodo para verificar si exite ya un cliente
     */
    public boolean verificarCliente(String cedula) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * Metodo para agregar un nuevo cliente
     */
    public void agregarCliente(Cliente cliente) {
        if (!verificarCliente(cliente.getCedula())) {
            cliente.add(cliente);
        }
    }

    /*
     * Metodo para eliminar los datos de un cliente en caso de finalizar el convenio
     */
    public void eliminarCliente(String cedula) {
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                cliente.remove(cliente);
                break;

            }
        }
    }

    /*
     * Metodo para verificar si exite ya una moto electrica con la misma matricula
     */
    public boolean verificarMotoElectrica(String matricula) {
        boolean centinela = false;
        for (MotoElectrica motoElectrica : motoElectricas) {
            if (motoElectrica.getMatricula().equals(matricula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * Metodo para agregar una nueva moto electrica
     */
    public void agregarMotoElectrica(MotoElectrica motoElectrica) {
        if (!verificarMotoElectrica(motoElectrica.getMatricula())) {
            motoElectrica.add(motoElectrica);
        }
    }

    /*
     * Metodo para eliminar los datos de una moto electrica en caso de ser vendida
     */
    public void eliminarMotoElectrica(String matricula) {
        for (MotoElectrica motoElectrica : motoElectricas) {
            if (motoElectrica.getMatricula().equals(matricula)) {
                motoElectrica.remove(motoElectrica);
                break;

            }
        }
    }

    /*
     * Metodo para verificar si exite ya una moto hibrida
     */
    public boolean verificarMotoHibrida(String matricula) {
        boolean centinela = false;
        for (MotoHibrida motoHibrida : motoHibridas) {
            if (motoHibrida.getMatricula().equals(matricula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * Metodo para agregar una nueva moto hibrida
     */
    public void agregarMotoHibrida(MotoHibrida motoHibrida) {
        if (!verificarMotoHibrida(motoHibrida.getMatricula())) {
            motoHibrida.add(motoHibrida);
        }
    }

    /*
     * Metodo para eliminar los datos de una moto hibrida en caso de ser vendida
     */
    public void eliminarMotoHibrida(String matricula) {
        for (MotoHibrida motoHibrida : motoHibridas) {
            if (motoHibrida.getMatricula().equals(matricula)) {
                motoHibrida.remove(motoHibrida);
                break;

            }
        }
    }

    /*
     * Metodo para verificar si exite ya una van con la misma matricula
     */
    public boolean verificarVan(String matricula) {
        boolean centinela = false;
        for (Van van : vans) {
            if (van.getMatricula().equals(matricula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * Metodo para agregar un nuevo sedan
     */
    public void agregarVan(Van van) {
        if (!verificarVan(van.getMatricula())) {
            van.add(van);
        }
    }

    /*
     * Metodo para eliminar los datos de un sedan en caso de ser vendida
     */
    public void eliminarVan(String matricula) {
        for (Van van : vans) {
            if (van.getMatricula().equals(matricula)) {
                van.remove(van);
                break;

            }
        }
    }

}
