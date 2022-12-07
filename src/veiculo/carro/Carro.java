package veiculo.carro;

import veiculo.Veiculo;

public class Carro extends Veiculo {

    private int qtdePortas;
    private boolean arCondicionado;
    protected boolean ligado;

    public Carro(int anoFabricacao, String cor, int qtdePortas, boolean arCondicionado) {
        super(anoFabricacao, cor);
        this.qtdePortas = qtdePortas;
        this.arCondicionado = arCondicionado;
    }

    public Carro(int anoFabricacao, String cor, int qtdePortas) {
        super(anoFabricacao, cor);
        this.qtdePortas = qtdePortas;
    }

    public int getQtdePortas() {
        return qtdePortas;
    }

    public boolean getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean getLigado() {
        return ligado;
    }

}
