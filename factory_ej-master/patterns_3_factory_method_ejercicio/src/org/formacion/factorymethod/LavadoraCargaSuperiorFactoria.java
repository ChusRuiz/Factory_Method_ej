package org.formacion.factorymethod;

public class LavadoraCargaSuperiorFactoria extends FactoryLavadora {

    @Override
    public Lavadora crearLavadoraTipo() {
        return new LavadoraCargaSuperior();
    }
}