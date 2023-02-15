public class Arrays {
    public static void main(String[] args) {
        //por convencion, los arreglos deben tener nombre en plural.
        //los espacios de los arreglos no se pueden redefinir, si aca ponemos 17 luego no podemos restarle o sumarle espacios.
        String[] androidVersions = new String[17];
        //otra sintaxis posible:
        int days[] = new int[7];
        //array de 2 dimensiones (miremoslo como una tabla, el primer elemento el sa fila y el segundo la columna):
        String[][] cities = new String[4][2];
        //arrai de 3 dimensiones (fila, columna, dimension:
        int [][][] numbers = new int [2][2][2];
        int [][][][] numbers4 = new int [2][2][2][2];

        //asi se declaran los valores:
        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";
        //así se accede:
        for (int i = 0; i <= androidVersions.length -1 ; i++) {
            System.out.println(androidVersions[i]);
            //si los valores del arrai son Strings las variables no definidas van a ser null.
            //una variable String no inicializada por defecto es null.
        }
        //en la condicion tambien podriamos poner i < androidVersions.length.
        System.out.println();
        for (int i = 0; i < days.length ; i++) {
            System.out.println(days[i]);
            //si los valores del arrai son int las variables no definidas van a ser 0 por defecto.
            //una variable int no inicializada por defecto es 0.
        }
    //foreach: androidVersion es cada inice del arrai
        for (String androidVersion : androidVersions) {
            System.out.println(androidVersion);
        }

//salto de linea en consola:
        System.out.println();
        System.out.println("recorriendo arrai cities manualmente:");
        cities[0][0] = "Colombia";
        cities[0][1] = "Medellín";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "México";
        cities[3][1] = "CDMX";
        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);
        System.out.println();
        System.out.println("recorriendo arrai cities on bucle for");
        //para recorrer un arrai de 2 dimensiones se usan 2 ciclos for:
        for (int i = 0; i < cities.length; i++) {   //i reprensentaran las filas
            for (int j = 0; j < cities[i].length; j++) {    //j represneta las columnas
                System.out.println(cities[i][j]);
            }
        }
        System.out.println("recorriendo arrai cities con bucle foreach:");
        //primero hacemos referencia a que recorra un arrai[pais,ciudad]
        for (String []par: cities) {
            for (String name : par) {   //luego hacemos referencia al dato dentro de cada elemento del arrai.
                System.out.println(name);
            }
        }

        //imaginemos que tenemos un arrai de 4 dimensiones, pensemoslo como una mamushka de arrais
        //tenemos 2 posiciones iniciales, 0 y 1, dentro de la fila 1, columna 0, tenemos otro arrai,
        // con sus filas y col., dentro de ese arrai en la posicion fila 0, col 1 esta nuestro dato.
        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";
        System.out.println();
        //System.out.println(animals[1][0][0][1]);

        //reccorer arrai de 4 dimensiones:
        for (int i = 0; i <=1 ; i++) {
            for (int j = 0; j <=0 ; j++) {
                for (int k = 0; k <=0 ; k++) {
                    for (int l = 0; l <=1; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }

                }

            }
            byte i = 1; byte j = 1; byte k = (byte) (i+j);

        }
    }
}
