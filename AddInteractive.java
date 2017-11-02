import javax.swing.*;

public class AddInteractive {
    public Student addStudentInteractive() throws AdditionalException {
        try {
            String name = String.valueOf(JOptionPane.showInputDialog("Input name: "));
            String surname = String.valueOf(JOptionPane.showInputDialog("Input surname: "));
            int age = Integer.valueOf(JOptionPane.showInputDialog("Input age as number of full years: "));
            String sex = String.valueOf(JOptionPane.showInputDialog("Input sex (male or female): "));
            int growth = Integer.valueOf(JOptionPane.showInputDialog("Input growth in sm: "));
            int weight = Integer.valueOf(JOptionPane.showInputDialog("Input weight in kg: "));
            String faculty = String.valueOf(JOptionPane.showInputDialog("Input faculty: "));
            int course = Integer.valueOf(JOptionPane.showInputDialog("Input course: "));
            if (name.isEmpty() || surname.isEmpty() || faculty.isEmpty() || sex.isEmpty()) {
                return null;
            }
            if (!sex.equals("male")) {
                if (!sex.equals("female")) {
                    return null;
                }
            }
            if (age < 14 || growth < 80 || growth > 250 || weight < 40 || course < 1 || course > 5) {
                return null;
            }
            return new Student(name, surname, age, sex, growth, weight, faculty, course);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "You've pressed cancel");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error number format"); //Microsoft style
        }
        return null;
    }
}