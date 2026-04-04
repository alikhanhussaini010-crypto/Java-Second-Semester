
package Chapater7Problems;

public class TestArrayArguments {
    public static void main(String[] args){
        
        int x = 1;
        int[] y = new int[10];
        
        m(x, y);
        
        System.out.println("x is "+ x);
        System.out.println("y is "+ y[0]);
        
    }
    
    public static void m(int number, int[] numbers){
        number = 10;
        numbers[0] = 5555;
    }
    
}
