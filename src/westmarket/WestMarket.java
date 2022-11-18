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
        try{
            Producto prod = new Producto();
            System.out.println(categoria);
            System.out.println("1");
            menu(producto, categoria);
        }
        catch(Exception e){
            System.out.println("error: " + e);
            menu(producto, categoria);
        }
    }
    
    public static void imprimirListado(ArrayList<Producto> producto, ArrayList<Categoria> categoria){
        try{
            System.out.println("2");
            System.out.println("TODOS LOS PRODUCTOS");
            if(producto.size()>0){
                for(int i = 0;i<producto.size();i++){
                        System.out.println("*********************************************************************");
                        System.out.println( "\n CODIGO: " +producto.get(i).getCodigo()+
                                            "\n DESCRIPCION: " +producto.get(i).getDescripcion()+
                                            "\n PRECIO: " +producto.get(i).getPrecio()+
                                            "\n STOCK: " +producto.get(i).getStock()+
                                            "\n CATEGORIA: " +producto.get(i).getCategoria());
                        System.out.println("*********************************************************************\n");
                }
            }
            else{
                System.out.println("NO EXISTEN PRODUCTOS EN EL SISTEMA");
            }
        
        menu(producto, categoria);
        }
        catch(Exception e){
            System.out.println("Error en Sistema, favor volver a reintentar ");
            menu(producto, categoria);
        }
    }
    
    public static void imprimirListadoSimple(ArrayList<Producto> producto, ArrayList<Categoria> categoria){
        try{
                System.out.println("PRODUCTOS INGRESADOS");
                if(producto.size()>0){
                    for(int i = 0;i<producto.size();i++){
                        System.out.println("*********************************************************************");
                        System.out.println( "\n CODIGO: " +producto.get(i).getCodigo()+
                                            "\n DESCRIPCION: " +producto.get(i).getDescripcion());
                        System.out.println("*********************************************************************\n");
                    }
                }
                else{
                    System.out.println("NO EXISTEN PRODUCTOS EN EL SISTEMA"); 
                }
                menu(producto, categoria);
        }
        catch(Exception e){
            System.out.println("ERROR EN SISTEMA, FAVOR VOLVER A REINTENTAR ");
            menu(producto, categoria);
        }
    } 
    
    public static void eliminarProducto(ArrayList<Producto> producto, ArrayList<Categoria> categoria){
        imprimirListadoSimple(producto,categoria);
        System.out.println("3");
        
        menu(producto, categoria);
    }
    
    public static void salir(){
        try{
            System.out.println("HASTA PRONTO");
        }
        catch(Exception e){
            System.out.println("error: " + e); 
        }
    }
    
    public static ArrayList<Categoria> categoria(ArrayList<Categoria> categoria){
        Categoria cat1 = new Categoria();
        Categoria cat2 = new Categoria();
        Categoria cat3 = new Categoria();
        Categoria cat4 = new Categoria();
        cat1.setCodigo(1);
        cat1.setDescripcion("Bebidas");
        cat1.setDescripcionCompleta("Bebidas (cod: 1)");
        categoria.add(cat1);
        cat2.setCodigo(2);
        cat2.setDescripcion("Congelados");
        cat2.setDescripcionCompleta("Congelados (cod: 2)");
        categoria.add(cat2);
        cat3.setCodigo(3);
        cat3.setDescripcion("Lácteos");
        cat3.setDescripcionCompleta("Lácteos (cod: 3)");
        categoria.add(cat3);
        cat4.setCodigo(4);
        cat4.setDescripcion("Aseo");
        cat4.setDescripcionCompleta("Aseo (cod: 4)");
        categoria.add(cat4);
        return categoria;
    }
}
