package co.edu.uniquindio.poo;

/*
* Clase padre
 */
public abstract class Vehiculo {

    /*
    * Atributos de la clase
     */
    public int velocidadMaxima, cilindraje, cajaCambio;
    public String marca, modelo, matricula;
    public boolean nuevo;

    /**
     * Constructor con los atributos de la clase
     *
     * @param cajaCambio
     * @param cilindraje
     * @param marca
     * @param matricula
     * @param modelo
     * @param nuevo
     * @param velocidadMaxima
     */
    public Vehiculo(int cajaCambio, int cilindraje, String marca, String matricula, String modelo, boolean nuevo, int velocidadMaxima) {
        this.cajaCambio = cajaCambio;
        this.cilindraje = cilindraje;
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
        this.nuevo = nuevo;
        this.velocidadMaxima = velocidadMaxima;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public int getCilindraje() {
        return cilindraje;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public int getCajaCambio() {
        return cajaCambio;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setCajaCambio(int cajaCambio) {
        this.cajaCambio = cajaCambio;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public String getMarca() {
        return marca;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public String getModelo() {
        return modelo;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public String getMatricula() {
        return matricula;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public boolean isNuevo() {
        return nuevo;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    /*
    * Constructor con el toString
     */
    @Override
    public String toString() {
        return "Vehiculo [velocidadMaxima=" + velocidadMaxima + ", cilindraje=" + cilindraje + ", cajaCambio="
                + cajaCambio + ", marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", nuevo="
                + nuevo + "]";
    }

    /*
     * Metodo para encender
     */
    public abstract void encender();

    /*
     * Metodo para apagar
     */
    public abstract void apagar();

    /*
     * Metodo para andar
     */
    public abstract void andar();

}
