import java.util.Random;
import java.util.Scanner;

public class Crypto {
    public static void main(String[] args) {
        System.out.print("Enter Text: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String normal_text = normalizeText(text);
        String obifyied_text  = obify(normal_text);
        Random s = new Random();
        int rs = s.nextInt(19);
        var caesarfiyed_text = caesarify(obifyied_text, rs);
        System.out.println(caesarfiyed_text);
    }
    public static String normalizeText(String text){
        String new_text1 = text.replace("*", "");
        String new_text2 = new_text1.replace("!", "");
        String new_text3 = new_text2.replace("@", "");
        String new_text4 = new_text3.replace("#", "");
        String new_text5 = new_text4.replace("$", "");
        String new_text6 = new_text5.replace("%", "");
        String new_text7 = new_text6.replace("^", "");
        String new_text8 = new_text7.replace("&", "");
        String new_text9 = new_text8.replace("(", "");
        String new_text10 = new_text9.replace(")", "");
        return new_text10;
    }

    public static String obify(String text){
        var modify1 = text.replace("A", "OAB");
        var modify2 = modify1.replace("a", "OaB");
        var modify3 = modify2.replace("e", "OeB");
        var modify4 = modify3.replace("E", "OEB");
        var modify5 = modify4.replace("I", "OIB");
        var modify6 = modify5.replace("i", "OiB");
        var modify7 = modify6.replace("o", "OoB");
        var modify8 = modify7.replace("O", "OOB");
        var modify9 = modify8.replace("u", "OuB");
        var modify10 = modify9.replace("U", "OUB");
        var modify11 = modify10.replace("Y", "OYB");
        var modify12 = modify11.replace("y", "OyB");
        return modify12;
    }

    public static String caesarify(String text, int key){
        var text2 = shiftAlphabet(key);
        return text2;
    }

    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for(; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if(result.length() < 26) {
            for(currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }
}