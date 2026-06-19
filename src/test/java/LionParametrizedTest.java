import com.example.Animal;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    private final String sex;
    private final boolean hasManeResult;
    private final Animal animal;

    public LionParametrizedTest(String sex, boolean hasManeResult) {
        this.sex = sex;
        this.hasManeResult = hasManeResult;
        this.animal = new Animal();
    }

    @Parameterized.Parameters(name = "Пол: {0}, Наличие гривы: {1}")
    public static Object[][] sexAndManeData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void testDoesLionHasMane() throws Exception{
        Lion lion = new Lion(sex,animal);
        assertEquals("Грива может быть только у самца-льва", hasManeResult,lion.doesHaveMane());
    }
}
