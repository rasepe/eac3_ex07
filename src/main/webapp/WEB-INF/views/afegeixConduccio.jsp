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
        <title>Afegir joc</title>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Joc de conducció</h1>
                    <p>Afegir joc de conducció</p>
                </div>
            </div>
        </section>
        <section class="container">
            <form:form modelAttribute="newConduccio" class="form-horizontal">
                <fieldset>
                    <legend>Afegir joc de conducció</legend>
                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="name">Nom</label>
                        <div class="col-lg-10">
                            <form:input id="name" path="name" type="text" class="form:input-large"/>
                        </div>
                    </div>
                     <div class="form-group">
                        <label class="control-label col-lg-2"
                               for="active">Dimensions</label>
                        <div class="col-lg-10">
                            <form:radiobutton path="dimensions" value="2D"/>2D 
                            <form:radiobutton path="dimensions" value="3D"/>3D 
                           
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="quantity">Quantitat</label>
                        <div class="col-lg-10">
                            <form:input id="quantity" path="quantity" type="number" class="form:input-large"/>
                        </div>
                    </div>
                      

                   
                    <div class="form-group">
                        <div class="col-lg-offset-2 col-lg-10">
                            <input type="submit" id="btnAdd" class="btn btn-primary"
                                   value ="Crear"/>
                        </div>
                    </div>
                </fieldset>
            </form:form>
        </section>
    </body>
</html>