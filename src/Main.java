import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        //Consigo chamar o montar na classe, pois o método é desse contexto,
        // mas não consigo chamar o ligar, pois é do objeto
        VwGol objetoGolCriado = VwGol.montar();
        System.out.println("Criado um novo objeto do tipo VwGol");

        VwGol golDoDiego = VwGol.montar();
        ;
        golDoDiego.anoFabricao = 2022;
        golDoDiego.cor = "Preto";
        golDoDiego.qtdePortas = 5;
        System.out.println("A cor do gol do Diego é: " + golDoDiego.cor);
        mudarCor(golDoDiego);
        System.out.println("A cor do gol do Diego é: " + golDoDiego.cor);

        VwGol golDoVitor = VwGol.montar();
        golDoVitor.anoFabricao = 2021;
        golDoVitor.cor = "Branca";
        golDoVitor.qtdePortas = 3;
        mudarCor(golDoVitor);
        System.out.println(golDoVitor.anoFabricao);

        // Consigo chamar o ligar, pois o método é desse contexto.
        // Não consigo chamar o montar, pois é do contexto d class
        golDoDiego.ligar();
        System.out.println("Gol do Diego ligado");

        Aluno richard = Aluno.matricular("Richard", "Dev_makers_2");
        richard.assistirAula("POO-1");

        Aluno arthur = Aluno.matricular("Arthur", "Dev_makers_2");
        arthur.assistirAula("Banco de dados");

        Aluno diego = Aluno.matricular("Diego", "Dev_makers_2");
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
