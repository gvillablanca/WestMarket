package westmarket;

import java.util.Scanner;
import java.util.ArrayList;
import classMarket.Producto;

public class WestMarket {
    public static void main(String[] args) {
        ArrayList<Producto> producto = new ArrayList<Producto>();
        menu(producto);
    }
    
    public static void menu(ArrayList<Producto> producto){
        System.out.println("*********************************************************************");
        System.out.println("BIENVENIDO, PARA CONTINUAR SELECCIONE UNA DE LAS SIGUIENTES OPCIONES...\n");
        System.out.println("*********************************************************************");
        System.out.println("1- * \n2- * \n3- * \n4- SALIR");
        System.out.println("*********************************************************************");
        
        String opcion = new String();
        while(opcion.isEmpty()){
            System.out.println("OPCION: ");
            Scanner op = new Scanner(System.in);
            opcion = (op.nextLine()).trim();

            if(opcion.isEmpty()){
                System.out.println("FAVOR SELECCIONAR UNA OPCION\n");
            }
            else if(opcion.equals("1")){
                registrarProducto(producto);
            }
            else if(opcion.equals("2")){
                imprimirListado(producto);
            }
            else if(opcion.equals("3")){
                eliminarProducto(producto);
            }  
            else if(opcion.equals("4")){
                salir();
            }  
        }
    }
    
    public static void registrarProducto(ArrayList<Producto> producto){
        System.out.println("1");
        menu(producto);
    }
    
    public static void imprimirListado(ArrayList<Producto> producto){
        System.out.println("2");
        menu(producto);
    }
    
    public static void imprimirListadoSimple(ArrayList<Producto> producto){
        System.out.println("2.5");
    }
    
    public static void eliminarProducto(ArrayList<Producto> producto){
        imprimirListadoSimple(producto);
        System.out.println("3");
        menu(producto);
    }
    
    public static void salir(){
        System.out.println("4");
    }
}
