
package PaqueteUno;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Archivo {
    
    private File archivo = new File("DocumentoConNumeroRespuesta.txt");;
    private String cadena;

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
    
    public void crearArchivo()
    {
        //Siempre que se crea un archivo de texto la terminación o la extención debe ser
        // .txt
        //El ID nos marca error cuando existen errores que se puedan dar por default al 
        //tansolo crear un archivo, nos brinda la opcion de implementar el try - catch
        try {
            //archivo = new File("DocumentoConNumeroRespuesta.txt");
            if(archivo.createNewFile())
            {
                System.out.println("El archivo se ha creado sin problema.");
            }
        } 
        catch (IOException ex) 
        {
            System.err.print("El archivo no se ha creado correctamente. ");
        }
    }
    
    public void añadirTexto(String guardarTexto)
    {
        try 
        {
            //Esta clase con su objeto, se utiliza para escribir en los archivos que tengamos.
            // *con los siguientes simbolos podemos saltar de linea en los archivos -- \r\n -- 
            // El utilizar el true o false es un método diferente al de escribier, este sirve para añadir texto 
            FileWriter escribir = new FileWriter(archivo,true);// true: para poder escribir. false: para impedir la escritura.
            escribir.write(guardarTexto);
            //La siguiente linea es muy importante ya que sin ella por lo que entiendo no 
            //podriamos visualizar los datos guardados 
            //Lo que hace es cerrar el archivo de texto. 
            escribir.close();
            
        } 
        catch (IOException ex) 
        {
            System.err.println("NO SE HA PODIDO ESCRIVIR EN EL ARCHIVO");
        }
    }
    
    public String leerArchivo(String nombreArchivo)
    {
    
        //Algoritmo para leer un archivo de texto. 
        try {
            FileReader lector = new FileReader(nombreArchivo);
            BufferedReader lectura = new BufferedReader(lector);
            cadena = lectura.readLine();
            
        } 
        catch (FileNotFoundException ex) 
        {
            System.err.println("Error:  "+ex);
        }
        catch (IOException ex) 
        {
            System.err.println("Error: "+ex);
        }
        return cadena;
    }
    
}