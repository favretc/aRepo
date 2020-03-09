import java.util.Scanner;

public class Hello
{
    public static void main(String[] args)
            // locate file and make a connection
    {
        Scanner keyboard = new Scanner(System.in);
        //let computer know there will be keyboard inputs and it needs to have scanner runnin
        System.out.println("Hello. What is your name?");
        //script
        String response;
        //notify computer next line requires keyboard input
        response = keyboard.next();
        //give the keyboard input a name "response"
        System.out.println("It's nice to meet you, " + response + ". How old are you?");
        //script + input
        String responseB;
        responseB = keyboard.next();
        //repeat lines, see above
        System.out.println("I see that you are still quite young at only " + responseB + ".");
        System.out.println("Where do you live?");
        //script
        String responseC;
        responseC = keyboard.next();
        //repeat lines, see above
        System.out.println("Wow! I've always wanted to go to " + responseC + ". Thanks for chatting with me. Bye!");
        //script
    }
}

