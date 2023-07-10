package week10_officeHours.evening.task2;

public class Encryption {
    public String message;
    public int modifyNumber;
    public int factorNumber;
    //windows alt+insert

    public Encryption(String message) {
        this.message = message;
    }



    public Encryption(String message, int modifyNumber, int factorNumber) {
        this(message);
        this.modifyNumber = modifyNumber;
        this.factorNumber = factorNumber;
        encrypt();//shortcut for creating method alt+enter
    }
    public void encrypt(){
        String encrypted="";
        for ( char c : message.toCharArray()){
            int result=(c+modifyNumber)*factorNumber;
            encrypted+=result+" ";
        }
        System.out.println(encrypted.trim());
    }

    public static String decrypt(String message, int modifyNumber, int factorNumber){
        String decrypted="";
        for (String s : message.split(" ")) {
            int dec=Integer.parseInt(s);
            char ch=(char)(dec/factorNumber-modifyNumber);
            decrypted+=ch;
        }
        return decrypted;
    }
}
