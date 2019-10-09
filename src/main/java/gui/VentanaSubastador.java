/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Producto.Producto;
import Subasta.Subasta;
import Users.Subastador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Gabriel
 */
public class VentanaSubastador extends JFrame {
    
    private Subastador subastadorActual;
    JButton botonSubasta;
    JTextField nombreProducto;
    JTextField descripcionProducto;
    JTextField precioBase;
    JTextField fin;
    
    
    public VentanaSubastador(Subastador subastadorActual){
        this.subastadorActual = subastadorActual;
        cargarVentana();
        cargarBotones();
        cargarTextFields();
        mostrarVentana();
    }
    
    private void mostrarVentana() {
        setLayout(null);
        setVisible(true);
    }
    
    private void cargarVentana() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(900, 480);
    }

    private void cargarBotones() {
        botonSubasta = new JButton("Colocar Producto");
	botonSubasta.setBounds(20,250,160,30);
	  botonSubasta.addActionListener(new ActionListener() {      
	    @Override
	    public void actionPerformed(ActionEvent e) {   
               
                try {
                    colocarEnSubasta();
                } catch (ParseException ex) {
                    Logger.getLogger(VentanaSubastador.class.getName()).log(Level.SEVERE, null, ex);
                }
	    }          
      });
          
      add(botonSubasta);
    }
    
    private void colocarEnSubasta() throws ParseException{
        if(!validarPrecio()){
            Producto p = new Producto(nombreProducto.getText(),descripcionProducto.getText(),Double.parseDouble(precioBase.getText()));
             Calendar calendar = Calendar.getInstance(); 
        
            Date finSubasta = new SimpleDateFormat("dd/MM/yyyy").parse(fin.getText());
            Date inicio = calendar.getTime();
            Subasta s = new Subasta(p.getNombre(),p.getDescripcion(),inicio,finSubasta,p);
            VentanaControlSubasta window = new VentanaControlSubasta(s);
        }
    }

    private void cargarTextFields() {
        JLabel labelNombre = new JLabel("Nombre:");
        nombreProducto = new JTextField(30);
        labelNombre.setBounds(40,0,130,80);
        nombreProducto.setBounds(120, 25, 150, 30);
        add(labelNombre);
        add(nombreProducto);
        
        
        JLabel labelDescripcion = new JLabel("Descripcion:");
        descripcionProducto = new JTextField(30);
        labelDescripcion.setBounds(40,50,130,80);
        descripcionProducto.setBounds(120, 75, 150, 30);
        add(labelDescripcion);
        add(descripcionProducto);
        
        
        JLabel labelPrecio = new JLabel("Precio:");
        precioBase = new JTextField(30);
        labelPrecio.setBounds(40,100,130,80);
        precioBase.setBounds(120, 125, 150, 30);
        add(labelPrecio);
        add(precioBase);
        
       
        
        
        JLabel labelFin = new JLabel("Fin:");
        fin = new JTextField(30);
        labelFin.setBounds(40,150,130,80);
        fin.setBounds(120, 175, 150, 30);
        add(labelFin);
        add(fin);
    }
    
    private boolean validarPrecio(){
        try{
            double test = Integer.parseInt(precioBase.getText());
            return false;
        }catch(NumberFormatException e){
            mostrarEmergente("El precio debe ser un double ");
            return true;
        }
    }
    
    public void mostrarEmergente(String mensaje) {
	    Emergente emergente = new Emergente(mensaje);
            emergente.mostrar();
	}
        
}
