package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("계산기는")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void init() {
        calculator = Calculator.create();
    }

    @ParameterizedTest
    @CsvSource({
        "2 5 *, 10.0",
        "10 2 /, 5.0",
        "10 2 +, 12.0",
        "10 2 -, 8.0",
    })
    @DisplayName("계산을 수행한다.")
    public void calculateTest(String line, double result){
        assertThat(calculator.calculate(line)).isEqualTo(result);
    }
}