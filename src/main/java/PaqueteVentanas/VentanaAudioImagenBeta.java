
package PaqueteVentanas;

import PaqueteUno.Acciones;
import PaqueteUno.Archivo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;


public class VentanaAudioImagenBeta extends JFrame{
    
    /*
        * En la clase archivo hay que hacer dos metodos para escribir en él, el primero 
          será para empezar a escribir y el segundo para añadir texto a este archivo
        * En el método guardarElementosActuales hay que ver como podemos resolver la excepcion 
          que manda cuando colocamos el if para decidir se se borra el archivo o no se borra 
        * ver que algoritmo implementare para que en el caso de que la ventana se cierre 
          de forma abrupta todo vuelba a su normalidad, cuando esto ocurra ¿seria mejor 
          gurdar el avance del usuario o que el programa comience desde cero?
    
    
    */
    
    /*
    Notas para dejar en el programa 
    La variable numeroRespuesta es la posición que se leliminara de 
    la colección, no coincide con la enumeración que se le dio a las 
    imagenes y audios 
    */
    
    private JPanel panelPrincipal;
    private JPanel panelImagenes;
    private JPanel panelBotonAudio;
    private GridBagConstraints establecerPosicion;
    private JButton btnAudio;
    private JToggleButton btnImagenUno;
    private JToggleButton btnImagenDos;
    private JToggleButton btnImagenTres;
    private JToggleButton btnImagenCuatro;
    private String rutaAbsolutaImagenUno;
    private String rutaAbsolutaImagenDos;
    private String rutaAbsolutaImagenTres;
    private String rutaAbsolutaImagenCuatro;
    private String rutaAbsolutaAudio;
    private String rutaAbsolutaImagen;
    private int indiceNumeroAleatorioRespuesta;
    private int cantidadElementosColeccion;
    private int numeroRespuesta;// Es la posición de la respuesta(imagen o audio) que se ha elegido de las colecciones  
    
    ArrayList copiaImagenes = new ArrayList();
    ArrayList copiaAudio = new ArrayList();
    ArrayList coleccionTemporal = new ArrayList();
    int[] cuatroNumerosAleatorios = new int[4];
    
    private Acciones objetoAcciones = new Acciones();
    private Archivo objetoArchivo = new Archivo();
    
    private File archivoImagenes = new File("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\Archivo con rutas de imagenes.txt");
    private File archivoAudio = new File("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\Archivo con rutas de audios.txt");
    private File archivoRespuestaCorrecta = new File("Archivo con respuesta correcta");
    
