package co.edu.uniquindio.poo;

public class CamionTest {

    @Test
    public void testAtributosCamion() {
        /*
        * Metodo de crear camion
         */
        Camion camion = new Camion();

        /*
        * Configura parametros de los atributos
         */
        camion.capacidadCarga = 5000;
        camion.ejes = 3;
        camion.dias = 7;
        camion.tipoCamion = "Refrigerado";
        camion.aireAcondicionado = true;
        camion.frenosAire = true;
        camion.siAbs = false;

        /*
        * Verifica los atributos
         */
        assertEquals(5000, camion.capacidadCarga);
        assertEquals(3, camion.ejes);
        assertEquals(7, camion.dias);
        assertEquals("Refrigerado", camion.tipoCamion);
        assertTrue(camion.aireAcondicionado);
        assertTrue(camion.frenosAire);
        assertFalse(camion.siAbs);
    }

}
