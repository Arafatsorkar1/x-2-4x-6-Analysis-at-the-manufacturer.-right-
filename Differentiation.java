
 
package cse0210.differentiation;


public class Differentiation {

    PolynomialFunction p;

    Differentiation(PolynomialFunction f) {
        p = f;
    }

    double getTrueValue() {
        double trueValue = 2 * p.a * p.x + p.b;
        return trueValue;
    }
}
