

public class Ecosport extends Carro {

    public Ecosport (float valorBase) {
        super(valorBase);
    }

    public float calcularValor() {
        return this.valorBase + ( this.versao.valorAdicional());
    }

}
