<?php
// =============================
// 🧵 Cadenas de texto en PHP
// =============================

// Concatenación
$nombre = "Ana";
$saludo = "Hola, " . $nombre . "!";
echo $saludo . "\n"; // Hola, Ana!

$mensaje = "Hola";
$mensaje .= ", ¿cómo estás?";
echo $mensaje . "\n";

// strlen: longitud de la cadena
echo strlen("PHP") . "\n"; // 3

// strpos: posición de subcadena
echo strpos("Hola mundo", "mundo") . "\n"; // 5

// substr: extraer parte de la cadena
echo substr("abcdef", 1, 3) . "\n"; // "bcd"

// strtolower / strtoupper
echo strtolower("PHP ES GENIAL") . "\n"; // "php es genial"
echo strtoupper("hola mundo") . "\n";   // "HOLA MUNDO"

// explode: separar string en array
$cadena = "uno,dos,tres";
$partes = explode(",", $cadena);
print_r($partes);

// implode: unir array en string
$palabras = ["Hola", "mundo"];
$frase = implode(" ", $palabras);
echo $frase . "\n";

// Función: normalizar nombre
function normalizarNombre(string $nombre): string {
    $nombre = strtolower($nombre);
    return ucfirst($nombre);
}
echo normalizarNombre("jUAn") . "\n"; // "Juan"