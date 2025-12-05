<%@page language="java" %>
<html>
<head>
    <link rel="stylesheet" href="style.css">
</head>
    <body>
        <div class="wrapper">
            <div class="container">
                <h2>Result is : <%= session.getAttribute("result") %>  </h2>
                <h3> Done using JSP Way </h3>
                <h2>Result is : ${result} </h2>
                <h3> Done using JSTL Way </h3>
            </div>
        </div>
    </body>
</html>
