package DEVER;

import DEVER.MODEL.*;
import DEVER.VIEW.Menu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Barco> barcos = new ArrayList<>();
        ArrayList<Carro> carros = new ArrayList<>();
        ArrayList<Moto> motos = new ArrayList<>();

        Menu.principal(carros,motos,barcos);


    }
}
