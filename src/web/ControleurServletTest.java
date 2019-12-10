package web;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import javax.servlet.ServletException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ControleurServletTest {

    ControleurServlet servlet;
    CreditModel modelAc;
    MockHttpServletRequest request;
    MockHttpServletResponse response;
    @BeforeEach
    void setUp() {
        servlet = new ControleurServlet();
        modelAc = new CreditModel();
        request = new MockHttpServletRequest();
        response = new MockHttpServletResponse();

        modelAc.setTaux(0.04);
        modelAc.setDuree(22);
        modelAc.setMontant(200);
    }

    @Test
    void doPost() throws ServletException, IOException {


        request.setParameter("montant", String.valueOf(modelAc.getMontant()));
        request.setParameter("duree",String.valueOf(modelAc.getDuree()));
        request.setParameter("taux",String.valueOf(modelAc.getTaux()));

        servlet.doPost(request,response);
        CreditModel model = (CreditModel) request.getAttribute("model");
        assertEquals(modelAc.getDuree(),model.getDuree());
    }
}