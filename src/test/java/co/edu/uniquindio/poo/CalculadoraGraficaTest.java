/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import java.util.List;


/**
 * Unit test for simple App.
 */

public class CalculadoraGraficaTest {
    private static final Logger LOG = Logger.getLogger(CalculadoraGraficaTest.class.getName());

    /**
     * Rigorous Test :-)
     */

     @Test
     public void testSumarConVectoresValidos() {
         LOG.info("Iniciando Test de vectores completosS");
 
         // Crear los vectores 3D de entrada
         Vector3D o1 = new Vector3D(2, 3, 4);
         Vector3D o2 = new Vector3D(5, 6, 7);
 
         // Crear una instancia de CalculadoraGraficadora
         CalculadoraGraficadora mCalculadoraGraficadora = new CalculadoraGraficadora("Teclado poller", 4, 5, o1, o2);
 
         // Realizar la operación de suma
         mCalculadoraGraficadora.operacionSuma();
 
         
         LOG.info("Terminando Test de vectores completos");
     }


     @Test
     public void testDatosnulos() {
         LOG.info("Iniciando Test de vectores nulos");
 
         Vector3D o1 = null;
         Vector3D o2 = null;
 
         assertThrows(Throwable.class, () -> new CalculadoraGraficadora(null, 0,  0, o1, o2));
 
         LOG.info("Terminando Test de vectores nulos");
     }

     
    @Test
        public void testObtenerCalculadorasGraficadoras() {
            LOG.info("Iniciando Test de lista");

            //Creacion del objeto Simulador de calculadoras que contiene los metodos de lista
            SimuladorCalculadoras simulador = new SimuladorCalculadoras();
    
            //Crear objeto - en este caso objeto 1
            Vector3D o1 = new Vector3D(2, 3, 4);
            Vector3D o2 = new Vector3D(5, 6, 7);
            var calc1 = new CalculadoraGraficadora("Macanitron", 4, 2, o1, o2);

            //Crear objeto - en este caso objeto 2
            Vector3D o11 = new Vector3D(5, 6, 7);
            Vector3D o22 = new Vector3D(2, 3, 4);
            var calc2 = new CalculadoraGraficadora("Samsung", 2, 3, o11, o22);
    
            //Llamamos al metodo para registar la calculadora a una lista
            simulador.registrarCalculadora(calc1);
            simulador.registrarCalculadora(calc2);
    
            //metodos asserts para corroborar que la lista nos retorna las calculadoras registradas
            List<CalculadoraGraficadora> graficadoras = simulador.obtenerCalculadorasGraficadoras();
            assertEquals(2, graficadoras.size());
            assertTrue(graficadoras.contains(calc1));
            assertTrue(graficadoras.contains(calc2));

            LOG.info("Terminando Test de lista");
    }
}