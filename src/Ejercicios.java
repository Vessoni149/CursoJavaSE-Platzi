public class Ejercicios {
    public static void main(String[] args) {
        String mama = "Susana";
        mama = mama + " Sberna";
        int edad = 57;
        long hormigasEnELPatio = 150000000l;
        float tartasEnHeladera = 2.5f;
        double dineroEnCartera = 1529.34452435;
        System.out.println(mama + " " + edad + " " + hormigasEnELPatio + " " + tartasEnHeladera + " " +
                dineroEnCartera);


        //Ejercicio 2

        //Usando los dos tipos de casting que aprendiste (implícito y explícito), resuelve los siguientes casteos
        // indicando qué tipo es y si se está calculando estimación o exactitud.
        char c = 'z';               //conviertelo a int
        int i = 250;                //conviertelo a long y luego de long a short
        double d = 301.067;         //conviertelo a long
        int i2 = 100;                //súmale 5000.66 y conviertelo a float
        int i3 = 737;                //multiplícalo por 100 y conviertelo a byte
        double d2 = 298.638;         //divídelo entre 25 y conviertelo a long

        int c2 = c;

        long iConvertidoLong = i;
        System.out.println(c2 + " " + iConvertidoLong);
        System.out.println("iConvertidoLong es de tipo " +  ((Object)iConvertidoLong).getClass().getSimpleName());
        short corto = (short) iConvertidoLong;
        System.out.println("corto es de tipo " +  ((Object)corto).getClass().getSimpleName());
        long largo = (long) d;
        System.out.println("largo es de tipo " +  ((Object)largo).getClass().getSimpleName());
        float i2Flotante = (float) (i2 + 5000.66);
        System.out.println("i2Flotante es de tipo " +  ((Object)i2Flotante).getClass().getSimpleName());
        byte i3PasadoAByte = (byte) (i3 * 100);
        System.out.println("i3PasadoAByte es de tipo " +  ((Object)i3PasadoAByte).getClass().getSimpleName());
        long d2PasadoALong = (long) (d2 / 25);
        System.out.println("d2PasadoALong es de tipo " +  ((Object)d2PasadoALong).getClass().getSimpleName());
    }
}
