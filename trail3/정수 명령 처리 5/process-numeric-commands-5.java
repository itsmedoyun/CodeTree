import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> v = new ArrayList<>();
        int N = Integer.parseInt(bf.readLine());

        for(int i = 0; i < N; i++)
        {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String input = st.nextToken();
            if(input.equals("push_back")) v.add(Integer.parseInt(st.nextToken())); 
            else if(input.equals("pop_back")) v.remove(v.size() - 1);
            else if(input.equals("size")) System.out.println(v.size());
            else System.out.println(v.get(Integer.parseInt(st.nextToken()) - 1));
        }
        
        
    }
}