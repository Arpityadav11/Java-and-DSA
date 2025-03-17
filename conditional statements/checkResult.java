// check if student is pass or fail
import java.util.*;

public class checkResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks = sc.nextInt();
        String Rc= marks>= 33?"pass":"fail";
        System.out.println(Rc);
    }
}
