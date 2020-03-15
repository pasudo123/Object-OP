package main.reservation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@DisplayName("좌석타입은")
class SeatTypeTest {

    @ParameterizedTest
    @CsvSource({
        "S, S",
        "A, A",
        "B, B"
    })
    @DisplayName("현재 좌석타입을 반환한다.")
    void getSeatTypeTest(String seatTypeStr, SeatType seatType) {

        // when
        SeatType mySeatType = SeatType.getSeatType(seatTypeStr);

        // then
        assertThat(mySeatType).isEqualTo(seatType);
    }

    @ParameterizedTest
    @ValueSource(strings = {"s", "a", "b", "c"})
    @DisplayName("현재 좌석타입 반환 시 에러가 발생한다.")
    void getSeatTypeExceptionTest(String seatType){

        // when
        assertThatThrownBy(() -> SeatType.getSeatType(seatType))
                .isInstanceOf(IllegalArgumentException.class);
    }
}