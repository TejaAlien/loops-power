import java.util.Scanner;

public class Scannermethods {
    public static void main(String[] args) {

        Scanner st = new Scanner(System.in);
        int i=0;
        while(st.hasNextLine()){

            System.out.println(i+" "+ st.nextLine());
            i++;
        }
    }
}
