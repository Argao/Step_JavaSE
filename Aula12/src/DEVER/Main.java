package DEVER;

import DEVER.MODEL.Pessoa;
import DEVER.VIEW.View;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        View.menu(pessoas);
    }
}
