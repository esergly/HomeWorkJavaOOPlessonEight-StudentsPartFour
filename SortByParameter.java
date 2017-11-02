import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public abstract class SortByParameter implements Comparator {
    public static class SortGroup {
        public static void sortMethodName(Group group) {
            Arrays.sort(group.getStudents(),
                    (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b)
                            : a.getName().compareTo(b.getName()));
        }

        public static void sortMethodSurame(Group group) {
            Arrays.sort(group.getStudents(),
                    (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b)
                            : a.getSurname().compareTo(b.getSurname()));
        }

        public static void sortMethodAge(Group group) {
            Arrays.sort(group.getStudents(),
                    (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b)
                            : a.getAge() - b.getAge());
        }

        public static void sortMethodSex(Group group) {
            Arrays.sort(group.getStudents(),
                    (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b)
                            : a.getSex().compareTo(b.getSex()));
        }

        public static void sortMethodGrowth(Group group) {
            Arrays.sort(group.getStudents(),
                    (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b)
                            : a.getGrowth() - b.getGrowth());
        }

        public static void sortMethodWeight(Group group) {
            Arrays.sort(group.getStudents(),
                    (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b)
                            : a.getWeight() - b.getWeight());
        }

        public static void sortMethodFaculty(Group group) {
            Arrays.sort(group.getStudents(),
                    (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b)
                            : a.getFaculty().compareTo(b.getFaculty()));
        }

        public static void sortMethodCourse(Group group) {
            Arrays.sort(group.getStudents(),
                    (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b)
                            : a.getCourse() - b.getCourse());
        }

        public static Group sort(Group group) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Sort group by"+"\n"+"1 or name"+"\n"+"2 or surname"+"\n"+"3 or age"+"\n"+"4 or sex"+"\n"+"5 or growth"+"\n"+"6 or weight"+"\n"+"7 or faculty"+"\n"+"8 or course");
            String sortMethod = bufferedReader.readLine();

            if (sortMethod.equalsIgnoreCase("name") || sortMethod.equalsIgnoreCase("1")) {
                sortMethodName(group);
            }
            if (sortMethod.equalsIgnoreCase("surname") || sortMethod.equalsIgnoreCase("2")) {
                sortMethodSurame(group);
            }
            if (sortMethod.equalsIgnoreCase("age") || sortMethod.equalsIgnoreCase("3")) {
                sortMethodAge(group);
            }
            if (sortMethod.equalsIgnoreCase("sex") || sortMethod.equalsIgnoreCase("4")) {
                sortMethodSex(group);
            }
            if (sortMethod.equalsIgnoreCase("growth") || sortMethod.equalsIgnoreCase("5")) {
                sortMethodGrowth(group);
            }
            if (sortMethod.equalsIgnoreCase("weight") || sortMethod.equalsIgnoreCase("6")) {
                sortMethodWeight(group);
            }
            if (sortMethod.equalsIgnoreCase("faculty") || sortMethod.equalsIgnoreCase("7")) {
                sortMethodFaculty(group);
            }
            if (sortMethod.equalsIgnoreCase("course") || sortMethod.equalsIgnoreCase("8")) {
                sortMethodCourse(group);
            }
            return group;
        }
    }
}

