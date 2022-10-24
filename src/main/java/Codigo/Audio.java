
package Codigo;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Audio implements Serializable{
    
    private String rutaAudio; //AGREGAR RUTA DE AUDIO
    private ArrayList audio;
    
    
    public Audio(String rutaAudio)
    {
        this.rutaAudio = rutaAudio;
        audio = new ArrayList();
        this.listaAudios();
    }  
    public Audio()
    {
    
    }
    
    public void reproducirAudio(String direccionAudio)
    {
        try
        {
            //Esto es para que solo se ejecute una sola vez al abrise la ventana
            File archivo = new File(direccionAudio);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(archivo);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        }
        catch(UnsupportedAudioFileException objetoExcepcion)
        {
            //mejorar estos mensajes de error utilizando un jOpjoinpain
            System.out.println("Error encontrado, primera excepción en el audio  "+ objetoExcepcion);
        }
        catch(IOException objetoExcepcion)
        {
            //mejorar estos mensajes de error utilizando un jOpjoinpain
            System.out.println("Error encontrado, segunda excepción en el audio "+ objetoExcepcion);
        }
        catch(LineUnavailableException objetoExcepcion)
        {
            //mejorar estos mensajes de error utilizando un jOpjoinpain
            System.out.println("Error encontrado, tercera excepción en el audio: " + objetoExcepcion);
        }
    
    }

    public ArrayList getAudio() {
        return audio;
    }
    
    //--------------------------------------- IMPLEMENTACIÓN --------------------------------------
    
    private void listaAudios()
    {
        audio.add(rutaAudio + "1 OPEN.wav");
        audio.add(rutaAudio + "2 ACCEPT.wav");
        audio.add(rutaAudio + "3 LOVE.wav");
        audio.add(rutaAudio + "4 LEARN.wav");
        audio.add(rutaAudio + "5 HURRY.wav");
        audio.add(rutaAudio + "6 DARE.wav");
        audio.add(rutaAudio + "7 HELP.wav");
        audio.add(rutaAudio + "8 DANCE.wav");
        audio.add(rutaAudio + "9 ERASE.wav");
        audio.add(rutaAudio + "10 CHANGE.wav");
        audio.add(rutaAudio + "11 WALK.wav");
        audio.add(rutaAudio + "12 CLOSE.wav");
        audio.add(rutaAudio + "13 DATE.wav");
        audio.add(rutaAudio + "14 COOK.wav");
        audio.add(rutaAudio + "15 CONSIDER.wav");
        audio.add(rutaAudio + "16 COUNT.wav");  
        audio.add(rutaAudio + "17 ANSWER.wav");
        audio.add(rutaAudio + "18 WISH.wav");
        audio.add(rutaAudio + "19 START.wav");
        audio.add(rutaAudio + "20 PUSH.wav");
        audio.add(rutaAudio + "21 DELIVER.wav");
        audio.add(rutaAudio + "22 LISTEN.wav");
        audio.add(rutaAudio + "23 EXPECT.wav");
        audio.add(rutaAudio + "24 WAIT.wav");
        audio.add(rutaAudio + "25 STUDY.wav");
        audio.add(rutaAudio + "26 MISS.wav");
        audio.add(rutaAudio + "27 SMOKE.wav");
        audio.add(rutaAudio + "28 ENJOY.wav");
        audio.add(rutaAudio + "29 LIKE.wav");
        audio.add(rutaAudio + "30 TALK.wav");
        audio.add(rutaAudio + "31 INTEND.wav");
        audio.add(rutaAudio + "32 PLAY.wav");
        audio.add(rutaAudio + "33 WASH.wav");
        audio.add(rutaAudio + "34 CLEAN.wav");
        audio.add(rutaAudio + "35 ARRIVE.wav");
        audio.add(rutaAudio + "36 FILL.wav");
        audio.add(rutaAudio + "37 RAIN.wav");
        audio.add(rutaAudio + "38 LOOK.wav");
        audio.add(rutaAudio + "39 SHOW.wav");
        audio.add(rutaAudio + "40 NEED.wav");
        audio.add(rutaAudio + "41 NAME.wav");
        audio.add(rutaAudio + "42 ORDER.wav");
        audio.add(rutaAudio + "43 STOP.wav");
        audio.add(rutaAudio + "44 STAY.wav");
        audio.add(rutaAudio + "45 BELONG.wav");
        audio.add(rutaAudio + "46 PLAN.wav");
        audio.add(rutaAudio + "47 PLANT.wav");
        audio.add(rutaAudio + "48 PRACTICE.wav");
        audio.add(rutaAudio + "49 ASK.wav");
        audio.add(rutaAudio + "50 WANT.wav");
        audio.add(rutaAudio + "51 REMEMBER.wav");
        audio.add(rutaAudio + "52 RENT.wav");
        audio.add(rutaAudio + "53 REPEAT.wav");
        audio.add(rutaAudio + "54 RESIST.wav");
        audio.add(rutaAudio + "55 JUMP.wav");
        audio.add(rutaAudio + "56 FOLLOW.wav");
        audio.add(rutaAudio + "57 POINT.wav");
        audio.add(rutaAudio + "58 END.wav");
        audio.add(rutaAudio + "59 FINISH.wav");
        audio.add(rutaAudio + "60 WORK.wav");
        audio.add(rutaAudio + "61 TRY.wav");
        audio.add(rutaAudio + "62 CLIMB.wav");
        audio.add(rutaAudio + "63 USE.wav");
        audio.add(rutaAudio + "64 DRESS.wav");
        audio.add(rutaAudio + "65 TRAVEL.wav");
        audio.add(rutaAudio + "66 VISIT.wav");
        audio.add(rutaAudio + "67 LIVE.wav");
        audio.add(rutaAudio + "68 TURN.wav");
    }
    
     
}
