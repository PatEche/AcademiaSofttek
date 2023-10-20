package ClaseOnceBis;

import java.util.ArrayList;
import java.util.List;

/*
La API Stream nos permite trabajar de una manera mucho mas cómoda y funciona con todo lo relacionado a arrays (listas, conjunto de datos, mapas, matrices, etc)
Esto lo podemos encontrar en java.util.stream

¿Que facilita? La api stream nos proporciona una forma sencilla de trabajar con colecciones

¿Que nos otorga? Legilibilidad y mantenibilidad, lo que signfiica que nuestro código es menos propenso a errores ya que escribimos mucho menos código

¿Que nos facilita? La manipulacion de datos

Menos necesidad de bucles explicitos

Código más entendible

En resumen la api de stream ofrece una manera mas moderna y eficiente de trabajar con colecciones de datos, mejorando la legibilidad, el rendimiento, la calidad del código y 
al mismo tiempo promueve la programación funcional

*/
public class StreamApp {
    
//Creamos una lista de Strings llamada lista y la inicializamos
    private List<String> lista = new ArrayList<>();
    
    private List<String> numeros = new ArrayList<>();
    
 //Constructor de la clase StreamsApp
    public StreamApp(){                        
        
        //Agregamos cadena a la lista "lista"
        
        lista.add("Messi");
        lista.add("Cacaroto");
        lista.add("Pikachu");
        lista.add("Goku");
        
        //Creamos una lista llamada "numeros" para almacenar cadenas
        
        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
        
    }
    
    //Los dos puntos :: se utiliza para crear una referencia a un método
    /*
    Cuando usas System.out::println, estás creando una referencia al método println de System.out, 
    pero no lo estás ejecutando directamente.
     Esta referencia al método puede ser pasada como argumento a otros métodos
    que esperan una interfaz funcional compatible con println, como es el caso de forEach en la API de Streams.
    */
    
    public void filtrar(){
        lista.stream().filter(x -> x.startsWith("M")).forEach(System.out::println);
    }
    
    public void ordenar(){
        lista.stream().sorted().forEach(System.out::println);
    }
    
    public void transformar(){
        lista.stream().map(String::toUpperCase).forEach(System.out::println);
    }
    
    public void limitar(){
        lista.stream().limit(2).forEach(System.out::println);
    }
    
    public void contar(){
        long x = lista.stream().count();
        System.out.println(x);
    }
    
    public void contarN(){
    long x = numeros.stream().count();
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        
        StreamApp app = new StreamApp();
        
//        app.contar();
//        app.contarN();
//        app.ordenar();
//        app.limitar();
          app.transformar();
        
        
    }
    
}