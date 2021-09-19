import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FocusTest {

    @Test
    void deveRetornarValorFocusBasica() {
        Versao versao = new Basica();
        Ecosport ecosport = new Ecosport(70000.0f);
        ecosport.setVersao(versao);
        assertEquals(70000.0f, ecosport.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorFocusIntermediaria() {
        Versao versao = new Intermediaria();
        Ecosport ecosport = new Ecosport(70000.0f);
        ecosport.setVersao(versao);
        assertEquals(73500.0f, ecosport.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorFocusCompleta() {
        Versao versao = new Completa();
        Ecosport ecosport = new Ecosport(70000.0f);
        ecosport.setVersao(versao);
        assertEquals(77500.0f, ecosport.calcularValor(), 0.01f);
    }
}
