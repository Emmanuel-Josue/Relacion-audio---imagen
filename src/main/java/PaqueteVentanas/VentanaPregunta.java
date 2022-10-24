/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteVentanas;

import Codigo.Operacion;
import Codigo.Pregunta;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class VentanaPregunta extends JFrame{
    
    //Variables 
    private JPanel panelPrincipal;
    private JPanel panelImagenes;
    private JPanel panelBotonAudio;
    private JToggleButton btnImagenUno;
    private JToggleButton btnImagenDos;
    private JToggleButton btnImagenTres;
    private JToggleButton btnImagenCuatro;
    private String rutaAbsolutaImagenUno;
    private String rutaAbsolutaImagenDos;
    private String rutaAbsolutaImagenTres;
    private String rutaAbsolutaImagenCuatro;
    private String rutaAbsolutaAudio;
    private JButton btnAudio;
    //--------------
    private Pregunta oPregunta;
    private int[] cuatroNumerosAleatorios;
    private Operacion oOperacion;
    int numeroRespuesta;
    //Este será mi primer constructor
    public VentanaPregunta()
    {
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);// Centramos la ventana 
        setMinimumSize(new Dimension(200,200));// tamaño minimo que tendra 
        oPregunta = new Pregunta();// Con esto ya puedo disponer de las rutas de imagenes y audios. 
        cuatroNumerosAleatorios = new int[4];//para controlar las rutas que iran en los botones.
        oOperacion = new Operacion();
        this.iniciarComponenetes();
    }
    //Ya que los constructores se utilizan para inicializar cosas, este inicializara con 
    //un objeto que se ha guardado en un estado y se ha recuperado en ese mismo. 
    public VentanaPregunta(Pregunta OPregunta)
    {
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);// Centramos la ventana 
        setMinimumSize(new Dimension(200,200));// tamaño minimo que tendra 
        this.oPregunta = OPregunta;
        cuatroNumerosAleatorios = new int[4];//para controlar las rutas que iran en los botones
        oOperacion = new Operacion();
        this.iniciarComponenetes();
