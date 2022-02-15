package AULA.APP;

import AULA.Controller.BarcoController;
import AULA.Controller.CarroController;
import AULA.Controller.MotoController;
import AULA.VIEW.Menu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CarroController> carros = new ArrayList<>();
        ArrayList<MotoController> motos = new ArrayList<>();
        ArrayList<BarcoController> barcos = new ArrayList<>();

        Menu.inicio(carros, motos, barcos);
    }


}