    public VentanaAudioImagenBeta(boolean verdaderoFalso)
    {
        if(verdaderoFalso)
        {
            //debe entrar solamente si es la primera vez que se comenzara el programa
            //creo que el diseño es el de por defecto 
            setSize(600,600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
            setLocationRelativeTo(null);// Centramos la ventana 
            setMinimumSize(new Dimension(200,200));// tamaño minimo que tendra 
            iniciarComponentes(verdaderoFalso); 
        }
        else
        {
            setSize(600,600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
            setLocationRelativeTo(null);// Centramos la ventana 
            setMinimumSize(new Dimension(200,200));// tamaño minimo que tendra 
            iniciarComponentes(verdaderoFalso); 
        }
    }
    //Lo creo para poder crear objetos en otras clases sin inicializar todo el 
    //código de la ventana
    public VentanaAudioImagenBeta()
    {
    
    }
    
    
    public void iniciarComponentes(boolean verdaderoFalso)
    {
        if(verdaderoFalso)
        {
            //debe entrar solamente si es la primera vez que se comenzara el programa
            panelPrincipal();
            panelImagenes();
            duplicacionColecciones();
            asignacionRutasAbsolutas();// Este método debe ir antes para que al inicializarse los botoes ya tengan una ruta asignada 
            inicializarBotones();
            panelBotonAudio();
            botonAudio();
        }
        else
        {
            panelPrincipal();
            panelImagenes();
            obtencionRutasColeccion();//esto es lo cambia a diferencia del if
            asignacionRutasAbsolutas();
            inicializarBotones();
            panelBotonAudio();
            botonAudio();
        }
    }
    
    public void panelPrincipal()
    {
        // * El panel principal se dividira en 4 partes y el panel imagenes ocupara 3 cuartas partes, el panel boton audio ocupara 1 parte 
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());//Investigar como funciona el border layout, colocar los siguientes paneles anto arriba como abajao center y este 
        panelPrincipal.setBackground(Color.red);
        this.add(panelPrincipal);
    }
    public void panelImagenes()
    {
        panelImagenes = new JPanel();
        panelImagenes.setLayout(new GridLayout(2,2));
        
    }
    public void duplicacionColecciones()
    {
        copiaAudio = objetoAcciones.coleccionAudio();
        copiaImagenes = objetoAcciones.coleccionImagenes();
    }
    //REFINAR ESTE MÉTODO
    public void obtencionRutasColeccion()
    {
        System.out.println("-----------------Entra el método obtencionRutasColeccion---------------");
        System.out.println("El número de elementos en la colección copiaAudio es de: "+copiaAudio.size());
        System.out.println("El número de elementos en la colección copiaAudio es de: "+copiaImagenes.size());
        if(copiaAudio.size() != 0 & copiaImagenes.size() != 0)
        {
            System.out.println("ENTRA EL IF DEL MÉTODO obtencionRutasColeccion--------------------");
            copiaAudio.clear();
            copiaImagenes.clear();
        }
        else
        {
            //ANALIZAR EL PORQUE DEBE DE SER ASÍ EL ALGORITMO 
            coleccionTemporal = objetoArchivo.leerArchivo("Archivo con rutas de imagenes.txt");
            for(int iterador = 0;iterador < coleccionTemporal.size();iterador++)//---------------------ESTA ESTRUCTURA PRINCIPALMETE ¿PORQUE NO PUEDE IR EL METODO EN ES PUNTO 
            {
                copiaImagenes.add(coleccionTemporal.get(iterador));
            }
            coleccionTemporal = objetoArchivo.leerArchivo("Archivo con rutas de audios.txt");
            for(int iterador = 0;iterador < coleccionTemporal.size();iterador++)
            {
                copiaAudio.add(coleccionTemporal.get(iterador));
            }
        }
        System.out.println("COLECCIÓN AUDIO-----------------------------------------------------\n");
        for(int i=0;i<copiaAudio.size();i++)
        {
            System.out.println("Posicion de la colección: "+i+" "+(String) copiaAudio.get(i));
        }
        System.out.println("COLECCIÓN IMAGENES--------------------------------------------\n");
        for(int i=0;i<copiaImagenes.size();i++)
        {
            System.out.println("Posición de la colección: "+i+" "+(String) copiaImagenes.get(i));
        }
        
    }
    public void asignacionRutasAbsolutas()
    {
        //El rango debe ser el número de imagenes que tenemos, este debe ir cambian-
        //do conforme se vallan quitando los elementos de la colección
        cuatroNumerosAleatorios = objetoAcciones.arregloNumeroAleatorio(copiaAudio.size());//MODIFIQUE ESTA PARTE 
        indiceNumeroAleatorioRespuesta = objetoAcciones.numeroAleatorio(3);
        rutaAbsolutaImagenUno = (String) copiaImagenes.get(cuatroNumerosAleatorios[0]);
        rutaAbsolutaImagenDos = (String) copiaImagenes.get(cuatroNumerosAleatorios[1]);
        rutaAbsolutaImagenTres = (String) copiaImagenes.get(cuatroNumerosAleatorios[2]);
        rutaAbsolutaImagenCuatro = (String) copiaImagenes.get(cuatroNumerosAleatorios[3]);
        numeroRespuesta = cuatroNumerosAleatorios[indiceNumeroAleatorioRespuesta];
        rutaAbsolutaAudio = (String) copiaAudio.get(numeroRespuesta);
        //variable para utilizar en método comparacionNumeros
        rutaAbsolutaImagen = (String) copiaImagenes.get(numeroRespuesta);
        
        
    }
    
    //Este método aún no se utiliza
    public void asignacionRutasAbsolutas(ArrayList copiaAudioActual, ArrayList copiaImagenesActual, int posicionAEliminar)
    {
        cantidadElementosColeccion = copiaAudioActual.size();//tome esta colección, pero igualmente se puede utilizar la colección de imagenes
       
        cuatroNumerosAleatorios = objetoAcciones.arregloNumeroAleatorio(cantidadElementosColeccion-1);
        indiceNumeroAleatorioRespuesta = objetoAcciones.numeroAleatorio(3);
        rutaAbsolutaImagenUno = (String) copiaImagenes.get(cuatroNumerosAleatorios[0]);
        rutaAbsolutaImagenDos = (String) copiaImagenes.get(cuatroNumerosAleatorios[1]);
        rutaAbsolutaImagenTres = (String) copiaImagenes.get(cuatroNumerosAleatorios[2]);
        rutaAbsolutaImagenCuatro = (String) copiaImagenes.get(cuatroNumerosAleatorios[3]);
        //El númeroRespuesta deriva de los cuatro números aleatorios obtenidos ante-
        //riormente y 1 numero aleatorio obtenido de estos cuatro. 
        numeroRespuesta = cuatroNumerosAleatorios[indiceNumeroAleatorioRespuesta];
        rutaAbsolutaAudio = (String) copiaAudio.get(numeroRespuesta);          
    }
    
    public void inicializarBotones()
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
    
    public void panelBotonAudio()
    {
        panelBotonAudio = new JPanel();
        panelBotonAudio.setBackground(Color.BLACK);
        panelPrincipal.add(panelBotonAudio,BorderLayout.PAGE_END);
       // panelBotonAudio
    }
    
    public void botonAudio()
    {
        btnAudio = new JButton("AUDIO");
        btnAudio.setPreferredSize(new Dimension(600,50));
        panelBotonAudio.add(btnAudio);
        reproducirAudio(rutaAbsolutaAudio);
        oyenteAccionBotonAudio();
        
    }
    public void reproducirAudio(String direccionAudio)
    {
        try
        {
            //Esto es para que solo se ejecute una sola vez al abrise la ventana
            File archivo = new File(direccionAudio);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(archivo);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        }
        catch(UnsupportedAudioFileException objetoExcepcion)
        {
            //mejorar estos mensajes de error utilizando un jOpjoinpain
            System.out.println("Error encontrado ");
        }
        catch(IOException objetoExcepcion)
        {
            //mejorar estos mensajes de error utilizando un jOpjoinpain
            System.out.println("Error encontrado ");
        }
        catch(LineUnavailableException objetoExcepcion)
        {
            //mejorar estos mensajes de error utilizando un jOpjoinpain
            System.out.println("Error encontrado ");
        }
    
    }
    
    public void oyenteAccionBotonAudio()
    {
        ActionListener oyente = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                reproducirAudio(rutaAbsolutaAudio);
            }
        };
        btnAudio.addActionListener(oyente);
    }
    
    public void oyenteAccionBotonUno()
    {
        ActionListener oyente = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //Se comparan los numeros no las rutas absolutas
                comparacionNumeros(cuatroNumerosAleatorios[0]);
            }
        };
        btnImagenUno.addActionListener(oyente);
        
    }
    
    public void oyenteAccionBotonDos()
    {
        ActionListener oyente = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //Se comparan los numeros no las rutas absolutas
                comparacionNumeros(cuatroNumerosAleatorios[1]);
            }
        };
        btnImagenDos.addActionListener(oyente);
        
    }
    
    public void oyenteAccionBotonTres()
    {
        ActionListener oyente = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //Se comparan los numeros no las rutas absolutas
                comparacionNumeros(cuatroNumerosAleatorios[2]);
            }
        };
        btnImagenTres.addActionListener(oyente);
        
    }
    
    public void oyenteAccionBotonCuatro()
    {
        ActionListener oyente = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //Se comparan los numeros no las rutas absolutas
                comparacionNumeros(cuatroNumerosAleatorios[3]);
            }
        };
        btnImagenCuatro.addActionListener(oyente);
        
    }
    
    public void comparacionNumeros(int numeroBotonPrecionado)
    {
        if(numeroBotonPrecionado == numeroRespuesta)
        { 
            System.out.println("Número a eliminar es: "+numeroRespuesta);
            guardarElementosActuales(archivoImagenes, copiaImagenes);
            guardarElementosActuales(archivoAudio, copiaAudio);
            VentanaAcierto ventana = new VentanaAcierto(new JFrame(),true);
            ventana.setVisible(true);
            dispose();
        }
        else
        {
            guardarRutaRespuestaCorrecta(archivoRespuestaCorrecta, rutaAbsolutaAudio, rutaAbsolutaImagen);
            VentanaError ventana = new VentanaError(new JFrame(),true);
            ventana.setVisible(true);
        }
    }
    public void guardarElementosActuales(File archivo,ArrayList coleccionGuardar)
    {
        System.out.println("-------------------entra metodo guardarElementosActuales---------------------");
        //El archivo que se utiliza aquí, se estara creando y eliminando 
        //constantemente, es un archivo que guarda temporalmete las direcciones 
        //de los elementos utilizados que no se han seleccionado como respuesta, por
        //esta razon no se lleva un control en git de este mismo. 
        if(archivo.exists())
        {
            /*
            System.out.println("Entrael if y el método .exists devuelve:  "+archivo.exists());
            System.out.println("Se implementa el método de ELIMINACIÓN: "+archivo.delete());
            System.out.println("El método .exists da como resulataod "+archivo.exists());
*/
            archivo.delete();
            coleccionGuardar.remove(numeroRespuesta);
            objetoArchivo.crearArchivo(archivo);
            System.out.println("Posición eliminada de la colección: "+ numeroRespuesta);
                for(int i=0;i<coleccionGuardar.size();i++)
                {
                //    System.out.println((String) coleccionGuardar.get(i));
                    objetoArchivo.añadirTexto((String) coleccionGuardar.get(i)+"\r\n", archivo);            
                }
            System.out.println("Se elimino posicion y ahora la coleccion debe tener "+coleccionGuardar.size()+" elementos.");
        
        }
        else
        {
            System.out.println("Entra el ELSE del método guardarElementosActuales");
            coleccionGuardar.remove(numeroRespuesta);
            objetoArchivo.crearArchivo(archivo);
                for(int i=0;i<coleccionGuardar.size();i++)
                {
                    System.out.println("Enta el for del método guardarElementosActuales");
                    System.out.println("La cantidad de elementos en la colección es de "+coleccionGuardar.size());
                    System.out.println((String) coleccionGuardar.get(i));
                    objetoArchivo.añadirTexto((String) coleccionGuardar.get(i)+"\r\n", archivo);            
                }
        }

    }
    //Optinizar este método si es que lo sigo utilizando en diferentes métodos
    public void guardarRutaRespuestaCorrecta(File archivo, String rutaRespuestaAudio, String rutaRespuestaImagen)
    {
        if(archivo.exists())
        {   
            //Existe un problema al llamar dos veces al método añadirTexto
            archivo.delete();
            objetoArchivo.crearArchivo(archivo);
            objetoArchivo.añadirTexto(rutaRespuestaAudio, archivo);
            objetoArchivo.añadirTexto(rutaRespuestaImagen, archivo); 
        }
        else
        {
            objetoArchivo.crearArchivo(archivo);
            objetoArchivo.añadirTexto(rutaRespuestaAudio, archivo); 
            objetoArchivo.añadirTexto(rutaRespuestaImagen, archivo);
        }
    }
    
    public ArrayList getCopiaAudio()
    {
        return copiaAudio;
    }
    public ArrayList getCopiaImagenes()
    {
        return copiaImagenes;
    }
    
    public int getNumeroRespuesta()
    {
        return numeroRespuesta;
    }
    
}
