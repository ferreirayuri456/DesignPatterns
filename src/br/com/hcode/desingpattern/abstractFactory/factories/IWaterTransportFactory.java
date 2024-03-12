package br.com.hcode.desingpattern.abstractFactory.factories;

import br.com.hcode.desingpattern.abstractFactory.vessels.model.IVessels;

public interface IWaterTransportFactory {

    IVessels createTransportVessels();
}
