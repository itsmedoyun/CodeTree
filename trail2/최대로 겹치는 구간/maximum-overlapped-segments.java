import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max_count = 201;
        int [] count = new int [max_count];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt()+100;
            int x2 = sc.nextInt()+100;

            for(int j = x1; j < x2; j++){
                count[j]++;
            }
        }
        int max = -1;
        for(int i = 0; i < max_count; i++)
        {
            if(max < count[i]) {
                max = count[i];
            }
        }
        System.out.print(max);
    }
}