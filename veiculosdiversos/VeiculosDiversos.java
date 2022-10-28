
package com.mycompany.veiculosdiversos;

public class VeiculosDiversos {

    public static void main(String[] args) {
        Veiculo veiculoUm = new Veiculo("Carro", "Fiat", 2021);
        System.out.println(veiculoUm);
        
        Aviacao veiculoAviacaoUm = new Aviacao("Avião", "Embraer", 2022, 2390);
        System.out.println(veiculoAviacaoUm);
        
        Aquatico veiculoAquaticoUm = new Aquatico("Barco", "Orizonte", 1999, 234);
        System.out.println(veiculoAquaticoUm);
        
        Terrestre veiculoTerrestreUm = new Terrestre("Moto", "Honda", 2023, 2);
        System.out.println(veiculoTerrestreUm);
    }
}
