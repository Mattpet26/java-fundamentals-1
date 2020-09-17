package basiclibrary;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class MapsTest {
    @Test public void testweatherAnalyze(){
        Maps test = new Maps();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String outPut = "High: 72 " + "\n " + "Low: 51 " + "\n" +
                "Never saw temp: 63 " + "\n" +
                "Never saw temp: 67 " + "\n" +
                "Never saw temp: 68 " + "\n" +
                "Never saw temp: 69 " + "\n";

        assertEquals(outPut, test.analyzeWeatherData(weeklyMonthTemperatures));
    }
    @Test
    public void testTally(){
        Maps test = new Maps();
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winString = test.tally(votes);
        assertEquals("Should be 'Bush'", "Bush", test.tally(votes));
    }
}
