package co.edu.uniquindio.poo;

public class MotoElectrica extends Vehiculo implements IVehiculoElectrico {

    /*
    * Atributos de la clase
     */
    public int dias, timpoCarga;
    public double voltaje;
    public static int COSTO_ALQUILER = 70000;

    /**
     * Constructor con los atributos de la clase padre y propios
     *
     * @param cajaCambio
     * @param cilindraje
     * @param marca
     * @param matricula
     * @param modelo
     * @param nuevo
     * @param velocidadMaxima
     * @param dias
     * @param timpoCarga
     * @param voltaje
     */
    public MotoElectrica(int cajaCambio, int cilindraje, String marca, String matricula, String modelo, boolean nuevo,
            int velocidadMaxima, int dias, int timpoCarga, double voltaje) {
        super(cajaCambio, cilindraje, marca, matricula, modelo, nuevo, velocidadMaxima);
        this.dias = dias;
        this.timpoCarga = timpoCarga;
        this.voltaje = voltaje;
    }

    public int getDias() {
        return dias;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getTimpoCarga() {
        return timpoCarga;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setTimpoCarga(int timpoCarga) {
        this.timpoCarga = timpoCarga;
    }

    public double getVoltaje() {
        return voltaje;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setVoltaje(double voltaje) {
        this.voltaje = voltaje;
    }

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
        return "MotoElectrica [velocidadMaxima=" + velocidadMaxima + ", cilindraje=" + cilindraje + ", dias=" + dias
                + ", timpoCarga=" + timpoCarga + ", cajaCambio=" + cajaCambio + ", voltaje=" + voltaje + ", marca="
                + marca + ", modelo=" + modelo + ", matricula=" + matricula + "]";
    }

    /*
     * Metodo para andar
     */
    @Override
    public void andar() {
        System.out.println("MotoElectrica Andando...");
    }

    /*
     * Metodo para apagar
     */
    @Override
    public void apagar() {
        System.out.println("MotoElectrica Apagado...");
    }

    /*
     * Metood para encender
     */
    @Override
    public void encender() {
        System.out.println("MotoElectrica Encendido...");
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
    public void informacion1() {
        System.out.println("Es de carga ligera");
    }

    /*
     * Metodo para agregar
     */
    public void add(MotoElectrica motoElectrica) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*
     * Metodo para eliminar
     */
    public void remove(MotoElectrica motoElectrica) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
