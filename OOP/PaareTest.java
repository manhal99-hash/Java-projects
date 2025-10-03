package Uebung2;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class PaareTest {
    Paar<String,Integer> other;

    @BeforeEach
    void init(){
        other = new Paar<>("Hallo",123);
    }

    @Test
    void testGet(){
        String a = other.getErstes();
        assertEquals("Hallo",a);

        int b = other.getZweites();
        assertEquals(123,b);

        other.setErstes("Wie gehts");
        assertEquals("Wie gehts",other.getErstes());

        other.setZweites(321);
        assertEquals(321,other.getZweites());
    }
    @Test
    void testIdentitaet(){
        Paar<Double,String> andere = new Paar<>(3.3,"Ich");
        Paar<Integer,Double> viele = new Paar<>(999,3.8);

        assertTrue(other.equals(other));
        assertFalse(other.equals(andere));
        assertFalse(other.equals(viele));

        assertFalse(andere.equals(other));
        assertTrue(andere.equals(andere));
        assertFalse(andere.equals(viele));

        assertTrue(viele.equals(viele));
        assertFalse(viele.equals(other));
        assertFalse(viele.equals(andere));

    }
}
