import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      //  int t=s.nextInt();
        //for (int i = 0; i <t ; i++) {
            // here we are converting string to the integer
           /* int a = Integer.parseInt(s.next());
            int b = Integer.parseInt(s.next());
            int n= Integer.parseInt(s.next());
            int temp = a;*/
        int a = Integer.parseInt(s.next());
        int b = Integer.parseInt(s.next());
        int n= Integer.parseInt(s.next());
            for (int j = 0; j <n ; j++) {

                int temp = a;
                // here n is the power
                        temp=temp+(int)Math.pow(2,j)*b;
                System.out.print(temp+"     ");
            }
            System.out.println();
        }


}
