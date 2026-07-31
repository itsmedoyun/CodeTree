import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int count = 0;
        int [] H = new int [N];
        for(int i = 0; i < N; i++)
        {
            H[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N - 2; i++)
        {
            for(int j = i + 1; j < N - 1; j++)
            {
                for(int k = j + 1; k < N; k++)
                {
                    if(H[i] <= H[j] && H[j] <= H[k]) count++;
                }
            }
        }

        System.out.print(count);

    }
}