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
        <li><a href="/login">Login</a></li>
        <#--<li><a href="/Estadistic">Estadisticas</a></li>-->
        <#--<li><a href="#">Factura</a></li>-->
		<#--<li><a href="#">Consultas</a></li>-->
        <#--<li><a href="/configuracion">Configuracion</a></li>-->
      </ul>
    </div>
  </div>
</nav>

<!-- First Container -->
<div class="container-fluid bg-1 text-center">
  <h3 class="margin">¿Qué es EPA?</h3>
  <img src="/img/logo.png" class="img-responsive img-circle margin" style="display:inline" alt="epa" width="350" height="350">
  <h3>Economic Power Alarm</h3>
</div>

<!-- Second Container -->
<div class="container-fluid bg-2 text-center">
  <h3 class="margin">EPA</h3>
  <p>Conocer   cuando se esté llegando al límite de la potencia disipada inherente a la tarifa minina por watt. Avisar cuándo se supere el límite de la potencia disipada en relación a la tarifa mínima  y a cuanto incrementa la tarifa por watt. Conocer la cuantía económica inherente al consumo energético actual. Tener  una aplicación o servidor que  reciba las  informaciones del EPA. </p>
  <a href="/login" class="btn btn-default btn-lg">
    <span class="glyphicon glyphicon-log-in"></span> Login
  </a>
    <a class=""></a>
</div>

<!-- Third Container (Grid) -->
<div class="container-fluid bg-3 text-center">
  <h3 class="margin">Funcionalidades</h3><br>
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

</body>
</html>