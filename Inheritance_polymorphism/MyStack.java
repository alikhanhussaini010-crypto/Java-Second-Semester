package Inheritance_polymorphism;
import java.util.ArrayList;
public class MyStack {
    
    private ArrayList<Object> list = new ArrayList<>();
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public void push(Object o){
        list.add(o);
    }
    
    public Object pop(){
        Object o = list.get(list.size() -1);
        list.remove(list.size() -1);
        return o;
    }
    
    public Object peek(){
        return list.get(list.size()-1);
    }
    
    public int getSize(){
        return list.size();
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
    
}
