import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int response = 0;
        do {
            System.out.println("Selecciona el número de la opcion deseada.");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Salir");
            //Scaner capta los eventos del teclado.
            Scanner sc = new Scanner(System.in); //System.in define la entrada de datos.
            response = Integer.valueOf(sc.nextLine());
            switch (response) {
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Selecciona una opcion correcta");
            }
        } while (response != 0);
        System.out.println("se termino el programa");
    }
    //Si en consola escribimos los numeros 1 2 y 0 recibiremos distintas respuestas.
}
