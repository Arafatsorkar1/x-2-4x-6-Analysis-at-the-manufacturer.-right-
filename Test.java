
package cse0210.differentiation;

import java.util.Scanner;


public class Test {

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a: ");
        int a = sc.nextInt();
        
        System.out.print("Please enter b: ");
        int b = sc.nextInt();
        
        System.out.print("Please enter c: ");
        int c = sc.nextInt();
        
        System.out.print("Please enter x: ");
        int x = sc.nextInt();
        
        System.out.print("Please enter del x: ");
        double delX = sc.nextDouble();
        
        PolynomialFunction f = new PolynomialFunction(a, b, c, x);
        System.out.println("the function is " + f);
        
        Differentiation d = new Differentiation(f);
        System.out.println("True value is: " + d.getTrueValue());
        
        FDD approx = new FDD(f);
        System.out.println("Approx. value is: " + approx.getApproxValue(delX));
        
        double trueError = d.getTrueValue() - approx.getApproxValue(delX);
        
        System.out.println("True error is: " + trueError);
    }
    
}
