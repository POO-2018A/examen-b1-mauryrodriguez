
package examen;
import java.util.Scanner;

public class Examen {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        
        
        do {            
            System.out.println("1. Ingresar los datos del libro");
            System.out.println("2. Imprimir los libros");
            System.out.println("3. Contar libros del autor");
            System.out.println("4. Salir");
            opcion = scan.nextInt();
            switch (opcion){
            case 1:
                
                Libro [] libros = new Libro [10];
                for (int i = 0; i < libros.length; i++) {
                   
                    System.out.println("Ingrese los datos del LIBRO " + (i+1));
                    System.out.println();
                    System.out.println("Titulo: ");
                    String titulo = scan.nextLine();

                    System.out.println("Autor: ");
                    String autor = scan.nextLine();
                
                    System.out.println("Pais del autor "+(i+1)+": ");
                    String paisAutor=scan.nextLine();
                
                    System.out.println("Año del libro: ");
                    int edad = scan.nextInt();
                

                    System.out.println("Ingrese las publicaciones mas recientes");

        
                    Autor publicaciones[] = new Autor[2];

                    for (int j = 0; j < publicaciones.length; j++) {
                    System.out.println("Publicaccion " + (j + 1));
                    scan.nextLine();
                    System.out.println("Nombre de publicacion "+(j+1)+": ");
                    String nombreAutor = scan.nextLine();

                    System.out.println("Año de la publicacion"+(j+1)+": ");
                    String pais = scan.nextLine();

                    publicaciones[j] = new Autor(nombreAutor, pais);;
                }
                
        } 
                System.out.println();
                System.out.println();
                break;
                
            case 2:
                System.out.println();
                System.out.println("Ud a seleccionado la OPCION IMPRIMIR");
                System.out.println("LIBROS FAVORITOS");
                System.out.println();
                System.out.println();
                break;
            case 3:
                System.out.println();
                System.out.println("UD A SELECCIONADO");
                System.out.println("CONTAR LIBROS DE AUTOR");
                System.out.println();
                break;
            case 4:          
                System.out.println("ADIOS !!!!!");
                break;
            default :
                System.out.println("OPCION NO VALIDA !!");
                System.out.println();
                break;
        }
        } while (opcion !=4);
    
   }
           
}
    

