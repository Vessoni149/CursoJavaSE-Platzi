public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        double area = circleArea(y);
        double volumen = sphereVolumen(y);
        System.out.println(area);
        System.out.println(volumen);
        System.out.println(converToDolar(200, "COP"));
    }
    //las funciones deben declararse a nivel de clase, fuera de metodos.
    //static es para los metodos que comparten el metodo main
    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereVolumen(double r){
        return 4/3 * Math.PI * Math.pow(r,3);
    }
/**
 *Comentando asi generamos javadoc.
 *Se pueden usar etiquetas html para que se vea mejor
 * ej: si ponemos esto arriba de una funcion:
 * <ul>
 *     <li>un elemento</li>
 *     <li>otro elemento</li>
 *     <li>ultimo elemento</li>
 * </ul>
 */
    /**
     * Descripción: Funcion que especificando su moneca convierte una cantidad de dinero a dolares.
     * <ul>
     *  *     <li>un elemento</li>
     *  *     <li>otro elemento</li>
     *  *     <li>ultimo elemento</li>
     *  * </ul>
     * @param quantity Cantidad de dinero (double).
     * @param currency Tipo de moneda: solo acepta peso mexicano y colombiano.
     * @return quantity Devuelve la cantidad actualizada en dolares.
     */
    public static double converToDolar(double quantity, String currency) {
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
