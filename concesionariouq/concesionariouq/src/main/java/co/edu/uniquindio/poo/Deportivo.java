package co.edu.uniquindio.poo;

/*
* Clase deportivo
 */
public class Deportivo extends Vehiculo implements IVehiculoCombustible {

    /*
    * Atributos de la clase
     */
    public int caballosFuerza, dias, pasajeros, bolsaAire, puertas;
    public String datos, propiedades;
    public static int COSTO_ALQUILER = 100000;

    /**
     * Constructor con los atributos de la clase padre y propios
     *
     * @param bolsaAire
     * @param caballosFuerza
     * @param datos
     * @param dias
     * @param pasajeros
     * @param propiedades
     * @param puertas
     * @param cajaCambio
     * @param cilindraje
     * @param marca
     * @param matricula
     * @param modelo
     * @param nuevo
     * @param velocidadMaxima
     */
    public Deportivo(int bolsaAire, int caballosFuerza, String datos, int dias, int pasajeros, String propiedades, int puertas, int cajaCambio, int cilindraje, String marca, String matricula, String modelo, boolean nuevo, int velocidadMaxima) {
        super(cajaCambio, cilindraje, marca, matricula, modelo, nuevo, velocidadMaxima);
        this.bolsaAire = bolsaAire;
        this.caballosFuerza = caballosFuerza;
        this.datos = datos;
        this.dias = dias;
        this.pasajeros = pasajeros;
        this.propiedades = propiedades;
        this.puertas = puertas;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public int getDias() {
        return dias;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setDias(int dias) {
        this.dias = dias;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public int getPasajeros() {
        return pasajeros;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public int getBolsaAire() {
        return bolsaAire;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setBolsaAire(int bolsaAire) {
        this.bolsaAire = bolsaAire;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public int getPuertas() {
        return puertas;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public String getDatos() {
        return datos;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setDatos(String datos) {
        this.datos = datos;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public String getPropiedades() {
        return propiedades;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setPropiedades(String propiedades) {
        this.propiedades = propiedades;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public static int getCOSTO_ALQUILER() {
        return COSTO_ALQUILER;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public static void setCOSTO_ALQUILER(int cOSTO_ALQUILER) {
        COSTO_ALQUILER = cOSTO_ALQUILER;
    }

    /*
    * Constructor con el toString
     */
    @Override
    public String toString() {
        return "Deportivo [velocidadMaxima=" + velocidadMaxima + ", cilindraje=" + cilindraje + ", cajaCambio="
                + cajaCambio + ", caballosFuerza=" + caballosFuerza + ", marca=" + marca + ", dias=" + dias
                + ", pasajeros=" + pasajeros + ", modelo=" + modelo + ", matricula=" + matricula + ", bolsaAire="
                + bolsaAire + ", puertas=" + puertas + ", nuevo=" + nuevo + ", datos=" + datos + ", propiedades="
                + propiedades + "]";
    }

    /*
     * Metodo para andar
     */
    @Override
    public void andar() {
        System.out.println("Deportivo Andando...");
    }

    /*
     * Metodo para apagar
     */
    @Override
    public void apagar() {
        System.out.println("Deportivo Apagado...");
    }

    /*
     * Metood para encender
     */
    @Override
    public void encender() {
        System.out.println("Deportivo Encendido...");
    }

    /*
     * Metodo para calcular costo de alguier
     */
    public int calcularPrecio(int COSTO_ALQUILER, int dias) {
        int costo = 0;
        costo = COSTO_ALQUILER * dias;
        return costo;
    }

    /*
    * Metodo de imformacion
     */
    public void informacion() {
        System.out.println("Tiene capacidad de 11 galones");
    }

    /*
     * Metodo para agregar
     */
    public void add(Deportivo deportivo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*
     * Metodo para eliminar
     */
    public void remove(Deportivo deportivo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
