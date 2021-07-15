package q_three;

import java.util.ArrayList;

import java.util.List;


public class Arraylist {
	public static void main(String[] args) {

		 List<Integer> list = new ArrayList<>();
       list.add(10);
       list.add(20);
       list.add(30);
       list.add(40);
       list.add(50);
       list.add(60);
       list.add(70);
       list.add(80);
       
       System.out.println(list);
       System.out.println("Before Sorting");
                 for (int i = 0; i < list.size(); i++) {
         System.out.println("the element is " + list.get(i));
     }
                 System.out.println("After reverse Sorting");  
                   for (int i = list.size() - 1; i >= 0; i--) {
           System.out.println("the element is " + list.get(i));
       }
                   
     
}
}