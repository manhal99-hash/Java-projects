package Uebung3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class DynArrayTest {
    DynArray<Integer> dyn1;

    @BeforeEach
    void init(){
        dyn1 = new DynArray<>();
    }
    @Test
    void testAdd(){
        assertEquals(0,dyn1.size());
        dyn1.add(1);
        dyn1.add(2);
        assertEquals(2,dyn1.size());
        assertFalse(dyn1.isEmpty());
    }
    @Test
    void testSet_Get(){

        dyn1.add(1);
        dyn1.add(2);
        dyn1.add(3);
        dyn1.set(0,10);
        assertEquals(dyn1.get(0),10);
        dyn1.set(0,1);
        assertEquals(dyn1.get(0),1);

        Exception exception = assertThrows(IndexOutOfBoundsException.class,()->{
            dyn1.set(-1,2);
        });
        assertEquals("Ungültiges Wert",exception.getMessage());

        Exception exception1 = assertThrows(IndexOutOfBoundsException.class,()->{
            dyn1.set(10,3);
        });
        assertEquals("Ungültiges Wert",exception1.getMessage());

        Exception exception2 = assertThrows(IndexOutOfBoundsException.class,()->{
            dyn1.get(90);
        });
        assertEquals("Ungültiges Wert",exception2.getMessage());

        Exception exception3 = assertThrows(IndexOutOfBoundsException.class,()->{
            dyn1.get(-8);
        });
        assertEquals("Ungültiges Wert",exception2.getMessage());
    }
    @Test
    void testContains(){
        dyn1.add(1);
        dyn1.add(2);
        assertTrue(dyn1.contains(1));
        assertTrue(dyn1.contains(2));
        assertFalse(dyn1.contains(40));
        assertFalse(dyn1.contains(-3));
    }
    @Test
    void testRemove(){
        dyn1.add(1);
        dyn1.add(2);
        dyn1.add(3);
        dyn1.add(4);
        dyn1.add(5);

        assertEquals(5,dyn1.size());
        assertEquals("1\n2\n3\n4\n5\n",dyn1.toString());

        dyn1.remove(0);
        assertEquals(4,dyn1.size());

        dyn1.remove(1);

    }
}
