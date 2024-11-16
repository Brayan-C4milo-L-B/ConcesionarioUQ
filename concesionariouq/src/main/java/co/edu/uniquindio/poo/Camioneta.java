package co.edu.uniquindio.poo;

/*
* Clase camioneta
 */
public class Camioneta extends Vehiculo implements IVehiculoCombustible {

    /*
    * Atributos de la clase
     */
    public int pasajeros, puertas, bolsaAire, capacidadMaletero, dias;
    public boolean aireAcondicionado, camaraReversa, siAbs, siVcrusero, siSensorColision, siSensorTraficoCruzado, siAsistentePermaneceACarril, si4x4;
    public static int COSTO_ALQUILER = 850000;

    /**
     * Constructor con los atributos de la clase padre y propios
     *
     * @param aireAcondicionado
     * @param bolsaAire
     * @param camaraReversa
     * @param capacidadMaletero
     * @param dias
     * @param pasajeros
     * @param puertas
     * @param si4x4
     * @param siAbs
     * @param siAsistentePermaneceACarril
     * @param siSensorColision
     * @param siSensorTraficoCruzado
     * @param siVcrusero
     * @param cajaCambio
     * @param cilindraje
     * @param marca
     * @param matricula
     * @param modelo
     * @param nuevo
     * @param velocidadMaxima
     */
    public Camioneta(boolean aireAcondicionado, int bolsaAire, boolean camaraReversa, int capacidadMaletero, int dias, int pasajeros, int puertas, boolean si4x4, boolean siAbs, boolean siAsistentePermaneceACarril, boolean siSensorColision, boolean siSensorTraficoCruzado, boolean siVcrusero, int cajaCambio, int cilindraje, String marca, String matricula, String modelo, boolean nuevo, int velocidadMaxima) {
        super(cajaCambio, cilindraje, marca, matricula, modelo, nuevo, velocidadMaxima);
        this.aireAcondicionado = aireAcondicionado;
        this.bolsaAire = bolsaAire;
        this.camaraReversa = camaraReversa;
        this.capacidadMaletero = capacidadMaletero;
        this.dias = dias;
        this.pasajeros = pasajeros;
        this.puertas = puertas;
        this.si4x4 = si4x4;
        this.siAbs = siAbs;
        this.siAsistentePermaneceACarril = siAsistentePermaneceACarril;
        this.siSensorColision = siSensorColision;
        this.siSensorTraficoCruzado = siSensorTraficoCruzado;
        this.siVcrusero = siVcrusero;
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
    public boolean isSiVcrusero() {
        return siVcrusero;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setSiVcrusero(boolean siVcrusero) {
        this.siVcrusero = siVcrusero;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public boolean isSiSensorColision() {
        return siSensorColision;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setSiSensorColision(boolean siSensorColision) {
        this.siSensorColision = siSensorColision;
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
    public boolean isSiAsistentePermaneceACarril() {
        return siAsistentePermaneceACarril;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setSiAsistentePermaneceACarril(boolean siAsistentePermaneceACarril) {
        this.siAsistentePermaneceACarril = siAsistentePermaneceACarril;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public boolean isSi4x4() {
        return si4x4;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setSi4x4(boolean si4x4) {
        this.si4x4 = si4x4;
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
        return "Camioneta [pasajeros=" + pasajeros + ", puertas=" + puertas + ", bolsaAire=" + bolsaAire
                + ", capacidadMaletero=" + capacidadMaletero + ", dias=" + dias + ", aireAcondicionado="
                + aireAcondicionado + ", camaraReversa=" + camaraReversa + ", siAbs=" + siAbs + ", siVcrusero="
                + siVcrusero + ", siSensorColision=" + siSensorColision + ", siSensorTraficoCruzado="
                + siSensorTraficoCruzado + ", siAsistentePermaneceACarril=" + siAsistentePermaneceACarril + ", si4x4="
                + si4x4 + "]";
    }

    /*
     * Metodo para andar
     */
    @Override
    public void andar() {
        System.out.println("Camioneta Andando...");
    }

    /*
     * Metodo para apagar
     */
    @Override
    public void apagar() {
        System.out.println("Camioneta Apagado...");
    }

    /*
     * Metood para encender
     */
    @Override
    public void encender() {
        System.out.println("Camioneta Encendido...");
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
        System.out.println("Tiene capacidad de 18 galones");
    }

    /*
     * Metodo para agregar
     */
    public void add(Camioneta camioneta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*
     * Metodo para eliminar
     */
    public void remove(Camioneta camioneta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
