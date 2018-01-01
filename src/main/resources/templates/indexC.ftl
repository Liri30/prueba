<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Theme Made By www.w3schools.com - No Copyright -->
    <title>EPA</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css">
    <script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>


    <style>
        body {
            font: 20px Montserrat, sans-serif;
            line-height: 1.8;
            color: #f5f6f7;
        }
        p {font-size: 16px;}
        .margin {margin-bottom: 45px;}
        .bg-1 {
            /*background-color: #2C9AB7; !* Green *!*/
            /*background-color: black;*/
            background-image: url("/img/p8.jpg");
            color: #ffffff;
        }
        .bg-2 {
            background-color: #474e5d; /* Dark Blue */
            color: #ffffff;
        }
        .bg-3 {
            background-color: #ffffff; /* White */
            color: #555555;
        }
        .bg-4 {
            background-color: #2f2f2f; /* Black Gray */
            color: #fff;
        }
        .container-fluid {
            padding-top: 70px;
            padding-bottom: 70px;
        }
        .navbar {
            padding-top: 15px;
            padding-bottom: 15px;
            border: 0;
            border-radius: 0;
            margin-bottom: 0;
            font-size: 12px;
            letter-spacing: 5px;
        }
        .navbar-nav  li a:hover {
            color: #1abc9c !important;
        }
    </style>
</head>
<body>

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
                <li><a href="/">Inicio</a></li>
                <li><a href="/consulta-estadistica">Estadisticas</a></li>
                <li><a href="/factura">Factura</a></li>
                <li><a href="/configuracion">Configuracion</a></li>
                <li><a id="salir" href="">Salir</a></li>

            </ul>
        </div>
    </div>
</nav>





<!-- First Container -->
<div class="container-fluid bg-1 text-center">


    <div class="row">

    <#--<div class="row well well-sm">-->


        <div class="col-md-4 col-md-offset-2">

            <div class="panel panel-primary">
                <div class="panel-heading">Sensor</div>
                <div class="panel-body" style="color: black;">
                    <table class="table">
                        <thead>
                        <tr>
                            <th>Fecha</th>
                            <th>Potencia kWh</th>
                            <th>Linea</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <th scope="row">
                                <div id="fecha"></div>
                            </th>
                            <td>
                                <div id="potencia"></div>
                            </td>
                            <td>
                                <div id="linea"></div>
                            </td>

                        </tr>

                        </tbody>
                    </table>


                </div>
            </div>
        </div>



        <div class="col-md-4">

            <div class="panel panel-primary">
                <div class="panel-heading">Tabla de Costos</div>
                <div class="panel-body" style="color: black;">
                    <table class="table" id="tableCosto">
                        <thead>
                        <tr>
                            <th>Rango</th>
                            <th>Costo RD$</th>
                        </tr>
                        </thead>

                    </table>


                </div>
            </div>
        </div>



    </div>





    <h3 class="margin">¿Qué es EPA?</h3>
    <img src="/img/logo.png" class="img-responsive img-circle margin" style="display:inline" alt="epa" width="350" height="350">
    <h3>Economic Power Alarm</h3>
</div>

<!-- Second Container -->
<div class="container-fluid bg-2 text-center">

    <h3 class="margin">EPA</h3>
    <p>Conocer   cuando se esté llegando al límite de la potencia disipada inherente a la tarifa minina por watt. Avisar cuándo se supere el límite de la potencia disipada en relación a la tarifa mínima  y a cuanto incrementa la tarifa por watt. Conocer la cuantía económica inherente al consumo energético actual. Tener  una aplicación o servidor que  reciba las  informaciones del EPA. </p>
<#--<a href="/login" class="btn btn-default btn-lg">-->
<#--<span class="glyphicon glyphicon-log-in"></span> Login-->
<#--</a>-->
    <a class=""></a>
</div>

<!-- Third Container (Grid) -->
<div class="container-fluid bg-3 text-center">
    <div class="row">
        <div class="col-sm-4">
            <p>Estadisticas: Puede consultar el consumo energético de su hogar en un periodo de tiempo deseado y comparar su consumo mensual.</p>
            <img src="/img/chart1.jpg" class="img-responsive margin" style="width:100%" alt="Image">
        </div>
        <div class="col-sm-4">
            <p>Facturas: Compare el monto a pagar de su factura con el valor aproximado de lectura en su factura recibida de su proveedora de servicios.</p>
            <img src="/img/pago.png" class="img-responsive margin" style="width:100%" alt="Image">
        </div>
        <div class="col-sm-4">
            <p>EPA enviará una notificación a su correo configurado cada vez que se esté acercando a un borde de cambio de precio para su control económico.</p>
            <img src="/img/s1.png" class="img-responsive margin" style="width:100%" alt="Image">
        </div>
    </div>
