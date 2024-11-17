package co.edu.uniquindio.poo;

public class BusTest {

    public void testGetSetCostoAlquiler() {
        /*
        * Metodo para verificar el costo del alquiler
         */
        Bus.setCOSTO_ALQUILER(100000);

        assertEquals(100000, Bus.getCOSTO_ALQUILER());
    }

    public void testAtributosBus() {
        /*
        * Metood para crear un bus
         */
        Bus bus = new Bus();

        /*
        * Metodo para configuar los atributos
         */
        bus.pasajeros = 50;
        bus.puertas = 2;
        bus.bolsaAire = 4;
        bus.ejes = 3;
        bus.capacidadMaletero = 500;
        bus.dias = 5;
        bus.salidasDeEmergencia = 2;
        bus.aireAcondicionado = true;
        bus.camaraReversa = true;
        bus.siAbs = false;

        /*
        * Codigos para verificar los atributos
         */
        assertEquals(50, bus.pasajeros);
        assertEquals(2, bus.puertas);
        assertEquals(4, bus.bolsaAire);
        assertEquals(3, bus.ejes);
        assertEquals(500, bus.capacidadMaletero);
        assertEquals(5, bus.dias);
        assertEquals(2, bus.salidasDeEmergencia);
        assertTrue(bus.aireAcondicionado);
        assertTrue(bus.camaraReversa);
        assertFalse(bus.siAbs);
    }
}
