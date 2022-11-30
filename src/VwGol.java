public class VwGol {

    int anoFabricao;
    String cor;
    int qtdePortas;
    boolean ligado = false;

    public static VwGol montar() {
        // Contexto static pertence a classe e não ao objeto
        return new VwGol();
    }

    public void ligar() {
        // Sem a palavra static o método pertence ao contexto do objeto
        // e não da classe
        // A palavra 'this' referencia o objeto que estou manipulando
        this.ligado = true;
    }

}
