
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
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;


public class VentanaAudioImagenBeta extends JFrame{
    
    /*
        * Insvestigar el algoritmo de obtener un número aleatorio y luego de eso 
            cacar a ese número de la lista 
        * Preparar los botones para recibir las rutas de las imagenes 
    
    
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
    
    ArrayList copiaImagenes = new ArrayList();
    ArrayList copiaAudio = new ArrayList();
    int[] cuatroNumerosAleatorios = new int[4];
    
    public VentanaAudioImagenBeta()
    {
        //creo que el diseño es el de por defecto 
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);// Centramos la ventana 
        setMinimumSize(new Dimension(200,200));// tamaño minimo que tendra 
        iniciarComponentes();    
    }
    
    public void iniciarComponentes()
    {
        panelPrincipal();
    }
    
    public void panelPrincipal()
    {
        // * El panel principal se dividira en 4 partes y el panel imagenes ocupara 3 cuartas partes, el panel boton audio ocupara 1 parte 
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());//Investigar como funciona el border layout, colocar los siguientes paneles anto arriba como abajao center y este 
        panelPrincipal.setBackground(Color.red);
        this.add(panelPrincipal);
        panelImagenes();
        panelBotonAudio();
        botonAudio();
        
        
    }
    public void panelImagenes()
    {
        panelImagenes = new JPanel();
        panelImagenes.setLayout(new GridLayout(2,2));
        btnImagenUno = new JToggleButton();
        // La posición que se indica en este método es ignorado a la ora de compilar,
        // por lo que creo es que esto pasa por que existe un Layout establecido, pero 
        // de igual forma utilizo esto para que me deje darle tamaño en la imagen al momento de 
        // inicializar el objeto de la calse ImageIcon
        btnImagenUno.setBounds(0,0,300,300);
        ImageIcon imagenBotonUno = new ImageIcon("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\37 rain.png");
        btnImagenUno.setIcon(new ImageIcon(imagenBotonUno.getImage().getScaledInstance(btnImagenUno.getWidth(),btnImagenUno.getHeight(),Image.SCALE_SMOOTH)));
        btnImagenDos = new JToggleButton();
        btnImagenDos.setBounds(0,0,300,300);
        ImageIcon imagenBotonDos = new ImageIcon("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\1 open.png");
        btnImagenDos.setIcon(new ImageIcon(imagenBotonDos.getImage().getScaledInstance(btnImagenDos.getWidth(),btnImagenDos.getHeight(), Image.SCALE_SMOOTH)));
        btnImagenTres = new JToggleButton();
        btnImagenTres.setBounds(0,0,300,300);
        ImageIcon imagenBotonTres = new ImageIcon("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\7 help.png");
        btnImagenTres.setIcon(new ImageIcon(imagenBotonTres.getImage().getScaledInstance(btnImagenTres.getWidth(),btnImagenTres.getHeight(), Image.SCALE_SMOOTH)));
        btnImagenCuatro = new JToggleButton();
        btnImagenCuatro.setBounds(0,0,300,300);
        ImageIcon imagenBotonCuatro = new ImageIcon("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\16 count.png");
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
        
        
    }
    
    public void oyenteAccionBotonUno()
    {
        ActionListener oyente = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                VentanaError ventana = new VentanaError(new JFrame(),true);
                ventana.setVisible(true);
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
                VentanaAcierto ventana = new VentanaAcierto(new JFrame(),true);
                ventana.setVisible(true);
            }
        };
        btnImagenDos.addActionListener(oyente);
        
    }
    
}
