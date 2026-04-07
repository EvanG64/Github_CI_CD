import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void testAdd() {
        App app = new App();
        // Change this '5' to '100' during the demo to show it failing!
        assertEquals(10, app.add(2, 3));
    }
}