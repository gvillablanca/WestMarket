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
            System.out.println("Opcion: ");
            Scanner op = new Scanner(System.in);
            opcion = (op.nextLine()).trim();

            if(opcion.isEmpty()){
                System.out.println("Favor seleccionar una opcion: \n");
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
            else{
                System.out.println("Opcion Invalida");
                opcion = new String();
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
                
                if(codigo.isEmpty() || descripcion.isEmpty() || precio.isEmpty() || stock.isEmpty()){
                    System.out.println("Favor completar con todos los datos...");                    
                }
                else{
                    for(int i = 0;i<=producto.size();i++){  
                        if(producto.size()>0){                            
                            if(isNumeric(codigo) && isNumeric(precio) && isNumeric(stock)){
                                int codigoNum = Integer.parseInt(codigo);
                                int precioNum = Integer.parseInt(precio);
                                int stockNum = Integer.parseInt(stock);
                                if(producto.get(i).getCodigo()== codigoNum || producto.get(i).getDescripcion().equals(descripcion)){
                                    System.out.println("Producto ya existe en sistema");
                                    break;
                                }
                                else{
                                    System.out.println("Categorias:\n1- Bebidas\n2- Congelados\n3- Lacteos\n4- Aseo");

                                    while(opcion.isEmpty()){
                                        System.out.println("Seleccione una categoria: ");
                                        Scanner op = new Scanner(System.in);
                                        opcion = (op.nextLine()).trim(); 

                                        if(opcion.isEmpty()){
                                            System.out.println("favor seleccionar una categoria\n");
                                        }
                                        else if(opcion.equals("1")){
                                            cat.setCodigo(categoria.get(0).getCodigo());
                                            cat.setDescripcion(categoria.get(0).getDescripcion());
                                            cat.setDescripcionCompleta(categoria.get(0).getDescripcionCompleta());
                                            categoria.add(cat);
                                        }
                                        else if(opcion.equals("2")){
                                            cat.setCodigo(categoria.get(1).getCodigo());
                                            cat.setDescripcion(categoria.get(1).getDescripcion());
                                            cat.setDescripcionCompleta(categoria.get(1).getDescripcionCompleta());
                                            categoria.add(cat);
                                        }
                                        else if(opcion.equals("3")){
                                            cat.setCodigo(categoria.get(2).getCodigo());
                                            cat.setDescripcion(categoria.get(2).getDescripcion());
                                            cat.setDescripcionCompleta(categoria.get(2).getDescripcionCompleta());
                                            categoria.add(cat);
                                                   }
                                        else if(opcion.equals("4")){
                                            cat.setCodigo(categoria.get(3).getCodigo());
                                            cat.setDescripcion(categoria.get(3).getDescripcion());
                                            cat.setDescripcionCompleta(categoria.get(3).getDescripcionCompleta());
                                            categoria.add(cat);
                                        }
                                    }
                                    if(precioNum>0 && stockNum > 0){
                                        prod.setPrecio(precioNum);
                                        prod.setStock(stockNum);
                                    }
                                    else{
                                        System.out.println("Ingrese valores mayores a 0");
                                        break;
                                    }
                                    prod.setCodigo(codigoNum);
                                    prod.setDescripcion(descripcion);
                                    prod.setCategoria(cat);
                                    producto.add(prod);
                                    System.out.println("Producto registrado exitosamente\n");
                                    break;
                                }
                            }
                        }
                        else{                                
                            if(isNumeric(codigo) && isNumeric(precio) && isNumeric(stock)){
                                int codigoNum = Integer.parseInt(codigo);
                                int precioNum = Integer.parseInt(precio);
                                int stockNum = Integer.parseInt(stock);
                                System.out.println("Categorias:\n1- Bebidas\n2- Congelados\n3- Lacteos\n4- Aseo");

                                while(opcion.isEmpty()){
                                    System.out.println("Seleccione una categoria: ");
                                    Scanner op = new Scanner(System.in);
                                    opcion = (op.nextLine()).trim(); 

                                    if(opcion.isEmpty()){
                                        System.out.println("favor seleccionar una categoria\n");
                                    }
                                    else if(opcion.equals("1")){
                                        cat.setCodigo(categoria.get(0).getCodigo());
                                        cat.setDescripcion(categoria.get(0).getDescripcion());
                                        cat.setDescripcionCompleta(categoria.get(0).getDescripcionCompleta());
                                    }
                                    else if(opcion.equals("2")){
                                        cat.setCodigo(categoria.get(1).getCodigo());
                                        cat.setDescripcion(categoria.get(1).getDescripcion());
                                        cat.setDescripcionCompleta(categoria.get(1).getDescripcionCompleta());
                                    }
                                    else if(opcion.equals("3")){
                                        cat.setCodigo(categoria.get(2).getCodigo());
                                        cat.setDescripcion(categoria.get(2).getDescripcion());
                                        cat.setDescripcionCompleta(categoria.get(2).getDescripcionCompleta());
                                    }
                                    else if(opcion.equals("4")){
                                        cat.setCodigo(categoria.get(3).getCodigo());
                                        cat.setDescripcion(categoria.get(3).getDescripcion());
                                        cat.setDescripcionCompleta(categoria.get(3).getDescripcionCompleta());
                                    }
                                }
                                if(precioNum>0 && stockNum > 0){
                                    prod.setPrecio(precioNum);
                                    prod.setStock(stockNum);
                                }
                                else{
                                    System.out.println("Ingrese valores mayores a 0");
                                    break;
                                }
                                prod.setCodigo(codigoNum);
                                prod.setDescripcion(descripcion.toUpperCase());                                                   
                                prod.setCategoria(cat);
                                producto.add(prod);
                                System.out.println("Producto registrado exitosamente\n");
                                break;  
                            }                                                          
                        }
                    }
                }
            }
            
            menu(producto, categoria);
        }
        catch(Exception e){
            System.out.println("Error en Sistema, favor volver a reintentar ");
            menu(producto, categoria);
        }
    }
    
    public static void imprimirListado(ArrayList<Producto> producto, ArrayList<Categoria> categoria){
        try{
            System.out.println("2");
            System.out.println("Todos los productos");
            if(producto.size()>0){
                for(int i = 0;i<producto.size();i++){
                        System.out.println("*********************************************************************");
                        System.out.println( "\n Codigo: " +producto.get(i).getCodigo()+
                                            "\n Descripcion: " +producto.get(i).getDescripcion()+
                                            "\n Precio: " +producto.get(i).getPrecio()+
                                            "\n Stock: " +producto.get(i).getStock()+
                                            "\n Categoria: " +producto.get(i).getCategoria().getDescripcionCompleta());
                        System.out.println("*********************************************************************\n");
                }
            }
            else{
                System.out.println("No existen productos en el sistema");
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
                System.out.println("Productos Ingresados: ");
                if(producto.size()>0){
                    for(int i = 0;i<producto.size();i++){
                        System.out.println("*********************************************************************");
                        System.out.println( "\n Codigo: " +producto.get(i).getCodigo()+
                                            "\n Descripcion: " +producto.get(i).getDescripcion());
                        System.out.println("*********************************************************************\n");
                    }
                }
                else{
                    System.out.println("No existen productos en el sistema"); 
                }
        }
        catch(Exception e){
            System.out.println("Error en Sistema, favor volver a reintentar ");
            menu(producto, categoria);
        }
    } 
    
    public static void eliminarProducto(ArrayList<Producto> producto, ArrayList<Categoria> categoria){
        try{
            String codigo = new String();
            int indice = 0;
            imprimirListadoSimple(producto,categoria);
            
            while(codigo.isEmpty()){
                System.out.println("Ingrese el codigo del producto que desea eliminar: ");
                Scanner codigoIn = new Scanner(System.in);
                codigo = codigoIn.nextLine();
                if(codigo.isEmpty()){
                    System.out.println("Favor ingresar codigo a eliminar");
                }
                else{
                    if(isNumeric(codigo)){
                        int codigoNum = Integer.parseInt(codigo);
                        
                        for(int i = 0;i<producto.size();i++){
                            if(producto.size()>0){

                                if(producto.get(i).getCodigo()== codigoNum){
                                    indice=i;
                                    System.out.println("indice: " + i);
                                    producto.remove(indice);
                                    System.out.println("*********************************************************************");
                                    System.out.println("El producto ha sido eliminado") ;
                                    System.out.println("*********************************************************************\n");
                                    break;
                                }
                            }
                            else{
                                System.out.println("No se registran productos en el sistema");
                            }
                        }
                    }
                }
            }
            menu(producto, categoria);
        }
        catch(Exception e){
            System.out.println(e);
            menu(producto, categoria);
        }
    }
    
    public static void salir(){
        System.out.println("Ha salido del sistema");        
    }
    
    public static ArrayList<Categoria> categoria(ArrayList<Categoria> categoria){
        Categoria cat1 = new Categoria();
        Categoria cat2 = new Categoria();
        Categoria cat3 = new Categoria();
        Categoria cat4 = new Categoria();
        
        cat1.setCodigo(1);
        cat1.setDescripcion("Bebidas");
        cat1.setDescripcionCompleta(("Bebidas (cod: 1)").toUpperCase());
        categoria.add(cat1);
        
        cat2.setCodigo(2);
        cat2.setDescripcion("Congelados");
        cat2.setDescripcionCompleta(("Congelados (cod: 2)").toUpperCase());
        categoria.add(cat2);
        
        cat3.setCodigo(3);
        cat3.setDescripcion("Lácteos");
        cat3.setDescripcionCompleta(("Lácteos (cod: 3)").toUpperCase());
        categoria.add(cat3);
        
        cat4.setCodigo(4);
        cat4.setDescripcion("Aseo");
        cat4.setDescripcionCompleta(("Aseo (cod: 4)").toUpperCase());
        categoria.add(cat4);

        return categoria;
    }
    
     public static boolean isNumeric(String cadena){
	try {
            Integer.parseInt(cadena);
            return true;
	} 
        catch (NumberFormatException e){
            System.out.println("Ingrese valor numerico correspondiente a lo solicitado...");
            return false;
	}
    }
}