</div>

<!-- Footer -->
<footer class="container-fluid bg-4 text-center">
    <div class="copyright">&copy;2016-2017 <strong> Derechos Reservados</strong></div>
</footer>


<script>

    //Tabla de Costo
    (function (){

        console.log("hola mundo");
        $.ajax({
            type: "GET",
            url: "http://localhost:4567/precios",
            dataType: "json",
            cache: false,
            success: function(data){

                console.log(data);
                var i = 1;
                var table = document.getElementById('tableCosto');

                $.each(data, function(k, valor){
                    console.log(valor.rango);
                    console.log("probando");
                    console.log(i);

                    var row = table.insertRow(i);
                    var cell1 = row.insertCell(0);
                    var cell2 = row.insertCell(1);
                    cell1.innerHTML = valor.rango;
                    cell2.innerHTML = valor.costo;
                    i++;
                });
            }
        });
    })();


    //Tabla de Potencia Hogar
    window.setInterval(function(){
        callData();
    }, 6000);

    function callData(){
        $.ajax({
            type: "GET",
            url: "http://localhost:4567/last-potencia-hogar",
//            data: myusername,
            dataType: "json",
            cache: false,
            success: function(data){
                $("#fecha").text(data.fecha);
                $("#potencia").text(data.potencia);
                $("#linea").text(data.linea);
            }
        });
    }

    //
    $("#salir").on('click', function (event) {
        // Stop form from submitting normally
        event.preventDefault();

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

</body>
</html>










<#--<!DOCTYPE html>-->
<#--<html lang="en">-->
<#--<head>-->
    <#--<!-- Theme Made By www.w3schools.com - No Copyright &ndash;&gt;-->
    <#--<title>EPA</title>-->
    <#--<meta charset="utf-8">-->
    <#--<meta name="viewport" content="width=device-width, initial-scale=1">-->
    <#--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">-->
    <#--<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">-->
    <#--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>-->
    <#--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>-->
    <#--<style>-->
        <#--body {-->
            <#--font: 20px Montserrat, sans-serif;-->
            <#--line-height: 1.8;-->
            <#--color: #f5f6f7;-->
        <#--}-->
        <#--p {font-size: 16px;}-->
        <#--.margin {margin-bottom: 45px;}-->
        <#--.bg-1 {-->
            <#--/*background-color: #2C9AB7; !* Green *!*/-->
            <#--/*background-color: black;*/-->
            <#--background-image: url("/img/p8.jpg");-->
            <#--color: #ffffff;-->
        <#--}-->
        <#--.bg-2 {-->
            <#--background-color: #474e5d; /* Dark Blue */-->
            <#--color: #ffffff;-->
        <#--}-->
        <#--.bg-3 {-->
            <#--background-color: #ffffff; /* White */-->
            <#--color: #555555;-->
        <#--}-->
        <#--.bg-4 {-->
            <#--background-color: #2f2f2f; /* Black Gray */-->
            <#--color: #fff;-->
        <#--}-->
        <#--.container-fluid {-->
            <#--padding-top: 70px;-->
            <#--padding-bottom: 70px;-->
        <#--}-->
        <#--.navbar {-->
            <#--padding-top: 15px;-->
            <#--padding-bottom: 15px;-->
            <#--border: 0;-->
            <#--border-radius: 0;-->
            <#--margin-bottom: 0;-->
            <#--font-size: 12px;-->
            <#--letter-spacing: 5px;-->
        <#--}-->
        <#--.navbar-nav  li a:hover {-->
            <#--color: #1abc9c !important;-->
        <#--}-->
    <#--</style>-->
<#--</head>-->
<#--<body>-->

<#--<!-- Navbar &ndash;&gt;-->
<#--<nav class="navbar navbar-default">-->
    <#--<div class="container">-->
        <#--<div class="navbar-header">-->
            <#--<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">-->
                <#--<span class="icon-bar"></span>-->
                <#--<span class="icon-bar"></span>-->
                <#--<span class="icon-bar"></span>-->
            <#--</button>-->
            <#--<a class="navbar-brand" href="/index/">EPA</a>-->
        <#--</div>-->
        <#--<div class="collapse navbar-collapse" id="myNavbar">-->
            <#--<ul class="nav navbar-nav navbar-right">-->
                <#--<li><a href="/">Inicio</a></li>-->
            <#--<li><a href="/consulta-estadistica">Estadisticas</a></li>-->
            <#--<li><a href="/factura">Factura</a></li>-->
            <#--<li><a href="/configuracion">Configuracion</a></li>-->
            <#--<li><a id="salir" href="">Salir</a></li>-->

            <#--</ul>-->
        <#--</div>-->
    <#--</div>-->
<#--</nav>-->

<#--<!-- First Container &ndash;&gt;-->
<#--<div class="container-fluid bg-1 text-center">-->
    <#--<h3 class="margin">¿Qué es EPA?</h3>-->
    <#--<img src="/img/logo.png" class="img-responsive img-circle margin" style="display:inline" alt="epa" width="350" height="350">-->
    <#--<h3>Economic Power Alarm</h3>-->
<#--</div>-->

<#--<!-- Second Container &ndash;&gt;-->
<#--<div class="container-fluid bg-2 text-center">-->
    <#--<h3 class="margin">EPA</h3>-->
    <#--<p>Conocer   cuando se esté llegando al límite de la potencia disipada inherente a la tarifa minina por watt. Avisar cuándo se supere el límite de la potencia disipada en relación a la tarifa mínima  y a cuanto incrementa la tarifa por watt. Conocer la cuantía económica inherente al consumo energético actual. Tener  una aplicación o servidor que  reciba las  informaciones del EPA. </p>-->
    <#--&lt;#&ndash;<a href="/login" class="btn btn-default btn-lg">&ndash;&gt;-->
        <#--&lt;#&ndash;<span class="glyphicon glyphicon-log-in"></span> Login&ndash;&gt;-->
    <#--&lt;#&ndash;</a>&ndash;&gt;-->
    <#--<a class=""></a>-->
<#--</div>-->

<#--<!-- Third Container (Grid) &ndash;&gt;-->
<#--<div class="container-fluid bg-3 text-center">-->
    <#--<div class="row">-->
        <#--<div class="col-sm-4">-->
            <#--<p>Estadisticas: Puede consultar el consumo energético de su hogar en un periodo de tiempo deseado y comparar su consumo mensual.</p>-->
            <#--<img src="/img/chart1.jpg" class="img-responsive margin" style="width:100%" alt="Image">-->
        <#--</div>-->
        <#--<div class="col-sm-4">-->
            <#--<p>Facturas: Compare el monto a pagar de su factura con el valor aproximado de lectura en su factura recibida de su proveedora de servicios.</p>-->
            <#--<img src="/img/pago.png" class="img-responsive margin" style="width:100%" alt="Image">-->
        <#--</div>-->
        <#--<div class="col-sm-4">-->
            <#--<p>EPA enviará una notificación a su correo configurado cada vez que se esté acercando a un borde de cambio de precio para su control económico.</p>-->
            <#--<img src="/img/s1.png" class="img-responsive margin" style="width:100%" alt="Image">-->
        <#--</div>-->
    <#--</div>-->
<#--</div>-->

<#--<!-- Footer &ndash;&gt;-->
<#--<footer class="container-fluid bg-4 text-center">-->
    <#--<div class="copyright">&copy;2016-2017 <strong> Derechos Reservados</strong></div>-->
<#--</footer>-->


<#--<script>-->
    <#--$("#salir").on('click', function (event) {-->
<#--//            // Stop form from submitting normally-->
        <#--event.preventDefault();-->
        <#--console.log("Entre");-->


        <#--var posting = $.get( "http://localhost:4567/salir" );-->


        <#--// Put the results in a div-->

        <#--posting.done(function( data ) {-->
<#--//                //lo unico agregado despues que te fuiste-->
            <#--if(data == "true")-->
            <#--{-->

                <#--window.location.replace("http://localhost:4567/login");-->
                <#--// window.location.replace("http://localhost:4567/index/");-->

            <#--}-->
        <#--});-->
    <#--});-->
<#--</script>-->

<#--</body>-->
<#--</html>-->