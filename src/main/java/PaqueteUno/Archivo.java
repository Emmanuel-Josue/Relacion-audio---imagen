
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
    private String rutaRespuesta;
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
        //El error debe estar aqui ya que como el método es llamado dos veces no añade la línea solamente reescribe en el archivo sin guar-
        // dar la informacion que ahi se encuentra
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
        System.out.println("-------------------Entra el método leerArchivo-------------");
        
    
        if(coleccion.size() == 0)
        {
            System.out.println("ENTRO EL IF");
            //Algoritmo para leer un archivo de texto. 
            guardarElementos(nombreArchivo);
        }
        else
        {
            System.out.println("Entro el else");
            coleccion.clear();
            //Algoritmo para leer un archivo de texto. 
            guardarElementos(nombreArchivo);
        
        }
        return coleccion;
    }
    public String leerArachivo(String nombreArchivo, boolean obtenerRutaImagen)
    {
        try 
        {
            FileReader lector = new FileReader(nombreArchivo);
            BufferedReader lectura = new BufferedReader(lector);
            rutaRespuesta = lectura.readLine();
            //para que automaticamente salte a leer la linea que necesito.
            if(obtenerRutaImagen)
            {
                rutaRespuesta = lectura.readLine();
            }
            
            lectura.close();
        } 
        catch (FileNotFoundException ex) 
        {
            System.err.println("Error:  "+ex);
        }
        catch (IOException ex) 
        {
            System.err.println("Error: "+ex);
        }
        return rutaRespuesta;
    }
    
    public void guardarElementos(String nombreArchivo)
    {
        try 
            {
                FileReader lector = new FileReader(nombreArchivo);
                BufferedReader lectura = new BufferedReader(lector);
                //int iterador=0;
                cadena = lectura.readLine();
                System.out.println("Entrara el DO WHILE");
                do
                {
                    //System.out.println("Iterador: "+(iterador++));
                    coleccion.add(cadena);
                    cadena = lectura.readLine();
                }while(cadena != null);
                System.out.println("Sale el DO while");
                lectura.close();
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
    
}
