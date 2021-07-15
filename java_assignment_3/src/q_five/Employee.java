package q_five;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Employee implements Comparable<Employee> {

    String name;
    int id;

    public Employee( int id,String name) {
    	 this.id = id;
    	 this.name = name;
       
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee Employee = (Employee) o;
        return id == Employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Employee that) {
        return this.id - that.id;
    }


	  public static void main(String[] args) {

	        Set<Employee> EmployeeSet = new HashSet<>();

	        EmployeeSet.add(new Employee(01,"Anuj"));
	        EmployeeSet.add(new Employee(02,"Ramesh"));
	        EmployeeSet.add(new Employee(03,"Shivam"));


	        
	        
	        System.out.println(EmployeeSet);

	            
}
}