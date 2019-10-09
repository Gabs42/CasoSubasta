/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subasta;

import Producto.Producto;
import java.awt.Image;
import java.util.Date;

/**
 *
 * @author Gabriel
 */
public class Subasta {
    private String nombre;
    private String descripcion;
    private Image imagen;
    private Date inicio;
    private Date fin;
    private Producto producto;
    private Estados status ;

    public Subasta(String nombre, String descripcion, Image imagen, Date inicio, Date fin, Producto producto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.inicio = inicio;
        this.fin = fin;
        this.producto = producto;
    }
    
    public Subasta(String nombre, String descripcion, Date inicio, Date fin, Producto producto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.inicio = inicio;
        this.fin = fin;
        this.producto = producto;
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

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Estados getStatus() {
        return status;
    }

    public void setStatus(Estados status) {
        this.status = status;
    }
    
    public String toString(){
        return nombre;
    }
    
    
    
}
