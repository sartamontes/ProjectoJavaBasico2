package co.curso;

public class Funciones {

   // Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.

    public static double sumaIVA(double precio, float iva){
        return precio*(100+iva)/100;
    }

    public static void main(String[] args) {
        double nuevoPrecio =sumaIVA(19.5d, 21);

        System.out.println(nuevoPrecio);
    }
}
