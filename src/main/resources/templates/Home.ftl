<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
</head>
<body>
<#--<h1>The marvellous blog of mine</h1>-->
<#--<h1>${Bienvenido}</h1>-->
<#--<h1>${persons}</h1>-->
<#--<#list persons as user>-->
<#--<h3>${user.fecha}</h3></#list>-->
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
        <div class="navbar-nav">
            <a class="nav-item nav-link active" href="#">Home <span class="sr-only">(current)</span></a>
            <a class="nav-item nav-link" href="#">Features</a>
            <a class="nav-item nav-link" href="#">Pricing</a>
            <a class="nav-item nav-link disabled" href="#">Disabled</a>
        </div>
    </div>
</nav>


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

<#list listaData as item>
    <tr>
        <#--<td>-->
            <#--${item.Id}-->
        <#--</td>-->
        <td>
            ${item.fecha}
        </td>
        <td>
            ${item.potencia}
        </td>
        <td>
            ${item.linea}
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


<#--<#list pepe as listaData>-->
    <#--<h3>${pepe}</h3>-->
<#--</#list>-->

<#--<#list listaEstudiante as estudiante>-->

<#--<tr><td>${estudiante.matricula?string["0"]}</td><td>${estudiante.nombre}</td><td>${estudiante.carrera}</td></tr>-->

<#--</#list>-->

</body>
</html>