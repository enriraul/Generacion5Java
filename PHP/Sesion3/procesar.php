<?php
if ($_SERVER['REQUEST_METHOD'] === 'GET') {
    echo "<h2>Solicitud GET</h2>";
    echo "Método: GET<br>";
    if (!empty($_GET['nombre'])) {
        echo "Nombre recibido: " . htmlspecialchars($_GET['nombre']);
    } else {
        echo "No se recibió ningún nombre.";
    }

} else if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    echo "<h2>Solicitud POST</h2>";
    echo "Método: POST<br>";
    if (!empty($_POST['usuario'])) {
        echo "Usuario recibido: " . htmlspecialchars($_POST['usuario']);
    } else {
        echo "No se recibió ningún usuario.";
    }
}
?>
