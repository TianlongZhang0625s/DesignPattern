package templatemethod.barista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Tianlong Zhang
 * @time 2018/8/17 17:37
 * @project DesignPattern
 * @Version 1.0.0
 */
public class TeaWithHook extends CaffineBeverageWithHook {

    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

    public boolean customeWantsCondiments(){
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.print("Would you like lemon with your tea (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader((System.in)));
        try {
            answer = in.readLine();
        }catch (IOException e){
            System.err.println("IO error trying to read your answer");
        }

        if(answer == null){
            return "no";
        }

        return answer;
    }
}
