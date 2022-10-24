/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigo;

import java.io.Serializable;
import java.util.ArrayList;


public class Imagen implements Serializable{
    
    private String rutaImagen = "";// AGRAGAR DIRECCIÓN 
    private ArrayList imagenes;
    
    //El parametro será la ubicación de los archivos a utilizar
    public Imagen(String rutaImagen)
    {
        this.rutaImagen = rutaImagen;
        imagenes = new ArrayList();
        this.listaImagenes();//Con esto el objeto empieza con elementos en su interior
    }
    
    public ArrayList getImagenes() 
    {
        return imagenes;
    }
        
    //--------------------------------------- IMPLEMENTACIÓN --------------------------------------
    
    private void listaImagenes()
    {
        imagenes.add(rutaImagen + "1 open.png");
        imagenes.add(rutaImagen + "2 accept.png");
        imagenes.add(rutaImagen + "3 love.png");
        imagenes.add(rutaImagen + "4 learn.png");
        imagenes.add(rutaImagen + "5 hurry.png");
        imagenes.add(rutaImagen + "6 dare.png");
        imagenes.add(rutaImagen + "7 help.png");
        imagenes.add(rutaImagen + "8 dance.png");
        imagenes.add(rutaImagen + "9 erase.png");
        imagenes.add(rutaImagen + "10 change.png");
        imagenes.add(rutaImagen + "11 walk.png");
        imagenes.add(rutaImagen + "12 close.png");
        imagenes.add(rutaImagen + "13 date.png");
        imagenes.add(rutaImagen + "14 cook.png");
        imagenes.add(rutaImagen + "15 consider.png");
        imagenes.add(rutaImagen + "16 count.png");
        imagenes.add(rutaImagen + "17 Answer.png");
        imagenes.add(rutaImagen + "18 wish.png");
        imagenes.add(rutaImagen + "19 start.png");
        imagenes.add(rutaImagen + "20 push.png");
        imagenes.add(rutaImagen + "21 deliver.png");
        imagenes.add(rutaImagen + "22 listen.png");
        imagenes.add(rutaImagen + "23 expect.png");
        imagenes.add(rutaImagen + "24 wait.png");
        imagenes.add(rutaImagen + "25 study.png");
        imagenes.add(rutaImagen + "26 miss.png");
        imagenes.add(rutaImagen + "27 smoke.png");
        imagenes.add(rutaImagen + "28 enjoy.png");
        imagenes.add(rutaImagen + "29 like.png");
        imagenes.add(rutaImagen + "30 talk.png");
        imagenes.add(rutaImagen + "31 intend.png");
        imagenes.add(rutaImagen + "32 play.png");
        imagenes.add(rutaImagen + "33 wash.png");
        imagenes.add(rutaImagen + "34 clean.png");
        imagenes.add(rutaImagen + "35 arrive.png");
        imagenes.add(rutaImagen + "36 fill.png");
        imagenes.add(rutaImagen + "37 rain.png");
        imagenes.add(rutaImagen + "38 look.png");
        imagenes.add(rutaImagen + "39 show.png");
        imagenes.add(rutaImagen + "40 need.png");
        imagenes.add(rutaImagen + "41 name.png");
        imagenes.add(rutaImagen + "42 order.png");
        imagenes.add(rutaImagen + "43 stop.png");
        imagenes.add(rutaImagen + "44 stay.png");
        imagenes.add(rutaImagen + "45 belong.png");
        imagenes.add(rutaImagen + "46 plan.png");
        imagenes.add(rutaImagen + "47 plant.png");
        imagenes.add(rutaImagen + "48 practice.png");
        imagenes.add(rutaImagen + "49 ask.png");
        imagenes.add(rutaImagen + "50 want.png");
        imagenes.add(rutaImagen + "51 remember.png");
        imagenes.add(rutaImagen + "52 rent.png");
        imagenes.add(rutaImagen + "53 repeat.png");
        imagenes.add(rutaImagen + "54 resist.png");
        imagenes.add(rutaImagen + "55 jump.png");
        imagenes.add(rutaImagen + "56 follow.png");
        imagenes.add(rutaImagen + "57 point.png");
        imagenes.add(rutaImagen + "58 end.png");
        imagenes.add(rutaImagen + "59 finish.png");
        imagenes.add(rutaImagen + "60 work.png");
        imagenes.add(rutaImagen + "61 try.png");
        imagenes.add(rutaImagen + "62 climb.png");
        imagenes.add(rutaImagen + "63 use.png");
        imagenes.add(rutaImagen + "64 dress.png");
        imagenes.add(rutaImagen + "65 travel.png");
        imagenes.add(rutaImagen + "66 visit.png");
        imagenes.add(rutaImagen + "67 live.png");
        imagenes.add(rutaImagen + "68 turn.png");

    }

    
}
