package hexlet.code;

public class Util {
    public static int getRandomNumberInRange(int rangeNumberMax, int rangeNumberMin) {
        return (int) (Math.random() * rangeNumberMax + rangeNumberMin);
    }
}
