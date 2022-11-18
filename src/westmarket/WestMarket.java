package westmarket;

import java.util.Scanner;
import java.util.ArrayList;
import classMarket.Producto;
import classMarket.Categoria;

public class WestMarket {
    public static void main(String[] args) {
        ArrayList<Producto> producto = new ArrayList<Producto>();
        ArrayList<Categoria> categoria = new ArrayList<Categoria>();
        //categoria(categoria);
        menu(producto, categoria);        
    }
    
    public static void menu(ArrayList<Producto> producto, ArrayList<Categoria> categoria){
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
                registrarProducto(producto, categoria);
            }
            else if(opcion.equals("2")){
                imprimirListado(producto, categoria);
            }
            else if(opcion.equals("3")){
                eliminarProducto(producto, categoria);
            }  
            else if(opcion.equals("4")){
                salir();
            }  
        }
    }
    
    public static void registrarProducto(ArrayList<Producto> producto, ArrayList<Categoria> categoria){
        Producto prod = new Producto();        
        System.out.println("1");
        menu(producto, categoria);
    }
    
    public static void imprimirListado(ArrayList<Producto> producto, ArrayList<Categoria> categoria){
        System.out.println("2");
        menu(producto, categoria);
    }
    
    public static void imprimirListadoSimple(ArrayList<Producto> producto, ArrayList<Categoria> categoria){
        System.out.println("2.5");
    }
    
    public static void eliminarProducto(ArrayList<Producto> producto, ArrayList<Categoria> categoria){
        imprimirListadoSimple(producto,categoria);
        System.out.println("3");
        menu(producto, categoria);
    }
    
    public static void salir(){
        System.out.println("4");
    }
    
    public static ArrayList<Categoria> categoria(ArrayList<Categoria> categoria){
        Categoria cat = new Categoria();
        int count = 0; 
        
        while(count <4){
          if(count==0){
            cat.setCodigo(1);
            cat.setDescripcion("Bebidas");
            cat.setDescripcionCompleta("Bebidas (cod: 1)");
            categoria.add(cat);
          }else if(count==1){
            cat.setCodigo(2);
            cat.setDescripcion("Congelados");
            cat.setDescripcionCompleta("Congelados (cod: 2)");
            categoria.add(cat);
          }else if(count==2){
            cat.setCodigo(3);
            cat.setDescripcion("Lácteos");
            cat.setDescripcionCompleta("Lácteos (cod: 3)");
            categoria.add(cat);
          }if(count==3){
            cat.setCodigo(4);
            cat.setDescripcion("Aseo");
            cat.setDescripcionCompleta("Aseo (cod: 4)");
            categoria.add(cat);            
          }
          count ++;
        }
        System.out.println(categoria);
        return categoria;
    }
}
