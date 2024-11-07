package Practice;


import java.io.*;
import java.util.*;

class Student implements Serializable {
    private int id;
    private String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

class Filedemo {
    void addStudent() {
        // Serialize Student List
        try {
            FileOutputStream fout = new FileOutputStream("file3.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);

            Scanner sc = new Scanner(System.in);
            List<Student> slList = new ArrayList<>();
            // Take input for 5 students
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter id: ");
                int id = sc.nextInt();
                sc.nextLine();  // Consume newline left-over
                System.out.println("Enter name:");
                String name = sc.nextLine();

                // Add the student object to the list
                slList.add(new Student(id, name));
            }

            // Serialize the student list to file
            out.writeObject(slList);
            out.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        void viewStudent() {
            // Deserialize Student List
            try {
                FileInputStream fin = new FileInputStream("file3.txt");
                ObjectInputStream in = new ObjectInputStream(fin);

                // Read the list of students from the file
                while (true) {
                    Student student = (Student) in.readObject();
                    System.out.println("Id :" + student.getId());
                    System.out.println("Name :" + student.getName());
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
public class Test{
    public static void main(String[] args) {
        //Student obj = new Student();

    }
}

