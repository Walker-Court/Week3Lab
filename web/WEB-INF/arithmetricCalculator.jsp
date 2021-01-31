<%-- 
    Document   : arithmetricCalculator
    Created on : Jan 24, 2021, 7:48:00 PM
    Author     : WCour
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetric Calculator</title>
    </head>
    <body>
        <h1>Arithmetric Calculator</h1>
         <form method="Post" action="">
        First:    <input type="text"name="first">
        <br>
        Second: <input type="text"name="second">
        <br>
        <input type="Submit" name="calc" value="+">
        <input type="Submit" name="calc" value="-">
        <input type="Submit" name="calc" value="*">
        <input type="Submit" name="calc" value="%">
        </form>
       <p>${message}</p>
    </body>
    <footer><a href="ageCalcServlet">Age Calculator</a></footer>
</html>
