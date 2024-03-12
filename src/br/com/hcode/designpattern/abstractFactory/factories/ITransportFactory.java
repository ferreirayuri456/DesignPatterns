package br.com.hcode.designpattern.abstractFactory.factories;

import br.com.hcode.designpattern.abstractFactory.aircraft.IAircraft;
import br.com.hcode.designpattern.abstractFactory.landVehicles.ILandVehicle;

public interface ITransportFactory {

    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();

}
