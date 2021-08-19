package apresentacao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumeroTest {

    @Test
    public void dadoNumero2testaPar_deveRetornarTrue(){
        Assertions.assertTrue(Numero.checkEven(2));
    }

    @Test
    public void dadoNumero4testaPar_deveRetornarTrue(){
        Assertions.assertTrue(Numero.checkEven(4));
    }

    @Test
    public void dadoNumero5testaPar_deveRetornarTrue(){
        Assertions.assertTrue(Numero.checkEven(6));
    }

}
