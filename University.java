public class University {
    private String universityName;
    private int id;

    // Cons
    public University(String name, int universityId) {
        universityName = name;
        id = universityId;
    }

    // Method to represent enrollment status
    public void enrollmentStatus() {
        System.out.println("Enrollment is open at " + universityName + " (ID: " + id + ")");
    }

    // Method to represent examination status
    public void examinationStatus() {
        System.out.println("Examinations are in progress at " + universityName + " (ID: " + id + ")");
    }

    public static void main(String[] args) {
        // Creating an object of University class
        University myUniversity = new University("My University", 123);

        myUniversity.enrollmentStatus();
        myUniversity.examinationStatus();
    }
}
