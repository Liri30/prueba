<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>EPA</title>

    <link href="/css/general.css" rel="stylesheet" type="text/css">
      <!--Load the AJAX API-->
        <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css">
    <script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>





</head>
<body>


<!--Carousel-->
<div class="container carro">
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
</div>



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
            </ul>
        </div>
    </div>
</nav>





<div class="container">
     
    <div class="row">

    <#--<form id="demo" action="/consulta-estadistica" method="post">-->
    <#--<form id="demo">-->
        <div class="col-md-5">
            <div class="form-group">
                <label>Fecha de Inicio:</label>
                <input name="startDate" type="date" class="form-control" required id="date1" placeholder="Fecha">
            </div>
        </div>
        <div class="col-md-5">
            <div class="form-group">
                <label>Fecha Final: </label>
                <input name="endDate" type="date" class="form-control" required id="date2" placeholder="Fecha">
            </div>
        </div>
        <div class="col-md-2">
            <br>

            <input id="intervalDate" type="submit" class="btn btn-primary" value="Submit">

        </div>

        <div class="col-md-4">

             <table id="example" class="display" width="100%"></table>
        </div>
        <div class="col-md-8">
            <canvas id="myChart" width="200" height="75"></canvas>
        </div>


    </div>








    <footer class="secondary_header footer">
        <div class="copyright">&copy;2016-2017 <strong> Derechos Reservados</strong></div>
    </footer>


    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.2.2/Chart.bundle.min.js"></script>


    <script type="text/javascript">



        $('#intervalDate').on('click', function () {

            var startDate = $('#date1').val();
            var endDate = $('#date2').val();

            var posting = $.post( "http://localhost:4567/factura", { startDate: startDate, endDate: endDate } );
            // Put the results in a div
            posting.done(function( data ) {
                console.log(data);












            });
        });


    </script>
     

     
     
     
      </body>




</html>
