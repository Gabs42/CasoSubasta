/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;

import java.awt.Image;

/**
 *
 * @author Gabriel
 */
public class Producto {
    private String nombre;
    private String descripcion;
    private Image imagen;
    private double precioBase;
    private double precioFinal;

    public Producto(String nombre, String descripcion, Image imagen, double precioBase, double precioFinal) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.precioBase = precioBase;
        this.precioFinal = precioFinal;
    }
    
    public Producto(String nombre, String descripcion, double precioBase) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.precioFinal = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
    
}
