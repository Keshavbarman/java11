public class Employee {
    private
    private int empId;
    private String empName;
    private double empSalary;

    // Constructor
    public Employee(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    // Method to calculate bonus
    private double calculateBonus() {
        double bonusPercentage = (empSalary > 25000) ? 0.05 : 0.02;
        return empSalary * bonusPercentage;
    }

    // Method to calculate net salary
    public double calculateNetSalary() {
        return empSalary + calculateBonus();
    }

    // Method to display employee information
    public void displayInfo() {
        double bonus = calculateBonus();
        double netSalary = calculateNetSalary();

        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Net Salary: " + netSalary);
    }

    // Example usage
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Keshav Kumar", 30000);
        emp1.displayInfo();
    }
}
