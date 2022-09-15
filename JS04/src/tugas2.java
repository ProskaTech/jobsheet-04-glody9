//Created by 21343077_Glody Syah Rabbynawa
public class tugas2 {
    public static void main(String[]args){
        int x = 10;
        int y = 23;
        int z = 5;
        int highest;
        
        highest = (y >= x)? y:x;
        highest = (z>=highest)? z:highest;
        
         System.out.println("number 1 = "+x);
        System.out.println("number 2 = "+y);
        System.out.println("number 3 = "+z);
        System.out.println("Nilai tertingginya adalah angka = "+highest);
        
    }
}
