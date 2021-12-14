
package PaqueteUno;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;


public class VentanaAcierto extends JDialog{
    
    JPanel panelPrincipal;
    JPanel panelEtiquetaAcierto;
    JPanel panelBotones;
    JButton btnSalir;
    JButton btnEstadistica;
    JButton btnSiguiente;

    public VentanaAcierto(Frame parent, boolean modal)
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
        panelEtiquetaAcierto();
        panelBotones();
    }
    
    public void panelPrincipal()
    {
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());//Investigar como funciona el border layout, colocar los siguientes paneles anto arriba como abajao center y este 
        panelPrincipal.setBackground(Color.red);
        this.add(panelPrincipal);
    }
    
    public void panelEtiquetaAcierto()
    {
        panelEtiquetaAcierto = new JPanel();
        panelEtiquetaAcierto.setBackground(Color.BLUE);
        panelPrincipal.add(panelEtiquetaAcierto, BorderLayout.CENTER);
    }
    
    public void panelBotones()
    {
        panelBotones = new JPanel();
        panelBotones.setBackground(Color.BLACK);
        btnSalir = new JButton("Salir");
        btnEstadistica = new JButton("Estadistica");
        btnSiguiente = new JButton("SIGUIENTE");
        
        panelBotones.add(btnSalir);
        panelBotones.add(btnEstadistica);
        panelBotones.add(btnSiguiente);
        
        panelPrincipal.add(panelBotones, BorderLayout.PAGE_END);
        oyenteAccionBotonSiguiente();
    }
    
    
    public void oyenteAccionBotonSiguiente()
    {
        System.out.println("ME EJECUTO YO EL OYENTE DE ACCIÓN");
        ActionListener oyente = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*
                Con estas 3 lineas el programa realiza las funciones basiscas que quiero que haga 
                la cuestion es que me pregunto si existira un problema en que cada vez que ponga en marcha 
                este oyente se creé un objeto, ¿Qué es lo que pasa con los anterires objetos que se han creado ?
                ¿ Pueden existir dos objetos de la misma clase con el mismo nombre?
                ¿Por qué la primera ventana no se cierra sino hasta que se cierra esta se cierra la primera ?
                */
                
                VentanaAudioImagenBeta ventana = new VentanaAudioImagenBeta(false);
                ventana.setVisible(true);
                dispose();


            }
        };
        btnSiguiente.addActionListener(oyente);
    }


    
}
