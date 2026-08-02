import java.io.*;
import java.util.*;

public class Main {

    public static int digit(int num){
        int digit = 0;
        while(num != 0)
        {
            num /= 10;
            digit++;
        }
        return digit;
    }

    public static int [] each_digit(int num){
        int digit = digit(num);
        int [] arr = new int [5];

        for(int i = digit; i > 0; i--)
        {
            int div = 1;
            for(int j = 0; j < i - 1; j++)
            {
                div *= 10;
            }
            arr[i - 1] = num / div;
            num %= div;
        }

        return arr;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int [] arr = new int [N];
        int max = -1;
        
        for(int i = 0; i < N; i++)
        {
            arr[i] = Integer.parseInt(bf.readLine());
        }

        for(int i = 0; i < N - 2; i++)
        {
            int [] num1 = each_digit(arr[i]);
            for(int j = i + 1; j < N - 1; j++)
            {
                int [] num2 = each_digit(arr[j]);
                for(int k = j + 1; k < N; k++)
                {
                    boolean isNotCarry = true;
                    int [] num3 = each_digit(arr[k]);
                    for(int l = 0; l < 5; l++)
                        {
                            if(num1[l] + num2[l] + num3[l] > 9)
                            {
                                isNotCarry = false;
                                break;
                            }
                        }
                        if(isNotCarry)
                        {
                            int num = arr[i] + arr[j] + arr[k];
                            if(max < num) max = num;
                        }
                }
            }
        }
        System.out.print(max);
    }
}