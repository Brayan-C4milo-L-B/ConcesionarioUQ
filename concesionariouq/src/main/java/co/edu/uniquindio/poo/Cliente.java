package co.edu.uniquindio.poo;

/*
 * Clase cliente
 */
public class Cliente extends Persona {

    /*
    * Atributos de la clase
     */
    public boolean esPago;

    /**
     * Constructor con los atributos de la clase padre y propios
     *
     * @param nombre
     * @param apellido
     * @param cedula
     * @param correo
     * @param telefono
     * @param pagoEfectivo
     */
    public Cliente(String nombre, String apellido, String cedula, String correo, String telefono,
            boolean esPago) {
        super(nombre, apellido, cedula, correo, telefono);
        this.esPago = esPago;

    }

    /*Get
    * Metodo para obtener un dato
     */
    public boolean isPagoEfectivo() {
        return esPago;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setPagoEfectivo(boolean esPago) {
        this.esPago = esPago;
    }

    /*
    * Constructor con el toString
     */
    @Override
    public String toString() {
        return "Cliente [pagoEfectivo=" + esPago + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula="
                + cedula + ", correo=" + correo + ", telefono=" + telefono + "]";
    }

    /*
     * Metodo para agregar
     */
    public void remove(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*
     * Metodo para eliminar
     */
    public void add(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
