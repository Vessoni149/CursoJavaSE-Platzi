public class MathOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        System.out.println(Math.ceil(x));   //ceil redondea un numero decimal redondeado para arriba y devuelve un decimal.
        System.out.println(Math.floor(x));  //lo redondea hacia abajo.
        System.out.println(Math.pow(x,y));  // pow toma 2 parametros, devuelve un numero elevado a otro numero.
        System.out.println(Math.max(x,y));  //toma 2 numeros y devuelve el mayor.
        System.out.println(Math.sqrt(y));   //devuelve la raiz cuadrada.
        System.out.println(Math.atan(y));   //Devuelve la raiz cubica de un valor double
        System.out.println(Math.PI * Math.pow(y,2));        //sacamos el radio de un circulo (pi por radio al cuadrado, suponiendo que el radio es y.
        System.out.println(Math.PI * 4 + Math.pow(y,2));    //area de una esfera.
        System.out.println(4/3 * Math.PI * Math.pow(x,3));  //volumen de una esfera: cuatro tercios e pi por  radio al cubo.

        //cast:
        //a veces necesitamos cambiar el tipo de dato de una variable. Dependiendo de si queremos estimar o exactitud.
        double casosPorMes = 30.0/12.0;
        System.out.println(casosPorMes); //da 2.5
        //estimacion:
        int estimacionMensual = (int) casosPorMes;  //asi se usa el cast
        System.out.println(estimacionMensual);
        //exactitud:
        int a = 30;
        int b = 12;
        System.out.println((double) a/b);    //otro ejemplo de cast

        //existen casos de cast automaticos y casso donde si hay que ponerlo literal:

        //Conversion automatica: una varaible chica siempre va a caber en una mas grande:
        //En este orden se conveirte automatico:
        //de byte short int long float double.

        //en cambio al reves requiere un cast declarado:
        //double float long int short byte.

        //con char para algo distinto: de  byte o  short o int hacia char requiere cast declarado
        //Pero de char a int es automatico.
            //.::Conversión Automatica::.
        //byte -> short
        //short -> int
        //char -> int
        //int -> long
        //long -> float
        //float -> double

            //.::Cast Necesario::.
        //double -> float
        //float -> long
        //long -> int
        //int -> short
        //short -> byte

        //char <-> byte
        //char <-> short
        //int -> char

        //si no forzamos el casting en donde si es necesario va a dar otro resultado:
        double c = a/b;     //esto que da 2.5 nos va a dar 2 si no lo forzamos.
        System.out.println(c);

        //otro ej:
        //char si cabe en int, no hay que ejecutar cast.
        char n = '1';
        int nI = n;
        System.out.println(nI); //Como no necesita casteo da como resultado 1 pasado a entero que es el codigo 49.
        //char no cabe en short, hay que ejecutar cast
        short nS = (short) n;
        System.out.println(nS);
        //siemrpe recordar el peso en bytes de cada tipo de dato para entender esta regla.

    }
}
