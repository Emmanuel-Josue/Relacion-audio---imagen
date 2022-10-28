/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteVentanas;

import Codigo.Audio;
import Codigo.Operacion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaError extends JDialog {
    private JPanel panelPrincipal;
    private JPanel panelEtiquetaError;
    private JPanel panelBotones;
    private JButton btnSalir;
    private JButton btnRepetir;
    //private String rutaAudio;
    private JLabel lblError;
    private Audio reproducir = new Audio();
    private String repetir;     
    private File rutaImagenError;
    private String rutaError;
    private Operacion operacionError;
    
    public VentanaError(Frame parent, boolean modal, String repetir)
    {
        super(parent, modal);//volver a investigar esta linea. 
        this.repetir = repetir;
        setSize(600,300);
        setLocationRelativeTo(null);// Centramos la ventana 
        setMinimumSize(new Dimension(200,200));// tamaño minimo que tendra 
        
        operacionError = new Operacion();
        rutaImagenError = new File("Error.jpg");
        rutaError = operacionError.establecerRuta(rutaImagenError,"src\\main\\java\\Recursos\\Imagenes para el proyecto\\", false);//Se completa la ruta 
        System.out.println(rutaError);
        iniciarComponentes();
        
    }
    
        //--------------------------------------- IMPLEMENTACIÓN --------------------------------------  
    private void iniciarComponentes()
    {
        panelPrincipal();
        panelEtiquetaError();
        panelBotones();
    }
    
    private void panelPrincipal()
    {
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());//Investigar como funciona el border layout, colocar los siguientes paneles anto arriba como abajao center y este 
        panelPrincipal.setBackground(Color.red);
        this.add(panelPrincipal);
    }
    
    private void panelEtiquetaError()
    {
        panelEtiquetaError = new JPanel();
        panelEtiquetaError.setBackground(Color.black);
        panelEtiquetaError.setLayout(new BorderLayout());
        lblError = new JLabel(new ImageIcon(rutaError));
        panelEtiquetaError.add(lblError, BorderLayout.CENTER);
        panelPrincipal.add(panelEtiquetaError, BorderLayout.CENTER);
    }
    
    private void panelBotones()
    {
        panelBotones = new JPanel();
        panelBotones.setBackground(Color.BLACK);
        btnSalir = new JButton("Salir");
        btnRepetir = new JButton("¡ REINTENTAR !");
        
        panelBotones.add(btnSalir);
        panelBotones.add(btnRepetir);
        
        panelPrincipal.add(panelBotones, BorderLayout.PAGE_END);
        oyenteAccionBotonSalir();
        oyenteAccionBotonRepetir();
    }
    private void oyenteAccionBotonSalir()
    {
        ActionListener oyente = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        };
        btnSalir.addActionListener(oyente);
    }
    private void oyenteAccionBotonRepetir()
    {
        //En este método se trabajara un poco más ya que cada vez 
        //que se repita alguna pregunta se contabilizara 
        
        //* Al cerrar la ventana se debe de repetir el audio, para lograr 
        // esto hay que guardar la ruta absluta en un archivo 
        ActionListener oyente = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                reproducir.reproducirAudio(repetir);
                dispose();
            }
        };
        btnRepetir.addActionListener(oyente);
    
    }
}
