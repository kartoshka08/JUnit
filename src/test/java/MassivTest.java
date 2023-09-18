import org.example.Massivs;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MassivTest {
    @BeforeEach
    void setUp(){
        System.out.println("Test started");
    }

    @AfterEach
    void tearDown(){
        System.out.println("Test ended");}

    @DisplayName("Проверка на длину массива")
    @Test
    void filesThrowException(){
        final var massiv = new Massivs();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> massiv.sortMass());

    }
}
