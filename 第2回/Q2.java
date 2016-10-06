import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] input = line.split(" ");

        char mark;
        char number;
        String[] spades = new String[13];
        String[] diamonds = new String[13];
        String[] clubs = new String[13];
        String[] hearts = new String[13];


        for(int i=0;i<input.length;i++){
            mark = input[i].charAt(0);
            number = input[i].charAt(1);
            if(mark == 'S'){
                setCard(number, spades);
            }
            else if(mark == 'D'){
                setCard(number, diamonds);
            }
            else if(mark == 'C'){
                setCard(number, clubs);
            }
            else if(mark == 'H'){
                setCard(number, hearts);
            }
        }

        if(outputCheck(spades) == true){
            System.out.print("S:");
            output(spades);
        }
        if(outputCheck(diamonds) == true){
            System.out.print("D:");
            output(diamonds);
        }
        if(outputCheck(clubs) == true){
            System.out.print("C:");
            output(clubs);
        }
        if(outputCheck(hearts) == true){
            System.out.print("H:");
            output(hearts);
        }
    }

    private static void output(String[] cards){
        boolean flag = false;
        for(int j=0;j<cards.length;j++){
            if(cards[j] != null){
                if(flag == true){
                    System.out.print(",");
                }
                System.out.print(cards[j]);
                flag = true;
            }
        }
        System.out.println();
    }

    private static void setCard(char number, String[] cards){
        if(number == 'A'){
            cards[0] = String.valueOf(number);
        }
        else if(number == '0'){
            cards[9] = String.valueOf(number);
        }
        else if(number == 'J'){
            cards[10] = String.valueOf(number);
        }
        else if(number == 'Q'){
            cards[11] = String.valueOf(number);
        }
        else if(number == 'K'){
            cards[12] = String.valueOf(number);
        }
        else{
            cards[(Character.getNumericValue(number))-1] = String.valueOf(number);
        }
    }

    private static boolean outputCheck(String[] cards){
        boolean outputFlug = false;
        for(int i=0;i<cards.length;i++){
            if(cards[i] != null){
                outputFlug = true;
                break;
            }
        }
        return outputFlug;
    }
}