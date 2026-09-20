import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        String object = bf.readLine();

        boolean is_contain = false;
        int index = -1;
        
        for(int i = 0; i < input.length() - object.length() + 1; i++) {

            for(int j = 0; j < object.length(); j++) {
                if(input.charAt(i + j) == object.charAt(j)){
                    is_contain = true;
                }
                else {
                    is_contain = false;
                    break;
                }
            }
            
            if(is_contain) {
                index = i;
                break;
            }
        }

        System.out.print(index);


    }
}