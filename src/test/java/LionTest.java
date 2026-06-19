import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Test
    public void testGetKittens() throws Exception{
        Lion lion = new Lion("Самец", new com.example.Feline());
        assertEquals("Некорректное количество котят",1, lion.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion("Самка", new com.example.Feline());
        assertEquals("Вернулся некорректный список еды", "Кошачьи", lion.getFamily());
    }

    @Test
    public void testDoesHaveMane() throws Exception{
        Lion lion1 = new Lion("Самец", new com.example.Feline());
        assertTrue("У самца должна быть грива", lion1.doesHaveMane());

        Lion lion2 = new Lion("Самка", new com.example.Feline());
        assertFalse("У самки не должно быть гривы", lion2.doesHaveMane());
    }

    @Test
    public void testInvalidSex() throws Exception {
        try {
            new Lion("Неизвестный пол", new com.example.Feline());
            fail("Ожидалось исключение");
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }
}
