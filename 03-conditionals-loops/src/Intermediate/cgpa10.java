package Intermediate;
// 10. Calculate CGPA Java Program
import java.util.*;

public class cgpa10 {
    public static void main(String[] args) {
        double English = 9.1;
        double Hindi = 8.5;
        double Maths = 9.5;
        double Science =9.6;
        double SocialStudy = 8.6;
        double CGPA = (9.1+8.5+9.5+9.6+8.6)/(5.0);
        double CGPAper = (float)(9.5 * (CGPA));
        System.out.println(" CGPA Percentage is:  "+CGPAper);
    }
}
