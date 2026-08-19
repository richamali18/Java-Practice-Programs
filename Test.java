

class Employee
{
    String name;
    double salary;

    Employee(String name,double salary)
    {
        this.name=name;
        this.salary=salary;

    }
    
}
class Test
{
    public static void main(String[] args) {
        
        Employee e1= new Employee("Richa",50000);
        Employee e2 = new Employee("Amit",60000);
        Employee e3 = new Employee("PRIya", 70000);

        //e1.name = "Richa";
        //e1.salary = 50000;
        //e2.name = "Amit";
        //e2.salary = 600000;
        //e1.name = "Priya";

        System.out.println(e1.name);
        System.out.println(e1.salary);
        System.out.println(e2.name);
        System.out.println(e2.salary);
        System.out.println(e3.name);
        System.out.println(e3.salary);
    }
}