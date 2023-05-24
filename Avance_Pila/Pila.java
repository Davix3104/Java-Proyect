package Avance_Pila;

public class Pila {

    private int Pila[];
    private int tope;

    public Pila(int n) {
        Pila = new int[n];
        PilaVacia();
    }

    public void PilaVacia() {
        tope = -1;
    }

    public void insertar(int valor) {
        if (tope < Pila.length - 1) {
            tope++;
            Pila[tope] = valor;
        }
    }

    public int eliminar() {
        int valor = 0;
        if (tope >= 0) {
            valor = Pila[tope];
            tope--;
        }
        return valor;
    }

    public String muestreValores() {
        String cadena = "";
        for (int i = 0; i <= tope; i++) {
            cadena += Pila[i] + "\t";
        }
        return cadena;
    }

    public int acceso() {
        int valor = 0;
        if (tope >= 0) {
            valor = Pila[tope];
        }
        return valor;
    }

    public void recorrerArray() {
        for (int i : Pila) {
            System.out.println(i);
        }
    }

}