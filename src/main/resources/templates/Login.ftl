<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Epa Login</title>
    <link rel="stylesheet" href="/css/logStyle.css">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

</head>
<body>
<div class="loginBox">
    <img src="/img/user.png" class="user">
    <h2 style="color: #efed40;">${Bienvenido}</h2>
<form id="login">
        <p>Usuario</p>
        <input type="email" name="usuario" required id="usuario" placeholder="Enter Email">
        <p>Contraseña</p>
        <input type="Password" name="contrasena" required id="contrasena" placeholder="••••••">
        <input type="submit" class="btn btn-info btn-lg" value="Entrar">
        <a href="#">Olvide mi contraseña</a>
</form>




    <script>

//        $("").click()
        // Attach a submit handler to the form
         $("#login").submit(function (event) {
//            // Stop form from submitting normally
            event.preventDefault();
            console.log("Entre");

//            // Get some values from elements on the page:
            var $form = $( this ),
//                    password = $("#contrasena").val(),
//                    email = $("#usuario").val()
                     password = $form.find("input[name='contrasena']").val(),
                    email = $form.find("input[name='usuario']").val()

            var posting = $.post( "http://localhost:4567/verificar-log", { contrasena: password, usuario: email } );


            // Put the results in a div
            posting.done(function( data ) {
//                //lo unico agregado despues que te fuiste
                if(data == true)
                {
                    console.log("esta en el if");
                    window.location.replace("http://localhost:4567/index/");
                   // window.location.replace("http://localhost:4567/index/");

                }
                else{
                    alert("Verifique su usuario y contraseña");
                }
                console.log(data);
            });
        });




    </script>
</div>

<script>
    $(document).ready(function(){
        $("#myBtn").click(function(){
            $("#myModal").modal();
        });
    });
</script>




<#--Modal-->


<#--<div id=”miVentana” style=”position: fixed; width: 350px; height: 190px; top: 0; left: 0; font-family:Verdana, Arial, Helvetica, sans-serif; font-size: 12px; font-weight: normal; border: #333333 3px solid; background-color: #FAFAFA; color: #000000; display:none;”>-->
    <#--Aquí pones tu contenido web-->
<#--</div>-->




</body>
</html>
