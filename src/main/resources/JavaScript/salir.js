

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