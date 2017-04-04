import random.Randomizer;

/**
 * Created by Mario de Benito on 04/04/2017.
 */
public class RandomPause {
    private static int MIN_MILLIS = 10;
    private static int MAX_MILLIS = 500;

    /**
     * Pauses the thread for a random amount of milliseconds between MIN_MILLIS and MAX_MILLIS
     * @return milliseconds paused
     * @throws InterruptedException
     */
    public static int pause() throws InterruptedException {
        int rand = Randomizer.randInt(MIN_MILLIS,MAX_MILLIS);
        Thread.sleep(rand);
        return rand;
    }
    /**
     * Pauses the thread for a random amount of milliseconds between min and max values
     * @param max Maximum amount of milliseconds to pause
     * @param min Minimum amount of milliseconds paused
     * @return milliseconds paused
     * @throws InterruptedException
     */
    public static int pause(int min, int max) throws InterruptedException {
        int rand = Randomizer.randInt(min,max);
        Thread.sleep(rand);
        return rand;
    }

    /**
     * Pauses the thread for a random amount of milliseconds between 0 and refmillis*2
     * @param refmillis reference milliseconds
     * @return milliseconds paused
     * @throws InterruptedException
     */
    public static int pause(int refmillis) throws InterruptedException {
        int min = Randomizer.randInt(0,99);
        int max = Randomizer.randInt(0,100);
        int rand = Randomizer.randInt(min*refmillis/100,refmillis+(max*refmillis/100));
        Thread.sleep(rand);
        return rand;
    }

    /**
     * Returns currently set minimum milliseconds
     * @return
     */
    public static int getMinMillis() {
        return MIN_MILLIS;
    }

    /**
     * Sets minimum milliseconds value
     * @param minMillis
     */
    public static void setMinMillis(int minMillis) {
        MIN_MILLIS = minMillis;
    }

    /**
     * Returns currently set maximum milliseconds
     * @return
     */
    public static int getMaxMillis() {
        return MAX_MILLIS;
    }

    /**
     * Sets maximum milliseconds value
     * @param maxMillis
     */
    public static void setMaxMillis(int maxMillis) {
        MAX_MILLIS = maxMillis;
    }


}
