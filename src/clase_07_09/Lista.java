package clase_07_09;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        //asi se crea una lista
        cars.add("BMW");
        //asi se añade un objeto a una lista

        ArrayList<String> cars2 = new ArrayList<String>();
        cars2.add("BMW");

        Boolean equals = cars.equals(cars2);
        //esto se hace para compara dos listas, en este caso es para que me diga que si los componentes
        // de las listas son iguales esntomces dira que es "true"

    }
}
