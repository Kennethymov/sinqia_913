package veiculo;

public class VwGol {

    public static int numeroDoProjeto = 54;

    public int anoFabricacao;
    public String cor;
    public int qtdePortas;

    public boolean arCondicionado;

    public boolean ligado = false;

    //Mesmo sem que seja escrito o código desse construtor o Java cria quando não há outro
    public VwGol(int anoFabricacao, String cor, int qtdePortas) {
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.qtdePortas = qtdePortas;
    }

    public VwGol(int anoFabricacao, String cor, int qtdePortas, boolean arCondicionado) {
        this(anoFabricacao, cor, qtdePortas);
        this.arCondicionado = arCondicionado;
    }

    public void ligar() {
        // Sem a palavra static o método pertence ao contexto do objeto
        // e não da classe
        // A palavra 'this' referencia o objeto que estou manipulando
        habilitarCircuitosEletricos();
        this.ligado = true;
    }

    private void habilitarCircuitosEletricos() {
        System.out.println("Circuitos eletricos habilitados");
    }

}
