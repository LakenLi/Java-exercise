package arrayList;

import java.util.*;

import abstractClasses.Employee;


public class ArrayListTest
{
    public static void main(String[] args)
    {
        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new Employee("Carl Cracker", 59000, 1987, 12, 12));
        staff.add(new Employee("Carl Cracker12", 59000, 1987, 12, 12));

        for(Employee e : staff){
            e.raiseSalary(5);
        }

        for(Employee e : staff){
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary() + ", hireDay=" + e.getHireDay());
        }
    }
}