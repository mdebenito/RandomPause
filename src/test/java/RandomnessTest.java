import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by tf05046 on 04/04/2017.
 */
public class RandomnessTest {
    @Test
    public void testRandomness(){
        try {
            int pause = 0;
            for(int i=0;i<10;i++){
                int newPause = RandomPause.pause();
                assertNotEquals("Checking standard pause ("+pause+"/"+newPause+")",pause,newPause);
                pause=newPause;
            }

            int min = 10;
            int max = 500;
            pause = 0;
            for(int i=0;i<10;i++){
                int newPause = RandomPause.pause(min,max);
                assertNotEquals("Checking delimited pause ("+pause+"/"+newPause+")",pause,newPause);
                pause=newPause;
            }

            int ref = 500;
            pause = 0;
            for(int i=0;i<10;i++){
                int newPause = RandomPause.pause(ref);
                assertNotEquals("Checking reference pause ("+pause+"/"+newPause+")",pause,newPause);
                assertTrue("Pause (" + pause + ") should be lesser than 2*ref (" + (ref*2) + ")", pause <= (ref*2));
                assertTrue("Pause (" + pause + ") should be greater or equal than zero", pause >= 0);
                pause=newPause;
            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
