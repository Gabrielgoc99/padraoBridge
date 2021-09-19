

public class Focus extends Carro {

    public Focus (float valorBase) {
        super(valorBase);
    }

    public float calcularValor() {
        return this.valorBase + (this.versao.valorAdicional());
    }

}