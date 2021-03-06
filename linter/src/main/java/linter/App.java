/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main (String[] args){
        String returnString = theLintr("src/main/resources/gates.js");
        System.out.println(returnString);
    }
    public static String theLintr(String filePath) {
        Scanner jsFile;
        try {
            jsFile = new Scanner(new File(filePath));
        } catch (FileNotFoundException e) {
            System.out.println("Oops looks like something went wrong");
        }
        int lineNumb = 0;
        String errorString = "";

        while (jsFile.hasNextLine()) {
            lineNumb++;
            String temp = jsFile.nextLine();
            if (!temp.isBlank()) {
                char endChar = temp.charAt(temp.length() - 1);
                if (!(endChar == ';' || endChar == '{' || endChar == '}' || temp.contains("if"))) {
                    if (errorString.isBlank()) {
                        errorString = "Line " + lineNumb + ": Missing semicolon.";
                    } else {
                        errorString = errorString + "\nLine" + lineNumb + " :Missing semicolon.";
                    }
                }
            }
        }
        return errorString;
    }
}
