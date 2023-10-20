package ClaseOnceBis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamsApp {

    public static void main(String[] args) {

        /*
La API Stream nos permite trabajar de una manera mucho mas cómoda y funciona con todo lo relacionado a arrays (listas, conjunto de datos, mapas, matrices, etc)
Esto lo podemos encontrar en java.util.stream

¿Que facilita? La api stream nos proporciona una forma sencilla de trabajar con colecciones

¿Que nos otorga? Legilibilidad y mantenibilidad, lo que signfiica que nuestro código es menos propenso a errores ya que escribimos mucho menos código

¿Que nos facilita? La manipulacion de datos

Menos necesidad de bucles explicitos

Código más entendible

En resumen la api de stream ofrece una manera mas moderna y eficiente de trabajar con colecciones de datos, 
mejorando la legibilidad, el rendimiento, la calidad del código y 
al mismo tiempo promueve la programación funcional

         */
        //Creamos una lista donde vamos a almacenar Strings y inicializamos el Arraylist
        List<String> lista = new ArrayList<String>();
        
        
               
        lista.add(
                "Messi");
        lista.add(
                "Caniggia");
        lista.add(
                "Bilardo");
        lista.add(
                "Schelotto");

        //Usando Streams para recorrer y mostrar la lista
//        lista.forEach(System.out::println);
        
        //Usamos streams y pasamos el metodo sorted para ordenar alfabeticamente y un foreach para recorrer y hacemos uso de una referencia la metodo println mediante los dos ::.
       
        //Usando un Iterador y sus metodos HasNext() y next() para recorrer una coleccion de elementos
//        Iterator<String> it = lista.iterator();
//            
//            while(it.hasNext()){
//                System.out.println(it.next());
//            }
//        for(String miLista : lista){
//            System.out.println(miLista.toUpperCase());
//        }
//        for(int i=0;i<lista.size();i++) {
//             System.out.println("Posicion:"+(i)+ ":"+ lista.get(i).toUpperCase());
//           
//        }
    }

    
    
    
    
    
}
