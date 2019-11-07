package metier.impl;

import metier.interf.ICreditMetier;

public class CreditMetierImpl implements ICreditMetier {

    @Override
    public double calculerMentialiteCredit(double c, double taux, int d) {
        double t = taux/100;
        double term1 = c*t/12;
        double term2 = 1-Math.pow(1+t/12,-d);

        return term1/term2;
    }
}
