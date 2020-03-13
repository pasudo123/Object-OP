package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("계산숫자는")
class CalNumberTest {

    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3", "4", "5"})
    @DisplayName("생성된다.")
    public void ofTest(String number){

        // when
        CalNumber calNumber = CalNumber.of(number);

        // then
        assertThat(calNumber.get()).isEqualTo(Integer.parseInt(number));
    }
}