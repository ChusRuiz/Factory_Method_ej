package org.formacion.factorymethod;

public abstract class FactoryLavadora {

    public Lavadora crearLavadora() {

        Lavadora lavadora = crearLavadoraTipo();
        lavadora.ponerMandos();
        lavadora.ponerTambor();
        return lavadora;
    }

    protected abstract Lavadora crearLavadoraTipo();

}