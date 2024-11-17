package co.edu.uniquindio.poo;

/*
     * Clase sedan
 */
public class Sedan extends Vehiculo implements IVehiculoCombustible {

    /*
     * Atributos de la clase
     */
    public int pasajeros, puerta, bolsaAire, capacidadMaletero, dias;
    public boolean aireAcondicionado, camaraReversa, siAbs, siSensorColicion, siSensorTraficoCruzado, siAsistentePermanenciaCarril;
    public static int COSTO_ALQUILER = 85000;

    /**
     * Constructor con los atributos de la clase padre y propios
     *
     * @param aireAcondicionado
     * @param bolsaAire
     * @param camaraReversa
     * @param capacidadMaletero
     * @param dias
     * @param pasajeros
     * @param puerta
     * @param siAbs
     * @param siAsistentePermanenciaCarril
     * @param siSensorColicion
     * @param siSensorTraficoCruzado
     * @param cajaCambio
     * @param cilindraje
     * @param marca
     * @param matricula
     * @param modelo
     * @param nuevo
     * @param velocidadMaxima
     */
    public Sedan(boolean aireAcondicionado, int bolsaAire, boolean camaraReversa, int capacidadMaletero, int dias, int pasajeros, int puerta, boolean siAbs, boolean siAsistentePermanenciaCarril, boolean siSensorColicion, boolean siSensorTraficoCruzado, int cajaCambio, int cilindraje, String marca, String matricula, String modelo, boolean nuevo, int velocidadMaxima) {
        super(cajaCambio, cilindraje, marca, matricula, modelo, nuevo, velocidadMaxima);
        this.aireAcondicionado = aireAcondicionado;
        this.bolsaAire = bolsaAire;
        this.camaraReversa = camaraReversa;
        this.capacidadMaletero = capacidadMaletero;
        this.dias = dias;
        this.pasajeros = pasajeros;
        this.puerta = puerta;
        this.siAbs = siAbs;
        this.siAsistentePermanenciaCarril = siAsistentePermanenciaCarril;
        this.siSensorColicion = siSensorColicion;
        this.siSensorTraficoCruzado = siSensorTraficoCruzado;
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
    public int getPuerta() {
        return puerta;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setPuerta(int puerta) {
        this.puerta = puerta;
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
    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
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
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public boolean isSiAbs() {
        return siAbs;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setSiAbs(boolean siAbs) {
        this.siAbs = siAbs;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public boolean isSiSensorColicion() {
        return siSensorColicion;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setSiSensorColicion(boolean siSensorColicion) {
        this.siSensorColicion = siSensorColicion;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public boolean isSiSensorTraficoCruzado() {
        return siSensorTraficoCruzado;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setSiSensorTraficoCruzado(boolean siSensorTraficoCruzado) {
        this.siSensorTraficoCruzado = siSensorTraficoCruzado;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public boolean isSiAsistentePermanenciaCarril() {
        return siAsistentePermanenciaCarril;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setSiAsistentePermanenciaCarril(boolean siAsistentePermanenciaCarril) {
        this.siAsistentePermanenciaCarril = siAsistentePermanenciaCarril;
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
     * Metodo para andar
     */
    @Override
    public void andar() {
        System.out.println("Sedan Andando...");
    }

    /*
     * Metodo para apagar
     */
    @Override
    public void apagar() {
        System.out.println("Sedan Apagado...");
    }

    /*
     * Metood para encender
     */
    @Override
    public void encender() {
        System.out.println("Sedan Encendido...");
    }

    /*
     * Metodo para calcular costo de alguier
     */
    public static int calcularCosto(int COSTO_ALQUILER, int dias) {
        int costo = 0;
        costo = COSTO_ALQUILER * dias;
        return costo;
    }

    /*
    * Metodo de imformacion
     */
    public void informacion() {
        System.out.println("Tiene capacidad de 14 galones");
    }

    /*
     * Metodo para agregar
     */
    public void add(Sedan sedan) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*
     * Metodo para eliminar
     */
    public void remove(Sedan sedan) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
