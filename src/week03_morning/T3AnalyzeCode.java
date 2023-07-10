package week03_morning;

public class T3AnalyzeCode {
    public static void main(String[] args) {
        int a=8;
        int b=a--;
        /*
        int b =a:
        a--;
        
         */
        System.out.println(a);
        System.out.println("b = " + b);
        //printed a=7 but b=8
        int c=10;
        int d=c--+3;//10+3=13|next 13 is assigned to d|c to subtract 1->9
        /*
        int d = c-- + 3;
        can be written as
        int d = c + 3
        c--
         */
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        // printed c=9, and d=13
        System.out.println("------------------");
        int z = 9; // z = 8
        int y = --z * 2; // 8 * 2 = 16//in this case
        System.out.println(z); //printed 8
        System.out.println(y);//printed 16
        System.out.println("------------------");
        int k=9;
        int i=k++/2; //i=4.5 k=10
        System.out.println("i = " + i); //printed i=4
        System.out.println("k = " + k);// printed k=10

        System.out.println("------------------");
        float speed = 20.5f;

        byte num1 = (byte)speed;
        short num2 = (short)speed;
        int num3 = (int)speed; // (short)speed -> works because short is smaller than int, so it will automatically match the type
        long num4 = (long)speed;
        float num5 = speed;
        double num6 = speed;

    }
}
