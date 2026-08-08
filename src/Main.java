import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student ID: ");
        String Student_ID = sc.next();
        // sc.nextLine();
        System.out.println("Enter full name: ");
        String Full_name = sc.nextLine();
        System.out.println("Enter the Age: ");
        int Age = sc.nextInt();
        int i = 1;
        while (i >= 1) {
            if (Age >= 15 && Age <= 35) {
                System.out.println("Age accepted");
                i = 0;
            } else {
                System.out.println("Age is invalid. Enter again: ");

                Age = sc.nextInt();
                i++;
            }
        }
        System.out.println("Enter your email:");
        String Email = sc.next();
        System.out.println("Select course: ");
        System.out.println("1. BCA");
        System.out.println("2. B.Sc Computer Science ");
        System.out.println("3. B.E/B.Tech");
        System.out.println("4. MCA");
        System.out.println("5. Other");
        System.out.println("Enter your course choice:");
        int choice = sc.nextInt();
        int j = 1;
        while (j >= 1) {
            if (choice >= 1 && choice <= 5) {
                j = 0;
            } else {
                System.out.println("Enter the choice between 1 to 5 only");
                choice = sc.nextInt();
                j++;
            }
        }
        switch (choice) {
            case 1:
                System.out.println("Course selected: BCA");
                break;
            case 2:
                System.out.println("Course selected: B.Sc Computer Science");
                break;
            case 3:
                System.out.println("Course selected: B.E/b.Tech");
                break;
            case 4:
                System.out.println("Course selected: MCA");
                break;
            case 5:
                System.out.println("Course selected: Other");
                break;
            default:
                System.out.println("Invaild course choice. Select a value from 1 to 5.");
                break;
        }
        j++;
        System.out.println("Enter semester (1-8): ");
        int semester = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter career goal: ");
        String goal = sc.nextLine();

        System.out.println("Enter Java marks: ");
        int java = sc.nextInt();
        System.out.println("Enter SQL marks: ");
        int SQL = sc.nextInt();
        System.out.println("Enter Web Technology marks: ");
        int web = sc.nextInt();
        System.out.println("Enter Aptitude marks: ");
        int apti = sc.nextInt();
        System.out.println("Enter communication marks: ");
        int communication = sc.nextInt();

        sc.close();
    }
}
