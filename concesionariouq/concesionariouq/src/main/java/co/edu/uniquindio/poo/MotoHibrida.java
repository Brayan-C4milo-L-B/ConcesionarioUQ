package co.edu.uniquindio.poo;

public class MotoHibrida extends Vehiculo implements IVehiculoHibrido, IVehiculoElectrico {

    public int dias, timpoCarga, galones;
    public double voltaje;
    public static int COSTO_ALQUILER = 65000;

    public MotoHibrida(int cajaCambio, int cilindraje, String marca, String matricula, String modelo, boolean nuevo,
            int velocidadMaxima, int dias, int timpoCarga, int galones, double voltaje) {
        super(cajaCambio, cilindraje, marca, matricula, modelo, nuevo, velocidadMaxima);
        this.dias = dias;
        this.timpoCarga = timpoCarga;
        this.galones = galones;
        this.voltaje = voltaje;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getTimpoCarga() {
        return timpoCarga;
    }

    public void setTimpoCarga(int timpoCarga) {
        this.timpoCarga = timpoCarga;
    }

    public int getGalones() {
        return galones;
    }

    public void setGalones(int galones) {
        this.galones = galones;
    }

    public double getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(double voltaje) {
        this.voltaje = voltaje;
    }

    public static int getCOSTO_ALQUILER() {
        return COSTO_ALQUILER;
    }

    public static void setCOSTO_ALQUILER(int cOSTO_ALQUILER) {
        COSTO_ALQUILER = cOSTO_ALQUILER;
    }

    @Override
    public String toString() {
        return "MotoHibrida [dias=" + dias + ", timpoCarga=" + timpoCarga + ", galones=" + galones
                + ", velocidadMaxima=" + velocidadMaxima + ", voltaje=" + voltaje + ", cilindraje=" + cilindraje
                + ", cajaCambio=" + cajaCambio + ", marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula
                + "]";
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
    * Metodo de imformacion hibrida
     */
    public void informacion2() {
        System.out.println("Tiene capacidad de 2 galones");
    }

    /*
     * Metodo para agregar
     */
    public void add(MotoHibrida motoHibrida) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*
     * Metodo para eliminar
     */
    public void remove(MotoHibrida motoHibrida) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
