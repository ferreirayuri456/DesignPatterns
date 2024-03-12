package br.com.hcode.designpattern.abstractFactory.factories;

import br.com.hcode.designpattern.abstractFactory.vessels.model.Boat;
import br.com.hcode.designpattern.abstractFactory.vessels.model.IVessels;

public class BoatTransport implements IWaterTransportFactory {

    @Override
    public IVessels createTransportVessels() {
        return new Boat();
    }
}
