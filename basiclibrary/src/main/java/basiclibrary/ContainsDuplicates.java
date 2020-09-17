package basiclibrary;

public class ContainsDuplicates {
    public boolean containsDuplicates(int [] thingToCheck){
        for(int slow = 0; slow < thingToCheck.length; slow++){
            for(int fast = slow + 1; fast < thingToCheck.length; fast++){
                if(thingToCheck[fast] == thingToCheck[slow]) return true;
            }
        }


        return false;
    }
}
