/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.*;
import java.util.ArrayList;
/**
 *
 * @author Nicolas Castaño & Sebastian Charris Garzon
 */
public class Controlador {
    public ArrayList<Producto> obtenerProductos() {
        ArrayList<Producto> lista = new ArrayList<>();

        lista.add(new Comida("Pizza", 25000, "pizza.png"));
        lista.add(new Comida("Hamburguesa", 18000, "hamburguesa.png"));
        lista.add(new Electronico("Audífonos", 90000, "audifonos.png"));
        lista.add(new Electronico("Mouse", 65000, "mouse.png"));
        lista.add(new Ropa("Camisa", 30000, "camisa.png"));

        return lista;
    }
}
