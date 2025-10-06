<?php
/*
    forma de comentar dentro de php

    Sintaxis
*/
?>


<?
    echo "Hola mundo";/*Imprimir varios elementos*/
    print "Hola mundo";/*Imprimir un solo elemento*/
?>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1><?php "hola mundo!"?></h1>
</body>
</html>


<?
    /*
        Comentarios
        Segmentos de texto grandes    
    */
    //Comentario por linea
    #Comentario por linea
?>

<?
    //Declaracion de variables y tipos de datos.
    $nombre;
    $_nombre;
    $Nombre;
    $dato = 10;
    $dato = "diez";


    $numero1 =1;
    $numero2 = "3";
    $numero3 = $numero1 + $numero2;
    $numero4 = $numero1 . $numero2;
?>
<?
    //operadores

    $a = 10;
    $b = 5;

    //Operadores aritmeticos
    $suma = $a + $b;
    $resta = $a - $b;
    $multiplicacion = $a * $b;
    $division = $a / $b;
    $residuo = $a % $b;

    //Operadores comparativos/relacionales
    $a == $b 
    $a === $b  //Estrictamente igual
    $a != $b
    $a > $b
    $a < $b

    //Operadores logicos
    $a && $b //and
    $a || $b //or
    !$a //negacion

?>
<?
    //Verificacion de tipados
    echo gettype($a); //Muestra el tipo de dato
    $numero = 142;
    $cad = (int) $numero; //Cambio de tipo de dato

    echo is_int($a);
    echo is_float($a);
?>
<?
    //Estructura de control
    #condicional
    if($a){
    }
    else if ($a){
    }
    else{
    }
    #switch
    switch($a){
        case opcion:
            break;
        case opcion2:
            break;
        case opcion3:
            break;
    }
    #Ciclos for
    for($i=1; $i<=5;$i++){

    }

    #Ciclos while
    while($a>=5){

    }
    
    #Ciclos do-while
    do{

    }while(condicional);

?>

<?
    #foreach
    $arreglo = ["ana","pedro","luis"];
    foreach($nombre as $arreglo){

    }
    foreach($arreglo as $indice=> $valor){
        echo $indice, $valor;
    }
?>
<?
    //Funciones
    function nombreFuncion(){

    }

    nombreFuncion();
    function nombreFuncion($variable){

    }
    nombreFuncion("nombre");
    $x;
    function(&$x){
        $x = 5;
    }
    $x = funcion($x);
    function funcion1($a,$b){
        #Pasos/Procesos
    }

    function($a,$b,$operacion){
        return $operacion($a,$b);
    }

    function factorial($n){
        if($n==0){
            return 1;
        }
        return $n*factorial($n-1);
    }
?>
