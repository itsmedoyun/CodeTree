import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        LinkedList<Integer> list = new LinkedList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        for(int i = 0; i < N; i++)
        {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String input = st.nextToken();

            if(input.equals("push_front")) list.addFirst(Integer.parseInt(st.nextToken()));
            else if(input.equals("push_back")) list.addLast(Integer.parseInt(st.nextToken()));
            else if(input.equals("pop_front")) System.out.println(list.pollFirst());
            else if(input.equals("pop_back")) System.out.println(list.pollLast());
            else if(input.equals("size")) System.out.println(list.size());
            else if(input.equals("empty")) System.out.println(list.isEmpty() ? 1 : 0);
            else if(input.equals("front")) System.out.println(list.peekFirst());
            else if(input.equals("back")) System.out.println(list.peekLast());
            
        }




    }
}