package game;
import java.util.Random;


public class Die {
    private int faceValue;


    public int getFaceValue() {
        return faceValue;
    }
    public void roll(){
        int random_int = random.nextInt(1, 10);
    }
}
