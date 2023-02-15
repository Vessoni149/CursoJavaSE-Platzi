public class WhileLoop {
    static boolean isTurnOnLight = false;


    public static void main(String[] args) {
        isIsTurnOffLight();
        int i = 1;
        while (isTurnOnLight && i <= 10){
            printSOS();
            i++;
        }
    }
    public static void printSOS(){
        System.out.println("... ___ ...");
    }
    public static boolean isIsTurnOffLight(){
        //sintaxis alternativa para if, else:
        //isTurnOnLight = (condicion)?valorIf:valorElse;
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;
    }
}
