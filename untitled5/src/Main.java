import java.util.ArrayList;
import java.util.Scanner;

class Book{
    String idbuku;
    String namabuku;
    String author;
    String category;
    int stock;

    public Book(String idbuku, String namabuku, String author, String category, int stock){
        this.idbuku = idbuku;
        this.namabuku = namabuku;
        this.author = author;
        this.category = category;
        this.stock = stock;

class Student{
    String nama;
    String nim;
    String faculty;
    String program;

    public Student(String nama, String nim , String faculty, String program){
        this.nama = nama;
        this.nim = nim;
        this.faculty = faculty;
        this.program = program;
    }

    void tampilanStudent(){
        System.out.println("Nama: " +nama);
        System.out.println("Nim: "+ nim);
        System.out.println("Faculty: "+ faculty);
        System.out.println("Program: " + program);
    }
}

public class LoginLibrary{
    private static final String User_Admin = "admin";
    private static final String Password = "admin123";
    private static final String checknim = "202310370311452";

    public static Book[] booklist = {
            new Book("388c-e681-9152", "Title", "Author", "Sejarah", "4"),
            new Book("ed90-be30-5cdb", "Title", "Author", "Sejarah", "0"),
            new Book("d95e-0c4a-9523", "Title", "Author", "Sejarah", "2")
    };

    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome To Library Sistem ===");
        System.out.println("1. Login as Admin");
        System.out.println("2. Login as Student");
        System.out.println("3. Exit");
        System.out.print("Enter Your Choice: ");
        int library = scanner.nextInt();
        scanner.nextLine();

            switch (library){
                case 1:
                    AdminLogin();
                    break;
                case 2:
                    Student user = new Student("",""<)





        }
    }

    private static void StudentLogin(Scanner library) {
        System.out.print("Enter your NIM: ");
        String nim = Scanner.next
    }
    private static void AdminLogin(Scanner library) {
        Scanner admin = new Scanner(System.in);
        ArrayList<Student> daftarstudent = new ArrayList<>();
        System.out.println("=== Login Admin ===");
        System.out.print("Username: ");
        String Username = library.nextLine();
        System.out.print("Enter Your Password: ");
        String password = library.nextLine();

        if (Username.equals(User_Admin) && password.equals(Password)){
            System.out.println("You have logged in as admin");
        } else if (Username.equals(User_Admin)) {
            System.out.println("Username is invalid!");
        } else if (password.equals(Password)) {
            System.out.println("Password is invalid!");
        }else {
            System.out.println("Username & Password Invalid!");
        }

        while (true){
            System.out.println("=== Admin Menu ===");
            System.out.println("1. Add Student");
            System.out.println("2. Display Registered Student");
            System.out.println("3. Logout");

            System.out.print("Choose Option (1-3): ");
            int choose = admin.nextInt();
            admin.nextLine();

            switch (choose){
                case 1:
                    addstudent(admin, daftarstudent);
                    break;
                case 2:
                    System.out.println("\nData Student: ");
                    displaystudent(daftarstudent);
                    break;
                case 3:
                    System.out.println("You're logout");
                    admin.close();
                    return;
                default:
                    System.out.println("The choice you entered is invalid!");
                    break;
            }
        }
    }

    private static void displaystudent(ArrayList<Student> daftarstudent) {
        if (daftarstudent.isEmpty()){
            System.out.println("No student data has been entered yet!");
            return;
        }
        for (Student student : daftarstudent){
            student.tampilanStudent();
            System.out.println("");
        }
    }

    private static void addstudent(Scanner admin, ArrayList<Student> daftarstudent) {
        System.out.print("Enter Student Name: ");
        String name = admin.nextLine();
        String Nim;
        do {
            System.out.print("Enter Student NIM: ");
            Nim = admin.nextLine();
            if (Nim.length() != 15){
                System.out.println("NIM must be 15 digits! ");
            }
        }while (Nim.length() != 15);
        System.out.print("Enter Student Faculty: ");
        String Fakultas = admin.nextLine();
        System.out.print("Enter Student Program: ");
        String prodi = admin.nextLine();

        Student student = new Student(name, Nim, Fakultas, prodi);
        daftarstudent.add(student);
        System.out.println("Student Successfully Registered: ");
    }


}


