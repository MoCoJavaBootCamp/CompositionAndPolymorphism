public class CompositionBasics {
    public static void main(String[] args) {
        Person bobby = new Person();
        bobby.setRole("Software Engineer");
        bobby.setId(1511331020);
        System.out.println("Bobby's salary: $" + bobby.getSalary());
        bobby.setSalary(150000);
        System.out.println("Bobby's salary: $" + bobby.getSalary());
        System.out.println("Bobby's schools:\n" + bobby.getSchools());
        bobby.setSchools(2, "School 3");
        bobby.setSchools(3, "School 4");
        System.out.println("Bobby's schools:\n" + bobby.getSchools());
        System.out.println("Bobby toString:\n" + bobby.toString());
    }
}