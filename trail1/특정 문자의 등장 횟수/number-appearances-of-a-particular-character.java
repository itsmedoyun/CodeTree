import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        int count_ee = 0;
        int count_eb = 0;

        for(int i = 0; i < input.length() - 1; i++) {
            if(input.charAt(i) == 'e') {
                if(input.charAt(i + 1) == 'e') {
                    count_ee++;
                }
                else if(input.charAt(i + 1) == 'b') {
                    count_eb++;
                }
            }
        }

        System.out.print(count_ee + " " + count_eb);
    }
}