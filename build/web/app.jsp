<%-- 
    Document   : app
    Created on : 29/05/2022, 11:39:31 AM
    Author     : ivar29
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--iconos fontawesome-->
        <script src="https://kit.fontawesome.com/3e9cb3f872.js" crossorigin="anonymous"></script>

        <!--css bootstrap personalizado-->
        <link rel="stylesheet" href="css/bootstrap.css">
        <!--My CSS-->
        <link rel="stylesheet" href="css/styles.css">
        <title>JSP Page</title>
    </head>
    <body>
        <!--encabezado de la pagina-->
        <header>
            <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
                <div class="container-fluid">
                    <div class="container-fluid">
                        <a class="navbar-brand" href="index.html">Cimetrix</a>
                        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav ml-auto">
                                <li class="nav-item">
                                    <a class="nav-link" href="index.html">Inicio</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="app.html">App</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link disabled">Disabled</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </nav>
        </header>
        <!--contenido-->
        <main id="main">

            <!--app-->
            <section id="app">
                <div class="container">
                    <form action="ServletBudget" class="form">
                        <div class="row">
                            <div class="col-lg-12 mb-2 mt-2" align="center">
                                <h2>App</h2>
                                <i class="fa-solid fa-computer"></i>
                                <small>Selecciona tus preferencias</small>                       
                            </div>
                            <div class="col-lg-3 col-md-6 mb-2 mt-2">
                                <span>Tipo de uso:</span>
                                <div class="form-check mt-2">
                                    <input class="form-check-input" type="radio" name="tipoUso" id="tipoUso1" value="1">
                                    <label class="form-check-label" for="tipoUso1">
                                        Video Juegos  <i class="fa-solid fa-gamepad"></i>
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="tipoUso" id="tipoUso2" value="2">
                                    <label class="form-check-label" for="tipoUso2">
                                        Streaming   <i class="fa-solid fa-headset"></i>
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="tipoUso" id="tipoUso3" value="3">
                                    <label class="form-check-label" for="tipoUso3">
                                        Edicion de Video   <i class="fa-solid fa-photo-film"></i>
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="tipoUso" id="tipoUso4" value="4">
                                    <label class="form-check-label" for="tipoUso4">
                                        Ofimatica   <i class="fa-solid fa-briefcase"></i>
                                    </label>
                                </div>
                            </div>
                            <div class="col-lg-3 col-md-6 mb-2 mt-2">
                                <span>Gama del Producto:</span>
                                <div class="form-check mt-2">
                                    <input class="form-check-input" type="radio" name="gama" id="gama1" value="1">
                                    <label class="form-check-label" for="gama1">
                                        Gama Baja   <i class="fa-solid fa-piggy-bank"></i>
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="gama" id="gama2" value="2">
                                    <label class="form-check-label" for="gama2">
                                        Gama Media   <i class="fa-solid fa-wallet"></i>
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="gama" id="gama3" value="3">
                                    <label class="form-check-label" for="gama3">
                                        Gama Alta   <i class="fa-solid fa-sack-dollar"></i>
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="gama" id="gama4" value="4">
                                    <label class="form-check-label" for="gama4">
                                        Todo   <i class="fa-solid fa-credit-card"></i>
                                    </label>
                                </div>
                            </div>
                            <div class="col-lg-3 col-md-6 mb-2 mt-2">
                                <span>Tamaño del PC:</span>
                                <div class="form-check mt-2">
                                    <input class="form-check-input" type="radio" name="tamano" id="tamano1" value="1">
                                    <label class="form-check-label" for="tamano1">
                                        Mini (ITX)
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="tamano" id="tamano2" value="2">
                                    <label class="form-check-label" for="tamano2">
                                        Pequeño(micro ATX)
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="tamano" id="tamano3" value="3">
                                    <label class="form-check-label" for="tamano3">
                                        Estandar (ATX)
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="tamano" id="tamano4" value="4">
                                    <label class="form-check-label" for="tamano4">
                                        Gigante (ATX y EATX)
                                    </label>
                                </div>
                            </div>
                            <div class="col-lg-3 col-md-6 mb-2 mt-2">
                                <span>Diseño del PC:</span>
                                <div class="form-check mt-2">
                                    <input class="form-check-input" type="radio" name="diseno" id="diseno1" value="1">
                                    <label class="form-check-label" for="diseno1">
                                        Basico
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="diseno" id="diseno2" value="2">
                                    <label class="form-check-label" for="diseno2">
                                        RGB
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="diseno" id="diseno3" value="3">
                                    <label class="form-check-label" for="diseno3">
                                        Minimalista
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="diseno" id="diseno4" value="4">
                                    <label class="form-check-label" for="diseno4">
                                        De diseño
                                    </label>
                                </div>
                            </div>
                            <div class="row offset-md-2 mt-4">
                                <div class="col-lg-12 mb-4">
                                    <span>Extras:</span>  
                                </div>
                                <div class="col-lg-6 mb-2 mt-2">
                                    <div class="custom-control custom-switch">
                                        <input type="checkbox" class="custom-control-input" id="perifericos" name="perifericos" value="1">
                                        <label class="custom-control-label" for="perifericos">Incluir Opciones de refrigeracion</label>
                                    </div>
                                </div>
                                <div class="col-lg-6 mb-2 mt-2 ">
                                    <div class="custom-control custom-switch">
                                        <input type="checkbox" class="custom-control-input" id="refrigeracion" name="refrigeracion" value="1">
                                        <label class="custom-control-label" for="refrigeracion">Incluir Perifericos Recomendados</label>
                                    </div>
                                </div>
                            </div>
                            <div class="row offset-md-4 mt-4 mb-4" >
                                <div class="col-lg-6">
                                    <input type="submit" class="btn btn-primary" value="Procesar">
                                </div>
                                <div class="col-lg-6">
                                    <input type="reset" class="btn btn-outline-danger" value="Limpiar">
                                </div>
                            </div>
                        </div>
                    </form>
                </div>

            </section>
            <!--/app-->

        </main>

        <!--pie de pagina-->
        <footer class="footer pb-4 pt-4">
            <div class="container">
                <div class="row text-center">
                    <div class="col-12 col-lg">
                        <a href="#">Preguntas Frecuentes</a>
                    </div>
                    <div class="col-12 col-lg">
                        <a href="#">Redes Sociales</a><br>
                        <a href="https://twitter.com/" target="_blank"><i class="fa-brands fa-twitter">   </i></a>
                        <a href="https://www.instagram.com/" target="_blank"><i class="fa-brands fa-instagram">   </i></a>
                        <a href="https://www.facebook.com/" target="_blank"><i class="fa-brands fa-facebook-f">   </i></a>
                        <a href="https://www.linkedin.com/" target="_blank"><i class="fa-brands fa-linkedin-in"></i></a>
                    </div>
                    <div class="col-12 col-lg">
                        <a href="#">Contactanos</a>
                    </div>
                    <div class="col-12 col-lg">
                        <a href="#">Equipo</a>
                    </div>
                </div>
            </div>
        </footer>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</body>
</html>
