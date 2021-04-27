<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ca">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <title>Jocs</title>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Jocs</h1>
                    <p>Llista de jocs</p>
                </div>
            </div>
        </section>
        <section class="container">
            <div class="row">
                <c:forEach items="${jocs}" var="joc">
                    <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                        <div class="thumbnail">
                            <div class="caption">
                                <h3>${joc.name}</h3>
                                <p>${joc.tipusJoc}</p>
                                <p>${joc.quantity}</p>
                                
                                
                                
                               <!-- <p>DOLAR{medicament.price}</p> 
                                <p>Hi ha DOLAR{medicament.stockQuantity} unitats en magatzem</p>
                                <p>
                                    <a href=" <springDOSPUNTSurl value= '/medicaments/medicament?codi=DOLAR{medicament.medicamentId}' /> " class="btn btn-primary">
                                        <span class="glyphicon-info-sign glyphicon"/></span> Detall
                                    </a>
                                </p> -->
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </section>
    </body>
</html>