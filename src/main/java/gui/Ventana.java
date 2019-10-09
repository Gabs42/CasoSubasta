/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Users.Oferente;
import Users.Subastador;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Gabriel
 */
public class Ventana extends JFrame {
        
    JButton botonLoginOferente;
    JButton botonLoginSubastador;
    JTextField nickname;
    
     
    public Ventana(){
        cargarVentana();
        cargarBotones();
        cargarNick();
        mostrarVentana();
    }
    
    
    private void cargarVentana() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(400, 200);
    }
    
    private void cargarBotones() {
      botonLoginOferente = new JButton("Login Oferente");
	  botonLoginOferente.setBounds(20, 100, 130, 30);
	  botonLoginOferente.addActionListener(new ActionListener() {      
	    @Override
	    public void actionPerformed(ActionEvent e) {   
               
              loginOferente();
	    }          
      });
      botonLoginSubastador = new JButton("Login Subastador");
      botonLoginSubastador.setBounds(200, 100, 160, 30);
      botonLoginSubastador.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
              loginSubastador();
          }
          
      });
      add(botonLoginOferente);
      add(botonLoginSubastador);
    }
    
    private void mostrarVentana() {
        setLayout(null);
        setVisible(true);
    }
    
    private void cargarNick(){
        JLabel labelCantidad = new JLabel("Nickname:");
        nickname = new JTextField(30);
        labelCantidad.setBounds(80,0,130,80);
        nickname.setBounds(160, 25, 150, 30);
        add(labelCantidad);
        add(nickname);
    }
    
    private void loginOferente(){
        if(this.nickname.getText().equals("")){
            mostrarEmergente("El nickname esta vacio");
        }
        else{
            Oferente newOferente = new Oferente(nickname.getText());
            VentanaOferente window = new VentanaOferente(newOferente);
            this.setVisible(false);
            dispose();
        }
        
    }
    
    private void loginSubastador(){
        if(this.nickname.getText().equals("")){
            mostrarEmergente("El nickname esta vacio");
        }
        else{
            Subastador newSubastador = new Subastador(nickname.getText());
            VentanaSubastador window = new VentanaSubastador(newSubastador);
            this.setVisible(false);
            dispose();
        }
        
    }
    
    public void mostrarEmergente(String mensaje) {
	    Emergente emergente = new Emergente(mensaje);
            emergente.mostrar();
	}
    


}     

