package inheritance;

/**
 * 
 */
public class ManagerTest
{
    public static void main(String[] args)
    {
        // construct a Manager object
        Manager boss = new Manager("HoRan", 80000, 2019, 6, 20);
        boss.setBouns(5000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Harry", 50000, 2019, 6, 20);
        staff[2] = new Employee("Tommy", 40000, 2019, 6, 20);

        for(Employee e : staff){
            System.out.println("name:" + e.getName() + ", salary:" + e.getSalary());
        }
    }
}