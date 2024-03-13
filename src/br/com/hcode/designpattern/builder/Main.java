package br.com.hcode.designpattern.builder;

import br.com.hcode.designpattern.builder.builders.CarBuilder;
import br.com.hcode.designpattern.builder.builders.ISportCarBuilder;
import br.com.hcode.designpattern.builder.builders.SportCarBuilder;
import br.com.hcode.designpattern.builder.builders.TruckBuilder;
import br.com.hcode.designpattern.builder.director.Director;
import br.com.hcode.designpattern.builder.model.Car;
import br.com.hcode.designpattern.builder.model.SportCar;
import br.com.hcode.designpattern.builder.model.Truck;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        CarBuilder carBuilder  = new CarBuilder();
        director.createSedanCar(carBuilder);

        Car car = carBuilder.getResult();
        System.out.println(car.getCarType() + " produzido com sucesso!");

        TruckBuilder truckBuilder = new TruckBuilder();
        director.createTruck(truckBuilder);
        Truck truck = truckBuilder.getResult();

        System.out.println(truck.result() + " produzido com sucesso!");

        SportCarBuilder sportCarBuilder = new SportCarBuilder();
        director.createSportCar(sportCarBuilder);

        SportCar sportCar = sportCarBuilder.getResult();

        System.out.println(sportCar.getCarType() + " produzido com sucesso " + "na cor " + sportCar.getColor());
    }
}
