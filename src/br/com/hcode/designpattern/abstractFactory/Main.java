package br.com.hcode.designpattern.abstractFactory;

import br.com.hcode.designpattern.abstractFactory.app.Application;
import br.com.hcode.designpattern.abstractFactory.factories.*;
import br.com.hcode.desingpattern.abstractFactory.factories.*;

public class Main {

    private static Application app;
    private static ITransportFactory factory;
    private static IWaterTransportFactory waterFactory;

    public static Application configure(){


        String company = "boat";

        if (company.equals("uber")){
            factory = new UberTransport();
        }else if (company.equals("99")){
            factory = new NineNineTransport();
        } else  {
            waterFactory = new BoatTransport();
        }
        return app = new Application(factory, waterFactory);

    }
    public static void main(String[] args) {

        Application application = configure();
        application.startRoute();

    }
}
