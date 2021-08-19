package apresentacao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumeroTest {

    @Test
    public void testaPar(){
        Assertions.assertTrue(Numero.checkEven(2));
    }
}
