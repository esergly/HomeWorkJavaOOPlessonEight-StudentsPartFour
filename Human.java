import java.io.Serializable;

public class Human implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String surname;
    private int age;
    private String sex;
    private int growth;
    private int weight;


    public Human(String name, String surname, int age, String sex, int growth, int weight) {
        super();
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.growth = growth;
        this.weight = weight;
    }

    public Human() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String name) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.getName() != null) {
            stringBuilder.append("The " + this.getSex() + " " + this.getName() + " " + this.getSurname() + "'s age is " + this.getAge() + ", growth is " + this.getGrowth() + " sm and weight is " + this.getWeight() + " kg.");
        }
        return stringBuilder.toString();
    }
}