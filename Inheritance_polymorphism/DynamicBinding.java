
package Inheritance_polymorphism;

public class DynamicBinding {
    
    public static void main(String[] args) {
        
        display(new GraduateStudent());
        display(new Student2());
        display(new Person2());
        display(new Object());
        
    }
    
  
    public static void display(Object x){
        System.out.println(x.toString());
    }
    
}



class GraduateStudent extends Student2{
    
}

class Student2 extends Person2{
    @Override
    public String toString(){
        return "student";
    }
}

class Person2 extends Object{
    @Override
    public String toString(){
        return "Person";
    }
}
