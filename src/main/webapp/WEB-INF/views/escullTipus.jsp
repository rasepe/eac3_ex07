<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link
            rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <title>Jocs</title>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Tipus</h1>
                    <p>Escull primer el tipus del joc</p>
                    <!-- <a href="<cDOSPUNTSurl value="/j_spring_security_logout" />" class="btn btndanger btn-mini pull-right">desconnectar</a>
                    <div class="pull-right" style="padding-right:50px">
                        <a href="?language=ca" >Català</a>|<a href="?language=en" >Anglès</a>
                    </div> -->
                </div>

            </div>
        </section>
        <section class="container">

            
        
                
                
                    <div class="col-lg-10">
                        <a href="/eac3_ex07_2/jocs/add/aventures"><button type="button">Aventures</button></a>
                   
                    </div>
                   <div class="col-lg-10">
                        <a href="/eac3_ex07_2/jocs/add/conduccio"><button type="button">Conducció</button></a>
                   
                    </div>
                <div class="col-lg-10">
                        <a href="/eac3_ex07_2/jocs/add/plataformes"><button type="button">Plataformes</button></a>
                   
                    </div>
                        
                      
                
            
            
            

        </section>
    </body>
</html>
