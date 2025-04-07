import com.example.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void testEatMeat() throws Exception {
        Feline spyFeline = Mockito.spy(new Feline());
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        doReturn(expectedFood).when(spyFeline).getFood("Хищник");
        Assert.assertEquals(expectedFood, spyFeline.eatMeat());
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
        Assert.assertEquals(3, feline.getKittens(3));
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }
}
