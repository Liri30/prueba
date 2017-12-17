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
                <#--<li><a href="/login">Login</a></li>-->
                    <li><a href="/index/">Inicio</a></li>
                    <li><a href="/Estadistic">Estadisticas</a></li>
                    <li><a href="/factura">Factura</a></li>
                    <li><a href="/consulta">Consultas</a></li>
                    <li><a href="/configuracion">Configuracion</a></li>
                    <li><a href="" id="salir">Salir</a></li>

            </ul>
        </div>
    </div>
</nav>




<div class="container"> 
    <div class="row">
        <form id="demo" method="post" action="/consulta-estadistica">
            <div class="col-md-5">
                <div class="form-group">
                    <label style="color: #000000;">Fecha de Inicio:</label>
                    <input name="date1" type="date" class="form-control" required id="date1" placeholder="Fecha">
                </div>
            </div>
            <div class="col-md-5">
                <div class="form-group">
                    <label style="color: #000000;">Fecha Final: </label>
                    <input name="date2" type="date" class="form-control" required id="date2" placeholder="Fecha">
                </div>
            </div>
            <div class="col-md-2">
                <br>
                <input type="submit" class="btn btn-primary" value="Submit">
            </div>

        </form>

        <div class="col-md-10 col-md-offset-2">
            <div id="chart_div"></div>
        </div>

    </div>


    <script type="text/javascript">

        // Load the Visualization API and the corechart package.
        google.charts.load('current', {'packages':['corechart']});

        // Set a callback to run when the Google Visualization API is loaded.
        google.charts.setOnLoadCallback(drawChart);

        // Callback that creates and populates a data table,
        // instantiates the pie chart, passes in the data and
        // draws it.
        function drawChart() {

            // Create the data table.
            var data = new google.visualization.DataTable();
            data.addColumn('string', 'Topping');
            data.addColumn('number', 'Kw/h');
            data.addRows([
                ['Lunes', 43],
                ["Martes", 24],
                ['Miercoles', 23],
                ['Jueves', 12],
                ['Viernes', 24],
                ['Sabado', 13],
                ['Domingo', 24],
            ]);

            // Set chart options
            var options = {'title':'Consumo de la semana',
                'width':800,
                'height':600};

            // Instantiate and draw our chart, passing in some options.
            var chart = new google.visualization.ColumnChart(document.getElementById('chart_div'));
            chart.draw(data, options);
        }
    </script>

<!-- Footer -->

<footer class="secondary_header footer">
    <div class="copyright">&copy;2016-2017 <strong> Derechos Reservados</strong></div>
</footer>


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


</body>
</html>




     

     
     
     
     