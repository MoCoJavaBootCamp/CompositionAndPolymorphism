import java.util.Arrays;

public class Education {
    private String[] schools = new String[10];

    @Override
    public String toString() {
        return getSchools();
    }

    public String getSchools() {
        return Arrays.toString(this.schools);
    }

    public void setSchools(int idx, String school) {
        this.schools[idx] = school;
    }
}

/*
    1) Create an Education class and
    2) make an instance of the Education class a member of the Person class.
    3) Your education class should include a list of last 10 schools attended.
    4) Create a toString() override for both Job and Education
        that outputs the information in the class to the console.
    5) The toString() override for Person should use the
        toString() methods for the Job and Education member objects.

 */