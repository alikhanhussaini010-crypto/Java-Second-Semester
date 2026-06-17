
package Inheritance_polymorphism;

public class MyStackTest {
    public static void main(String[] args) {
        
        MyStack list = new MyStack();
        
        list.push("String1");
        list.push("String2");
        list.push("String3");
        list.push("String4");
        list.push("String5");
        
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.peek());
        System.out.println(list.peek());
        System.out.println(list.toString());
        
    }
    
}
