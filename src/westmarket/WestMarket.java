package westmarket;

import java.util.Scanner;

public class WestMarket {
    public static void main(String[] args) {
        
    }
    
    public void menu(){
        String opcion = new String();
        while(opcion.isEmpty()){
            System.out.println("OPCION: ");
            Scanner op = new Scanner(System.in);
            opcion = (op.nextLine()).trim();

            if(opcion.isEmpty()){
                System.out.println("FAVOR SELECCIONAR UNA OPCION\n");
            }
            else if(opcion.equals("1")){
                registrarProducto();
            }
            else if(opcion.equals("2")){
                imprimirListadoSimple();
            }
            else if(opcion.equals("3")){
                eliminarProducto();
            }  
            else if(opcion.equals("4")){
                salir();
            }  
        }
    }
    
    public void registrarProducto(){
        
    }
    
    public void imprimirListado(){
        
    }
    
    public void imprimirListadoSimple(){
        
    }
    
    public void eliminarProducto(){
        
    }
    
    public void salir(){
        
    }
}
