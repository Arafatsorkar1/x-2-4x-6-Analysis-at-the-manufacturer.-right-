

package cse0210.differentiation;


public class FDD {
    PolynomialFunction p;
    FDD(PolynomialFunction f){
        p = f;
    }
    PolynomialFunction 
         
    FDD(PolynomialFunction g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    double getApproxValue(double delX){
        double approxValue = (p.getFunctionValue(p.x+delX) - p.getFunctionValue(p.x)) / delX;
        return approxValue;
    }
}
