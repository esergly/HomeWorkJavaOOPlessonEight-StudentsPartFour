import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Group genius = new Group();
        try {
            genius.addStudentToTheGroup(new Student("John", "Bell", 21, "male", 181, 75, "Finance", 5));
            genius.addStudentToTheGroup(new Student("Jane", "Carroll", 18, "female", 170, 48, "Mathematic", 2));
            genius.addStudentToTheGroup(new Student("Anna", "Smith", 19, "female", 174, 50, "Logic", 3));
            genius.addStudentToTheGroup(new Student("Nick", "Tompson", 22, "male", 178, 72, "Politic", 5));
            genius.addStudentToTheGroup(new Student("Kate", "Blange", 20, "female", 168, 78, "Finance", 5));
            genius.addStudentToTheGroup(new Student("Ben", "Bull", 17, "male", 181, 70, "Mathematic", 1));
            genius.addStudentToTheGroup(new Student("Chris", "Peterson", 21, "male", 190, 92, "Logic", 5));
            genius.addStudentToTheGroup(new Student("Diane", "Holsson", 20, "female", 172, 46, "Politic", 2));
            genius.addStudentToTheGroup(new Student("George", "Klarkson", 17, "male", 178, 80, "Mathematic", 4));//
//            genius.addStudentToTheGroup(new Student("Pitt", "Erwin", 18, "male", 181, 85, "Logic", 5));

//          Add students via menu
            genius.addStudentToTheGroupInteractive();

//          Add new student in to the Group when is not free space there (exception test)
//            genius.addStudentToTheGroup(new Student("Paula", "Kotlin", 22, "female", 171, 47.3,"Politic", 3));

        } catch (AdditionalException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }

//        genius.saveGroupToFiles(new GroupFiles("Genius.txt"));

//        Group testGroup = Group.loadGroupFromFile(new GroupFiles("Genius.txt"));
//        System.out.println(testGroup);

//        Methods from previous tasks for tests (search, remove)
//        System.out.println(genius.searchBySurname("Smith"));
//        System.out.println(genius.searchBySurname("Tompson"));
//        System.out.println(genius.searchBySurname("Kennedy"));
//        genius.removeStudentFromTheGroup(4);

//        Methods for voenkomat (search students which are male and more than 17 years old)
//        System.out.println(Arrays.toString(genius.searchForArmy()));

//        Sort by parameters
//        System.out.println(SortByParameter.SortGroup.sort(genius));

//        Serialization and Deserialization for Group
        genius.saveGroupToFileSerialization(new GroupFiles("group.db"));
        Group geniusCopy = genius.loadGroupFromFileDeserialization(new GroupFiles("group.db"));

        System.out.println(genius);
        System.out.println("*********************************************************************************");
        System.out.println(geniusCopy);
    }
}
