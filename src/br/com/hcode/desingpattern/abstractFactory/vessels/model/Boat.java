package br.com.hcode.desingpattern.abstractFactory.vessels.model;

public class Boat implements IVessels {

    @Override
    public void getCargo() {
        compass();
        startRoute();
        System.out.println("Mercadorias separadas e preparadas");
    }

    @Override
    public void startRoute() {
        System.out.println("Iniciando a navegação.");
    }

    @Override
    public void compass() {
        System.out.println("Sua encomenda está indo até você pela rota 45° Norte, 30° Leste");
    }
}
