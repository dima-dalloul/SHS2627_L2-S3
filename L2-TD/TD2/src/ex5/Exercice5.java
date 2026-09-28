package ex5;

public class Exercice5 {
    public static void main(String[] args){
        System.out.println((byte) 128);
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE-1));
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE>>1));
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE>>>1));
        System.out.println(1<<3);
    }
}
