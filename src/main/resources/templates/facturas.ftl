<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>EPA</title>

<#--<link href="/css/multiColumnTemplate.css" rel="stylesheet" type="text/css">-->
      <!--Load the AJAX API-->
        <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css">
    <script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
    <link href="/css/general.css" rel="stylesheet" type="text/css">






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
        <li data-target="#myCarousel" data-slide-to="3"></li>
        <li data-target="#myCarousel" data-slide-to="4"></li>
        <li data-target="#myCarousel" data-slide-to="5"></li>
        <li data-target="#myCarousel" data-slide-to="6"></li>
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
        <div class="item">
            <img src="/img/p5.jpg" alt="Ahorra dinero" style="width:100%;">
        </div>
        <div class="item">
            <img src="/img/p6.jpg" alt="Ahorra dinero" style="width:100%;">
        </div>
        <div class="item">
            <img src="/img/p7.jpg" alt="Ahorra dinero" style="width:100%;">
        </div>
        <div class="item">
            <img src="/img/p4.jpg" alt="Ahorra dinero" style="width:100%;">
        </div>
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
            </ul>
        </div>
    </div>
</nav>





<div class="container">
     
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <h3>Compare su factura con la de su proveedora de servicios:</h3>
        </div>

        <div class="col-md-12">
        <#--<table class="table">-->
                <#--<tr>-->
                <#--&lt;#&ndash;<th>&ndash;&gt;-->
                <#--&lt;#&ndash;Id&ndash;&gt;-->
                <#--&lt;#&ndash;</th>&ndash;&gt;-->
                    <#--<th>-->
                        <#--<label>Fecha inicio</label>-->
                    <#--</th>-->
                    <#--<th>-->
                        <#--<label>Fecha fin</label>-->
                    <#--</th>-->
                    <#--<th>-->
                        <#--<label>Potencia acumulada</label>-->
                    <#--</th>-->
                    <#--<th>-->
                        <#--<label>Precio por KWh del rango</label>-->
                    <#--</th>-->
                    <#--<th>-->
                        <#--<label>Total a pagar RD$</label>-->
                    <#--</th>-->
                    <#--<th></th>-->
                <#--</tr>-->

            <#--<#list listaData as item>-->
                <#--<tr>-->
                <#--&lt;#&ndash;<td>&ndash;&gt;-->
                <#--&lt;#&ndash;${item.Id}&ndash;&gt;-->
                <#--&lt;#&ndash;</td>&ndash;&gt;-->
                    <#--<td>-->
                    <#--${item.fecha}-->
                    <#--</td>-->
                    <#--<td>-->
                    <#--${item.potencia}-->
                    <#--</td>-->
                    <#--<td>-->
                    <#--${item.linea}-->
                    <#--</td>-->
                <#--&lt;#&ndash;<td>&ndash;&gt;-->
                <#--&lt;#&ndash;${item.Id}&ndash;&gt;-->
                <#--&lt;#&ndash;</td>&ndash;&gt;-->
                    <#--<td>-->
                    <#--&lt;#&ndash;@Html.ActionLink("Assign", "AssignedToTicket", new { id=item.Id })&ndash;&gt;-->
            <#--&lt;#&ndash;@*@Html.ActionLink("Details", "Details", new { id=item.Id }) |&ndash;&gt;-->
            <#--&lt;#&ndash;@Html.ActionLink("Delete", "Delete", new { id=item.Id })*@&ndash;&gt;-->
                    <#--</td>-->
                <#--</tr>-->
            <#--</#list>-->

            <#--</table>-->

        </div>


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

            <input id="intervalDate" type="submit" class="btn btn-primary" value="Verificar">

        </div>

        <div class="row">
            <div class="col-md-6 col-md-offset-3">

                <div class="panel panel-primary" id="panelDiv" style="display: none;">
                    <div class="panel-heading">Table Factura</div>
                    <div class="panel-body" style="color: black;">
                        <table class="table" id="tableFactura">
                            <thead>
                            <tr>
                                <th>Potencia</th>
                                <th>Precio</th>
                                <th>Fecha Inicio</th>
                                <th>Fecha Final</th>
                                <th>Total</th>
                            </tr>
                            </thead>

                        </table>


                    </div>
                </div>




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

//            var posting = $.post( "http://localhost:4567/factura", { startDate: startDate, endDate: endDate } );

