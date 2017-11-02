import java.io.Serializable;

public class Student extends Human implements Serializable {

    private static final long serialVersionUID = 1L;

    private String faculty;
    private int course;

    public Student(String name, String surname, int age, String sex, int growth, int weight, String faculty, int course) {
        super(name, surname, age, sex, growth, weight);
        this.faculty = faculty;
        this.course = course;
    }

    public Student(){
        super();
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.getName() != null) {
            stringBuilder.append(this.getName() + " " + this.getSurname() + " (" + this.getSex() + ", age is " + this.getAge() + ", growth is " + this.getGrowth() + " sm, weight is " + this.getWeight() + " kg). This student is in ");
            if (this.getSex().equals("male")) {
                stringBuilder.append("his ");
            } else {
                stringBuilder.append("her ");
            }
            stringBuilder.append(this.getCourse());
            if (this.getCourse() == 1) {
                stringBuilder.append("-st");
            }
            if (this.getCourse() == 2) {
                stringBuilder.append("-nd");
            }
            if (this.getCourse() == 3) {
                stringBuilder.append("-rd");
            }
            if (this.getCourse() == 4 || this.getCourse() == 5) {
                stringBuilder.append("-th");
            }
            stringBuilder.append(" year of the faculty of " + this.getFaculty() + "s.");
        }
//        stringBuilder.append(System.lineSeparator());
        return stringBuilder.toString();
    }
}
