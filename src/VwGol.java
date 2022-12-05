public class VwGol {

    public static int numeroDoProjeto = 54;

    int anoFabricao;
    String cor;
    int qtdePortas;

    boolean arCondicionado;

    boolean ligado = false;

    //Mesmo sem que seja escrito o código desse construtor o Java cria quando não há outro
    public VwGol(int anoFabricao, String cor, int qtdePortas) {
        this.anoFabricao = anoFabricao;
        this.cor = cor;
        this.qtdePortas = qtdePortas;
    }

    public VwGol(int anoFabricao, String cor, int qtdePortas, boolean arCondicionado) {
        this(anoFabricao, cor, qtdePortas);
        this.arCondicionado = arCondicionado;
    }

    public void ligar() {
        // Sem a palavra static o método pertence ao contexto do objeto
        // e não da classe
        // A palavra 'this' referencia o objeto que estou manipulando
        this.ligado = true;
    }

}
