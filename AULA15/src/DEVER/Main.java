package DEVER;

import DEVER.Model.Fruta;
import DEVER.View.Menu;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<Fruta> frutas = new ArrayList<>();

        Menu.principal(frutas);

    }
}
