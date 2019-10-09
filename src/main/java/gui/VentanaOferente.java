/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Producto.Producto;
import Subasta.Subasta;
import Users.Oferente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Gabriel
 */
public class VentanaOferente extends JFrame {
    JComboBox<Subasta> comboSubastas;
    JButton botonUnirse;
    private Oferente oferenteActual;
    
    public VentanaOferente(Oferente oferenteActual){
        this.oferenteActual = oferenteActual;
        cargarVentana();
        cargarBotones();
        cargarSubastas();
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
        botonUnirse = new JButton("Unirse a subasta");
	botonUnirse.setBounds(20, 100, 130, 30);
	  botonUnirse.addActionListener(new ActionListener() {      
	    @Override
	    public void actionPerformed(ActionEvent e) {   
               
              unirseASubasta();
	    }          
      });
          
      add(botonUnirse);
    }
    
    private void unirseASubasta(){
        Subasta subastaEscogida = (Subasta) comboSubastas.getSelectedItem();
        VentanaSubasta window = new VentanaSubasta(subastaEscogida);
    }

    private void cargarSubastas() {
        ArrayList<Subasta> s = new ArrayList<>();
        Producto p = new Producto("h","desc",100);
        Calendar calendar = Calendar.getInstance(); 
        Date inicio = calendar.getTime();
        
        Subasta sub = new Subasta(p.getNombre(),p.getDescripcion(),inicio,inicio,p);
        s.add(sub);
        JLabel subastas = new JLabel("Subastas:");
        subastas.setBounds(20,150,180,30);
        comboSubastas = new JComboBox<Subasta>();
            for(Subasta subasta : s) {
		comboSubastas.addItem(subasta);
	    }
        comboSubastas.setBounds(80, 150, 130, 30);
        
        add(comboSubastas);
        add(subastas);
    }
}
