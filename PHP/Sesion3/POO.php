<?php
    //Estructura simple de una clase
    Class Cuenta{
        private $saldo =0;

        public function depositar($monto){
            $this->saldo += $monto;
        }
        public function mostrarSaldo(){
            return $this->saldo;
        }
    }
?>


<?php
    //Constructor y Destructor

    Class Usuario{
        public $nombre;

        public function __construct($nombre)
        {
            $this->nombre = $nombre;
        }
        public function __destruct()
        {
            echo "Elemento destruido"
        }
    }

?>


<?php
    //Herencia 
    class Animal{
        public function hacerRuido(){

        }
    }
    class Perro extends Animal{

    }
?>

