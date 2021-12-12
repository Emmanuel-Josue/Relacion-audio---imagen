
package PaqueteUno;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
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
    private int indiceNumeroAleatorioRespuesta;
    private int cantidadElementosColeccion;
    private int numeroRespuesta;
    
    ArrayList copiaImagenes = new ArrayList();
    ArrayList copiaAudio = new ArrayList();
    int[] cuatroNumerosAleatorios = new int[4];
    
    Acciones objetoAcciones = new Acciones();
    Archivo objetoArchivo = new Archivo();
    
    
    public VentanaAudioImagenBeta()
    {
        //creo que el diseño es el de por defecto 
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);// Centramos la ventana 
        setMinimumSize(new Dimension(200,200));// tamaño minimo que tendra 
        iniciarComponentes();    
    }
    //Lo creo para poder crear objetos en otras clases sin inicializar todo el 
    //código de la ventana
    public VentanaAudioImagenBeta(boolean verdaderoFalso)
    {
    
    }
    
    public void iniciarComponentes()
    {
        panelPrincipal();
        panelImagenes();
        asignacionRutasAbsolutas();// Este método debe ir antes para que al inicializarse los botoes ya tengan una ruta asignada 
        inicializarBotones();
        panelBotonAudio();
        botonAudio();
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
        System.out.println("Se ejecuta método panelImagenes\n\n");
        panelImagenes = new JPanel();
        panelImagenes.setLayout(new GridLayout(2,2));
        
    }
    public void asignacionRutasAbsolutas()
    {
        System.out.println("Se ejecuta método asignacionRutasAbsolutas\n");
        copiaAudio = objetoAcciones.coleccionAudio();
        copiaImagenes = objetoAcciones.coleccionImagenes();
        //El rango debe ser el número de imagenes que tenemos, este debe ir cambian-
        //do conforme se vallan quitando los elementos de la colección
        cuatroNumerosAleatorios = objetoAcciones.arregloNumeroAleatorio(67);
        indiceNumeroAleatorioRespuesta = objetoAcciones.numeroAleatorio(3);
        rutaAbsolutaImagenUno = (String) copiaImagenes.get(cuatroNumerosAleatorios[0]);
        rutaAbsolutaImagenDos = (String) copiaImagenes.get(cuatroNumerosAleatorios[1]);
        rutaAbsolutaImagenTres = (String) copiaImagenes.get(cuatroNumerosAleatorios[2]);
        rutaAbsolutaImagenCuatro = (String) copiaImagenes.get(cuatroNumerosAleatorios[3]);
        numeroRespuesta = cuatroNumerosAleatorios[indiceNumeroAleatorioRespuesta];
        rutaAbsolutaAudio = (String) copiaAudio.get(numeroRespuesta);
        System.out.println("La ruta del audio es:  "+rutaAbsolutaAudio);
        System.out.println("La ruta de imagen 1:"+rutaAbsolutaImagenUno);
        System.out.println("La ruta de imagen 2:"+rutaAbsolutaImagenDos);
        System.out.println("La ruta de imagen 3:"+rutaAbsolutaImagenTres);
        System.out.println("La ruta de imagen 4:"+rutaAbsolutaImagenCuatro);
        
        System.out.println(cuatroNumerosAleatorios[0]);
        System.out.println(cuatroNumerosAleatorios[1]);
        System.out.println(cuatroNumerosAleatorios[2]);
        System.out.println(cuatroNumerosAleatorios[3]);
        System.out.println("Numero de respuesta"+cuatroNumerosAleatorios[indiceNumeroAleatorioRespuesta]);
        
    }
    public void asignacionRutasAbsolutas(ArrayList copiaAudioActual, ArrayList copiaImagenesActual, int posicionAEliminar)
    {
        //verificar que este modificando los arreglos de copias con los que se empezo. 
        System.out.println("Variable posicion a eliminar: "+posicionAEliminar);
        System.out.println("La variable numeroAleatorioRespuesta_: " + indiceNumeroAleatorioRespuesta);
        System.out.println("El número a borrar de la lista es: "+cuatroNumerosAleatorios[indiceNumeroAleatorioRespuesta]);
        copiaAudioActual.remove(posicionAEliminar);
        copiaImagenesActual.remove(posicionAEliminar);
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
        reproducirAudio();
        oyenteAccionBotonAudio();
        
    }
    public void reproducirAudio()
    {
        try
        {
            //Esto es para que solo se ejecute una sola vez al abrise la ventana
            File archivo = new File(rutaAbsolutaAudio);
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
                reproducirAudio();
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
        System.out.println("Entra método comparacionNumeros");
        System.out.println("Numero enviado por el boton"+numeroBotonPrecionado);
        System.out.println("Numero de la imagen (respuesta) "+cuatroNumerosAleatorios[indiceNumeroAleatorioRespuesta]);
        if(numeroBotonPrecionado == cuatroNumerosAleatorios[indiceNumeroAleatorioRespuesta])
        { 
            guardarElementosActuales();
            //objetoArchivo.añadirTexto(Integer.toString(numeroRespuesta));//se comvierte el int a String y se manda al archivo 
            VentanaAcierto ventana = new VentanaAcierto(new JFrame(),true);
            ventana.setVisible(true);
            dispose();
        }
        else
        {
            System.out.println("Entra el else ");
            VentanaError ventana = new VentanaError(new JFrame(),true);
            ventana.setVisible(true);
        }
    }
    public void guardarElementosActuales()
    {
        // Funciona, solo hay que implementar el if para decidir si se borra el archivo 
        // actual o no. 
        try
        {
            System.out.println("Entra el TRY");
            if(objetoArchivo.getArchivo().exists())
            {
                System.out.println("Entra el IF del TRY");
                objetoArchivo.getArchivo().delete();
                copiaAudio.remove(numeroRespuesta);
                copiaImagenes.remove(numeroRespuesta);
                objetoArchivo.crearArchivo();
                System.out.println("Posición eliminada de la colección: "+ numeroRespuesta);
                    for(int i=0;i<copiaAudio.size();i++)
                    {
                        System.out.println("Enta el for del método guardarElementosActuales");
                        System.out.println("La cantidad de elementos en la colección es de "+copiaAudio.size());
                        System.out.println((String) copiaAudio.get(i));
                        objetoArchivo.añadirTexto((String) copiaAudio.get(i)+"\r\n");            
                    }
        
            }
            else
            {
                System.out.println("Ocurrio un error, el método .exists devolvio un false");
            }
        }
        catch(NullPointerException objetoDeLaExcepcion)
        {
            System.out.println("Se ejecuta el CATCH");
            copiaAudio.remove(numeroRespuesta);
            copiaImagenes.remove(numeroRespuesta);
            objetoArchivo.crearArchivo();
                for(int i=0;i<copiaAudio.size();i++)
                {
                    System.out.println("Enta el for del método guardarElementosActuales");
                    System.out.println("La cantidad de elementos en la colección es de "+copiaAudio.size());
                    System.out.println((String) copiaAudio.get(i));
                    objetoArchivo.añadirTexto((String) copiaAudio.get(i)+"\r\n");            
                }
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
