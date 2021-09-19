

public abstract class Carro {

    protected Versao versao;

    protected float valorBase;

    public Carro(float valorBase) {
        this.valorBase = valorBase;
    }

    public void setVersao(Versao versao) {
        this.versao = versao;
    }

    public void setValorBase(float valorBase) {
        this.valorBase = valorBase;
    }

    public abstract float calcularValor();
}