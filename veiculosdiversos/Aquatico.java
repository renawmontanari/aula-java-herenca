
package com.mycompany.veiculosdiversos;

public class Aquatico extends Veiculo {
    private int profundidade;
    
    public Aquatico(String nome, String fabricante, int anoFabricacao, int profundidade) {
        super(nome, fabricante, anoFabricacao);
        this.profundidade = profundidade;
    }
    
    public double getProfundidade() {
        return profundidade;
    }
    
    public void setProfundidade(double profundidade) {
        this.profundidade = (int) profundidade;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n Profundidade " + profundidade;
    }
}
