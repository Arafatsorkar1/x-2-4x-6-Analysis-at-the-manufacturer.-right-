
package cse0210.differentiation;

public class PolynomialFunction {
    double a, b, c, x;
    PolynomialFunction(double p, double q, double r, double s){
        a = p;
        b = q;
        c = r;
        x = s;
    }
    
    @Override
    public String toString(){
        String s = a + "x^2 + " + b + "x + " + c;
        return s;
    }
    
    double getFunctionValue(double x1){
        double ans = a * x1 * x1 + b * x1 + c;
        return ans;
    }
}
