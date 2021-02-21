package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Autos> auto = new ArrayList<>();
        auto.add(new Autos("Renault", 2020, "Logan", 200));
        auto.add(new Autos("Montero", 2016, "magic", 500));
        auto.add(new Autos("For", 2022, "For runner", 600));
        auto.add(new Autos("Toyota", 2022, "For runner", 500));

        System.out.println("La cantidad de autos es " +auto.size());

        for(int i=0; i<auto.size();i++){
            System.out.println("El precio del auto " +auto.get(i).getMarca()+" es: $" +auto.get(i).getPrecio());
                    }


    }
}
