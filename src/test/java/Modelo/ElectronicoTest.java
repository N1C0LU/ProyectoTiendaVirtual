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
public class ElectronicoTest {
    @Test
    public void testCrearElectronico() {
        Electronico e = new Electronico("Televisor", 1800, "tv.png");

        assertEquals("Televisor", e.getNombre());
        assertEquals(1800, e.getPrecio());
        assertEquals("tv.png", e.getImagen());
    }
    
    
}
