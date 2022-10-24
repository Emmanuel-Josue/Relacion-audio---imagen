/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigo;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo {
    
    private ArrayList coleccion; //Hay que inicializar esto. 
       
    public Archivo()
    {
        coleccion = new ArrayList();
    }    
    public void escribirBinario(Object objetoAGuardar)
    {
        try
        {
            FileOutputStream archivo = new FileOutputStream("C:\\Users\\user01\\Desktop\\Emmanuel\\Programacion\\JAVA\\Palabra_Imagen_Ingles\\src\\main\\java\\Recursos\\Archivos\\Archivo Binario.bin");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);

            escritura.writeObject(objetoAGuardar);

            escritura.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public Pregunta leerBinario(String ruta)
     {
         Pregunta cuestionamiento = null;
         FileInputStream archivo;
        try {
            archivo = new FileInputStream(ruta);
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            
            while(true)
            {
                cuestionamiento = (Pregunta) lectura.readObject();
            }
            
            
        } catch(EOFException e)
        {
            return cuestionamiento;
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         
         
         return cuestionamiento;
     }
     
     
    
}
