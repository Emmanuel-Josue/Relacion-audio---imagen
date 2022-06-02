/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteUno;

import java.util.ArrayList;
import java.util.Random;
import javax.sound.sampled.*;


/**
 *
 * @author user01
 */
public class Acciones {
    
    private int numeroAleatorio;
    private int numeroPosicionEncontrada;
    
    private ArrayList imagenes = new ArrayList();
    private ArrayList audio = new ArrayList();
    
    private ArrayList coleccionParaPruebasImagenes = new ArrayList();
    private ArrayList coleccionParaPruebasAudio = new ArrayList();
    
    public Acciones()
    {
    //Constructor
    }
   
    
    public ArrayList coleccionImagenes()
    {
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\1 open.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\2 accept.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\3 love.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\4 learn.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\5 hurry.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\6 dare.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\7 help.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\8 dance.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\9 erase.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\10 change.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\11 walk.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\12 close.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\13 date.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\14 cook.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\15 consider.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\16 count.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\17 Answer.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\18 wish.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\19 start.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\20 push.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\21 deliver.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\22 listen.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\23 expect.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\24 wait.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\25 study.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\26 miss.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\27 smoke.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\28 enjoy.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\29 like.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\30 talk.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\31 intend.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\32 play.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\33 wash.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\34 clean.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\35 arrive.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\36 fill.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\37 rain.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\38 look.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\39 show.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\40 need.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\41 name.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\42 order.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\43 stop.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\44 stay.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\45 belong.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\46 plan.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\47 plant.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\48 practice.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\49 ask.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\50 want.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\51 remember.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\52 rent.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\53 repeat.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\54 resist.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\55 jump.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\56 follow.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\57 point.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\58 end.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\59 finish.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\60 work.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\61 try.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\62 climb.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\63 use.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\64 dress.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\65 travel.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\66 visit.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\67 live.png");
        imagenes.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Imagenes verbos regulares\\68 turn.png");

        return imagenes;
        
    }
    
    public ArrayList coleccionAudio()
    {
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\1 OPEN.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\2 ACCEPT.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\3 LOVE.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\4 LEARN.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\5 HURRY.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\6 DARE.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\7 HELP.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\8 DANCE.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\9 ERASE.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\10 CHANGE.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\11 WALK.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\12 CLOSE.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\13 DATE.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\14 COOK.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\15 CONSIDER.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\16 COUNT.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\17 ANSWER.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\18 WISH.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\19 START.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\20 PUSH.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\21 DELIVER.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\22 LISTEN.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\23 EXPECT.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\24 WAIT.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\25 STUDY.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\26 MISS.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\27 SMOKE.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\28 ENJOY.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\29 LIKE.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\30 TALK.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\31 INTEND.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\32 PLAY.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\33 WASH.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\34 CLEAN.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\35 ARRIVE.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\36 FILL.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\37 RAIN.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\38 LOOK.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\39 SHOW.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\40 NEED.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\41 NAME.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\42 ORDER.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\43 STOP.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\44 STAY.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\45 BELONG.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\46 PLAN.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\47 PLANT.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\48 PRACTICE.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\49 ASK.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\50 WANT.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\51 REMEMBER.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\52 RENT.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\53 REPEAT.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\54 RESIST.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\55 JUMP.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\56 FOLLOW.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\57 POINT.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\58 END.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\59 FINISH.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\60 WORK.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\61 TRY.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\62 CLIMB.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\63 USE.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\64 DRESS.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\65 TRAVEL.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\66 VISIT.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\67 LIVE.wav");
        audio.add("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\68 TURN.wav");
        
        return audio;
    }
    
    public int[] arregloNumeroAleatorio(int rangoNumeros)
    {
        System.out.println("----------------------arregloNumeroAleatorio()----------------------------");
        Random aleatorio=new Random();
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
    
    public int[] arregloNumeroAleatorio(int rangoNumeros, int omitirNumero, int omitirPosicion)
    {
        Random aleatorio=new Random();
        int [] arregloN=new int[4];
        int iterador=1;
        //se agrega en () el rango del numero en el que se generara el aleatorio en este 
        //caso el rango es de 0-6, son 7 números en este rango 
        do
        {
            arregloN[0]=aleatorio.nextInt(rangoNumeros);
            
        }while(omitirNumero == arregloN[0] || omitirPosicion == arregloN[0]);
        System.out.println("---"+arregloN[0]);
        arregloN[iterador]=aleatorio.nextInt(rangoNumeros);//REVISAR SI SI EL RANDO DE NUMEROS ABARCA TODO EL ARREGLO
        while(arregloN[0]==arregloN[iterador] || omitirNumero == arregloN[iterador] || omitirPosicion == arregloN[iterador])
        {
            arregloN[iterador]=aleatorio.nextInt(rangoNumeros);
        }
        System.out.println("---"+arregloN[iterador]);
        ++iterador;
        arregloN[iterador]=aleatorio.nextInt(rangoNumeros);
    
        //Recordar que el simbolo || significa 'o' y sirve para enlazar condicionales 
        while(arregloN[0]==arregloN[iterador] || arregloN[1]==arregloN[iterador] || omitirNumero == arregloN[iterador] || omitirPosicion == arregloN[iterador])
        {
            arregloN[iterador]=aleatorio.nextInt(rangoNumeros);
        }
        System.out.println("---"+arregloN[iterador]);
        ++iterador;
        arregloN[iterador]=aleatorio.nextInt(rangoNumeros);
        while(arregloN[0]==arregloN[iterador] || arregloN[1]==arregloN[iterador] || arregloN[2]==arregloN[iterador] || omitirNumero == arregloN[iterador] || omitirPosicion == arregloN[iterador])
        {
            arregloN[iterador]=aleatorio.nextInt(rangoNumeros);
        }
        System.out.println("---"+arregloN[iterador]);
        return arregloN;
    }
    
    public int numeroAleatorio(int rangoNumeros)
    {
        Random aleatorio=new Random();
        this.numeroAleatorio = aleatorio.nextInt(rangoNumeros);
        return this.numeroAleatorio;
    }
    
    public int numeroAOmitir(ArrayList coleccionOriginal, String rutaAOmitir)
    {
        for(int i=0; i<coleccionOriginal.size(); i++)
        {
            if(rutaAOmitir.equals((String) coleccionOriginal.get(i)))
            {
                numeroPosicionEncontrada = i;
            }
        }
    
        return numeroPosicionEncontrada;
    }
    
    
}