//            posting.done(function( data ) {
//                console.log(data);
//
//                var result =data.split(',');
//                console.log(result);
//
//                console.log(result.length);
//
//                for (var i = 0; i < result.length; i++) {
//                  console.log(result[i]);
//                }
//
//
//
//                $('#example').DataTable( {
//                    data: [result],
//                    paging: false,
//                    Searching: false,
//                    columns: [
//                        { title: "Fecha inicial" },
//                        { title: "Fecha de lectura" },
//                        { title: "Potencia del periodo KWh" },
//                        { title: "Precio del rango RD$:" },
//                        { title: "Total a pagar RD$:" },
//
//
//                    ]
//                } );
//            });


                $.ajax({
                    type: "Post",
                    url: "http://localhost:4567/factura",
                    data: { startDate: startDate, endDate: endDate },
                    dataType: "json",
                    cache: false,
                    success: function(data){

                        console.log("dentro de ajax: " + data);
                        var i = 1;
                        var table = document.getElementById('tableFactura');

                        $.each(data, function(k, valor){
                            console.log(valor);
                            console.log("probando");
                            console.log(i);

                            var row = table.insertRow(i);
                            var cell1 = row.insertCell(0);
                            var cell2 = row.insertCell(1);
                            var cell3 = row.insertCell(2);
                            var cell4 = row.insertCell(3);
                            var cell5 = row.insertCell(4);

                            cell1.innerHTML = valor.potencia;
                            cell2.innerHTML = valor.precio;
                            cell3.innerHTML = valor.FechaIni;
                            cell4.innerHTML = valor.Fachafin;
                            cell5.innerHTML = valor.total;

                            i++;
                        });
                        document.getElementById("panelDiv").style.display = "block";



                    }
                });











            });


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













































<#--<!doctype html>-->
<#--<html>-->
<#--<head>-->
    <#--<meta charset="utf-8">-->
    <#--<meta http-equiv="X-UA-Compatible" content="IE=edge">-->
    <#--<meta name="viewport" content="width=device-width, initial-scale=1">-->
    <#--<title>EPA</title>-->

<#--&lt;#&ndash;<link href="/css/multiColumnTemplate.css" rel="stylesheet" type="text/css">&ndash;&gt;-->
    <#--  <!--Load the AJAX API&ndash;&gt;-->
    <#--    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>-->
    <#--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">-->
    <#--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>-->
    <#--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>-->

    <#--<link rel="stylesheet" href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css">-->
    <#--<script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>-->
    <#--<link href="/css/general.css" rel="stylesheet" type="text/css">-->






<#--</head>-->
<#--<body>-->


<#--<!--Carousel&ndash;&gt;-->
<#--&lt;#&ndash;<div class="container carro">&ndash;&gt;-->
<#--<div id="myCarousel" class="carousel slide" data-ride="carousel">-->
    <#--<!-- Indicators &ndash;&gt;-->
    <#--<ol class="carousel-indicators">-->
        <#--<li data-target="#myCarousel" data-slide-to="0" class="active"></li>-->
        <#--<li data-target="#myCarousel" data-slide-to="1"></li>-->
        <#--<li data-target="#myCarousel" data-slide-to="2"></li>-->
        <#--<li data-target="#myCarousel" data-slide-to="3"></li>-->
        <#--<li data-target="#myCarousel" data-slide-to="4"></li>-->
        <#--<li data-target="#myCarousel" data-slide-to="5"></li>-->
        <#--<li data-target="#myCarousel" data-slide-to="6"></li>-->
    <#--</ol>-->

    <#--<!-- Wrapper for slides &ndash;&gt;-->
    <#--<div class="carousel-inner">-->
        <#--<div class="item active">-->
            <#--<img style="width: auto" src="/img/p2.jpg" alt="Monitorea tu consumo" style="width:100%;">-->
        <#--</div>-->

        <#--<div class="item">-->
            <#--<img src="/img/p3.jpg" alt="Ahorra energia" style="width:100%;">-->
        <#--</div>-->

        <#--<div class="item">-->
            <#--<img src="/img/p1.jpg" alt="Ahorra dinero" style="width:100%;">-->
        <#--</div>-->
        <#--<div class="item">-->
            <#--<img src="/img/p5.jpg" alt="Ahorra dinero" style="width:100%;">-->
        <#--</div>-->
        <#--<div class="item">-->
            <#--<img src="/img/p6.jpg" alt="Ahorra dinero" style="width:100%;">-->
        <#--</div>-->
        <#--<div class="item">-->
            <#--<img src="/img/p7.jpg" alt="Ahorra dinero" style="width:100%;">-->
        <#--</div>-->
        <#--<div class="item">-->
            <#--<img src="/img/p4.jpg" alt="Ahorra dinero" style="width:100%;">-->
        <#--</div>-->
    <#--</div>-->

    <#--<!-- Left and right controls &ndash;&gt;-->
    <#--<a class="left carousel-control" href="#myCarousel" data-slide="prev">-->
        <#--<span class="glyphicon glyphicon-chevron-left"></span>-->
        <#--<span class="sr-only">Previous</span>-->
    <#--</a>-->
    <#--<a class="right carousel-control" href="#myCarousel" data-slide="next">-->
        <#--<span class="glyphicon glyphicon-chevron-right"></span>-->
        <#--<span class="sr-only">Next</span>-->
    <#--</a>-->
