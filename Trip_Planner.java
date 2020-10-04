import java.util.Scanner;

public class Trip_Planner {
    public static void main(String[] args) {
        welcome();
        information();
        time();
        area();
    }

    public static void welcome() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Trip Planner!!!!");
        System.out.println("What is your name?");
        if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4")|| input.equals("5")|| input.equals("6")|| input.equals("7")|| input.equals("8") ||
                input.equals("9") || input.equals("0")){
            int name= input.nextInt();
        }
        String name = input.nextLine();
        System.out.print("Nice to meet you" + " " + name);
        System.out.print(", Where are you travelling to?");
        System.out.println("Enter a real COUNTRY name");
    }

    public static void information() {
        Scanner place = new Scanner(System.in);
        String  plac = place.nextLine();
        System.out.println("Great!!!!" + " " + plac + " " + "sounds like a great trip!!!!!!");
        Scanner days = new Scanner(System.in);
        System.out.println("How many days are you going to spend travelling?");
        int day = days.nextInt();
        System.out.print("How much money, in USD");
        System.out.print(", are you planning to spend in your trip?");
        Scanner mo = new Scanner(System.in);
        int money = mo.nextInt();
        System.out.println("What is the three letter currency symbol for your travel destination?");
        Scanner sym = new Scanner(System.in);
        String sys = sym.next();
        System.out.println("How many" + " " + sys + " are in 1 USD? ");
        Scanner v = new Scanner(System.in);
        double s = v.nextDouble();
        int x = day * 24;
        int z = day * 24 * 60;
        System.out.print("If you are traveling for");
        System.out.print(" " + day + " " + "day that is same as" + " " + x + " " + "hours");
        System.out.println(" " + "or" + " " + z + " " + "minutes");
        double j = money/day;
        System.out.print("If you are going to spend"+" "+ "$" + money + " "+"that means you are going to spend");
        System.out.println(" "+"$"+ j+" "+"per day");
        double m = s*money;
        double n = m/day;
        System.out.println("Your Budget in"+" "+sys+" "+"is"+" "+m+" "+", which per day is"+" "+n);
    }

    public static void time() {
        System.out.println("What is the time difference, in hours, between your home and your destination?");
        Scanner time=new Scanner(System.in);
        double ti=time.nextDouble();
        double a = 00000+ti;
        double g = 12.00+a;
        System.out.print("That means that when it is midnight at home it will be"+" "+a);
        System.out.println(" "+"at your travel destination and when it is noon at home it will be"+" "+g);
    }
    public static void area(){
        System.out.println("What is the square area of your destination country in Km^2?");
        Scanner hga=new Scanner(System.in);
        double  bn=hga.nextDouble();
        double h=bn/2.59000259;
        System.out.println("In miles^2 that is"+" "+h);
        System.out.println("Happy Journey!!!!!");
        //HAPPY JOURNEY!!!!!
    }
}

