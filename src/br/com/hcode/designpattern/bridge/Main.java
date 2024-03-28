package br.com.hcode.designpattern.bridge;

import br.com.hcode.designpattern.bridge.plataforms.*;
import br.com.hcode.designpattern.bridge.transmissions.AdvancedLive;
import br.com.hcode.designpattern.bridge.transmissions.Live;
import br.com.hcode.designpattern.bridge.transmissions.RecordLive;

public class Main {

    public static void main(String[] args) {
        startLive(new Youtube());
        startLive(new Facebook());
        startLive(new TwitchTV());
        startLive(new DisneyPlus());
    }

    public static void startLive(IPlataform iPlataform) {

        //System.out.println("Aguarde");
        //Live live = new Live(iPlataform);
        //live.broadcasting();
        //live.result();

        System.out.println("Transmissão avançada");
        AdvancedLive advancedLive = new AdvancedLive(iPlataform);
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.result();

        System.out.println("------------------------------");
        System.out.println("Iniciando gravação");
        RecordLive recordLive = new RecordLive(iPlataform);
        recordLive.recordLive();
    }
}
