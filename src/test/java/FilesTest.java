import org.example.Files;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("File Test")
public class FilesTest {

    @BeforeEach
    void setUp(){
        System.out.println("Test started");
    }

    @AfterEach
    void tearDown(){
        System.out.println("Test ended");}

    @DisplayName("Проверка на создание файлов")
    @Test
    void filesThrowException(){
        final var file = new Files();

        var exception = "Oops";
        var actual = file.createFiles();
        assertNotEquals(exception, actual);
    }
}
