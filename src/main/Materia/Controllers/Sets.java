package main.Materia.Controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {
    public Sets(){
        construirHashSet();
        construirLinkedHashSet();
        construirTreeSet();
        construirTreeSetConComparador();
    }
    //Construir y Mostrar un HashSet
    public void construirHashSet(){
        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("Manzana");
        System.out.println("HashSet: "+conjunto);
        conjunto.add("Pera");
        System.out.println("HashSet: "+conjunto);
        conjunto.add("Banana");
        System.out.println("HashSet: "+conjunto);
        conjunto.add("Kiwi");
        System.out.println("HashSet: "+conjunto);
        conjunto.add("Piña");
        System.out.println("HashSet: "+conjunto);
        conjunto.add("Aguacate");
        System.out.println("HashSet: "+conjunto);
        //verificar si existe un elemento en mi conjunto
        Boolean contieneBanana = conjunto.contains("Banana");
        System.out.println("¿HashSet contiene Banana? \n"+ (contieneBanana? "Si contiene": "No contiene"));
        //obtener el tamaño
        int tamanio = conjunto.size();
        System.out.println("Tamaño del HashSet: "+ tamanio);
    }
    //Construir y mostrar un LinkedHashSet
    public void construirLinkedHashSet(){
        LinkedHashSet<String> conjunto = new LinkedHashSet<>();
        //Agregar elementos
        conjunto.add("Manzana");
        System.out.println("\nLinkedHashSet: "+conjunto);
        conjunto.add("Pera");
        System.out.println("LinkedHashSet: "+conjunto);
        conjunto.add("Banana");
        System.out.println("LinkedHashSet: "+conjunto);
        conjunto.add("Kiwi");
        System.out.println("LinkedHashSet: "+conjunto);
        conjunto.add("Piña");
        System.out.println("LinkedHashSet: "+conjunto);
        conjunto.add("Aguacate");
        System.out.println("LinkedHashSet: "+conjunto);
    }
    public void construirTreeSet(){
        TreeSet<String> conjunto = new TreeSet<>();
        //Agregar elementos
        conjunto.add("Manzana");
        System.out.println("\nTreeSet: "+conjunto);
        conjunto.add("Pera");
        System.out.println("TreeSet: "+conjunto);
        conjunto.add("Banana");
        System.out.println("TreeSet: "+conjunto);
        conjunto.add("Kiwi");
        System.out.println("TreeSet: "+conjunto);
        conjunto.add("Piña");
        System.out.println("TreeSet: "+conjunto);
        conjunto.add("Aguacate");
        System.out.println("TreeSet: "+conjunto);
    }
    public void construirTreeSetConComparador(){
        Comparator<String> comparadorOrdenInverso = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };
        TreeSet<String> conjunto = new TreeSet<>(comparadorOrdenInverso);

        //Agregar elementos
        conjunto.add("Manzana");
        System.out.println("\nTreeSetConComparador: "+conjunto);
        conjunto.add("Pera");
        System.out.println("TreeSetConComparador: "+conjunto);
        conjunto.add("Banana");
        System.out.println("TreeSetConComparador: "+conjunto);
        conjunto.add("Kiwi");
        System.out.println("TreeSetConComparador: "+conjunto);
        conjunto.add("Piña");
        System.out.println("TreeSetConComparador: "+conjunto);
        conjunto.add("Aguacate");
        System.out.println("TreeSetConComparador: "+conjunto);

    }
}
