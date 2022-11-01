package cs.bjoremo.christine.miscstuff;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.*;

class LotteryNumbersTest {
    LotteryNumbers ln;
    SortNumbers sn;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
     //   ln = new LotteryNumbers();
        sn = new SortNumbers();
    }

    @Test
    void lottoNumbersShouldBeUniqueAndBetweenSpanSet() {
        var lotteryRow = ln.generateSet();

        assertThat(lotteryRow.size()).isEqualTo(7);

        for (int lotteryNumber : lotteryRow) {
            assertThat(lotteryNumber).isGreaterThan(0);
            assertThat(lotteryNumber).isLessThanOrEqualTo(35);
        }
    }

    @Test
    void lottoNumbersShouldBeUniqueAndBeBetweenSpanList() {
        var lotteryRowList = ln.generateList();

        Set<Integer> lotteryRow = new HashSet<>(lotteryRowList);

        assertThat(lotteryRow.size()).isEqualTo(11);

        for (int lotteryNumber : lotteryRow) {
            assertThat(lotteryNumber).isGreaterThan(0);
            assertThat(lotteryNumber).isLessThanOrEqualTo(35);
        }

    }

    @Test
    void lottoNumbersShouldBeUniqueAndBeBetweenSpanArray() {
        var lotteryRowArray = ln.generateArray();

        Set<Integer> lotteryRow = new HashSet<>();

        for (int lotteryNumber : lotteryRowArray) {
            assertThat(lotteryNumber).isGreaterThan(0);
            assertThat(lotteryNumber).isLessThanOrEqualTo(35);
            lotteryRow.add(lotteryNumber);
        }
        assertThat(lotteryRow.size()).isEqualTo(11);
    }

    @Test
    void lottoNumbersShouldBeUniqueAndBeBetweenSpanMap() {
        var lotteryRowMap = ln.generateMap();

        Set<Integer> lotteryRow = new HashSet<>(lotteryRowMap.values());

        assertThat(lotteryRow.size()).isEqualTo(7);

        for (int lotteryNumber : lotteryRow) {
            assertThat(lotteryNumber).isGreaterThan(0);
            assertThat(lotteryNumber).isLessThanOrEqualTo(35);
        }

    }

    @Test
    void numbersShouldBeSorted() {
        var sortedNumbers = sn.numericalOrder();
        assertThat(sortedNumbers).isSorted();
    }

    @org.junit.jupiter.api.Test
    void generateSet() {
    }

    @org.junit.jupiter.api.Test
    void generateList() {
    }

    @org.junit.jupiter.api.Test
    void generateArray() {
    }

    @org.junit.jupiter.api.Test
    void generateMap() {
    }
}