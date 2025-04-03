import com.example.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;
import java.util.Arrays;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    FelineBehavior felineBehavior;

    @Test
    public void testLionFood() throws Exception {
        when(felineBehavior.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самец", felineBehavior);
        Assert.assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void testLionGetKittens() throws Exception {
        when(felineBehavior.getKittens()).thenReturn(3);
        Lion lion = new Lion("Самец", felineBehavior);
        Assert.assertEquals(3, lion.getKittens());
    }

    @Test(expected = Exception.class)
    public void testLionInvalidSex() throws Exception {
        Lion lion = new Lion("Неизвестный", felineBehavior);
    }
}