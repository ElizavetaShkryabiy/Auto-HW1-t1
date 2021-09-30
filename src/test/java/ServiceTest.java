import org.junit.Test;

import ru.netology.CashbackHackerService;

import static org.junit.Assert.*;


public class ServiceTest {
    CashbackHackerService service = new CashbackHackerService();

    @Test
    public void shouldFindRestSumToBuyWhenSumIs1000() {
        int actual = service.remain(1000);
        assertEquals(0, actual);
    }

    @Test
    public void shouldFindRestSumToBuyWhenSumBigger() {
        int actual = service.remain(1001);
        assertEquals(999, actual);
    }

    @Test
    public void shouldFindRestSumToBuyWhenSumTwiceBigger() {
        int actual = service.remain(2000);
        assertEquals(0, actual);
    }

    @Test
    public void shouldFindRestSumToBuyWhenSumSmaller() {
        int actual = service.remain(999);
        assertEquals(1, actual);
    }

}
