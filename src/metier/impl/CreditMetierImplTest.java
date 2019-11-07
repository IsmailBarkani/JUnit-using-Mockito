package metier.impl;

import metier.interf.ICreditMetier;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CreditMetierImplTest {

    ICreditMetier metier;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        metier = new CreditMetierImpl();
    }

    @org.junit.jupiter.api.Test
    void calculerMentialiteCredit() {
        double c = 200000;
        int  d =240;
        double t = 4.5;

        double resAttendu= 1265.2987;
        double restCalcule = metier.calculerMentialiteCredit(200000,4.5,240);


        assertEquals(resAttendu,restCalcule,0.0001);

    }
}