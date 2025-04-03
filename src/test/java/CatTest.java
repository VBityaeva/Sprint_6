import com.example.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;
import java.util.Arrays;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void testCatSound() {
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testCatFood() throws Exception {
        when(feline.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(feline);
        Assert.assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}
