<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <!-- Theme Made By www.w3schools.com - No Copyright -->
    <title>EPA</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <!--CSS General-->
    <link rel="stylesheet" href="/css/general.css" type="text/css">

<#--Load google API-->
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
</head>
<body>

<!--Carousel-->
<#--<div class="container carro">-->
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
        <#--<li data-target="#myCarousel" data-slide-to="3"></li>-->
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner">
            <div class="item active">
                <img style="width: auto" src="/img/p2.jpg" alt="Monitorea tu consumo" style="width:100%;">
            </div>

            <div class="item">
                <img src="/img/p3.jpg" alt="Ahorra energia" style="width:100%;">
            </div>

            <div class="item">
                <img src="/img/p1.jpg" alt="Ahorra dinero" style="width:100%;">
            </div>
        <#--<div class="item">-->
        <#--<img src="/img/p4.jpg" alt="Ahorra dinero" style="width:100%;">-->
        <#--</div>-->
        </div>

        <!-- Left and right controls -->
        <a class="left carousel-control" href="#myCarousel" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#myCarousel" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
<#--</div>-->

<!-- Navbar -->
<nav class="navbar navbar-default">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/index/">EPA</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav navbar-right">
            <li><a href="/index/">Inicio</a></li>
                <li><a href="/consulta-estadistica">Estadisticas</a></li>
                <li><a href="/factura">Factura</a></li>
                <#--<li><a href="#">Consultas</a></li>-->
                <li><a href="/configuracion">Configuracion</a></li>
                <li><a href="" id="salir">Salir</a></li>



                    <#--<li class="active"><a data-toggle="tab" href="/index">Inicio</a></li>-->
                    <#--<li><a data-toggle="tab" href="/consulta-estadistica">Estadistica</a></li>-->
                    <#--<li><a data-toggle="tab" href="/factura">Factura</a></li>-->
                <#--<li><a data-toggle="tab" href="/configuracion">Configuracion</a></li>-->
                    <#--<li><a data-toggle="tab" href="/Salir">Salir</a></li>-->

            </ul>
        </div>
    </div>
</nav>
<!--body part-->
<div class="row">

    <div class="container">


        <br>

<div class="col-md-6">
    <div class="panel panel-default">
        <div class="panel-body">
        <h3>Registrar dirección de correo</h3>
        <#--<form id="demo" method="get">-->

                    <form id="demo">
                        <div class="form-group">
                            <label for="EmailD">Correo electrónico nuevo</label>
                            <input name="correoActual" type="email" class="form-control" required id="correoActual"
                                   aria-describedby="emailHelp" placeholder="Enter email">
                            <small id="emailHelp" class="form-text text-muted">No compartimos su correo con nadie más.
                            </small>
                        </div>

                        <div class="form-group">
                            <label for="contrasena">Contraseña</label>
                            <input name="pass" type="password" class="form-control" required id="pass"
                                   placeholder="Password">
                        </div>
                    <#--<button type="submit" onclick="confirmar()" class="btn btn-primary">Registrar</button>-->
                        <input type="submit" class="btn btn-primary" value="Registrar">

                    </form>

        </div>
    </div>
