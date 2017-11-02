import java.io.*;

public class GroupFiles implements WorkWithFiles, Serializable {
    private static final long serialVersionUID = 1L;
    private String filePathWay;

    public GroupFiles() {
        super();
    }

    public GroupFiles(String filePathWay) {
        super();
        this.filePathWay = filePathWay;
    }

    public String getFilePathWay() {
        return filePathWay;
    }

    public void setFilePathWay(String filePathWay) {
        this.filePathWay = filePathWay;
    }

    @Override
    public String toString() {
        return "Filepathway is " + this.filePathWay + '\'' + "}";
    }

    @Override
    public void saveGroupToFile(Group group) {
        try (PrintWriter printWriter = new PrintWriter(this.filePathWay)) {
            for (Student student : group.getStudents()) {
                if (student != null) {
                    printWriter.println(student.getName() + "\t" + student.getSurname() + "\t" + student.getAge() + "\t" + student.getSex() + "\t" + student.getGrowth() + "\t" + student.getWeight() + "\t" + student.getFaculty() + "\t" + student.getCourse());
                }
            }

        } catch (IOException ex) {
            System.out.println(ex.fillInStackTrace());
        }
    }

    @Override
    public Group loadGroupFromFile() {
        Group groupReadFromFile = new Group();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.filePathWay));
            String inputfromfile = "";
            for (; (inputfromfile = bufferedReader.readLine()) != null; ) {
                String[] arraysfromsfiletring = inputfromfile.split("\t");
                String name = arraysfromsfiletring[0];
                String surname = arraysfromsfiletring[1];
                int age = Integer.valueOf(arraysfromsfiletring[2]);
                String sex = arraysfromsfiletring[3];
                int growth = Integer.valueOf(arraysfromsfiletring[4]);
                int weight = Integer.valueOf(arraysfromsfiletring[5]);
                String faculty = arraysfromsfiletring[6];
                int course = Integer.valueOf(arraysfromsfiletring[7]);

                Student student = new Student(name, surname, age, sex, growth, weight, faculty, course);
                groupReadFromFile.addStudentToTheGroup(student);
            }
        } catch (IOException | AdditionalException ex) {
            System.out.println(ex.fillInStackTrace());
        }
        return groupReadFromFile;
    }

    @Override
    public void saveGroupToFileSerialization(Group group) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePathWay))) {
            objectOutputStream.writeObject(group);
        } catch (IOException ex) {
            System.out.println("ERROR save group !!!");
        }
    }

    @Override
    public Group loadGroupFromFileDeserialization() {
        Group groupCreatedFromDatabaseFile = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePathWay))) {
            groupCreatedFromDatabaseFile = (Group) objectInputStream.readObject();
            return groupCreatedFromDatabaseFile;
        } catch (IOException |
                ClassNotFoundException ex) {
            System.out.println("ERROR to read groups database file.");
        }
        return null;
    }

}