//        this.iniciarComponenetes(OPregunta);
    }
    
        //--------------------------------------- IMPLEMENTACIÓN --------------------------------------  
    
    //Para la inicialización del programa
    private void iniciarComponenetes()
    {        
        panelPrincipal();
        panelImagenes();
        if(oPregunta.getOImagen().getImagenes().size() <= 3)
        {
            Pregunta rutas = new Pregunta();
            crearSeñuelos((rutas.getOImagen().getImagenes().size()));//El número debe de ser acorde al total de elementos en las listas. 
            int indice = elegirIndiceRespuesta();
            int posicionDuplicada = oOperacion.rutaDuplicada(rutas.getOImagen().getImagenes(), (String) oPregunta.getOImagen().getImagenes().get(0));            
            //Mpétodo que cambiara el elemento de la posición respuesta por el primer elemento de el objeto oPregunta.
            oPregunta.mostrarDatosDelObjeto();            
            oOperacion.cambiarRuta(posicionDuplicada,cuatroNumerosAleatorios[indice], rutas.getOImagen().getImagenes(), (String) oPregunta.getOImagen().getImagenes().get(0));
            oOperacion.cambiarRuta(posicionDuplicada,cuatroNumerosAleatorios[indice], rutas.getOAudio().getAudio(), (String) oPregunta.getOAudio().getAudio().get(0));
            System.out.println("El objeto rutas tiene los siguientes elementos: ");
            rutas.mostrarDatosDelObjeto();
            asignacionRutasAbsolutas(indice, rutas);
            
        }
        else
        {
            crearSeñuelos((oPregunta.getOImagen().getImagenes().size()));
            asignacionRutasAbsolutas(elegirIndiceRespuesta(), oPregunta);
        }
        inicializarBotones();
        panelBotonAudio();
        botonAudio();
    }
    private void panelPrincipal()
    {
        // * El panel principal se dividira en 4 partes y el panel imagenes ocupara 3 cuartas partes, el panel boton audio ocupara 1 parte 
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());//Investigar como funciona el border layout, colocar los siguientes paneles anto arriba como abajao center y este 
        panelPrincipal.setBackground(Color.red);
        this.add(panelPrincipal);
    }
    
    private void panelImagenes()
    {
        panelImagenes = new JPanel();
        panelImagenes.setLayout(new GridLayout(2,2));
        
    }
    
    private void inicializarBotones()
    {
    
        btnImagenUno = new JToggleButton();
        // La posición que se indica en este método es ignorado a la ora de compilar,
        // por lo que creo es que esto pasa por que existe un Layout establecido, pero 
        // de igual forma utilizo esto para que me deje darle tamaño en la imagen al momento de 
        // inicializar el objeto de la calse ImageIcon
        btnImagenUno.setBounds(0,0,300,300);
        ImageIcon imagenBotonUno = new ImageIcon(rutaAbsolutaImagenUno);
        btnImagenUno.setIcon(new ImageIcon(imagenBotonUno.getImage().getScaledInstance(btnImagenUno.getWidth(),btnImagenUno.getHeight(),Image.SCALE_SMOOTH)));
        btnImagenDos = new JToggleButton();
        btnImagenDos.setBounds(0,0,300,300);
        ImageIcon imagenBotonDos = new ImageIcon(rutaAbsolutaImagenDos);
        btnImagenDos.setIcon(new ImageIcon(imagenBotonDos.getImage().getScaledInstance(btnImagenDos.getWidth(),btnImagenDos.getHeight(), Image.SCALE_SMOOTH)));
        btnImagenTres = new JToggleButton();
        btnImagenTres.setBounds(0,0,300,300);
        ImageIcon imagenBotonTres = new ImageIcon(rutaAbsolutaImagenTres);
        btnImagenTres.setIcon(new ImageIcon(imagenBotonTres.getImage().getScaledInstance(btnImagenTres.getWidth(),btnImagenTres.getHeight(), Image.SCALE_SMOOTH)));
        btnImagenCuatro = new JToggleButton();
        btnImagenCuatro.setBounds(0,0,300,300);
        ImageIcon imagenBotonCuatro = new ImageIcon(rutaAbsolutaImagenCuatro);
        btnImagenCuatro.setIcon(new ImageIcon(imagenBotonCuatro.getImage().getScaledInstance(btnImagenCuatro.getWidth(),btnImagenCuatro.getHeight(), Image.SCALE_SMOOTH)));
        //Agrupamos los botones mediante esta clase 
        ButtonGroup grupoBotones = new ButtonGroup();
        grupoBotones.add(btnImagenUno);
        grupoBotones.add(btnImagenDos);
        grupoBotones.add(btnImagenTres);
        grupoBotones.add(btnImagenCuatro);
        
        panelImagenes.add(btnImagenUno);
        panelImagenes.add(btnImagenDos);
        panelImagenes.add(btnImagenTres);
        panelImagenes.add(btnImagenCuatro);
        panelPrincipal.add(panelImagenes, BorderLayout.CENTER);
        
        //oyentes de acción.
        oyenteAccionBotonUno();
        oyenteAccionBotonDos();
        oyenteAccionBotonTres();
        oyenteAccionBotonCuatro();
        
    }
    
    private void panelBotonAudio()
    {
        panelBotonAudio = new JPanel();
        panelBotonAudio.setBackground(Color.black);
        panelPrincipal.add(panelBotonAudio,BorderLayout.PAGE_END);
       // panelBotonAudio
    }
    
    private void botonAudio()
    {
        btnAudio = new JButton();
        //btnAudio.setPreferredSize(new Dimension(600,50));
        btnAudio.setBounds(250,0,100, 50);
        btnAudio.setBackground(Color.BLACK);
        ImageIcon imagenBoton=new ImageIcon("C:\\Users\\user01\\Desktop\\Emmanuel\\Programacion\\JAVA\\AudioImagenRelacion\\src\\Recursos\\Imagenes para el proyecto\\audio_4.PNG");
        btnAudio.setIcon(new ImageIcon(imagenBoton.getImage().getScaledInstance(btnAudio.getWidth(), btnAudio.getHeight(), Image.SCALE_DEFAULT)));
        panelBotonAudio.add(btnAudio);
        oPregunta.getOAudio().reproducirAudio(rutaAbsolutaAudio);
//        reproducirAudio(rutaAbsolutaAudio);
        oyenteAccionBotonAudio();
        
    }
    
    private void oyenteAccionBotonAudio()
    {
        ActionListener oyente = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                oPregunta.getOAudio().reproducirAudio(rutaAbsolutaAudio);              
            }
        };
        btnAudio.addActionListener(oyente);
    }
    
    private void oyenteAccionBotonUno()
    {
        ActionListener oyente = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {                
                abrirVentana((oOperacion.verificarRespuesta(numeroRespuesta, cuatroNumerosAleatorios[0], oPregunta)));
            }
        };
        btnImagenUno.addActionListener(oyente);
        
    }
    
    private void oyenteAccionBotonDos()
    {
        ActionListener oyente = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                abrirVentana((oOperacion.verificarRespuesta(numeroRespuesta, cuatroNumerosAleatorios[1], oPregunta)));
            }
        };
        btnImagenDos.addActionListener(oyente);
        
    }
    
    private void oyenteAccionBotonTres()
    {
        ActionListener oyente = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                abrirVentana((oOperacion.verificarRespuesta(numeroRespuesta, cuatroNumerosAleatorios[2], oPregunta)));
            }
        };
        btnImagenTres.addActionListener(oyente);
        
    }
    
    private void oyenteAccionBotonCuatro()
    {
        ActionListener oyente = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                abrirVentana((oOperacion.verificarRespuesta(numeroRespuesta, cuatroNumerosAleatorios[3], oPregunta)));
            }
        };
        btnImagenCuatro.addActionListener(oyente);
        
    }
    
    private void asignacionRutasAbsolutas(int indiceRespuesta, Pregunta oRutasDePregunta)
    {
        //Creo que esta variable debe ser con el ambito de objeto
        rutaAbsolutaImagenUno = (String) oRutasDePregunta.getOImagen().getImagenes().get(cuatroNumerosAleatorios[0]);
        rutaAbsolutaImagenDos = (String) oRutasDePregunta.getOImagen().getImagenes().get(cuatroNumerosAleatorios[1]);
        rutaAbsolutaImagenTres = (String) oRutasDePregunta.getOImagen().getImagenes().get(cuatroNumerosAleatorios[2]);
        rutaAbsolutaImagenCuatro = (String) oRutasDePregunta.getOImagen().getImagenes().get(cuatroNumerosAleatorios[3]);
        numeroRespuesta = cuatroNumerosAleatorios[indiceRespuesta];
        rutaAbsolutaAudio = (String) oRutasDePregunta.getOAudio().getAudio().get(numeroRespuesta);
    }        
    private void abrirVentana(boolean respuesta)
    {
        if(respuesta)
        {
            VentanaAcierto correcto = new VentanaAcierto(this, true);
            correcto.setVisible(true);
            dispose();
        }
        else
        {
            VentanaError incorrecto = new VentanaError(this, true, rutaAbsolutaAudio);
            incorrecto.setVisible(true);
        }
    }
    
    private void crearSeñuelos(int rango)
    {
        cuatroNumerosAleatorios = oOperacion.arregloNumeroAleatorio(rango);
    }
    
    private int elegirIndiceRespuesta()
    {
        int indiceRespuesta;
        //De los cuatro números obtenidos elegiremos uno, este número será la posición del elegido. 
        return indiceRespuesta = oOperacion.numeroAleatorio(3);   
    }
    
    
}
