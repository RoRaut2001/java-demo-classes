public class Student1 {
   // attributes
    // name, age, grade
    String name;
    int age;
    String grade;
    // method1 --- "Name is studying for exams"
    //method2 --- Rohini: age 25 grade A
    void study(){
        System.out.println(name + " is studying for exams!!");
    }
    void showStudentDetails(){
        System.out.println("Name: " + name + " Age: " + age + " Grade: " + grade);
    }

    public static void main(String[] args) {
        // object
        Student1 obj = new Student1();
        obj.name = "Diksha";
        obj.age = 15;
        obj.grade = "A";
        obj.study();
        obj.showStudentDetails();


        Student1 obj2 = new Student1();
        obj2.name = "Sakshi";
        obj2.age = 16;
        obj2.grade = "AA";
        obj2.study();
        obj2.showStudentDetails();




    }
}

// class Main {
//    public static void main(String[] args) {
//
//    }
//
//}
