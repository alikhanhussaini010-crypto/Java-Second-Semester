
package Inheritance_polymorphism;

public class Exercise_11_8_4 {
    public static void main(String[] args) {
        
        Integer[] list1 = {12,34,56,67};
        Double[] list2 = {12.4,45.6,67.8};
        int[] list3 = {1,2,3};
        
        printArray(list1);
        System.out.println("----------------------------------");
        printArray(list2);
        
        
    }
    
    public static void printArray(Object[] list){
        for(Object o : list){
            System.out.print(o+"  ");
            System.out.println("");
        }
    }
    
}
