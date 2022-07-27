package chapterSeventeen.employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
    private String lastName;
    private String firstName;
    private String id;
    private String department;
    private double salary;


    public Employee(String lastName, String firstName, String id, String department, double salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", id='" + id + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

    class Main{
        public static void main(String[] args) {
            Employee[] employees = {
                    new Employee("Bukola", "bekes", "SA1709", "Sanition", 5000.0),
                    new Employee("Tolani", "Tuple", "TT1009", "Sanition", 80000.0),
                    new Employee("Lingo", "Lango", "LL0429", "Security", 49500.0),
                    new Employee("Yemisi", "Anobi", "SQ3309", "Side chic", 90450.00),
                    new Employee("Adewale", "Samuel", "AA3309", "Bestie", 12000.00),
                    new Employee("Love", "Alakija Agnes", "LA3309", "Prayer & Counselling", 7800.00),
                    new Employee("Florence", "AsherFlo", "LA3309", "Home Economics", 85000.00),
            };
            Map<String, List<Employee>> map = Arrays.stream(employees)
                    .collect(Collectors.groupingBy(Employee::getDepartment));

            map.forEach((dept, employeeList) -> {
                System.out.printf("%s : %s%n", dept, employeeList);
            });

//            Map<String, List<Long>> map2 = Arrays.stream(employees)
//                    .collect(Collectors.groupingBy(Employee::getDepartment);

//            map2.forEach((dept, employeeList) -> {
//                System.out.printf("%s : %s%n", dept, employeeList);
//            });


        }
    }



