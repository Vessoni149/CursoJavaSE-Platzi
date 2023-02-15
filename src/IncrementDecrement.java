public class IncrementDecrement {
    public static void main(String[] args){
        //los operadores de asignacion (+=, -=, *=, /=, %=), incremento y decremento (++ y --)
        // funcionan igual que en js.
        //solo que los operadores de incre/decremento pueden ir como prefrijo (++i) o posfijo (i++).
        //suponiendo un juego en el que tenemos 5 vidas y podemos ganarlas y perderlas:
        int lives = 5;
        //posfijo:
        lives--;
        System.out.println(lives);
        lives++;
        System.out.println(lives);
        lives--;
        System.out.println(lives);

        //postfijo:
        //suponiendo que en el juego ganamos un gift:
        int gift = 100 + lives++;   //suma 100 + 4 y luego incrementa lives a 5.
        System.out.println(gift);
        //en el postfijo primero se accede a la variable en su valor actual (estaba en 4), se suma
        // a 100, y recien luego incrementa la variable lives. Entonces para esta suma, va a tener
        // como valor 4, pero a su vez, en otro segundo proceso la vida tambien se esta incrementando,
        // así, vida sera = 5.
        System.out.println(lives); //lives será 5.

        //prefijo:
        int gift2 = 100 + ++lives; //primero agrega un punto a lives y luego se suma a 100.
        System.out.println(gift2);

    }

}