</div>

        <#--<br>-->
        <#--<br>-->
            <div class="col-md-6">
                <div class="panel panel-default">
                    <div class="panel-body">
                    <h3>Cambiar contraseña</h3>
                    <form id="cambiarpass">
                    <div class="form-group">

                            <label for="contrasena">Contraseña actual:</label>
                            <input name="passActual" type="password" class="form-control" required id="passActual"
                                   placeholder="Password">


                            <label for="contrasena">Contraseña nueva:</label>
                            <input name="passNueva" type="password" class="form-control" required id="passNueva"
                                   placeholder="New password">


                            <label for="contrasena">Repita su nueva contraseña:</label>
                            <input name="passNueva2" type="password" class="form-control" required id="passNueva2"
                                   placeholder="New password">



                    </div>
                        <input type="submit" class="btn btn-primary" value="Registrar">
                    </form>
                    </div>
                </div>
            </div>


            <div class="col-md-6">
                <div class="panel panel-default">
                    <div class="panel-body">
                    <h3>Configurar precios por KWh</h3>
        <form id="precio">
            <div class="form-group">
                <label for="p1">Menor a 200 KWh</label>
                <input type="number" step="any" required id="pr1" class="form-control" placeholder="Precio por KWh">
            </div>
            <div class="form-group">
                <label for="p2">Mayor a 200 KWh y menor a 300 KWh</label>
                <input type="number" step="any" required id="pr2" class="form-control" placeholder="Precio por KWh">
            </div>
            <div class="form-group">
                <label for="p3">Mayor a 300 KWh y menor a 700 KWh</label>
                <input type="number" step="any" required id="pr3" class="form-control" placeholder="Precio por KWh">
            </div>
            <div class="form-group">
                <label for="p4">Mayor a 700 KWh</label>
                <input type="number" step="any" required id="pr4" class="form-control" placeholder="Precio por KWh">
            </div>
            <input type="submit" class="btn btn-primary" value="Registrar">
        </form>
                    </div>
                </div>
            </div>

        <script>
            // Attach a submit handler to the form
            $("#demo").submit(function (event) {

                // Stop form from submitting normally
                event.preventDefault();

                // Get some values from elements on the page:
                var $form = $(this),
                        password = $form.find("input[name='pass']").val(),
                        email = $form.find("input[name='correoActual']").val()

                //url = $form.attr( "http://localhost:4567/post-test" );

                console.log(email);
                console.log(password);
                // Send the data using post
                //var posting = $.post( url, { inputPassword: password, inputEmail: email } );
                var posting = $.post("http://localhost:4567/post-test", {pass: password, correoActual: email});


                // Put the results in a div
                posting.done(function (data) {
                    //lo unico agregado despues que te fuiste
                    if (data == "true") {
                        alert("Su correo ha sido actualizado a " + email + ", este también será su nuevo usuario.");
                        location.reload();
                    }
                    else {
                        alert("Verifique sus datos para actualizar su correo");
                    }
                    console.log(data);
                });
            });


        </script>

        <script>
            // Attach a submit handler to the form
            $("#precio").submit(function (event) {

                // Stop form from submitting normally
                event.preventDefault();

                // Get some values from elements on the page:
                var $form = $(this),
                        number1 = $form.find("input[name='pr1']").val(),
                        number2 = $form.find("input[name='pr2']").val(),
                        number3 = $form.find("input[name = 'pr3']").val(),
                        number4 = $form.find("input[name = 'pr4']").val()

                //url = $form.attr( "http://localhost:4567/post-test" );


                // Send the data using post
                //var posting = $.post( url, { inputPassword: password, inputEmail: email } );
                var posting = $.post("http://localhost:4567/configurar-precios", {
                    pr1: number1,
                    pr2: number2,
                    pr3: number3,
                    pr4: number4
                });


                // Put the results in a div
                posting.done(function (data) {
                    //lo unico agregado despues que te fuiste
                    if (data == "true") {
                        alert("Su correo ha sido actualizado a " + email + ", este también será su nuevo usuario.");
                        location.reload();
                    }
                    else {
                        alert("Verifique sus datos para actualizar su correo");
                    }
                    console.log(data);
                });
            });


        </script>


        <script>
            // Attach a submit handler to the form
            $("#cambiarpass").submit(function (event) {

                // Stop form from submitting normally
                event.preventDefault();

                // Get some values from elements on the page:
                var $form = $(this),
                        passwordactual = $form.find("input[name='passActual']").val(),
                        passwordnueva = $form.find("input[name='passNueva']").val(),
                        passwordnueva2= $form.find("input[name='passNueva2']").val()

                //url = $form.attr( "http://localhost:4567/post-test" );

                console.log(passwordactual);
                console.log(passwordnueva2);
                // Send the data using post
                //var posting = $.post( url, { inputPassword: password, inputEmail: email } );
                if (passwordnueva == passwordnueva2){
                    var posting = $.post("http://localhost:4567/update-password", {passActual: passwordactual, passNueva: passwordnueva, passNueva2:passwordnueva2});

                }else{
                    window.alert("Los campos de contraseña nueva no coinciden. Favor verificar.")
                }




                // Put the results in a div
                posting.done(function (data) {
                    //lo unico agregado despues que te fuiste
                    if (data == "true") {
                        alert("Su contraseña ha sido actualizada.");
                        location.reload();
                    }
                    else {
                        alert("Su contraseña actual no es correcta. Por favor verifique de otra vez.");
                    }
                    console.log(data);
                });
            });


        </script>


        <script>
            $("#salir").on('click', function (event) {
//            // Stop form from submitting normally
                event.preventDefault();
                console.log("Entre");


                var posting = $.get( "http://localhost:4567/salir" );


                // Put the results in a div

                posting.done(function( data ) {
//                //lo unico agregado despues que te fuiste
                    if(data == "true")
                    {

                        window.location.replace("http://localhost:4567/login");
                        // window.location.replace("http://localhost:4567/index/");

                    }
                });
            });
        </script>



        <!--Estamos aqui, hola mundo-->


    </div>
</div>


<!-- Footer -->

<footer class="secondary_header footer">
    <div class="copyright">&copy;2016-2017 <strong> Derechos Reservados</strong></div>
</footer>


</body>
</html>


 
<#--<select name="diaCorte" class="form-control" id="fechacorte" placeholder="#">-->
<#--<option value="1">1</option>-->
<#--<option value="2">2</option>-->
<#--<option value="3">3</option>-->
<#--<option value="4">4</option>-->
<#--<option value="5">5</option>-->
<#--<option value="6">6</option>-->
<#--<option value="7">7</option>-->
<#--<option value="8">8</option>-->
<#--<option value="9">9</option>-->
<#--<option value="10">10</option>-->
<#--<option value="11">11</option>-->
<#--<option value="12">12</option>-->
<#--</select>-->
<#--<label for="mes">de cada mes</label>-->
 
 
 




