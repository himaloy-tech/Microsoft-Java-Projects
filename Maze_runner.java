import java.util.Scanner;

public class Maze_runner {

    public static void main(String[] args) {
        intro();
        userMove();
    }

    public static void intro(){
        System.out.println("Welcome to Maze runner");
        System.out.println("Here is your current position:");
        Maze myMap = new Maze();
        myMap.printMap();
//        System.out.println(myMap.canIMoveRight());
    }

    public static void userMove() {
        Maze myMap = new Maze();
        boolean out_of_moves = false;
        int i = 0;
        boolean lose = false;
        while (!out_of_moves) {
            if (myMap.didIWin() == false){
                System.out.print("Where would you like to move? (R, L, U, D): ");
                i++;
                Scanner user = new Scanner(System.in);
                var tr = movesMessage(i);
                if (tr) {
                    out_of_moves = true;
                    break;
                }
                boolean not_invalid = true;
                var move = user.next();
                if (move.equals("R") || move.equals("L")|| move.equals("U") || move.equals("D")){
                    not_invalid = true;
                }
                else {
                    System.out.println("Invalid input ");
                    System.out.println(" ");
                    not_invalid = false;
                }
                if (not_invalid){
                    if (move.equals("R")){
                        if (myMap.canIMoveRight() == true){
                            boolean pit = navigatePit("R");
                            if (pit){
                                System.out.println("Watch out! There's a pit ahead, jump it?");
                                Scanner pi = new Scanner(System.in);
                                String inp = pi.next();
                                if (inp.startsWith("Y") ||  inp.startsWith("y")){
                                    myMap.jumpOverPit(move);
                                    myMap.printMap();
                                }
                                else {
                                    lose = true;
                                    break;
                                }
                            }
                            else {
                                myMap.moveRight();
                                myMap.printMap();
                            }

                        }
                        else {
                        System.out.println(myMap.canIMoveRight());
                            System.out.println("Sorry you have hit a wall");
                        }
                    }
                    else if(move.equals("U")){
                        if(myMap.canIMoveUp() == true){
                            boolean pit = navigatePit("U");
                            if (pit){
                                System.out.println("Watch out! There's a pit ahead, jump it?");
                                Scanner pi = new Scanner(System.in);
                                String inp = pi.next();
                                if (inp.startsWith("Y") ||  inp.startsWith("y")){
                                    myMap.jumpOverPit(move);
                                    myMap.printMap();
                                }
                                else {
                                    lose = true;
                                    break;
                                }
                            }
                            else {
                                myMap.moveRight();
                                myMap.printMap();
                            }
                        }
                        else {
                        System.out.println(myMap.canIMoveUp());
                            System.out.println("Sorry you have hit a wall");
                        }
                    }
                    else if (move.equals("L") == true){
                        if (myMap.canIMoveLeft()){
                            boolean pit =  navigatePit("L");
                            if (pit){
                                System.out.println("Watch out! There's a pit ahead, jump it?");
                                Scanner pi = new Scanner(System.in);
                                String inp = pi.next();
                                if (inp.startsWith("Y") ||  inp.startsWith("y")){
                                    myMap.jumpOverPit(move);
                                    myMap.printMap();
                                }
                                else {
                                    lose = true;
                                    break;
                                }
                            }
                            else {
                                myMap.moveRight();
                                myMap.printMap();
                            }
                        }
                        else {
                        System.out.println(myMap.canIMoveLeft());
                            System.out.println("Sorry you have hit a wall");
                        }
                    }
                    else if (move.equals("D") == true){
                        if (myMap.canIMoveDown()){
                            boolean pit = navigatePit("D");
                            if (pit){
                                System.out.println("Watch out! There's a pit ahead, jump it?");
                                Scanner pi = new Scanner(System.in);
                                String inp = pi.next();
                                if (inp.startsWith("Y") ||  inp.startsWith("y")){
                                    myMap.jumpOverPit(move);
                                }
                                else {
                                    lose = true;
                                    break;
                                }
                            }
                            else {
                                myMap.moveRight();
                                myMap.printMap();
                            }
                        }
                        else {
                        System.out.println(myMap.canIMoveDown());
                            System.out.println("Sorry you have hit a wall");
                        }
                    }
                }
            }
            else if (lose){
                System.out.println("You died because you fell into a pit");
            }
            else if (out_of_moves){
                System.out.println("Sorry, but you didn't escape in time- you lose!");
            }
            else {
                System.out.print("Congratulations, you made it out alive!");
                System.out.print("and you did it in "+i+" moves");
                break;
            }
        }
    }

    public static boolean movesMessage(int moves){
        boolean over = false;
        if (moves == 50){
            System.out.println("Warning: You have made 50 moves, you have 50 remaining before the maze exit closes.");
        }
        else if (moves == 75){
            System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");
        }
        else if (moves == 90){
            System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!");
        }
        else if (moves == 100){
            over = true;
            System.out.println("Oh no! You took too long to escape, and now the maze exit is closed FOREVER 😭 😭 😭 😭 😭 😭");
        }
        return over;
    }

    public static boolean navigatePit(String move) {
        Maze myMap = new Maze();
        if (myMap.isThereAPit(move)){
            return true;
        }
        else {
            return false;
        }
    }

}