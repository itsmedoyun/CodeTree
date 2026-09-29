import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int space = 0;
        for(int i = n; i > 0; i--) {
            for(int k = 0; k < space; k++) {
                System.out.print("  ");
            }
            
            for(int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            space++;
            System.out.println();
        }
       
    }
}