<#--</div>-->
<#--&lt;#&ndash;</div>&ndash;&gt;-->



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
                <#--<li><a href="/index/">Inicio</a></li>-->
                <#--<li><a href="/consulta-estadistica">Estadisticas</a></li>-->
                <#--<li><a href="/factura">Factura</a></li>-->
            <#--&lt;#&ndash;<li><a href="#">Consultas</a></li>&ndash;&gt;-->
                <#--<li><a href="/configuracion">Configuracion</a></li>-->
                <#--<li><a href="" id="salir">Salir</a></li>-->
            <#--</ul>-->
        <#--</div>-->
    <#--</div>-->
<#--</nav>-->





<#--<div class="container">-->
    <#-- -->
    <#--<div class="row">-->
        <#--<div class="col-md-8 col-md-offset-2">-->
            <#--<h3>Compare su factura con la de su proveedora de servicios:</h3>-->
        <#--</div>-->

        <#--<div class="col-md-12">-->
            <#--&lt;#&ndash;<table class="table">&ndash;&gt;-->
                <#--&lt;#&ndash;<tr>&ndash;&gt;-->
                <#--&lt;#&ndash;&lt;#&ndash;<th>&ndash;&gt;&ndash;&gt;-->
                <#--&lt;#&ndash;&lt;#&ndash;Id&ndash;&gt;&ndash;&gt;-->
                <#--&lt;#&ndash;&lt;#&ndash;</th>&ndash;&gt;&ndash;&gt;-->
                    <#--&lt;#&ndash;<th>&ndash;&gt;-->
                        <#--&lt;#&ndash;<label>Fecha inicio</label>&ndash;&gt;-->
                    <#--&lt;#&ndash;</th>&ndash;&gt;-->
                    <#--&lt;#&ndash;<th>&ndash;&gt;-->
                        <#--&lt;#&ndash;<label>Fecha fin</label>&ndash;&gt;-->
                    <#--&lt;#&ndash;</th>&ndash;&gt;-->
                    <#--&lt;#&ndash;<th>&ndash;&gt;-->
                        <#--&lt;#&ndash;<label>Potencia acumulada</label>&ndash;&gt;-->
                    <#--&lt;#&ndash;</th>&ndash;&gt;-->
                    <#--&lt;#&ndash;<th>&ndash;&gt;-->
                        <#--&lt;#&ndash;<label>Precio por KWh del rango</label>&ndash;&gt;-->
                    <#--&lt;#&ndash;</th>&ndash;&gt;-->
                    <#--&lt;#&ndash;<th>&ndash;&gt;-->
                        <#--&lt;#&ndash;<label>Total a pagar RD$</label>&ndash;&gt;-->
                    <#--&lt;#&ndash;</th>&ndash;&gt;-->
                    <#--&lt;#&ndash;<th></th>&ndash;&gt;-->
                <#--&lt;#&ndash;</tr>&ndash;&gt;-->

            <#--&lt;#&ndash;<#list listaData as item>&ndash;&gt;-->
                <#--&lt;#&ndash;<tr>&ndash;&gt;-->
                <#--&lt;#&ndash;&lt;#&ndash;<td>&ndash;&gt;&ndash;&gt;-->
                <#--&lt;#&ndash;&lt;#&ndash;${item.Id}&ndash;&gt;&ndash;&gt;-->
                <#--&lt;#&ndash;&lt;#&ndash;</td>&ndash;&gt;&ndash;&gt;-->
                    <#--&lt;#&ndash;<td>&ndash;&gt;-->
                    <#--&lt;#&ndash;${item.fecha}&ndash;&gt;-->
                    <#--&lt;#&ndash;</td>&ndash;&gt;-->
                    <#--&lt;#&ndash;<td>&ndash;&gt;-->
                    <#--&lt;#&ndash;${item.potencia}&ndash;&gt;-->
                    <#--&lt;#&ndash;</td>&ndash;&gt;-->
                    <#--&lt;#&ndash;<td>&ndash;&gt;-->
                    <#--&lt;#&ndash;${item.linea}&ndash;&gt;-->
                    <#--&lt;#&ndash;</td>&ndash;&gt;-->
                <#--&lt;#&ndash;&lt;#&ndash;<td>&ndash;&gt;&ndash;&gt;-->
                <#--&lt;#&ndash;&lt;#&ndash;${item.Id}&ndash;&gt;&ndash;&gt;-->
                <#--&lt;#&ndash;&lt;#&ndash;</td>&ndash;&gt;&ndash;&gt;-->
                    <#--&lt;#&ndash;<td>&ndash;&gt;-->
                    <#--&lt;#&ndash;&lt;#&ndash;@Html.ActionLink("Assign", "AssignedToTicket", new { id=item.Id })&ndash;&gt;&ndash;&gt;-->
            <#--&lt;#&ndash;&lt;#&ndash;@*@Html.ActionLink("Details", "Details", new { id=item.Id }) |&ndash;&gt;&ndash;&gt;-->
            <#--&lt;#&ndash;&lt;#&ndash;@Html.ActionLink("Delete", "Delete", new { id=item.Id })*@&ndash;&gt;&ndash;&gt;-->
                    <#--&lt;#&ndash;</td>&ndash;&gt;-->
                <#--&lt;#&ndash;</tr>&ndash;&gt;-->
            <#--&lt;#&ndash;</#list>&ndash;&gt;-->

            <#--&lt;#&ndash;</table>&ndash;&gt;-->

        <#--</div>-->


        <#--<div class="col-md-5">-->
            <#--<div class="form-group">-->
                <#--<label>Fecha de Inicio:</label>-->
                <#--<input name="startDate" type="date" class="form-control" required id="date1" placeholder="Fecha">-->
            <#--</div>-->
        <#--</div>-->
        <#--<div class="col-md-5">-->
            <#--<div class="form-group">-->
                <#--<label>Fecha Final: </label>-->
                <#--<input name="endDate" type="date" class="form-control" required id="date2" placeholder="Fecha">-->
            <#--</div>-->
        <#--</div>-->
        <#--<div class="col-md-2">-->
            <#--<br>-->

            <#--<input id="intervalDate" type="submit" class="btn btn-primary" value="Verificar">-->

        <#--</div>-->

        <#--<div class="col-md-4">-->

            <#-- <table id="example" class="display" width="100%"></table>-->
        <#--</div>-->








    <#--<footer class="secondary_header footer">-->
        <#--<div class="copyright">&copy;2016-2017 <strong> Derechos Reservados</strong></div>-->
    <#--</footer>-->


    <#--<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.2.2/Chart.bundle.min.js"></script>-->


    <#--<script type="text/javascript">-->



        <#--$('#intervalDate').on('click', function () {-->

            <#--var startDate = $('#date1').val();-->
            <#--var endDate = $('#date2').val();-->

            <#--var posting = $.post( "http://localhost:4567/factura", { startDate: startDate, endDate: endDate } );-->
            <#--// Put the results in a div-->
            <#--posting.done(function( data ) {-->
                <#--console.log(data);-->

                <#--var result =data.split(',');-->
                <#--console.log(result);-->
