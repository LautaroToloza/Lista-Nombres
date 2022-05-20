
package ar.com.lautaro.test;

import java.util.*;

public class testResolucion {
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
        
        List <String> nombres = new ArrayList<>();
        cargarLista(nombres);
        
    }
    public static String cargarTexto(String texto){
        Scanner leer = new Scanner(System.in);
        System.out.println(texto);
        String mensaje = leer.nextLine();
        return mensaje;
    }
    public static boolean verificacion(String texto){
        return texto.matches("^(S|s){1}+(I|i){1}$");
    }
    public static void cargarLista(List<String> lista){
        String op;
        while(true){
            op = cargarTexto("Ingrese un 'SI' para ingresar una palabra o un 'NO' para salir. ");
            if (verificacion(op)) {
                lista.add(cargarTexto("Ingrese un nombre: "));
                
            } else if(op.equalsIgnoreCase("NO")) {
                break;
            }
            else{
                System.out.println("Error de carga, intente nuevamente.");
            
            }
            
        }
        // Mustra de la lista.
        System.out.println("\nMustra de la lista: ");
        lista.forEach(System.out::println);
    }
}
