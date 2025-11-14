/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.*;
import java.util.ArrayList;
/**
 *
 * @author Nicolas Castaño
 */
public class Controlador {
    public ArrayList<Producto> obtenerProductos() {
        ArrayList<Producto> lista = new ArrayList<>();

        lista.add(new Comida("Pizza", 25000));
        lista.add(new Comida("Hamburguesa", 18000));
        lista.add(new Electronico("Audífonos", 90000));
        lista.add(new Electronico("Mouse Gamer", 65000));
        lista.add(new Ropa("Camisa", 30000));

        return lista;
    }
}
