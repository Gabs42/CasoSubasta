/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Subasta.Subasta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Gabriel
 */
public class VentanaSubasta extends JFrame {
    private Subasta subastaActual;
    
    JButton empujarDinero;
    JTextField cantidad;
    JLabel precioActual;
    JLabel nombreProducto;
    
    public VentanaSubasta(Subasta subastaActual){
        this.subastaActual = subastaActual;
        cargarVentana();
        cargarBotones();
        cargarDinero();
        cargarLabel();
        mostrarVentana();
    }
    
    private void mostrarVentana() {
        setLayout(null);
        setVisible(true);
    }
    
    private void cargarVentana() {
      setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
      setSize(900,480);
    }

    private void cargarBotones() {
        empujarDinero = new JButton("Empujar Dinero");
	empujarDinero.setBounds(20, 150, 130, 30);
	  empujarDinero.addActionListener(new ActionListener() {      
	    @Override
	    public void actionPerformed(ActionEvent e) {   
               
              empujarDinero();
	    }          
      });
          
      add(empujarDinero);
    }
    
    
    
    private void empujarDinero(){
        
    }

    private void cargarDinero(){
        JLabel labelCantidad = new JLabel("Cantidad a Empujar:");
        cantidad = new JTextField(30);
        labelCantidad.setBounds(30,75,130,80);
        cantidad.setBounds(160, 100, 150, 30);
        add(labelCantidad);
        add(cantidad);
    }

    private void cargarLabel() {
        nombreProducto = new JLabel("Producto:"+ this.subastaActual.getNombre());
        nombreProducto.setBounds(30, 0,130,80);
        add(nombreProducto);
        precioActual = new JLabel("Precio actual: "+ this.subastaActual.getProducto().getPrecioBase());
        precioActual.setBounds(30, 50,130,80);
        add(precioActual);
    }
}
