
package com.mycompany.veiculosdiversos;

public class Veiculo {
    private String nome;
    private String fabricante;
    private int anoFabricacao;
    
    public Veiculo(String nome, String fabricante, int anoFabricacao) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.anoFabricacao = anoFabricacao;
    }
    
    public String getNome() {
        return nome;
    }
        
    public void setNome(String nome) {
        this.nome = nome;
    }   
    
    public String getFabricante() {
        return fabricante;
    }
    
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    
    @Override
    public String toString() {
        return "Nome:: " + nome + "\n Fabricante:: " + fabricante + "\n Ano de Fabricacao:: " + anoFabricacao;
    }
}
