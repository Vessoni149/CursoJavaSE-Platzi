public class NamingJava {
    public static void main(String[] args) {
        //Java es sensible a mayusculas y min, no es lo mismo una variable 'nombre' que 'Nombre'.
        //Todas las variables deben comenzar con una letra, con $ o _. Nunca con numeros, por convencion.
        int cellPhonE = 32523;
        int cellPone = 324325;
        //System.out.println(CellPhone);  da error.
        System.out.println(cellPone);
        String $country = "Spain";
        String _backgroundColor = "green";
        //Otra convencion:
        //lass letras posteriores a la que inicia la variable puede ser letra, numero o $ y _
        // las constantes se escriben en MAYUSCULAS y contienen _.
        int POSITION = -5;
        int MAX_WIDTH = 9999;

        //otra convencion:
        //Escribir en camelCase. UpperCamelCase y lowerCamelCase
        //usaremos Upper para nombrar Clases, y usaremos lower para todas las otras varaibles y metodos.

    }
}
