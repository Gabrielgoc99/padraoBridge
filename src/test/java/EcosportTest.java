import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EcosportTest {

    @Test
    void deveRetornarValorEcosportBasica() {
        Versao versao = new Basica();
        Ecosport ecosport = new Ecosport(80000.0f);
        ecosport.setVersao(versao);
        assertEquals(80000.0f, ecosport.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorEcosportIntermediaria() {
        Versao versao = new Intermediaria();
        Ecosport ecosport = new Ecosport(80000.0f);
        ecosport.setVersao(versao);
        assertEquals(83500.0f, ecosport.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorEcosportCompleta() {
        Versao versao = new Completa();
        Ecosport ecosport = new Ecosport(80000.0f);
        ecosport.setVersao(versao);
        assertEquals(87500.0f, ecosport.calcularValor(), 0.01f);
    }
}
