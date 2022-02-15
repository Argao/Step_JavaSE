package TESTE;

import TESTE.Controller.AlunoController;
import TESTE.Model.Aluno;
import TESTE.View.Menu;
import java.util.ArrayList;

/*
* Crie um sistema de cadastro de Alunos.
Aluno tem nome, data de nascimento e sexo

Relatórios:
Alunos dimaió
Alunos dimenó
Alunos dimenó menino
Alunos dimenó menina
Aniversariantes do mês------------------
Masculino mais velho
Masculino mais novo
Feminino mais velho
Feminino mais novo */

public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        Menu.menu(listaAlunos);
    }




}

