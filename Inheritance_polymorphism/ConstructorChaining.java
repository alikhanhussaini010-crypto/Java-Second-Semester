
package Inheritance_polymorphism;

public class ConstructorChaining extends Employee {
    public static void main(String[] args) {
        
        ConstructorChaining c = new ConstructorChaining();
        
        
    }
    
    
    ConstructorChaining(){
        
        System.out.println("4: The main class constructor:");
    }
    
}


class Employee extends Teacher{
    String name1;
    Employee(){
        this("3:The overloaded constructor of employee:");
        System.out.println("3: The employee constructor:");
    }
    
    Employee(String s){
        System.out.println(s);
    }
}

class Teacher extends Student{
    String name2;
    Teacher(){
        System.out.println("2: The teacher constructor:");
    }
}

class Student{
    String name3;
        Student(){
            System.out.println("1: the student constructor:");
        }
    }
