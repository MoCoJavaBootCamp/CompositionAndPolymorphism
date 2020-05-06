public class Job {
    private String role;
    private long salary;
    private int id;
    
    @Override
    public String toString() {
        return String.format("The role of %s (ID: %d) has a salary of $%d.",
                this.getRole(), this.getId(), this.getSalary());
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}