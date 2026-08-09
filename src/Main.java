import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        // FR-02: Student Profile

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter student ID: ");
            String Student_ID = sc.next();
            sc.nextLine();
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
            double Base_semester_fee = 0;
            switch (choice) {
                case 1:
                    System.out.println("Course selected: BCA");
                    Base_semester_fee = 35000;
                    break;
                case 2:
                    System.out.println("Course selected: B.Sc Computer Science");
                    Base_semester_fee = 30000;
                    break;
                case 3:
                    System.out.println("Course selected: B.E/b.Tech");
                    Base_semester_fee = 50000;
                    break;
                case 4:
                    System.out.println("Course selected: MCA");
                    Base_semester_fee = 45000;
                    break;
                case 5:
                    System.out.println("Course selected: Other");
                    Base_semester_fee = 25000;
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

            // FR-03: Subject Marks

            System.out.println("Enter Java marks: ");
            int java = sc.nextInt();
            j++;
            while (j >= 1) {

                if (java >= 0 && java <= 100) {
                    System.out.println("Java marks Accepted");
                    j = 0;
                } else {
                    System.out.println("Invalid marks. Enter a value between 0 and 100.");
                    java = sc.nextInt();
                    j++;
                }
            }
            j++;
            System.out.println("Enter SQL marks: ");
            int SQL = sc.nextInt();
            ;
            while (j >= 1) {

                if (SQL >= 0 && SQL <= 100) {
                    System.out.println("SQL marks Accepted");
                    j = 0;
                } else {
                    System.out.println("Invalid marks. Enter a value between 0 and 100.");
                    SQL = sc.nextInt();
                    j++;
                }
            }
            j++;
            System.out.println("Enter Web Technology marks: ");
            int web = sc.nextInt();
            ;
            while (j >= 1) {

                if (web >= 0 && web <= 100) {
                    System.out.println("web marks Accepted");
                    j = 0;
                } else {
                    System.out.println("Invalid marks. Enter a value between 0 and 100.");
                    web = sc.nextInt();
                    j++;
                }
            }
            System.out.println("Enter Aptitude marks: ");
            j++;
            int apti = sc.nextInt();
            while (j >= 1) {

                if (apti >= 0 && apti <= 100) {
                    System.out.println("apti marks Accepted");
                    j = 0;
                } else {
                    System.out.println("Invalid marks. Enter a value between 0 and 100.");
                    apti = sc.nextInt();
                    j++;
                }
            }
            j++;
            System.out.println("Enter communication marks: ");
            int communication = sc.nextInt();
            while (j >= 1) {
                if (communication >= 0 && communication <= 100) {
                    System.out.println("Communication marks Accepted");
                    j = 0;
                } else {
                    System.out.println("Invalid marks. Enter a value between 0 and 100.");
                    communication = sc.nextInt();
                    j++;
                }
            }

            // FR-04: Total and Percentage

            int total_marks = java + SQL + web + apti + communication;

            double percentage = (double) total_marks / 5;

            // FR-05: Subject and Academic Result
            boolean academic = java >= 35 && SQL >= 35 && web >= 35 && apti >= 35 && communication >= 35
                    && percentage >= 40;
            String academic_status = (academic) ? "PASSED" : "FAILD";
            /*
             * if (academic) {
             * System.out.println("PASSED");
             * } else {
             * System.out.println((java <= 35 ? "You Faild in java" : ""));
             * System.out.println((SQL <= 35 ? "You Faild in SQL" : ""));
             * System.out.println((web <= 35 ? "You Faild in web" : ""));
             * System.out.println((apti <= 35 ? "You Faild in apti" : ""));
             * System.out.println((communication <= 35 ? "You Faild in communication" :
             * ""));
             * System.out.println((percentage <= 40 ? "Your over all percentage is low" :
             * ""));
             * 
             * }
             */

            // FR-07: Attendance

            j++;
            System.out.println("Enter total classes conducted: ");
            int total_classes_conducted = sc.nextInt();
            while (j >= 1) {
                if (total_classes_conducted >= 1 && total_classes_conducted <= 300) {
                    j = 0;
                } else {
                    System.out.println("Invalid, The classes conducted must be in between 1 to 300 , Enter Again:");
                    total_classes_conducted = sc.nextInt();
                    j++;
                }
            }

            j++;
            System.out.println("Enter the classes attended: ");
            int classes_attended = sc.nextInt();
            while (j >= 1) {
                if (classes_attended >= 0 && classes_attended <= total_classes_conducted) {
                    System.out.println("Attendance accepted.");
                    j = 0;
                } else {
                    System.out.println(
                            "Invalid attendance. Attended classes cannot exceed" + total_classes_conducted
                                    + " Enter Again:");
                    classes_attended = sc.nextInt();
                    j++;
                }
            }

            double Attendance_percentage = ((double) classes_attended / total_classes_conducted) * 100;
            String attendance_status = (Attendance_percentage >= 75) ? "REGULAR" : "SHORTAGE";

            // FR-08: Assignment Score Processing

            System.out.println("Enter how many assignments scores you wants to enter: ");

            int assignment = sc.nextInt();
            j++;
            while (j >= 1) {
                if (assignment >= 1 && assignment <= 10) {
                    System.out.println("accepted");
                    j = 0;
                } else {
                    System.out.println("Inavlid,the assignment rage in between 1 to 10 , Enter again: ");
                    assignment = sc.nextInt();
                    j++;
                }
            }

            int assignment_score = 0;
            int total_assignment_score = 0;
            int assignemnt_count = 0;
            for (int k = 1; k <= assignment; k++) {
                System.out.println("Enter Assignment Score " + k + "(0-10, -1 to finish): ");
                assignment_score = sc.nextInt();
                if (assignment_score == -1) {
                    System.out.println("Assignemnt entry completed early.");
                    break;
                } else if (assignment_score < -1 || assignment_score > 10) {
                    System.out.println("Invalid score. Assignment" + k + "skipped");
                    continue;
                } else {
                    total_assignment_score += assignment_score;
                    assignemnt_count++;
                    System.out.println("Assignment score accepted.");
                }

            }
            double Assignemnt_average = total_assignment_score / assignemnt_count;
            boolean assignment_criteria = (assignemnt_count >= 1 && Assignemnt_average >= 5);
            String assignment_status = (assignment_criteria) ? "SATISFACTORY" : "NEEDS IMPROVEMENT";

            // FR-09: Scholarship Calculation
            int Scholarship_percentage = 0;
            if (academic && percentage >= 85 && Attendance_percentage >= 85) {
                Scholarship_percentage = 10;
            } else if (academic && percentage >= 75 && Attendance_percentage >= 75) {
                Scholarship_percentage = 5;
            } else {
                Scholarship_percentage = 0;
            }

            double Scholarship_amount = Base_semester_fee * Scholarship_percentage / 100;
            double Final_payable_fee = Base_semester_fee - Scholarship_amount;

            // FR-10: Fee Payment
            j++;
            System.out.println("the FEE You Need pay");
            System.out.println(Base_semester_fee - Scholarship_amount);
            System.out.println("Enter the Amount Paid:");

            double Amount_paid = sc.nextDouble();
            double Fee_balance = 0;
            while (j >= 1)
                if (Amount_paid >= 0 && Amount_paid <= Final_payable_fee) {
                    j = 0;
                    Fee_balance = Final_payable_fee - Amount_paid;

                } else {
                    System.out.println("Paying more amount, Enter Again: ");
                    Amount_paid = sc.nextInt();
                    j++;
                }
            String Fee_Status = (Fee_balance == 0) ? "PAID" : "PENDING";

            // FR-11: Final Semester Clearance
            boolean result = academic && Attendance_percentage >= 75 && assignment_criteria && Fee_balance == 0;
            String res = (result) ? "Semester Clearance         : CLEARED FOR NEXT SEMESTER"
                    : "Semester Clearance         : ACTION REQUIRED";

            /*
             * // FR-12: Failed Conditions
             * if (!result) {
             * System.out.println((java < 35 ? "Java marks are below 35" : ""));
             * System.out.println((SQL < 35 ? "SQL marks are below 35" : ""));
             * System.out.println((web < 35 ? "Web Technology marks are below 35" : ""));
             * System.out.println((apti < 35 ? "Aptitude marks are below 35." : ""));
             * System.out.println((communication < 35 ? "Communication marks are below 35."
             * : ""));
             * System.out.println((percentage < 40 ? "Overall percentage is below 40%" :
             * ""));
             * System.out.println((Attendance_percentage < 75) ? "Attendance is below 75%."
             * : "");
             * System.out.println((Assignemnt_average < 5) ?
             * "Assignment average is below 5.00." : "");
             * System.out.println((Fee_balance == 0) ? "" : "Semester fee is pending");
             * }
             */

            System.out.println("========================================================");
            System.out.println("                    STUDENT SEMESTER REPORT         ");
            System.out.println("========================================================");
            System.out.println("Student ID                 : " + Student_ID);
            System.out.println("Student Name               : " + Full_name);
            System.out.println("Age                        : " + Age);
            System.out.println("Email                      : " + Email);
            System.out.println("Course                     : " + choice);
            System.out.println("Semester                   : " + semester);
            System.out.println("Career Goal                : " + goal);
            System.out.println("---------------- ACADEMIC SUMMARY --------------------");
            System.out.println("Java Marks                 : " + java);
            System.out.println("SQL Marks                  : " + SQL);
            System.out.println("Web Technology Marks       : " + web);
            System.out.println("Aptitude Marks             : " + apti);
            System.out.println("Communication Marks        : " + communication);
            System.out.println("Total Marks                : " + total_marks + "/500");
            System.out.printf("Percentage                 : " + "%.2f%%\n", percentage);
            System.out.println("Academic Result            : " + academic_status);
            // FR-06: Grade Classification

            if (percentage >= 85) {
                System.out.println("Grade                  : A+");

            } else if (percentage >= 75 && academic) {
                System.out.println("Grade                  : A");

            } else if (percentage >= 65 && academic) {
                System.out.println("Grade                  : B");

            } else if (percentage >= 50 && academic) {
                System.out.println("Grade                  : C");

            } else if (percentage >= 40 && academic) {
                System.out.println("Grade                  : D");
            } else {
                System.out.println("Grade                  : F");
            }

            System.out.println("---------------- ATTENDANCE SUMMARY ------------------");
            System.out.println("Classes Conducted          : " + total_classes_conducted);
            System.out.println("Classes Attended           : " + classes_attended);
            System.out.printf("Attendance Percentage       : " + "%.2f%%\n", Attendance_percentage);
            System.out.println("Attendance Status          : " + attendance_status);
            System.out.println("---------------- ASSIGNMENT SUMMARY ------------------");
            System.out.println("Valid Assignments          : " + assignemnt_count);
            System.out.println("Assignment Total           : " + total_assignment_score);
            System.out.printf("Assignment Average          : " + "%.2f%n", Assignemnt_average);
            System.out.println("Assignment Status          : " + assignment_status);
            System.out.println("---------------- FEE SUMMARY -------------------------");
            System.out.printf("Base Semester Fee           : " + "%.2f%n", Base_semester_fee);
            System.out.println("Scholarship Percentage     : " + Scholarship_percentage + "%");
            System.out.printf("Scholarship Amount          : " + "%.2f%n", Scholarship_amount);
            System.out.printf("Final Payable Fee           : " + "%.2f%n", Final_payable_fee);
            System.out.printf("Amount Paid                 : " + "%.2f%n", Amount_paid);
            System.out.printf("Fee Balance                 : " + "%.2f%n", Fee_balance);
            System.out.println("Fee Status                 : " + Fee_Status);
            System.out.println("---------------- FINAL STATUS ------------------------");
            System.out.println(res);

            System.out.println("---------------- FAILED CONDITIONS -------------------");

            if (!result) {
                if (java < 35) {
                    System.out.println("Java marks are below 35");
                }
                if (SQL < 35) {
                    System.out.println("SQL marks are below 35");
                }
                if (web < 35) {
                    System.out.println("Web Technology are below 35");
                }
                if (apti < 35) {
                    System.out.println("Aptitude marks are below 35");
                }
                if (communication < 35) {
                    System.out.println("communication marks are below 35");
                }
                if (percentage < 40) {
                    System.out.println("Overall percentage is below 40%");
                }
                if (Attendance_percentage < 75) {
                    System.out.println("Attendance is below 75%.");
                }
                if (Assignemnt_average < 5) {
                    System.out.println("Assignment average is below 5.0");
                }
                if (Fee_balance != 0) {
                    System.out.println("Semester fee is pending");
                }
            } else {
                System.out.println("None");
            }
            System.out.println("---------------- RECOMMENDATIONS ---------------------");
            if (!result) {
                if (java < 35 || SQL < 35 || web < 35 || apti < 35 || communication < 35) {
                    System.out.println("Revisit the failed subject and complete additional practice.");
                }
                if (percentage < 40) {
                    System.out.println("Improve overall academic performance.");
                }
                if (Attendance_percentage < 75) {
                    System.out.println("Attend classes regularly and clear the attendance shortage.");
                }
                if (!assignment_criteria) {
                    System.out.println("Complete assignments consistently and maintain an average of at least 5.00.");
                }
                if (Fee_balance != 0) {
                    System.out.println("Pay the pending semester fee before clearance.");
                }
            } else {
                System.out.println("Maintain the current performance in the next semester.");
            }
            System.out.println("========================================================");
            System.out.println("Do you want to process another student , Enter the choice");
            System.out.println("1.Yes");
            System.out.println("0. No");
            j++;
            r = sc.nextInt();
            while (j >= 1) {
                if (r == 0) {
                    j = 0;
                    System.out.println("Thank you for using Campustrack.");
                    r = 0;
                } else if (r == 1) {
                    r++;
                    j = 0;
                } else {
                    System.out.println("Accept only 1 or 0, Enter the value Again: ");
                    r = sc.nextInt();
                }

            }

        } while (r >= 1);
        sc.close();
    }
}
