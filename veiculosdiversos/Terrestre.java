
package com.mycompany.veiculosdiversos;

public class Terrestre extends Veiculo {
    private int kmRodado;
    
    public Terrestre(String nome, String fabricante, int anoFabricacao, int kmRodado) {
        super(nome, fabricante, anoFabricacao);
        this.kmRodado = kmRodado;
    }
    
    public double getKmRodado() {
        return kmRodado;
    }
    
    public void setKmRodado(double kmRodado) {
        this.kmRodado = (int) kmRodado;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n Km rodado " + kmRodado;
    }
}
