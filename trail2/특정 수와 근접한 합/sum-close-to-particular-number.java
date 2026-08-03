import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int sum = 0;
        int [] num = new int [N];
        int distance = Integer.MAX_VALUE;

        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < N; i++)    
        {
            num[i] = Integer.parseInt(st.nextToken());
            sum += num[i];
        }

        for(int i = 0; i < N - 1; i++)
        {
            for(int j = i + 1; j < N; j++)
            {
                int T = sum - num[i] - num[j];
                if(Math.abs(T - S) < distance) distance = Math.abs(T - S);
            }
        }
        System.out.print(distance);
    }
}