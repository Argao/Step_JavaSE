package DEVER;

import DEVER.CONTROLLER.DoadorController;
import DEVER.CONTROLLER.NaoDoadorController;
import DEVER.VIEW.Menu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<DoadorController> d = new ArrayList<>();
        ArrayList<NaoDoadorController> nd = new ArrayList<>();

        Menu.pricipal(d,nd);
    }
}
