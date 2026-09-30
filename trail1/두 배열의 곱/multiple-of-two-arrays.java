import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int [][] array1 = new int[3][3];
        int [][] array2 = new int[3][3];
       
        for(int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j = 0; j < 3; j++) {
                array1[i][j] = Integer.parseInt(st.nextToken());
            }   
        }
        bf.readLine();

        for(int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j = 0; j < 3; j++) {
                int input = Integer.parseInt(st.nextToken());
                array2[i][j] = input * array1[i][j];
            }
        }
    
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }


    


    }
}