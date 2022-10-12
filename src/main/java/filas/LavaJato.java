/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author eduardo.gomes
 */
public class LavaJato {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        List<Carro> Carros = new ArrayList<>();

        Carro carrosa1 = new Carro("Marca", "Modelo", 2001);
        Carro carrosa2 = new Carro("Marca", "Modelo", 2002);
        Carro carrosa3 = new Carro("Marca", "Modelo", 2003);
        Carro carrosa4 = new Carro("Marca", "Modelo", 2004);
        Carro carrosa5 = new Carro("Marca", "Modelo", 2005);
        Carro carrosa6 = new Carro("Marca", "Modelo", 2006);
        Carro carrosa7 = new Carro("Marca", "Modelo", 2007);
        Carro carrosa8 = new Carro("Marca", "Modelo", 2008);
        Carro carrosa9 = new Carro("Marca", "Modelo", 2008);
        Carro carrosa10 = new Carro("Marca", "Modelo", 2010);
        Carro carrosa11 = new Carro("Marca", "Modelo", 2011);
        Carro carrosa12 = new Carro("Marca", "Modelo", 2012);
        Carro carrosa13 = new Carro("Marca", "Modelo", 2013);
        Carro carrosa14 = new Carro("Marca", "Modelo", 2014);
        Carro carrosa15 = new Carro("Marca", "Modelo", 2015);

        Carros.add(carrosa1);
        Carros.add(carrosa2);
        Carros.add(carrosa3);
        Carros.add(carrosa4);
        Carros.add(carrosa5);
        Carros.add(carrosa6);
        Carros.add(carrosa7);
        Carros.add(carrosa8);
        Carros.add(carrosa9);
        Carros.add(carrosa10);
        Carros.add(carrosa11);
        Carros.add(carrosa12);
        Carros.add(carrosa13);
        Carros.add(carrosa14);
        Carros.add(carrosa15);

        //   for (Carro Carro : Carros) {
        //     Carro.imprimirCarros();
        // }
        List<Carro> CarrosLavados = new ArrayList<>();

        CarrosLavados.add(carrosa1);
        CarrosLavados.add(carrosa2);
        CarrosLavados.add(carrosa3);
        CarrosLavados.remove(0);
        CarrosLavados.remove(0);
        CarrosLavados.remove(0);

        for (Carro CarrosLavado : CarrosLavados) {
            CarrosLavado.imprimirCarros();
        }

        Collections.sort(CarrosLavados);
    }

}
