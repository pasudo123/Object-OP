package main.reservation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

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
}