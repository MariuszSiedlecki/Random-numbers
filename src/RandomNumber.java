import javax.sound.midi.Soundbank;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Drawn numbers: ");
        for (int i = 1; i <= 6; i++) {
            System.out.println(random.nextInt(49) + 1);
        }

    }
}
