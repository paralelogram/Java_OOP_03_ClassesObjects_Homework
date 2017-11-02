
    public class EmployeeTest {
        public static void main(String [] args) {
            Employee[] dudes = new Employee[3];
            Employee e1 = new Employee();
            Employee e2 = new Employee("octopus", 1.3, 12);
            Employee e3 = new Employee("victor", 1);
            Employee e4 = new Employee("octopus", 1.3, 16);

            e1.changeRate(2);

            System.out.println(e2.toString());

            System.out.printf( "Salary = %4.2f \n", e2.salary());
            System.out.printf("Salary with bonuses = %4.2f \n", e2.bonuses());
            System.out.printf("Salary with bonuses = %4.2f \n", e4.bonuses());

            System.out.println("total hours = " + Employee.getTotalHours());

        }
}
