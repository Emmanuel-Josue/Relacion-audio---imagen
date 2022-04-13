
package PaqueteVentanas;

import PaqueteUno.Archivo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author user01
 */
public class VentanaError extends JDialog{
    
    JPanel panelPrincipal;
    JPanel panelEtiquetaError;
    JPanel panelBotones;
    JButton btnSalir;
    JButton btnVerRespuesta;
    JButton btnRepetir;
    private String rutaAudio;
    
    private Archivo objetoArchivo =new Archivo();
    private VentanaAudioImagenBeta objetoVentanaBeta = new VentanaAudioImagenBeta();
    
    public VentanaError(Frame parent, boolean modal)
    {
        super(parent, modal);//volver a investigar esta linea. 
        setSize(600,300);
        setLocationRelativeTo(null);// Centramos la ventana 
        setMinimumSize(new Dimension(200,200));// tamaño minimo que tendra 
        iniciarComponentes();
    }
    
    public void iniciarComponentes()
    {
        panelPrincipal();
        panelEtiquetaError();
        panelBotones();
    }
    
    public void panelPrincipal()
    {
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());//Investigar como funciona el border layout, colocar los siguientes paneles anto arriba como abajao center y este 
        panelPrincipal.setBackground(Color.red);
        this.add(panelPrincipal);
    }
    
    public void panelEtiquetaError()
    {
        panelEtiquetaError = new JPanel();
        panelEtiquetaError.setBackground(Color.GREEN);
        panelPrincipal.add(panelEtiquetaError, BorderLayout.CENTER);
    }
    
    public void panelBotones()
    {
        panelBotones = new JPanel();
        panelBotones.setBackground(Color.BLACK);
        btnSalir = new JButton("Salir");
        btnVerRespuesta = new JButton("Ver respuesta");
        btnRepetir = new JButton("¡ REINTENTAR !");
        
        panelBotones.add(btnSalir);
        panelBotones.add(btnVerRespuesta);
        panelBotones.add(btnRepetir);
        
        panelPrincipal.add(panelBotones, BorderLayout.PAGE_END);
        oyenteAccionBotonSalir();
        oyenteAccionBotonRepetir();
        oyenteAccionBotonVerRespuesta();
    }
    public void oyenteAccionBotonSalir()
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
    public void oyenteAccionBotonRepetir()
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
                rutaAudio = objetoArchivo.leerArachivo("Archivo con respuesta correcta.txt", false);
                objetoVentanaBeta.reproducirAudio(rutaAudio);
                dispose();
            }
        };
        btnRepetir.addActionListener(oyente);
    
    }
    public void oyenteAccionBotonVerRespuesta()
    {
        ActionListener oyente = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            { 
                //en este boton solamente abrire otra ventana. 
                
            }
        };
        btnVerRespuesta.addActionListener(oyente);
        
    }
    
}
