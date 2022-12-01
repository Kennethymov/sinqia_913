public class VwGol {

    public static int numeroDoProjeto = 54;

    int anoFabricao;
    String cor;
    int qtdePortas;
    boolean ligado = false;

    //Mesmo sem que seja escrito o código desse construtor o Java cria quando não há outro
    public VwGol() {
    }

    public VwGol(int anoFabricao, String cor, int qtdePortas) {
        this.anoFabricao = anoFabricao;
        this.cor = cor;
        this.qtdePortas = qtdePortas;
    }

    public static VwGol montar() {
        // Contexto static pertence a classe e não ao objeto
        return new VwGol(2022, "Preto", 5);
    }

    public void ligar() {
        // Sem a palavra static o método pertence ao contexto do objeto
        // e não da classe
        // A palavra 'this' referencia o objeto que estou manipulando
        this.ligado = true;
    }

}
