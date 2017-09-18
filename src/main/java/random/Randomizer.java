package random;

import java.util.Random;

/**
 * Created by Mario de Benito on 04/04/2017.
 * Used code on this thread:
 * http://stackoverflow.com/questions/363681/how-to-generate-random-integers-within-a-specific-range-in-java
 */
public class Randomizer {
	
	private Randomizer(){}

    /**
     * Returns a pseudo-random number between min and max, inclusive.
     * The difference between min and max can be at most
     * <code>Integer.MAX_VALUE - 1</code>.
     *
     * @param min Minimum value
     * @param max Maximum value.  Must be greater than min.
     * @return Integer between min and max, inclusive.
     * @see java.util.Random#nextInt(int)
     */
    public static int randInt(int min, int max) {        
        Random rand = new Random();
        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        return rand.nextInt((max - min) + 1) + min;
    }
}
