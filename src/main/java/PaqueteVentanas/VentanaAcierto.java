/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteVentanas;

import Codigo.Archivo;
import Codigo.Operacion;
import Codigo.Pregunta;
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

public class VentanaAcierto extends JDialog{
    
    private JPanel panelPrincipal;
    private JPanel panelEtiquetaAcierto;
    private JPanel panelBotones;
    private JButton btnSalir;
    private JButton btnSiguiente;
    private JLabel lblAcierto; 
    private Archivo archivista;
    private File archivoImagenCorrecto;
    private File archivoBinario;
    private Operacion operacional;
    private String rutaComplataImagenAcierto;
    private String rutaCompletaArchivoBinario;

    public VentanaAcierto(Frame parent, boolean modal)
    {
        super(parent, modal);//volver a investigar esta linea. 
        setSize(600,300);
        setLocationRelativeTo(null);// Centramos la ventana 
        setMinimumSize(new Dimension(200,200));// tamaño minimo que tendra 
        archivista = new Archivo();
        operacional = new Operacion();//clase con la que obtendremos la ruta absoluta
        this.obtenerRutasCompletas();
        iniciarComponentes();
    }  
    
    //--------------------------------------- IMPLEMENTACIÓN --------------------------------------    
    private void iniciarComponentes()
    {
        panelPrincipal();
        panelEtiquetaAcierto();
        panelBotones();
        
    }
    
    private void panelPrincipal()
    {
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.setBackground(Color.red);
        this.add(panelPrincipal);
    }
    
    private void panelEtiquetaAcierto()
    {
        panelEtiquetaAcierto = new JPanel();
        panelEtiquetaAcierto.setBackground(Color.black);
        panelEtiquetaAcierto.setLayout(new BorderLayout());
        lblAcierto = new JLabel(new ImageIcon(rutaComplataImagenAcierto));
        panelEtiquetaAcierto.add(lblAcierto, BorderLayout.CENTER);
        panelPrincipal.add(panelEtiquetaAcierto, BorderLayout.CENTER);
    }
    
    private void panelBotones()
    {
        panelBotones = new JPanel();
        panelBotones.setBackground(Color.BLACK);
        btnSalir = new JButton("Salir");
        btnSiguiente = new JButton("SIGUIENTE");
        
        panelBotones.add(btnSalir);
        panelBotones.add(btnSiguiente);
        
        panelPrincipal.add(panelBotones, BorderLayout.PAGE_END);
        oyenteAccionBotonSiguiente();
        oyenteAccionBotonSalir();
    }
    
    
    private void oyenteAccionBotonSiguiente()
    {
        ActionListener oyente = new ActionListener()
        {           
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Pregunta oPregunta = archivista.leerBinario(rutaCompletaArchivoBinario);
                if(oPregunta.getOImagen().getImagenes().size() != 0)
                {
                    VentanaPregunta ventana = new VentanaPregunta(oPregunta);
                    ventana.setVisible(true);
                    dispose();
                }
                
                else
                {
                    System.exit(0);
                }


            }
        };
        btnSiguiente.addActionListener(oyente);
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
    
    public void obtenerRutasCompletas()
    {
        //asignar elementos a archivos
        archivoImagenCorrecto = new File("Correcto3.jpg");//para poder obtener la ruta del archivo
        archivoBinario = new File("Archivo Binario.bin");
        
        //Se obtiene la ruta completa
        rutaComplataImagenAcierto = operacional.establecerRuta(archivoImagenCorrecto,"src\\main\\java\\Recursos\\Imagenes para el proyecto\\", false);
        rutaCompletaArchivoBinario = operacional.establecerRuta(archivoBinario,"src\\main\\java\\Recursos\\Archivos\\", false);
    }

}
