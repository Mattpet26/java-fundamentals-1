package basiclibrary;

public class Averages {
    public double average(int[] nums){
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total += nums[i];
        }
        return (double) total / nums.length;
    }

    public int[] lowestOfAverages(int[][] tempsPerWeek){ // an array of integer arrays
        double lowest = average(tempsPerWeek[0]);
        int index = 0;
        for(int i = 1; i < tempsPerWeek.length; i++){
            if(lowest > average(tempsPerWeek[i])){
                lowest = average(tempsPerWeek[i]);
                index = i;
            }
        }
        return tempsPerWeek[index];
    }
}
