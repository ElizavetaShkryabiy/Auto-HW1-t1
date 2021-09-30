import org.testng.annotations.Test;
import ru.netology.CashbackHackerService;

import static org.testng.Assert.assertEquals;

public class ServiceTest {
    CashbackHackerService service = new CashbackHackerService();

    @Test
    public void shouldFindRestSumToBuyWhenSumIsOK() {
        int actual = service.remain(1000);
        assertEquals(actual, 1000);
    }

    @Test
    public void shouldFindRestSumToBuyWhenSumBigger() {
        int actual = service.remain(1001);
        assertEquals(actual, 999);
    }

    @Test
    public void shouldFindRestSumToBuyWhenSumTwiceBigger() {
        int actual = service.remain(2000);
        assertEquals(actual, 1000);
    }

    @Test
    public void shouldFindRestSumToBuyWhenSumSmaller() {
        int actual = service.remain(999);
        assertEquals(actual, 1);
    }

}
