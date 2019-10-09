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
public class VentanaControlSubasta extends JFrame {
    
    private Subasta subasta;
    JButton aceptarOferta;
    JButton cerrarSubasta;
    JButton cancelarSubasta;
    JLabel ofertaPropuesta;
    JLabel nombreProducto;
    JLabel ofertaActual;
    
    public VentanaControlSubasta(Subasta s){
        this.subasta = s;
        cargarVentana();
        cargarBotones();
        cargarLabel();
        mostrarVentana();
    }
    
    private void mostrarVentana() {
        setLayout(null);
        setVisible(true);
    }
    
    private void cargarVentana() {
      setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
      setSize(400,400);
    }

    private void cargarBotones() {
        aceptarOferta = new JButton("AceptarOferta");
	aceptarOferta.setBounds(20, 200, 130, 30);
	  aceptarOferta.addActionListener(new ActionListener() {      
	    @Override
	    public void actionPerformed(ActionEvent e) {   
               
              aceptarOferta();
	    }          
      });
          
      add(aceptarOferta);
      
      cerrarSubasta = new JButton("Cerrar Subasta");
	cerrarSubasta.setBounds(20, 250, 130, 30);
	  cerrarSubasta.addActionListener(new ActionListener() {      
	    @Override
	    public void actionPerformed(ActionEvent e) {   
               
              cerrarSubasta();
	    }          
      });
          
      add(cerrarSubasta);
      
      
      cancelarSubasta = new JButton("Cancelar Subasta");
	cancelarSubasta.setBounds(20, 300, 130, 30);
	  cancelarSubasta.addActionListener(new ActionListener() {      
	    @Override
	    public void actionPerformed(ActionEvent e) {   
               
              cancelarSubasta();
	    }          
      });
          
      add(cancelarSubasta);
    }
    
    
    
    private void aceptarOferta(){
        
    }
    
    private void cerrarSubasta(){
        
    }
    
    private void cancelarSubasta(){
        
    }


    private void cargarLabel() {
        nombreProducto = new JLabel("Producto:"+ subasta.getNombre());
        nombreProducto.setBounds(30, 0,130,80);
        add(nombreProducto);
        
        ofertaActual = new JLabel("Ofertar Actual:");
        ofertaActual.setBounds(30, 50,130,80);
        add(ofertaActual);
        
        ofertaPropuesta = new JLabel("Ofertar Propuesta:");
        ofertaPropuesta.setBounds(30, 100,130,80);
        add(ofertaPropuesta);
        
    }
}
