<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Epa Login</title>
    <link rel="stylesheet" href="/css/logStyle.css">
</head>
<body>
<div class="loginBox">
    <img src="/img/user.png" class="user">
    <h2>${Bienvenido}</h2>
    <form method="post" action="/login/">
        <p>Usuario</p>
        <input type="text" name="usuario" placeholder="Enter Email">
        <p>Contraseña</p>
        <input type="Password" name="contrasena" placeholder="••••••">
        <input type="submit" name="entrar" value="Entrar">
        <a href="#">Olvide mi contraseña</a>
    </form>
</div>
</body>
</html>
