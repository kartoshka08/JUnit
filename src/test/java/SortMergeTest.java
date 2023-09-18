import org.example.SortMerge;
import org.junit.jupiter.api.*;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;



class SortMergeTest {

    @BeforeEach
    void setUp(){
        System.out.println("Test started");
    }

    @AfterEach
    void tearDown(){
        System.out.println("Test ended");}

    @DisplayName("Проверка на метод слияния двух массивов")
    @Test
    void mergeTest(){
        final SortMerge sortMerge = new SortMerge();
        final int[][] teams = {
                {45, 31, 24, 22, 20, 17, 14, 13, 12, 10},
                {31, 18, 15, 12, 10, 8, 6, 4, 2, 1},
                {51, 30, 10, 9, 8, 7, 6, 5, 2, 1}
        };

        final var actual = Arrays.toString(SortMerge.mergeAll(teams));
        var exception = Arrays.toString(new int[]{51, 45, 31, 31, 30, 24, 22, 20, 18, 17});
        assertEquals(exception.toString(), actual.toString());
    }

}