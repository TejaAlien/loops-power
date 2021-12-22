import java.util.Scanner;

public class TwodimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]a = new int[6][6];
        for(int i = 0; i < 6; i ++)
            for(int j = 0 ; j < 6; j ++)
                a[i][j] = sc.nextInt();
        int maxsum = -999;
        for(int i = 0; i < 6; i++)
        {
            for(int j = 0; j < 6; j++)
            {
                int sum = 0;
                if(j <= 3 && i <= 3)
                {
                    sum += a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                }
                else
                    break;
                if(sum > maxsum)
                    maxsum = sum;
            }
        }
        System.out.println(maxsum);
    }
}
