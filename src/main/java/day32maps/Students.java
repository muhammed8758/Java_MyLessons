package day32maps;

public class Students {


    public String name;
    public String email;
    public int ages;
    public boolean success;

    public Students(String name, String email, int ages, boolean success) {
        this.name = name;
        this.email = email;
        this.ages = ages;
        this.success = success;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", ages=" + ages +
                ", success=" + success +
                '}';
    }
}
