package main.reservation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("좌석들은")
class PlacesTest {

    @Test
    @DisplayName("생성된다.")
    void createTest() {
        // when
        Places places = Places.create();

        // then
        assertThat(places).isNotNull();
    }

    @ParameterizedTest
    @CsvSource({
        "PARK, 1",
        "KIM, 2",
        "LEE, 3",
    })
    @DisplayName("업데이트된다.")
    void updatePlaceTest(String name, int seatNumber){

        // when
        Places places = Places.create();

        // then
        final String myName = places.updatePlace(name, seatNumber);

        // then
        assertThat(myName).isEqualTo(name);
    }

    @ParameterizedTest

    void updatePlaceExceptionTest(String name, int seatNumber){

    }
}