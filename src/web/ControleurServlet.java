package web;

import metier.impl.CreditMetierImpl;
import metier.interf.ICreditMetier;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="cs",urlPatterns={"*.ism","/ismail"})
public class ControleurServlet extends HttpServlet {
    ICreditMetier service;
    @Override
    public void init() throws ServletException {
        service = new CreditMetierImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("VueCredit.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double montant  = Double.parseDouble(req.getParameter("montant"));
        int duree = Integer.parseInt(req.getParameter("duree"));
        double taux = Double.parseDouble(req.getParameter("taux"));

        double result = service.calculerMentialiteCredit(montant,taux,duree);

    }
}
