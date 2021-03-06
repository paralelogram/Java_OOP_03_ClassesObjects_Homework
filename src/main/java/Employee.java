

public class Employee {

    private String name;
    private double rate;
    private int hours;

    private static int totalHours;

    public static int getTotalHours() {
        return totalHours;
    }

    public Employee() {}

    public Employee(String name, double rate){
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, double rate, int hours){
        this.name = name;
        this.rate = rate;
        if (hours >= 0) {
        this.hours = hours;
        }
        totalHours += hours;
    }

    public String toString(){
        return "Employee`s name: " + name + ", rate: " + rate + ", hours: " + hours;
    }

    public double salary(){
        return rate * hours;
    }

    public void changeRate(double rate){
        this.rate = rate;
    }

    public double bonuses() {
        if (hours > 8 && hours <= 12) {
            return salary() + 0.25;
        }

        else if (hours > 12) {
            return salary() + 0.5;
        }
        else return 0;
    }
}
