import java.io.*;

public class Group implements Voenkomat, Serializable {

    private static final long serialVersionUID = 1L;
    private Student[] students = new Student[10];

    public Group() {
        super();
    }

    public static Group loadGroupFromFile(WorkWithFiles workWithFiles) {
        return workWithFiles.loadGroupFromFile();
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void addStudentToTheGroup(Student student) throws AdditionalException {
        if (student == null) {
            throw new IllegalArgumentException("Nothing to add!");
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return;
            }
        }
        throw new AdditionalException();
    }

    public void addStudentToTheGroupInteractive() throws AdditionalException {
        AddInteractive addStudentViaMenu = new AddInteractive();
        addStudentToTheGroup(addStudentViaMenu.addStudentInteractive());
    }

    public Student searchBySurname(String surname) {
        for (Student student : students) {
            if (student != null && student.getSurname().equals(surname)) {
                return student;
            }
        }
        return null;
    }

    public void removeStudentFromTheGroup(int p) {
        if (p > 0 && p < students.length) {
            students[p - 1] = null;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(System.lineSeparator());
        int j = 1;
        for (Student student : students) {
            if (student != null) {
                stringBuilder.append(Integer.toString(j)).append(") ").append(student).append("\n");
                j++;
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public Student[] searchForArmy() {
        Student[] voenkom = new Student[1];
        int count = 0;
        int control = 0;
        Student[] voenkomResult = new Student[0];
        for (Student student : students) {
            if (student != null && student.getSex().equals("male") && (student.getAge() > 17)) {
                control++;
                count++;
                Student[] temp = new Student[control + 1];
                System.arraycopy(voenkom, 0, temp, 0, voenkom.length);
                temp[control - 1] = student;
                voenkom = temp;
                if (count == students.length) {
                    voenkomResult = new Student[voenkom.length - 1];
                    System.arraycopy(voenkom, 0, voenkomResult, 0, voenkom.length - 1);
                }
            } else {
                count++;
            }
            if (count == students.length - 1 && control == 0) {
                return null;
            }
        }
        return voenkomResult;
    }

    public void saveGroupToFiles(WorkWithFiles workWithFiles) {
        workWithFiles.saveGroupToFile(this);
    }
    public void saveGroupToFileSerialization(WorkWithFiles workWithFiles){
        workWithFiles.saveGroupToFileSerialization(this);
    }
    public Group loadGroupFromFileDeserialization (WorkWithFiles workWithFiles){
        return workWithFiles.loadGroupFromFileDeserialization();
    }
 }




