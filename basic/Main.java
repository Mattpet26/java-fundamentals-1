import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  

public class Main {
  public static void main(String[] args){
    flipNHeads(3);
    clock();
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
  }
  public static String pluralize(String word, int num){    
    if(num > 1){
      return word + "s";
    }
    return word;
  }
  public static void flipNHeads(int n){
    int heads = 0;
    int count = 0;
    while(heads < n){
      double flip = Math.random();
      if(flip >= 0.5) {
        System.out.println("Heads");
        heads++;
      } else {
        System.out.println("Tails");
        heads = 0;
      }
      count ++;
      }
    System.out.println("It took " + count + " flips to achieve three heads in a row");
  }
  public static void clock(){
    String test ="";
    while(true){
      LocalDateTime now = LocalDateTime.now();
      DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-YYY HH:mm:ss");
      String formatDateTime = now.format(format);

      if(!test.equals(formatDateTime)){
        System.out.println(formatDateTime);
      }
      test = formatDateTime;
    }
  }
}