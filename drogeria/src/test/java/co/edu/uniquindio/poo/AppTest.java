/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        LOG.info("Iniciado test shouldAnswerWithTrue");
        assertTrue(true);
        LOG.info("Finalizando test shouldAnswerWithTrue");
    }

    @Test

    public void productoSinStock(){

        Drogeria drogeria = new Drogeria("Drogeria Saludable");

        Producto acetaminofen = new Medicamento("1", "Acetaminofen", "Pasta", 17000.00, 0, "Profamiliar", 12.00);

        drogeria.agregarProducto(acetaminofen);

        assert acetaminofen.getStock() != 0: "NO HAY STOCK";
    }

    @Test

    public void productosMayoresDe100(){

        Drogeria drogeria = new Drogeria("Drogeria Saludable");


        Producto acetaminofen = new Medicamento("1", "Acetaminofen", "Pasta", 17000.00, 100, "Profamiliar", 12.00);

        Producto lozartan = new Medicamento("1", "lozartan", "Medicamento para la tos", 34000.00, 100, "Profamiliar", 450.00);

        drogeria.agregarProducto(acetaminofen);

        drogeria.agregarProducto(lozartan);    

        Collection<Producto> listaEsperada = List.of(acetaminofen, lozartan);

        assertIterableEquals(listaEsperada, drogeria.getProductoStock100());

        LOG.info("Fin test obtener productos con stock mayor a 100");
    }

    @Test

    public void costoTotalPedido(){

        Drogeria drogeria = new Drogeria("asdjkasd");

        Producto lozartan = new Medicamento("1", "lozartan", "Medicamento para la tos", 34000.00, 100, "Profamiliar", 450.00);

        Pedido pedido = new Pedido(LocalDate.of(2024, 06, 12), 3, lozartan);

        drogeria.agregarPedido(pedido);

        assertEquals(102000.00, pedido.calcularValorPedido());

    }


    }
        
