<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 07/11/2019
  Time: 18:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Banque</title>
</head>
<body>
    <form action="controleur.ism" method="post">
        <table>
            <tr>
                <td>Mantant:</td>
                <td><input type="text" placeholder="montant" name="montant"></td>
                <td> DH</td>
            </tr>
            <tr>
                <td>Taux:</td>
                <td><input type="text" placeholder="taux" name="taux"></td>
                <td> %</td>
            </tr>
            <tr>
                <td>Durre:</td>
                <td><input type="text" placeholder="duree" name="duree"></td>
                <td> mois</td>
            </tr>
            <tr>
                <button type="submit">Calculer</button>
            </tr>
        </table>
    </form>
</body>
</html>
