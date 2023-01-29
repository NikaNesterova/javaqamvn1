import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    private final SQRService service = new SQRService();


    @Test
    public void testServiceWhenResultEqualsThree() {
        //Arrange подготовка классов к тестировнию - создание объектов
        int expected = 3;
        //Act - делаешь дейтсвие
        int result = service.calculate(200, 300);
        // Assert - - проверка ожидаемого результата и фактического
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testServiceWhenResultEqualsFour() {
        int expected = 4;
        int result = service.calculate(200, 350);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testServiceWhenResultEqualsSix() {
        int expected = 6;
        int result = service.calculate(200, 420);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testServiceWhenResultEqualsNull() {
        int expected = 0;
        int result = service.calculate(1, 5);
        Assert.assertEquals(expected, result);
    }

}


