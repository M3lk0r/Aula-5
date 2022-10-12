/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filas;

/**
 *
 * @author eduardo.gomes
 */
public class Carro implements Comparable<Carro> {

    String Marca;
    String Modelo;
    int nCarro;

    public Carro(String Marca, String Modelo, int nCarro) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.nCarro = nCarro;
    }

    public void imprimirCarros() {
        System.out.println("--------------");
        System.out.println("Marca: " + this.Marca);
        System.out.println("Modelo: " + this.Modelo);
        System.out.println("Nuemro Carro: " + this.nCarro);
        System.out.println("--------------");
    }

    public String getModelo() {
        return Modelo;
    }

    public void setTipo(String tipo) {
        this.Modelo = tipo;
    }

    @Override
    public int compareTo(Carro outroCarro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
