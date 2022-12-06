package docencia;

import java.util.ArrayList;
import java.util.UUID;

public class Aluno {

    public String nome;

    public String numeroMatricula;

    public String curso;

    public ArrayList<String> atividades = new ArrayList<>();

    // Método contrutor
    // Não precisa declarar retorno. Deve possuir o mesmo nome que a classe
    public Aluno(String nome, String curso) {
        this(nome);
        matricular(curso);
    }

    public Aluno(String nome) {
        this.nome = nome;
        this.numeroMatricula = UUID.randomUUID().toString();
    }

    public void matricular(String curso) {
        this.curso = curso;
    }

    public void assistirAula(String disciplina) {
        System.out.println("O aluno " + nome + " assistiu a aula de " +
                disciplina + " no curso de " + curso);
        darAtencaoAula();
    }

    protected void darAtencaoAula() {
        System.out.println("Muito focado aqui");
    }

    public void realizarAtividade(String displina, String atividade) {
        System.out.println("O aluno " + nome + " realizou a atividade " +
                atividade + " na disciplina " + displina + " no curso " + curso);
    }

}
