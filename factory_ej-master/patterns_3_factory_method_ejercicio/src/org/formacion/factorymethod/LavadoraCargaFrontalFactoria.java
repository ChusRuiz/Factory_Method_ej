package org.formacion.factorymethod;

public class LavadoraCargaFrontalFactoria extends FactoryLavadora {

    @Override
    public Lavadora crearLavadoraTipo() {
        return new LavadoraCargaFrontal();
    }

}