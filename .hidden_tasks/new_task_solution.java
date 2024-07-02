```java
import java.util.Random;

public class Ken {

    public void introduce() {
        System.out.println("I'm Ken, and I'm going to sing a song for you!");
    }
    
    public void sing() {
        System.out.println("I'm just Ken");
    }
    
    public int evaluatePerformance() {
        Random rand = new Random();
        int rating = rand.nextInt(11);
        return rating;
    }
    
    public static void main(String[] args) {
        Ken ken = new Ken();
        
        ken.introduce();
        ken.sing();
        System.out.println("Rating 1: " + ken.evaluatePerformance());
        System.out.println("Rating 2: " + ken.evaluatePerformance());
        System.out.println("Rating 3: " + ken.evaluatePerformance());
    }
}
```