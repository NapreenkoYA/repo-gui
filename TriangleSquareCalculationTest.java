import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

public class TriangleSquareCalculationTest {
    @Test
    @DisplayName("Первая позитивная проверка")
    void positiveSquareCalcTest1() throws Exception {
        double result = calculateTriangleSquare(2, 2, 2);
        Assertions.assertEquals(1.7320508075688772, result);
    }

    @Test
    @DisplayName("Вторая позитивная проверка")
    void positiveSquareCalcTest2() throws Exception {
        double result = calculateTriangleSquare(3, 4, 5);
        Assertions.assertEquals(6, result);
    }

    @Test
    @DisplayName("Третья позитивная проверка")
    void positiveSquareCalcTest3() throws Exception {
        double result = calculateTriangleSquare(5, 6, 7);
        Assertions.assertEquals(14.696938456699069, result);
    }

    @Test
    @DisplayName("Первая негативная проверка")
    void negativeSquareCalcTest1() {
        assertThatExceptionOfType(Exception.class).isThrownBy(() -> calculateTriangleSquare(-2, 4, 5));
    }

    @Test
    @DisplayName("Вторая негативная проверка")
    void negativeSquareCalcTest2() {
        assertThatExceptionOfType(Exception.class).isThrownBy(() -> calculateTriangleSquare(0, 2, 2));
    }

    @Test
    @DisplayName("Третья негативная проверка")
    void negativeSquareCalcTest3() {
        assertThatExceptionOfType(Exception.class).isThrownBy(() -> calculateTriangleSquare(1, 2, 3));
    }
}
