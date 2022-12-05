import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        //Consigo chamar o montar na classe, pois o método é desse contexto,
        // mas não consigo chamar o ligar, pois é do objeto
        VwGol golDoDiego = new VwGol(2022, "Preto", 5);
        System.out.println("A cor do gol do Diego é: " + golDoDiego.cor);
        mudarCor(golDoDiego);
        System.out.println("A cor do gol do Diego é: " + golDoDiego.cor);

        VwGol golDoVitor = new VwGol(2021, "Branca", 3, true);
        mudarCor(golDoVitor);
        System.out.println(golDoVitor.anoFabricao);

        // Consigo chamar o ligar, pois o método é desse contexto.
        // Não consigo chamar o montar, pois é do contexto d class
        golDoDiego.ligar();
        System.out.println("Gol do Diego ligado");

        Aluno richard = new Aluno("Richard", "Dev_makers_2");
        richard.assistirAula("POO-1");

        Aluno arthur = new Aluno("Arthur", "Dev_makers_2");
        arthur.assistirAula("Banco de dados");

        Aluno diego = new Aluno("Diego", "Dev_makers_2");
        diego.assistirAula("POO-1");
        diego.realizarAtividade("POO-1", "Trabalho-1");

        Professor william = Professor.contratar("William", 1.0);
        william.ministrarAula("Dev_makers_2", "POO-1");
        william.corrirgirAtividade("Dev_makers_2", "POO-1", "Trabalho-1");

        // método representam as ações possíveis de um objeto
        // atributos representam as propriedades dos objetos
    }

    public static void mudarCor(VwGol variavelDoProfessor) {
        variavelDoProfessor.cor = "Azul";
        variavelDoProfessor.anoFabricao = 2029;
    }

}
