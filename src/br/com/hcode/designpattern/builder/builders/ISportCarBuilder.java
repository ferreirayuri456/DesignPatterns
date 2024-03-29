package br.com.hcode.designpattern.builder.builders;

import br.com.hcode.designpattern.builder.components.CarType;
import br.com.hcode.designpattern.builder.components.Color;
import br.com.hcode.designpattern.builder.components.Engine;
import br.com.hcode.designpattern.builder.components.Transmission;

public interface ISportCarBuilder {

    void setCarType(CarType carType);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
    void setColor(Color color);
}
