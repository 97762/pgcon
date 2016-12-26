package q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] input = line.split(" ");
        String output = "";

        String insert = String.format("%-19s", input[0]);
        output = output.concat(insert);
        output = output.concat(" ");

        insert = String.format("%19s", input[1]);
        output = output.concat(insert);
        output = output.concat(" ");

        insert = String.format("%09d", Integer.parseInt(input[2]));
        output = output.concat(insert);
        output = output.concat(" ");

        insert = String.format("%9d", Integer.parseInt(input[3]));
        output = output.concat(insert);
        output = output.concat(" ");

        insert = String.format("%9.3f", Double.parseDouble(input[4]));
        output = output.concat(insert);


        System.out.println(output);
    }
}
