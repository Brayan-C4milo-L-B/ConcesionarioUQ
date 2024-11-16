package co.edu.uniquindio.poo;

/*
 * Clase camion
 */
public class Camion extends Vehiculo implements IVehiculoCombustible {

    /*
    * Atributos de la clase
     */
    public int capacidadCarga, ejes, dias;
    public String tipoCamion;
    public boolean aireAcondicionado, frenosAire, siAbs;
    public static int COSTO_ALQUILER = 80000;

    /**
     * Constructor con los atributos de la clase padre y propios
     *
     * @param aireAcondicionado
     * @param capacidadCarga
     * @param dias
     * @param ejes
     * @param frenosAire
     * @param siAbs
     * @param tipoCamion
     * @param cajaCambio
     * @param cilindraje
     * @param marca
     * @param matricula
     * @param modelo
     * @param nuevo
     * @param velocidadMaxima
     */
    public Camion(boolean aireAcondicionado, int capacidadCarga, int dias, int ejes, boolean frenosAire, boolean siAbs, String tipoCamion, int cajaCambio, int cilindraje, String marca, String matricula, String modelo, boolean nuevo, int velocidadMaxima) {
        super(cajaCambio, cilindraje, marca, matricula, modelo, nuevo, velocidadMaxima);
        this.aireAcondicionado = aireAcondicionado;
        this.capacidadCarga = capacidadCarga;
        this.dias = dias;
        this.ejes = ejes;
        this.frenosAire = frenosAire;
        this.siAbs = siAbs;
        this.tipoCamion = tipoCamion;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public int getEjes() {
        return ejes;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setEjes(int ejes) {
        this.ejes = ejes;
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
    public String getTipoCamion() {
        return tipoCamion;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
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
    public boolean isFrenosAire() {
        return frenosAire;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setFrenosAire(boolean frenosAire) {
        this.frenosAire = frenosAire;
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
        return "Camion [velocidadMaxima=" + velocidadMaxima + ", cilindraje=" + cilindraje + ", cajaCambio="
                + cajaCambio + ", capacidadCarga=" + capacidadCarga + ", ejes=" + ejes + ", marca=" + marca + ", dias="
                + dias + ", modelo=" + modelo + ", matricula=" + matricula + ", tipoCamion=" + tipoCamion + ", nuevo="
                + nuevo + ", aireAcondicionado=" + aireAcondicionado + ", frenosAire=" + frenosAire + ", siAbs=" + siAbs
                + "]";
    }

    /*
     * Metodo para andar
     */
    @Override
    public void andar() {
        System.out.println("Camion Andando...");
    }

    /*
     * Metodo para apagar
     */
    @Override
    public void apagar() {
        System.out.println("Camion Apagado...");
    }

    /*
     * Metood para encender
     */
    @Override
    public void encender() {
        System.out.println("Camion Encendido...");
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
        System.out.println("Tiene capacidad de 23 galones");
    }

    /*
     * Metodo para agregar
     */
    public void add(Camion camion) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*
     * Metodo para eliminar
     */
    public void remove(Camion camion) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
