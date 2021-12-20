
package PaqueteUno;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Archivo {
    
    // No sé cómo funciona el constructor File, ya que no crea un archivo. 
    // ¿Qué va a pasar cuando quiera crear un archivo diferente?
//--    private File archivo = new File("DocumentoConNumeroRespuesta.txt");
    private String cadena;
    ArrayList coleccion = new ArrayList();

    /*
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
*/
    
    
    public void crearArchivo(File archivo)
    {
        //Siempre que se crea un archivo de texto la terminación o la extención debe ser
        // .txt
        //El ID nos marca error cuando existen errores que se puedan dar por default al 
        //tansolo crear un archivo, nos brinda la opcion de implementar el try - catch
        try 
        {
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
    
    public void añadirTexto(String guardarTexto, File archivo)
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
    
    public ArrayList leerArchivo(String nombreArchivo)
    {
    
        if(coleccion.size() == 0)
        {
            System.out.println("ENTRA EL MÉTODO leerArchivo en la opcion del if ");
        //Algoritmo para leer un archivo de texto. 
            try 
            {
                FileReader lector = new FileReader(nombreArchivo);
                BufferedReader lectura = new BufferedReader(lector);
                cadena = lectura.readLine();
                coleccion.add(cadena);
                int iterador=0;
                System.out.println("Entrara el WHILE");
                while(cadena != null)
                {
                    System.out.println("Iterador: "+(iterador++));
                    cadena = lectura.readLine();
                    coleccion.add(cadena);
                }
                System.out.println("Sale el while");
            } 
            catch (FileNotFoundException ex) 
            {
                System.err.println("Error:  "+ex);
            }
            catch (IOException ex) 
            {
                System.err.println("Error: "+ex);
            }
        }
        else
        {
            coleccion.clear();
            //Algoritmo para leer un archivo de texto. 
            try 
            {
                FileReader lector = new FileReader(nombreArchivo);
                BufferedReader lectura = new BufferedReader(lector);
                cadena = lectura.readLine();
                coleccion.add(cadena);
                int iterador=0;
                System.out.println("Entrara el WHILE");
                while(cadena != null)
               {
                    System.out.println("Iterador: "+(iterador++));
                    cadena = lectura.readLine();
                    coleccion.add(cadena);
                }
                System.out.println("Sale el while");
            } 
            catch (FileNotFoundException ex) 
            {
                System.err.println("Error:  "+ex);
            }
            catch (IOException ex) 
            {
                System.err.println("Error: "+ex);
            }
        
        }
        return coleccion;
    }
    
}
