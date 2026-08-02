import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int count = 0;


        for(int i = 0; i < N - 2; i++)
        {
            if(str.charAt(i) == 'C')
            {
                for(int j = i + 1; j < N - 1; j++)
                {
                    if(str.charAt(j) == 'O')
                    {
                        for(int k = j + 1; k < N; k++)
                        {
                            if(str.charAt(k) == 'W') count++;
                        }
                    }
                }
            }
        }

        System.out.print(count);




    }
}