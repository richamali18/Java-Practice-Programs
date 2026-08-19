

class Employee
{
    private String name;
    private double salary;

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setSalary(double salary)
    {
        if(salary >= 0)
    {
        this.salary = salary;
    }
}

    public double getSalary()
    {
        return salary;
    }
    
}
class TEst2
{
    public static void main(String[] args) {
        
        Employee e1= new Employee();
        
        e1.setName("Richa");
        e1.setSalary(50000);
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
        
        
    }
}