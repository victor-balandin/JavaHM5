import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/TestData.csv")
    public void testSQR(int expected, int bottomLine, int upperLine) {
        SQRService service = new SQRService();
        int actual = service.calculate(bottomLine, upperLine);
        Assertions.assertEquals(expected, actual);

    }


}
