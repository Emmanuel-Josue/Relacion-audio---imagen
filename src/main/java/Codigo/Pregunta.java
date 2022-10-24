
package Codigo;

import java.io.Serializable;

public class Pregunta implements Serializable{
    
    private String respuesta;
    private int numeroRespuesta;
    
    //objetos de la que estara compuesta
    private Imagen OImagen;
    private Audio OAudio;
    
    //----------------------------INTERFACE-----------------------------
    public Pregunta()
    {
        //En este punto el objeto ya debe de contar con elementos en su colección 
        OImagen = new Imagen("C:\\Users\\user01\\Desktop\\Emmanuel\\Programacion\\JAVA\\Palabra_Imagen_Ingles\\src\\main\\java\\Recursos\\Imagenes verbos regulares\\");
        OAudio = new Audio("C:\\Users\\user01\\Desktop\\Emmanuel\\Programacion\\JAVA\\Palabra_Imagen_Ingles\\src\\main\\java\\Recursos\\Audio verbos regulares WAV\\");
    }

    public Imagen getOImagen() {
        return OImagen;
    }

    public Audio getOAudio() {
        return OAudio;
    }
    
    public void mostrarDatosDelObjeto()
    {
        System.out.println(":::::::::::..................LOS ELEMENTOS EN EL OBJETO PREGUNTA SON.................::::::::::");
        System.out.println("Rutas imagenes: ");
        for(int i = 0; i < OImagen.getImagenes().size(); i++)
        {
            System.out.println(OImagen.getImagenes().get(i));
        }
        System.out.println("");
        System.out.println("Rutas Audio: ");
        for(int i = 0; i < OAudio.getAudio().size(); i++)
        {
            System.out.println(OAudio.getAudio().get(i));
        }
    }
}
