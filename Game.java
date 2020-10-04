import java.util.*;

public class Game {
    public static void main(String[] args) {
        game();

    }public static void game(){
        System.out.println("What is your name?");
        Scanner name=new Scanner(System.in);
        String na=name.nextLine();
        System.out.println("Hello  "+na);
        System.out.println("My name is COMPUTER,Nice to meet you "+na);
        System.out.println("Here are the rules for the GAME:");
        System.out.println("When you choose a number, the computer will automatically choose another number randomly.");
        System.out.println("If the sum of the numbers chosen by you and the computer results to an even number, then you WIN!!!, otherwise you lose.");
        System.out.println("Write Play to  play or Quit to quite");
        Scanner d = new Scanner(System.in);
        String v = d.next();
        // HERE IS THE WHILE LOOP!!!!
        while (v.equals("Play") || v.equals("play") || v.startsWith("p") || v.startsWith("P")) {

            if (v.equals("Play") || v.equals("play") || v.startsWith("P") || v.startsWith("p")) {
                System.out.println("Let's play");
            } else if (v.equals("Quit") || v.equals("quit") || v.startsWith("Q") || v.startsWith("q")) {
                System.out.println("I am feeling so bad that you are leaving");
                break;
            } else {
                System.out.println("Error: write play or quit");
            }
            System.out.println(na + " " + "you are Even");
            System.out.println("The computer is Odd");
            System.out.println("How many fingers do you put out?Input numbers between 0 to 5");
            Scanner b = new Scanner(System.in);
            int l = b.nextInt();
            if (l >= 6) {
                System.out.println("Input numbers between 0 to 5");
            } else if (l <= 5) {
                System.out.println("");
            } else {
                System.out.println("Error");
            }
            Random s = new Random();
            int rs = s.nextInt(6);
            System.out.println("computer chosen :" + " " + rs);
            int hi = l + rs;
            if (hi == 1 || hi == 3 || hi == 5 || hi == 7 || hi == 9) {
                System.out.println(l + "+" + rs + "=" + hi);
                System.out.println("Its an Odd number!!!YOU LOSE");
            } else if (hi == 2 || hi == 4 || hi == 6 || hi == 8 || hi == 10) {
                System.out.println(l + "+" + rs + "=" + hi);
                System.out.println(" Its an Even number!!! OMG!!! YOU WIN !!!!!!!");
            } else {
                System.out.println("Error");
            }
            System.out.println("Write Play to play again OR Quit to stop Playing");
            Scanner x = new Scanner(System.in);
            String c = x.nextLine();
            if (c.equals("Play") || c.equals("play") || c.startsWith("Q") || c.startsWith("q")) {
                System.out.println("Let's Play again");
            }
            else if(c.equals("Quit") || c.equals("q")){
                break;
            }
        }
        System.out.println("Bye");
        System.out.println("Have a NICE DAY");
    }
}


