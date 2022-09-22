package cs.bjoremo.christine.miscstuff;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FunWithNumbersTest {

    FunWithNumbers fn;

    @BeforeEach
    void setUp() {
        fn = new FunWithNumbers();
    }

    @Test
    void shouldDivideNumbersEvenly() {
        var result1 = fn.canDivideEvenly(3,1);
        assertThat(result1).isTrue();

        var result2 = fn.canDivideEvenly(6,9);
        assertThat(result2).isFalse();

        var result3 = fn.canDivideEvenly(2,5);
        assertThat(result3).isFalse();

        var result4 = fn.canDivideEvenly(9,3);
        assertThat(result4).isTrue();
    }

}