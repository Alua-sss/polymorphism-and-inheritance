import java.util.*;

public class MyApplication {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Samal", "Makashova", "Manager", 270450.78);
        Employee emp2 = new Employee("Tolkynay", "Yelemes", "Teacher", 500000.00);

        Student stu1 = new Student("Alua", "Sagyndyk", 1.98);
        Student stu2 = new Student("Altynai", "Bolatova", 3.78);

        ArrayList<Payable> people = new ArrayList<>();
        people.add(emp1);
        people.add(emp2);
        people.add(stu1);
        people.add(stu2);

        Collections.sort(people, Comparator.comparingDouble(Payable::getPaymentAmount));

        printData(people);
    }

    public static void printData(Iterable<Payable> payables) {
        for (Payable payable : payables) {
            String type = (payable instanceof Employee) ? "Employee" : "Student";
            System.out.printf("%s: %s earns %.2f tenge%n", type, payable.toString(), payable.getPaymentAmount());
        }
    }
}