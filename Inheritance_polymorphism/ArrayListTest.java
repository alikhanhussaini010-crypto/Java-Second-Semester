
package Inheritance_polymorphism;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListTest {
    public static void main(String[] args) {
        
        ArrayList<String> cityList = new  ArrayList();
        cityList.add("Kabul");
        cityList.add("Herat");
        cityList.add("Maidan");
        cityList.add("Ghazni");
        cityList.add("Ghor");
        cityList.add("Bamyon");
 
        String[] name = new String[cityList.size()];
        cityList.toArray(name);
        for(String na : name){
            System.out.println(na);
        }
        
        System.out.println(cityList.size());
        System.out.println(cityList.getFirst());
        System.out.println(cityList.getLast());
        Collections.shuffle(cityList);
        
        System.out.println(cityList);
        
    }
    
}
