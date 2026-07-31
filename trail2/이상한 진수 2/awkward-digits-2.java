import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
        String str = bf.readLine();
        int [] number = new int [str.length()];
        boolean isFirst = true;
        int num = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '0' && isFirst) 
            {
                number[i] = 1;
                isFirst = false;
            }

            else number[i] = str.charAt(i) - '0';
        }

        if(isFirst)
        {
            number[str.length() - 1] = 0;
        }
        for(int i = 0; i < str.length(); i++)
        {
            int value = (int)Math.pow(2, str.length() - 1 - i);
            num += number[i] * value;
        }

        System.out.print(num);
    }
}