import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void addTest(){
        var app = new App();
        assertEquals(5, app.add(2, 2)); 
    }
}
