package AULA;

import AULA.MODEL.Aluno;
import AULA.MODEL.Matricula;
import AULA.MODEL.Turma;
import AULA.VIEW.Menu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Turma> turmas = new ArrayList<>();
        ArrayList<Matricula> matriculas = new ArrayList<>();
        Menu.menu(alunos,turmas,matriculas);
    }


}
/*

Crie um sistema de cadastro de Alunos.
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
Feminino mais novo
 */

