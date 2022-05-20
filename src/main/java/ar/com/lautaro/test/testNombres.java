package ar.com.lautaro.test;

import java.util.*;

public class testNombres {

    public static void main(String[] args) {

        /*Consigna del ejercicio:
        
        CREAR UN PROGRAMA QUE CARGUE UNA SERIE DE NOMBRES A UNA LISTA
        PARA ESTO DEBERAN DESARROLAR UN CARGAR TEXTO(SCANNER)
        Y LUEGO HACER UNA FUNCION CON UN CICLO EN DONDE PARA CADA SITUACION DE CARGA
        NOSOTROS DEBAMOS INDICAR CON UN "SI" O UN "NO" SI QUEREMOS SEGUIR CARGANDO
        HACER VERIFICACION EN CASO DE QUE LA PERSONA NO INGRESE NI SI NI NO
        EN ESE CASO SE DEBE DECIR QUE "INGRESO FUE INCORRECTO"
        CUANDO SE SELECCIONE EL NO, MOSTRAR LA LISTA CARGADA.

        */
        
        // Inicialización de la lista..
        List<String> nombre = new ArrayList<>();

        // Mustra de resultados..
        muestra(nombre);

    }

    public static void usoReguladores() {
        // Devuelve un booleano dependiendo si hay coincidenciaono
        // ^ inicio (con los corchetes)
        // $ final
        // [a-z][0-9][a-d]rangos
        // (hola|HOLA)opciones una o la otra
        // ? opcional 0 o 1
        // * opcional 0 o muchas veces
        // + 1 o más veces
        // {n} cantidad de veces que queremos ver algo de ese tipo.
        // {n1,n2} rango menor, rango mayor.
        // Sintaxis: 
        // public static boolean coincidencia(String texto){
        // return nombreString.matches("Coincidencia");
        //}
    }

    public static boolean ejemplo(String texto) {
        // Consigna:
        // Que el nombre comience con una mayúscula y que luego tenga 5 minúsculas.
        return texto.matches("^[A-Z]{1}+[a-z]{5}$");
    }

    public static String cargarTexto(String texto) {
        Scanner leer = new Scanner(System.in);
        System.out.println(texto);
        String mensaje = leer.nextLine();
        return mensaje;
    }

    public static void cargarLista(List<String> lista) {
        // Carga de lista..

        boolean flag = true;
        while (flag) {
            String op = cargarTexto("Ingrese 'SI' para cargar un nombre a la lista, ingrese 'NO' para no seguir cargando: ");
            if (op.equalsIgnoreCase("SI")) {
                lista.add(cargarTexto("Ingrese un nombre: "));

            } else if (op.equalsIgnoreCase("NO")) {
                flag = false;
            } else {
                System.out.println("Error de carga, intente nuevamente,Ingrese 'SI' o 'NO'.");

            }

        }

    }

    public static void muestra(List<String> lista) {

        // Lista cargada..
        cargarLista(lista);

        // Mustra de los resultados..
        System.out.println("\nFinalizo el programa..");
        if (lista.size() == 0) {
            System.out.println("\nNo se cargo ningun nombre en la lista!! ");
        } else {
            System.out.println("\nLos nombres cargados a la lista fue: ");
            lista.forEach(System.out::println);
        }
    }
}
