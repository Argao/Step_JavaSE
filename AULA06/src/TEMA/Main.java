package TEMA;

/*
Dever de casa

Crie um sistema de cadastro de Livro(nome, autor,genero,preço)
O usuário pode cadastrar ou imprimir os livros

Organize em classes e métodos estáticos
 */

import TEMA.Model.LivroModel;
import TEMA.View.Menu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<LivroModel> listaLivros = new ArrayList();

        Menu.principal(listaLivros);
    }
}
