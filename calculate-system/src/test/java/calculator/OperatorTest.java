package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("연산자는")
class OperatorTest {

    @ParameterizedTest
    @MethodSource("provideOperator")
    @DisplayName("연산기호를 반환한다.")
    void getOperatorTest(Operator operator, String operatorStr) {
        assertThat(Operator.getOperator(operatorStr)).isEqualTo(operator);
    }

    @ParameterizedTest
    @ValueSource(strings = {"@", "#", "$", "%", "&"})
    @DisplayName("연산기호 반환시, 에러가 발생한다.")
    void getOperatorExceptionTest(String operatorStr){
        assertThatThrownBy(() -> Operator.getOperator(operatorStr))
                .isInstanceOf(IllegalArgumentException.class);
    }

    private static Stream<Arguments> provideOperator(){
        return Stream.of(
            Arguments.of(Operator.PLUS, "+"),
            Arguments.of(Operator.SUBTRACT, "-"),
            Arguments.of(Operator.DIVIDE, "/"),
            Arguments.of(Operator.MULTIPLY, "*")
        );
    }
}