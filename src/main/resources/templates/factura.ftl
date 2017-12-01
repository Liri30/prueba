<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <title>EPA</title>

    <link href="/css/multiColumnTemplate.css" rel="stylesheet" type="text/css">


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
                <li><a href="/index"> INICIO</a></li>
                <li><a href="/Estadistic"> ESTADISTICAS</a></li>
                <li><a href="">FACTURAS</a></li>
                <li><a href=""> CONSULTAS </a></li>
                <li><a href=""> CONFIGURACION<!--<span onmouseover="caret"></span>--></a></li>
            </ul>
        </nav>
    </header>
    <section>
        <h2 class="noDisplay">Main Content</h2>
        <article class="left_article">
            <h3></h3>
              <body>
            <!--Div that will hold the pie chart-->
            <div id="chart_div"></div>
          </body>





            <script>
                // Attach a submit handler to the form
                $( "#demo" ).submit(function( event ) {

                    // Stop form from submitting normally
                    event.preventDefault();

                    // Get some values from elements on the page:
                    var $form = $( this ),
                            password = $form.find( "input[name='pass']" ).val(),
                            email = $form.find( "input[name='correoActual']" ).val()

                    //url = $form.attr( "http://localhost:4567/post-test" );

                    console.log(email);
                    console.log(password);
                    // Send the data using post
                    //var posting = $.post( url, { inputPassword: password, inputEmail: email } );
                    var posting = $.post( "http://localhost:4567/post-test", { pass: password, correoActual: email } );


                    // Put the results in a div
                    posting.done(function( data ) {
                        //lo unico agregado despues que te fuiste
                        if(data == "true")
                        {
                            alert("Su correo ha sido actualizado a "+email+", este también será su nuevo usuario.");
                            location.reload();
                        }
                        else{
                            alert("Verifique sus datos para actualizar su correo");
                        }
                        console.log(data);
                    });
                });


            </script>

            <script>
                // Attach a submit handler to the form
                $( "#precio" ).submit(function( event ) {

                    // Stop form from submitting normally
                    event.preventDefault();

                    // Get some values from elements on the page:
                    var $form = $( this ),
                            number1 = $form.find( "input[name='pr1']" ).val(),
                            number2 = $form.find( "input[name='pr2']" ).val(),
                            number3 = $form.find("input[name = 'pr3']").val(),
                            number4 = $form.find("input[name = 'pr4']").val()

                    //url = $form.attr( "http://localhost:4567/post-test" );


                    // Send the data using post
                    //var posting = $.post( url, { inputPassword: password, inputEmail: email } );
                    var posting = $.post( "http://localhost:4567/configurar-precios", { pr1:number1, pr2:number2, pr3:number3, pr4:number4 } );


                    // Put the results in a div
                    posting.done(function( data ) {
                        //lo unico agregado despues que te fuiste
                        if(data == "true")
                        {
                            alert("Su correo ha sido actualizado a "+email+", este también será su nuevo usuario.");
                            location.reload();
                        }
                        else{
                            alert("Verifique sus datos para actualizar su correo");
                        }
                        console.log(data);
                    });
                });



            </script>
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