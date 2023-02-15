public class IfStatement {
    public static void main(String[] args) {
      boolean isBluetoothEnabled = true;
      int fileSended = 3;
        if (isBluetoothEnabled){
            fileSended++;
            System.out.println("Archivo enviado");
        } else{
            System.out.println("encienda el bluetooth");
        }
        System.out.println(fileSended);
    }
//los ifs se pueden anidar igual que en javascript.
}
