import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    private Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }

    @Test
    public void testEatMeat() throws Exception{

        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void testGetFamily() {

        assertEquals("Неверное семейство", "Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittensDefault(){

        assertEquals("Некорректное количество котят",1, feline.getKittens());
    }

    @Test
    public void getKittensWithParameters(){

        assertEquals("Некорректное количество котят",5, feline.getKittens(5));
    }
}