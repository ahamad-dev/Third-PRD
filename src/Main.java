import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student ID: ");
        String Student_ID = sc.next();
        sc.nextLine();
        System.out.println("Enter full name: ");
        String Full_name = sc.nextLine();
        int Age = sc.nextInt();
        String Email = sc.next();
        System.out.println("Select course: ");
        System.out.println("1. BCA");
        System.out.println("2. B.Sc Computer Science ");
        System.out.println("3. B.E/B.Tech");
        System.out.println("4. MCA");
        System.out.println("5. Other");
        System.out.println("Enter your course choice:");
        int choice = sc.nextInt();
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

        System.out.println("Enter semester (1-8): ");
        int semester = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter career goal: ");
        String goal = sc.nextLine();

        sc.close();
    }
}
