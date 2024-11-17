package co.edu.uniquindio.poo;

public class AdministradorTest {

    @Test
    public void testAtributosAdministrador() {
        /*
        * Metodo para crear un administrador
         */
        Administrador administrador = new Administrador();

        /*
        * Configurar los atributos
         */
        administrador.idEmpleado = "EMP123";
        administrador.credencialInicioSeccion = "admin123";
        administrador.activo = true;

        /*
        * Verifica atributos
         */
        assertEquals("EMP123", administrador.idEmpleado);
        assertEquals("admin123", administrador.credencialInicioSeccion);
        assertTrue(administrador.activo);

        /*
        * Verifica el estado del administrador
         */
        administrador.activo = false;

        assertFalse(administrador.activo);
    }
}
