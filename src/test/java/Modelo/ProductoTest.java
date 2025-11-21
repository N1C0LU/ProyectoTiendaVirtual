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
public class ProductoTest {
    @Test
    public void testCrearProducto() {
        Producto p = new Producto("Laptop", 2500, "laptop.png");

        assertEquals("Laptop", p.getNombre());
        assertEquals(2500, p.getPrecio());
        assertEquals("laptop.png", p.getImagen());
    }

    @Test
    public void testToStringProducto() {
        Producto p = new Producto("Mouse", 50, "mouse.png");

        assertEquals("Mouse - $50", p.toString());
    }
    
}
