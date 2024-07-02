```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KenTest {

    @Test
    void testIntroduce() {
        Ken ken = new Ken();
        assertEquals("I'm Ken, and I'm going to sing a song for you!", ken.introduce());
    }
    
    @Test
    void testSing() {
        Ken ken = new Ken();
        assertEquals("I'm just Ken", ken.sing());
    }
    
    @Test
    void testPerformance() {
        Ken ken = new Ken();
        int performance = ken.evaluatePerformance();
        assertTrue(performance >= 0 && performance <= 10);
    }
}
```