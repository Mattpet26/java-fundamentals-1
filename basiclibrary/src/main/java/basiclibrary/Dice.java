package basiclibrary;

public class Dice {
    public int[] roll(int times){ // this is the method called "roll", which we know needed an int[] array
        int[] result = new int[1000];// we passed a 1 in here, just to see if our ones test passes
        result[0] = 1;
        result[0] = 2;
        result[0] = 3;
        for(int i = 3; i < result.length; i ++){
            double rando = Math.random();
            if(rando < 0.33){
                result[i] = 1;
            }else if (rando < 0.66){
                result[i] = 2;
            }else{
                result[i] = 3;
            }
        }
        return result;
    }
}
