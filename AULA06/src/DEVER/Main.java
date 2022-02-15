package DEVER;

/*
Dever de casa

Crie um sistema de cadastro de Livro(nome, autor,genero,preço)
O usuário pode cadastrar ou imprimir os livros

Organize em classes e métodos estáticos
 */

import DEVER.Model.ClienteModel;
import DEVER.Model.FuncionarioModel;
import DEVER.Model.LivroModel;
import DEVER.Model.VendasModel;
import DEVER.View.Menu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<LivroModel> listaLivros = new ArrayList();
        ArrayList<ClienteModel> listaClientes = new ArrayList<>();
        ArrayList<FuncionarioModel> listaFuncionarios = new ArrayList<>();
        ArrayList<VendasModel> listaVendas = new ArrayList<>();

        Menu.principal(listaLivros,listaClientes,listaFuncionarios,listaVendas);
    }
}
