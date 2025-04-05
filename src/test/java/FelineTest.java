import com.example.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;

import java.util.Arrays;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline feline;

    @Test
    public void testEatMeat() throws Exception {
        Assert.assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void testGetKittens() {
        when(feline.getKittens(1)).thenReturn(3);  // Мокируем getKittens(int), чтобы вернуть 3
        Assert.assertEquals(3, feline.getKittens());
    }

    @Test
    public void testGetFamily() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }
}
