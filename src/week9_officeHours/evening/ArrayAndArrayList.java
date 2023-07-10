package week9_officeHours.evening;

import java.util.ArrayList;

public class ArrayAndArrayList {
    public static void main(String[] args) {
        int [] array=new int[5];
        array[0]=10;

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        System.out.println("length of array: "+ array.length);//5
        System.out.println("length of arrayList :" + arrayList.size());//1

        array[1] =20;
        arrayList.add(20);
        System.out.println("length of array: "+ array.length);//5
        System.out.println("length of arrayList :" + arrayList.size());//2

        array[1]=0;//i am deleting only value
        arrayList.remove(1);//here we changing size
        System.out.println("length of array: "+ array.length);//5
        System.out.println("length of arrayList :" + arrayList.size());//1






    }






}
