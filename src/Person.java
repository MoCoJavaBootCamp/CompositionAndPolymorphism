public class Person {
    //composition has-a relationship
    private Job job;
    private Education education;

    public Person(){
        this.job = new Job();
        job.setSalary(1000L);
        this.education = new Education();
        education.setSchools(0, "School 1");
        education.setSchools(1, "School 2");
    }

    public String getRole() {
        return job.getRole();
    }

    public void setRole(String role) {
        job.setRole(role);
    }

    public int getId() {
        return job.getId();
    }

    public void setId(int id) {
        job.setId(id);
    }

    public long getSalary() {
        return job.getSalary();
    }

    public void setSalary(long salary) {
        job.setSalary(salary);
    }

    public String getSchools() {
        return education.getSchools();
    }

    public void setSchools(int idx, String school) {
        education.setSchools(idx, school);
    }

    @Override
    public String toString() {
        return String.format("Job: %s\n" +
                "Education: %s",
                job.toString(), education.toString());
    }
}