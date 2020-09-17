package basiclibrary;

import java.util.*;

public class Maps {
    public String analyzeWeatherData(int[][] arr) {

        HashSet<Integer> tempSet = new HashSet<>();
        HashSet<String> addtemps = new HashSet<>();

        for (int[] outer : arr) {
            for (int vals : outer) {
                tempSet.add(vals);
            }
        }
        int maxTemp = Collections.max(tempSet);
        int minTemp = Collections.min(tempSet);

        String ans = "High: " + maxTemp + "\n" +
                "Low: " + maxTemp + "\n";

        for (int i = minTemp; i < maxTemp; i++) {
            if (!tempSet.contains(i)) {
                ans += "Never saw temp: " + i + "\n";
            }
        }
        System.out.println(ans);
        return ans;
    }
    public static String tally(List<String> votes) {
        HashMap<String, Integer> uniqueVotes = new HashMap<>();

        int winNum = Integer.MIN_VALUE;
        String winString ="";
        int mostVotes = 0;

        for (String vote : votes) {
            if(uniqueVotes.containsKey(vote)){
                uniqueVotes.put(vote, uniqueVotes.get(vote) +1);
            }else {
                uniqueVotes.put(vote, 0);
            }
        }

        for(String candidate : uniqueVotes.keySet()){
            int totalVote = uniqueVotes.get(candidate);
            if(totalVote > mostVotes){
                mostVotes = totalVote;
                winString = candidate;
            }
        }
        return winString;
    }
}

