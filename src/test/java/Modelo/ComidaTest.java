/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicolas Castaño
 */
public class ComidaTest {
    @Test
    public void testCrearComida() {
        Comida c = new Comida("Hamburguesa", 25, "hamb.png");

        assertEquals("Hamburguesa", c.getNombre());
        assertEquals(25, c.getPrecio());
        assertEquals("hamb.png", c.getImagen());
    }
    
}
