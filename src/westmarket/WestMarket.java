package westmarket;

import java.util.Scanner;
import java.util.ArrayList;
import classMarket.Producto;
import classMarket.Categoria;

public class WestMarket {
    public static void main(String[] args) {
        ArrayList<Producto> producto = new ArrayList<Producto>();
        ArrayList<Categoria> categoria = new ArrayList<Categoria>();
        categoria(categoria);
        menu(producto, categoria);        
    }
    
    public static void menu(ArrayList<Producto> producto, ArrayList<Categoria> categoria){
        System.out.println("*********************************************************************");
        System.out.println("--- West Market ---\n");
        System.out.println("*********************************************************************");
        System.out.println("1- Registrar producto \n2- Imprimir productos \n3- Eliminar producto \n4- Salir");
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
            System.out.println("--- Registrar Producto ---");
            Producto prod = new Producto();
            Categoria cat = new Categoria();            
            
            String codigo = new String();
            String descripcion = new String();
            String precio = new String();
            String stock = new String();
            String opcion = new String();
            
            while(codigo.isEmpty() || descripcion.isEmpty() || precio.isEmpty() || stock.isEmpty()){
                System.out.println("ingrese los datos solictados");
                System.out.println("- Codigo: ");
                Scanner codigoIn = new Scanner(System.in);
                codigo = codigoIn.nextLine();
                
                System.out.println("- Descripcion: ");
                Scanner descripcionIn = new Scanner(System.in);
                descripcion = descripcionIn.nextLine();
                
                System.out.println("- Precio: ");
                Scanner precioIn = new Scanner(System.in);
                precio = precioIn.nextLine();
                
                System.out.println("- Stock: ");
                Scanner stockIn = new Scanner(System.in);
                stock = stockIn.nextLine();
                
                int codigoNum = Integer.parseInt(codigo);
                int precioNum = Integer.parseInt(precio);
                int stockNum = Integer.parseInt(stock);
                
                
                if(codigo.isEmpty() || descripcion.isEmpty() || precio.isEmpty() || stock.isEmpty()){
                    System.out.println("Favor completar con todos los datos...");                    
                }
                else{
                    for(int i = 0;i<=producto.size();i++){  
                        if(producto.size()>0){
                            if(1==3){
                                
                            }
                            
                        }
                    }
                }
            }
            
            
            /*
            verificar que producto no este registrado ya
            si esta registrado, indicarlo y traer la informacion del producto
            si no
                solicitar codigo - int
                solicitar descripcion - string
                solicitar precio - int
                solicitar stock - int
                categoria
                    desplegar menu de seleccion (utilizar arraylist de categorias y desplegar)
                        Categorías
                        1.	Bebidas
                        2.	Congelados
                        3.	Lácteos
                        4.	Aseo
                    solicitar categoria - categoria.DescripcionCompleta
                    depende de seleccion asignar categoria-descripcionCompleta
                    si la seleccion de categorias no es una opcion valida solicitar ingresar nuevamente hasta 3 veces - contar intentos
                    si no salir e indicar que vuelva a intentar y mandar al menu principal
                agregar producto a arrayList de producto                    
            mensaje de producto agregado correctamente
            */
            menu(producto, categoria);
        }
        catch(Exception e){
            System.out.println("NO EXISTEN PRODUCTOS EN EL SISTEMA");
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
        try{
            imprimirListadoSimple(producto,categoria);
        }
        catch(Exception e){
            System.out.println("ERROR EN SISTEMA, FAVOR VOLVER A REINTENTAR ");
            menu(producto, categoria);
        }
    }
    
    public static void salir(){
        System.out.println("HASTA PRONTO");
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