<#--//                var meses = [];-->
<#--//                var potencia = [];-->
<#--//-->
<#--//                var j=0;-->
                <#--console.log(result.length);-->

                <#--for (var i = 0; i < result.length; i++) {-->
                  <#--console.log(result[i]);-->
                <#--}-->
<#--//-->
<#--//                console.log(meses);-->
<#--//                console.log(potencia);-->



                <#--//Grafica-->


<#--//                console.log("estoy despues de la grafica"+ result);-->
<#--//                var j=0;-->
<#--//                var dataTable =[];-->
<#--//                var arrayTest = [];-->
<#--//                for (var i = 0; i < result.length; i++) {-->
<#--//                    arrayTest[0]= result[i];-->
<#--//                    arrayTest[1]= result[i+1];-->
<#--//                    dataTable.push(arrayTest);-->
<#--//                    arrayTest = [];-->
<#--//-->
<#--//                    console.log(dataTable[j]);-->
<#--//                    i++;-->
<#--//                    j++;-->
<#--//-->
<#--//                }-->


                <#--$('#example').DataTable( {-->
                    <#--data: [result],-->
                    <#--paging: false,-->
                    <#--Searching: false,-->
                    <#--columns: [-->
                        <#--{ title: "Fecha inicial" },-->
                        <#--{ title: "Fecha de lectura" },-->
                        <#--{ title: "Potencia del periodo KWh" },-->
                        <#--{ title: "Precio del rango RD$:" },-->
                        <#--{ title: "Total a pagar RD$:" },-->


                    <#--]-->
                <#--} );-->
            <#--});-->
        <#--});-->


    <#--</script>-->

    <#-- -->
    <#-- -->
    <#-- -->
    <#--  </body>-->
<#--</html>-->
