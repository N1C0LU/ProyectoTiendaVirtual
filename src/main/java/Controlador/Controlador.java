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
    private ArrayList<Producto> carritoCompras;
    
    public Controlador() {
        this.carritoCompras = new ArrayList<>();
    }

    public ArrayList<Producto> obtenerProductos() {
        ArrayList<Producto> lista = new ArrayList<>();
        lista.add(new Comida("Pizza", 25000, "pizza.png"));
        lista.add(new Comida("Hamburguesa", 18000, "hamburguesa.png"));
        lista.add(new Electronico("Audífonos", 90000, "audifonos.png"));
        lista.add(new Electronico("Mouse", 65000, "mouse.png"));
        lista.add(new Ropa("Camisa", 30000, "camisa.png"));
        return lista;
    }
    
    public void agregarAlCarrito(Producto producto) {
        if (producto != null) {
            carritoCompras.add(producto);
        }
    }

    public void quitarDelCarrito(Producto producto) {
        if (producto != null) {
            carritoCompras.remove(producto);
        }
    }

    public void limpiarCarrito() {
        carritoCompras.clear();
    }

    public ArrayList<Producto> obtenerCarrito() {
        return new ArrayList<>(carritoCompras);
    }

    public int obtenerCantidadItems() {
        return carritoCompras.size();
    }

    public boolean carritoVacio() {
        return carritoCompras.isEmpty();
    }

    public int calcularTotal() {
        int suma = 0;
        for (Producto p : carritoCompras) {
            suma += p.getPrecio();
        }
        return suma;
    }

    public int calcularTiempoEntrega() {
        int tiempo = 2;
        
        for (Producto p : carritoCompras) {
            if (p instanceof Electronico) {
                tiempo += 3;
            }
        }
        
        return tiempo;
    }

    public String validarDatosCompra(String nombre, String apellidos, String telefono,
                                      String correo, String direccion, String tarjeta) {
        if (nombre == null || nombre.trim().isEmpty()) {
            return "El nombre es obligatorio";
        }
        if (apellidos == null || apellidos.trim().isEmpty()) {
            return "Los apellidos son obligatorios";
        }
        if (telefono == null || telefono.trim().isEmpty()) {
            return "El teléfono es obligatorio";
        }
        if (!telefono.matches("\\d{7,10}")) {
            return "El teléfono debe tener entre 7 y 10 dígitos";
        }
        if (correo == null || correo.trim().isEmpty()) {
            return "El correo es obligatorio";
        }
        if (!correo.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            return "El correo no tiene un formato válido";
        }
        if (direccion == null || direccion.trim().isEmpty()) {
            return "La dirección es obligatoria";
        }
        if (tarjeta == null || tarjeta.trim().isEmpty()) {
            return "El número de tarjeta es obligatorio";
        }
        if (!tarjeta.matches("\\d{16}")) {
            return "La tarjeta debe tener 16 dígitos";
        }
        return null;
    }

    public boolean validarLogin(String usuario, String clave) {
        return usuario != null && !usuario.trim().isEmpty() &&
               clave != null && clave.length() >= 4;
    }

    public String generarRecibo(String nombre, String apellidos, String telefono,
                                String correo, String direccion, String tarjeta) {
        
        if (carritoVacio()) {
            return null;
        }

        int total = calcularTotal();
        int tiempoEntrega = calcularTiempoEntrega();
        
        StringBuilder productos = new StringBuilder();
        for (Producto p : carritoCompras) {
            productos.append("- ").append(p.getNombre())
                    .append("  $").append(p.getPrecio()).append("\n");
        }

        String tarjetaOculta = "**** **** **** " + 
            tarjeta.substring(tarjeta.length() - 4);

        return "===== RECIBO DE COMPRA =====\n\n" +
               "Nombre: " + nombre + " " + apellidos + "\n" +
               "Teléfono: " + telefono + "\n" +
               "Correo: " + correo + "\n" +
               "Dirección: " + direccion + "\n" +
               "Tarjeta: " + tarjetaOculta + "\n\n" +
               "Productos:\n" + productos +
               "\nTOTAL PAGADO: $" + total +
               "\nTiempo estimado de entrega: " + tiempoEntrega + " horas\n";
    }
}