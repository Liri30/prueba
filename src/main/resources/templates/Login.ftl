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

</head>
<body>
<div class="loginBox">
    <img src="/img/user.png" class="user">
    <h2>${Bienvenido}</h2>
    <form id="login">
        <p>Usuario</p>
        <input type="email" name="usuario" required id="usuario" placeholder="Enter Email">
        <p>Contraseña</p>
        <input type="Password" name="contrasena" required id="contrasena" placeholder="••••••">
        <input type="submit" class="btn btn-primary" value="Entrar">
        <a href="#">Olvide mi contraseña</a>
    </form>

    <script>
        // Attach a submit handler to the form
        $( "#login" ).submit(function( event ) {
//            // Stop form from submitting normally
            event.preventDefault();
            console.log("Entre");

//            // Get some values from elements on the page:
            var $form = $( this ),
                    password = $form.find( "input[name='contrasena']" ).val(),
                    email = $form.find( "input[name='usuario']" ).val()
//            //url = $form.attr( "http://localhost:4567/post-test" );
////
            console.log(email);
            console.log(password);
//            // Send the data using post
//            //var posting = $.post( url, { inputPassword: password, inputEmail: email } );
            var posting = $.post( "http://localhost:4567/verificar-log", { contrasena: password, usuario: email } );


            // Put the results in a div
            posting.done(function( data ) {
//                //lo unico agregado despues que te fuiste
                if(data == "true")
                {
                    window.location.replace("http://localhost:4567/index/");
                }
                else{
                    alert("Verifique su usuario y contraseña");
                }
                console.log(data);
            });
        });


    </script>
</div>
</body>
</html>
