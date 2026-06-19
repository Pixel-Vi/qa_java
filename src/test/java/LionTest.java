import com.example.Animal;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    private Animal animal;

    @Test
    public void testGetKittens() throws Exception{
        Lion lion = new Lion("Самец", animal);
        when(animal.getKittens()).thenReturn(1);
        assertEquals("Некорректное количество котят",1, lion.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion("Самка", animal);
        when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals("Вернулся некорректный список еды", List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test(expected = Exception.class)
    public void testInvalidSex() throws Exception {
        new Lion("Неизвестный пол", new Animal());
    }
}
