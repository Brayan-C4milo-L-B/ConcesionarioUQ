package co.edu.uniquindio.poo;

/*
* Clase padre
 */
public class Persona {

    /*
    * Atributos de la clase
     */
    public String nombre, apellido, cedula, correo, telefono;

    /**
     * Constructor con los atributos de la clase
     *
     * @param nombre
     * @param apellido
     * @param cedula
     * @param correo
     * @param telefono
     */
    public Persona(String nombre, String apellido, String cedula, String correo, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
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
    public String getApellido() {
        return apellido;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public String getCedula() {
        return cedula;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public String getCorreo() {
        return correo;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public String getTelefono() {
        return telefono;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /*
    * Constructor con el toString
     */
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", correo=" + correo
                + ", telefono=" + telefono + "]";
    }

}
