package westmarket;

import java.util.Scanner;

public class WestMarket {
    public static void main(String[] args) {
        
    }
    
    public void menu(){
        System.out.println("*********************************************************************");
        System.out.println("BIENVENIDO, PARA CONTINUAR SELECCIONE UNA DE LAS SIGUIENTES OPCIONES...\n");
        System.out.println("*********************************************************************");
        System.out.println("1- REGISTRAR CLIENTE \n2- VER DATOS DE CLIENTES \n3- DEPOSITAR \n4- SALIR");
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
                registrarProducto();
            }
            else if(opcion.equals("2")){
                imprimirListado();
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
        imprimirListadoSimple();
    }
    
    public void salir(){
        
    }
}
