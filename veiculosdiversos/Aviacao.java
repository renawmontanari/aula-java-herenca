
package com.mycompany.veiculosdiversos;

public class Aviacao extends Veiculo {
    private int altitudeVoo;
    
    public Aviacao(String nome, String fabricante, int anoFabricacao, int altitudeVoo) {
        super(nome, fabricante, anoFabricacao);
        this.altitudeVoo = altitudeVoo;
    }
    
    public double getAltitudeVoo() {
        return altitudeVoo;
    }
    
    public void setAltitudeVoo(double altitudeVoo) {
        this.altitudeVoo = (int) altitudeVoo;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n Altitude do Voo " + altitudeVoo;
    }
}
