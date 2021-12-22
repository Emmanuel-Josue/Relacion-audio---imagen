
package PaqueteVentanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
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
    JButton btnRegresar;
    
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
        btnRegresar = new JButton("REGRESAR");
        
        panelBotones.add(btnSalir);
        panelBotones.add(btnVerRespuesta);
        panelBotones.add(btnRegresar);
        
        panelPrincipal.add(panelBotones, BorderLayout.PAGE_END);
    }
    
}
