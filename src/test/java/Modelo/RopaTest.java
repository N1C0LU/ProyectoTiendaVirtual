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
public class RopaTest {
    @Test
    public void testCrearRopa() {
        Ropa r = new Ropa("Camiseta", 40, "camiseta.png");

        assertEquals("Camiseta", r.getNombre());
        assertEquals(40, r.getPrecio());
        assertEquals("camiseta.png", r.getImagen());
    }
    
}
