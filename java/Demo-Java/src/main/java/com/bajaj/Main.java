package com.bajaj;

import com.bajaj.students.StudentController;
import com.bajaj.students.StudentGateway;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
//        Scanner scanner = new Scanner(System.in);
//        User user = new User();
////        user.name = "Mallika";
////        user.age = 23;
////        user.city = "Mumbai";
//
////        user.getName();
//        user.setName("Mallika");
////        user.getDetails();
////        user.printDetails();
//
//        System.out.println(user.getName());


//        Students students = new Students();
//        students.getStudentDetails();
////        students.printDetails();
//        System.out.println(students);

//        Teachers teachers = new Teachers();
//        teachers.getTeacherDetails();
//        System.out.println(teachers);


//        Person calculator = new Person();  //inbuilt constructor

//
//
//  PersonController personController = new PersonController();
//  personController.createPerson();
//  personController.displayPerson();

//  Students students = new Students("MALLIKA",0,"pune",34,"maths");
//        System.out.println(students);
//    }

//        StudentController studentController = new StudentController();
//        studentController.create();
//        studentController.display();

        //Array

//        int[] nums = {20,12,23,45,78};


//        Scanner scanner = new Scanner(System.in);
//        int[] nums = new int[5];
//        System.out.println("Enter 5 digits");
//        for(int i = 0; i<nums.length; i++) {
//            nums[i] =  scanner.nextInt();
//        }
//        for(int i = 0; i<nums.length; i++) {
//            System.out.println(nums[i]);
//        }


//arrayList
//        ArrayList<Integer> nums = new ArrayList();
//        nums.add(23);
//        nums.add(42);
//        nums.add(43);
//        nums.add(41);
//        nums.add(49);
//        nums.add(43);
//        System.out.println(nums);
//        for (int i =0; i<nums.size(); i++){
//            System.out.println(nums.get(i));
//        }
        //enhanced for loop
//        for (Integer n: nums){
//            System.out.println(n);
//        }
//         nums.forEach((n) -> {
//             System.out.println(n);
//         });

//
//      List<Integer> a =   nums.stream().filter((n)->{
//            return n%2!=0;
//        }).collect(toList());
//        System.out.println(a);
//
//
//        List<Integer> b =   nums.stream().filter((n)->{
//            return n%2!=0;
//        }).limit(2).toList();
//        System.out.println(b);


        //functional Interface

//        Demo demo = new Demo() {
//            @Override
//            public void doSomething() {
//
//            }

//            @Override
//            public void some1() {
//
//            }
//        };

//      it is only for implementation
//        Demo demo = (a) -> a * 2;
//        System.out.println("" + demo.doSomething(2));


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter no. of students");
//        int noOfStudents = scanner.nextInt();
//
//        StudentController controller = new StudentController();
//
//        for(int i=0 ; i < noOfStudents; i ++){
//            controller.create();
//
//        }
//        controller.display();

//        try {
//            Class.forName("org.postgresql.Driver");
//        Connection connection =  DriverManager.getConnection("jdbc:postgresql://localhost:5432/sms","postgres","rootroot");
//
////        String query = "insert into students(name, age, rollno, city, subject)values('Mallika',23,34,'pune', 'maths')";
////            Statement statement = connection.createStatement();
////            statement.executeUpdate(query);
////
//
//        String newQuery = "insert into students(name, age, rollno, city, subject)values(?,?,?,?,?)";
//            PreparedStatement preparedStatement = connection.prepareStatement(newQuery);
//            preparedStatement.setString(1,"Mallika");
//            preparedStatement.setInt(2,23);
//            preparedStatement.setInt(3,100699);
//            preparedStatement.setString(4,"Pune");
//            preparedStatement.setString(5, "Maths");
//
//
//            int status =  preparedStatement.executeUpdate();
//            if(status != 1){
//
//            }
//
//
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

        DBConnection dbConnection = new DBConnection();
        StudentGateway studentGateway = new StudentGateway(dbConnection);
        StudentController studentController = new StudentController(studentGateway);

        int conti = 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Choose The operation");
            System.out.println("1. Create Students ");
            System.out.println("2. Delete Students ");
            System.out.println("3. Update Students ");
            System.out.println("4. View All Students ");
            System.out.println("5. Search By Name ");
            System.out.println("6. Sort By Age");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter name,age");
                    studentController.create();
                    break;
                }
                case 2: {
                    studentController.delete();
                    break;
                }
                case 3: {
                    studentController.update();
                   break;
                }
                case 4: {
                  studentController.getAll();
                    break;
                }
                case 5: {
                  studentController.SearchByName();
                    break;
                }
                case 6: {
                    studentController.SortByAge();
                    break;
                }

                default: {
                    System.out.println("Invalid Option");
                }
            }
            System.out.println("Do you want to continue application");
            conti = scanner.nextInt();
        } while (conti == 1);
    }
}