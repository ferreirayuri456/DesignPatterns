package br.com.hcode.designpattern.abstractFactory.app;

import br.com.hcode.designpattern.abstractFactory.aircraft.IAircraft;
import br.com.hcode.designpattern.abstractFactory.factories.IWaterTransportFactory;
import br.com.hcode.designpattern.abstractFactory.landVehicles.ILandVehicle;
import br.com.hcode.designpattern.abstractFactory.factories.ITransportFactory;
import br.com.hcode.designpattern.abstractFactory.vessels.model.IVessels;

public class Application {

    private ILandVehicle vehicle;
    private IAircraft aircraft;
    private IVessels vessels;

    public Application(ITransportFactory factory, IWaterTransportFactory waterFactory){
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
        vessels = waterFactory.createTransportVessels();
    }

    public void startRoute(){
        vehicle.startRoute();
        aircraft.startRoute();
        vessels.startRoute();
    }
}
