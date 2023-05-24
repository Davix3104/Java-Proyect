package Avance_Pila;

public class MainPila {
    public static void main(String[] args) {

        Pila oPila = new Pila(5);
        oPila.insertar(10);
        oPila.insertar(20);
        oPila.insertar(30);
        oPila.insertar(40);
        System.out.println(oPila.muestreValores());
        oPila.acceso();
        oPila.eliminar();
        System.out.println(oPila.muestreValores());
        oPila.eliminar();
        System.out.println(oPila.muestreValores());
        oPila.eliminar();
        System.out.println(oPila.muestreValores());
        oPila.eliminar();
        System.out.println(oPila.muestreValores());
        oPila.eliminar();
        System.out.println(oPila.muestreValores());
        oPila.eliminar();
        System.out.println(oPila.muestreValores());

    }

}
