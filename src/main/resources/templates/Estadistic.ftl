<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>EPA</title>

    <link href="/css/multiColumnTemplate.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>



</head>
<body>
<div class="container">
    <header>
        <div class="primary_header">
            <h1 class="right_half"><a href="Inicio.html"></a><img src="img\logo.png"  alt="" width="150" height="100" class="columns_center" class = "social_icon"
            /></h1>
        </div>
        <style type="text/css">

            * {
                margin:0px;
                padding:0px;
            }



            ul, ol {
                list-style:none;
            }

            .nav > li {
                float:left;
            }

            .nav li a {
                background-color:#000;
                color:#fff;
                text-decoration:none;
                padding:20px 24px;
                display:block;
            }

            .nav li a:hover {
                background-color:#434343;
            }

            .nav li ul {
                display:none;
                position:absolute;
                min-width:140px;
            }

            .nav li:hover > ul {
                display:block;
            }

            .nav li ul li {
                position:relative;
            }

            .nav li ul li ul {
                right:-140px;
                top:0px;
            }

        </style>

        <nav class="secondary_header" id="menu">
            <ul class="nav">
                <li><a href="/Home"> INICIO</a></li>
                <li><a href="/Estadistic"> ESTADISTICAS</a></li>
                <li>FACTURAS</li>
                <li>CONSULTAS </li>

                <li>CONFIGURACION<!--<span onmouseover="caret"></span>-->                </li>

            </ul>
        </nav>
    </header>
    <section>
        <h2 class="noDisplay">Main Content</h2>
        <article class="left_article">
            <h3></h3>

            <#--Formulario para seleccionar fecha-->
            <table class="container" align="center">
                <form method="post" action="/Estadistica">
                    <h3 align="center">Seleccione Fecha</h3>
                <tr>
                    <th>
                       <input type="date" name="fechaInicio" placeholder="Fecha inicial">
                    </th>
                    <th>
                        <input type="date" name="fechafin" placeholder="Fecha final">
                    </th>
                    <th>
                        <input type="submit" name="entrar" value="Buscar">
                        <a href="#"></a>
                    </th>

                </tr>
                </form>
            </table>


            <table class="table">
                <tr>
                <#--<th>-->
                <#--Id-->
                <#--</th>-->
                    <th>
                        <label>Fecha</label>
                    </th>
                    <th>
                        <label>Potencia</label>
                    </th>
                    <th>
                        <label>Linea</label>
                    </th>
                    <th></th>
                </tr>

            <#list listaRango as item>
                <tr>
                <#--<td>-->
                <#--${item.Id}-->
                <#--</td>-->
                    <td>
                    ${item.mes}
                    </td>
                    <td>
                    ${item.potenciaMes}
                    </td>
                    <td>
                    <#--${item.linea}-->
                    </td>
                <#--<td>-->
                <#--${item.Id}-->
                <#--</td>-->
                    <td>
                    <#--@Html.ActionLink("Assign", "AssignedToTicket", new { id=item.Id })-->
            <#--@*@Html.ActionLink("Details", "Details", new { id=item.Id }) |-->
            <#--@Html.ActionLink("Delete", "Delete", new { id=item.Id })*@-->
                    </td>
                </tr>
            </#list>

            </table>
            <!-- week potency graph-->
            <head>
                    <!--Load the AJAX API-->
                <#--    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>-->
                <#--    <script type="text/javascript">-->

                <#--// Load the Visualization API and the corechart package.-->
                <#--google.charts.load('current', {'packages':['corechart']});-->

                <#--// Set a callback to run when the Google Visualization API is loaded.-->
                <#--google.charts.setOnLoadCallback(drawChart);-->

                <#--// Callback that creates and populates a data table,-->
                <#--// instantiates the pie chart, passes in the data and-->
                <#--// draws it.-->
                <#--function drawChart() {-->

                    <#--// Create the data table.-->
                    <#--var data = new google.visualization.DataTable();-->
                    <#--data.addColumn('string', 'Topping');-->
                    <#--data.addColumn('number', 'Kw/h');-->
                    <#--data.addRows([-->
                        <#--['Lunes', 43],-->
                        <#--["Martes", 24],-->
                        <#--['Miercoles', 23],-->
                        <#--['Jueves', 12],-->
                        <#--['Viernes', 24],-->
                        <#--['Sabado', 13],-->
                        <#--['Domingo', 24],-->
                    <#--]);-->

                    <#--// Set chart options-->
                    <#--var options = {'title':'Consumo de la semana',-->
                        <#--'width':600,-->
                        <#--'height':500};-->

                    <#--// Instantiate and draw our chart, passing in some options.-->
                    <#--var chart = new google.visualization.PieChart(document.getElementById('chart_div'));-->
                    <#--chart.draw(data, options);-->
                <#--}-->
            <#--</script>-->
                  </head>

              <body>
            <!--Div that will hold the pie chart-->
            <div id="chart_div"></div>
          </body>
            <!--
             <canvas id="Grafica_Semanal" width="400" height="300"></canvas>
       <script type="text/javascript">
       var g = new Bluff.Line('Grafica_Semanal', '400x300');
         g.title = 'Consumo de la semana';
         g.tooltips = true;
         g.theme_37signals();
         g.data("Lunes", [1,2,3,5,4]);
         g.data("Martes", [4,3,7,8,3]);
         g.data("Miercoles", [5,6,2,9,2]);
         g.data("Jueves", [3,7,2,7,5]);

         g.labels = {0: 'Prueba', 2:'hola'}
         g.draw();
       </script>-->

            <p>.</p>
        </article>

        <!--Estamos aqui, hola mundo-->

    </section>

    <footer class="secondary_header footer">
        <div class="copyright">&copy;2016-2017 <strong> Derechos Reservados</strong></div>
    </footer>
</div>
</body>
</html>
