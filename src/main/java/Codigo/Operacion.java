
package Codigo;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

public class Operacion {
    
    private Random aleatorio;
    private Archivo archivista;
    
    public Operacion()
    {
        aleatorio = new Random();
        archivista = new Archivo();
    }
    
    // Creo que este algoritmo se puede mejorar cambiando los bucles While por 
    //un método de busqueda, si el nuevo número ya se tiene en un arrglo de 4 elementos 
    // que se vuelva a obtener uno nuevo que no sea uno de los que ya se tienen. 
    public int[] arregloNumeroAleatorio(int rangoNumeros)
    {
        System.out.println("----------------------arregloNumeroAleatorio()----------------------------");
        
        //el largo es cuatro porque es la cantidad de elementos que se necesita
        int [] arregloN=new int[4];
        int iterador=1;
        //se agrega en () el rango del numero en el que se generara el aleatorio en este 
        //caso el rango es de 0-6, son 7 números en este rango 
        arregloN[0]=aleatorio.nextInt(rangoNumeros);
        arregloN[iterador]=aleatorio.nextInt(rangoNumeros);//REVISAR SI SI EL RANDO DE NUMEROS ABARCA TODO EL ARREGLO
        System.out.println("Entran los bucles-----------<<<<<<<<<<<<");
        System.out.println("---"+arregloN[0]);
        while(arregloN[0]==arregloN[iterador])
        {
            arregloN[iterador]=aleatorio.nextInt(rangoNumeros);
        }
        System.out.println("---"+arregloN[iterador]);
        ++iterador;
        arregloN[iterador]=aleatorio.nextInt(rangoNumeros);
    
        //Recordar que el simbolo || significa 'o' y sirve para enlazar condicionales 
        while(arregloN[0]==arregloN[iterador] || arregloN[1]==arregloN[iterador])
        {
            arregloN[iterador]=aleatorio.nextInt(rangoNumeros);
        }
        System.out.println("---"+arregloN[iterador]);
        ++iterador;
        arregloN[iterador]=aleatorio.nextInt(rangoNumeros);
        while(arregloN[0]==arregloN[iterador] || arregloN[1]==arregloN[iterador] || arregloN[2]==arregloN[iterador])
        {
            arregloN[iterador]=aleatorio.nextInt(rangoNumeros);
        }
        System.out.println("---"+arregloN[iterador]);
        
        System.out.println("SALEN LOS BUCLES----------------------->>>>>>>>>>>>>>>>>>");
    
        return arregloN;
    }

    
    public int numeroAleatorio(int rangoNumeros)
    {
        int numeroAleatorio;
        numeroAleatorio = aleatorio.nextInt(rangoNumeros);
        return numeroAleatorio;
    }
    public boolean verificarRespuesta(int numeroRespuesta, int numeroElegido, Pregunta oPregunta)
    {
        boolean respuesta;
        if(numeroRespuesta == numeroElegido)           
        {
            //Se eliminan los elementos de esta pregunta para que no sean repetidos en el resto del programa. 
            this.eliminarRespuesta(oPregunta, numeroRespuesta);
            archivista.escribirBinario(oPregunta);
            respuesta = true;                     
        }
        else
        {
            System.out.println("Has elegido una respuesta incorrecta");
            respuesta = false;
        }
        return respuesta;
    }
    public int rutaDuplicada(ArrayList coleccion, String rutaRespuesta)
    {
        //Si se devuelve el ( -1 ) es porque la ruta no esta en la coleccion
        int duplicado = -1;        
        for(int i = 0; i < coleccion.size(); i++)
        {
            if(rutaRespuesta.equals((String) coleccion.get(i)))
            {
                duplicado = i;
            }
        }
        return duplicado;
    }
    
    public void cambiarRuta(int posicionRuta, int posicionRespuesta, ArrayList coleccion, String rutaRespuesta)
    {
        if(posicionRuta != -1)
        {
            if(posicionRuta != posicionRespuesta)
            {
                intercambio(posicionRuta, posicionRespuesta, coleccion);
            }
            else
            {
                //La ruta ya esta en la posición en la que deberia estar. 
            }
        }
        else if(posicionRuta == -1)            
        {
            coleccion.set(posicionRespuesta, rutaRespuesta);
        }
    }
    public String establecerRuta(File archivo)
    {
        String ruta;
        int posicion;
        int longitudDeNombre;
        int longitudDeRuta;
        ruta = archivo.getPath();
        longitudDeNombre = ruta.length();
        ruta = archivo.getAbsolutePath();
        longitudDeRuta = ruta.length();
        posicion = longitudDeRuta - longitudDeNombre;
        ruta = ruta.substring(0, posicion) + "src\\main\\java\\Recursos\\Imagenes para el proyecto\\" + ruta.substring(posicion);
        return ruta;
    }
                 
    //--------------------------------------- IMPLEMENTACIÓN --------------------------------------
    
    private void eliminarRespuesta(Pregunta elementos, int posicionAEliminar)
    {
        if(elementos.getOImagen().getImagenes().size() <= 3 & elementos.getOImagen().getImagenes().size() >= 1 )
        {
            elementos.getOAudio().getAudio().remove(0);
            elementos.getOImagen().getImagenes().remove(0);
        }
        else if(elementos.getOImagen().getImagenes().size() > 3)
        {
            elementos.getOAudio().getAudio().remove(posicionAEliminar);
            elementos.getOImagen().getImagenes().remove(posicionAEliminar);
        }
        else if(elementos.getOImagen().getImagenes().size() == 0)
        {
            System.out.println("------------------------EL PROGRAMA SE HA TERMINADO EXITOSAMENTE------------------------");
        }
    }
       
    private void intercambio(int posicionRutaRespuesta, int posicionRespuesta, ArrayList coleccion)
    {
        String temporal;
        String respuesta;
        temporal = (String) coleccion.get(posicionRespuesta);
        respuesta = (String) coleccion.get(posicionRutaRespuesta);
        coleccion.set(posicionRespuesta, respuesta);
        coleccion.set(posicionRutaRespuesta, temporal);
        
    }
    
}
