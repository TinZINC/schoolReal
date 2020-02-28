public class Runner {
    public static void main(String[] args) {

        School BerkeleyHigh = new School("Berkeley High");

        Section mathSection = new Section("Math");
        Section biologySection = new Section( "Biology");
        Section comSciSection = new Section("Computer Science");

        Teacher Albinson = new Teacher("Albinson", "computer science");
        Teacher Teacher1 = new Teacher("Teacher1", "math");
        Teacher Teacher2 = new Teacher("Teacher2", "biology");

        Student Me = new Student("Me", 11);
        Student Student1 = new Student("Student1", 11);
        Student Student2 = new Student("Student2", 11);
        Student Student3 = new Student("Student3", 11);
        Student Student4 = new Student("Student4", 11);
        Student Student5 = new Student("Student5", 11);

        BerkeleyHigh.addSection(mathSection);
        BerkeleyHigh.addSection(biologySection);
        BerkeleyHigh.addSection(comSciSection);

        comSciSection.setTeacher(Albinson);
        mathSection.setTeacher(Teacher1);
        biologySection.setTeacher(Teacher2);

        Albinson.addTeacher(comSciSection);
        Teacher1.addTeacher(mathSection);
        Teacher2.addTeacher(biologySection);

        comSciSection.addStudents(Me);
        comSciSection.addStudents(Student1);
        mathSection.addStudents(Student2);
        mathSection.addStudents(Student3);
        biologySection.addStudents(Student4);
        biologySection.addStudents(Student5);

        Me.addStudent(comSciSection);
        Student1.addStudent(comSciSection);
        Student2.addStudent(mathSection);
        Student3.addStudent(mathSection);
        Student4.addStudent(biologySection);
        Student5.addStudent(biologySection);

        System.out.println(BerkeleyHigh.schoolInfo());

        System.out.println(" ");

        System.out.println(comSciSection.sectionInfo());
        System.out.println(mathSection.sectionInfo());
        System.out.println(biologySection.sectionInfo());

        System.out.println(" ");

        System.out.println(Albinson.teacherInfo());
        System.out.println(Teacher1.teacherInfo());
        System.out.println(Teacher2.teacherInfo());

        System.out.println(" ");

        System.out.println(Me.studentInfo());
        System.out.println(Student1.studentInfo());
        System.out.println(Student2.studentInfo());
        System.out.println(Student3.studentInfo());
        System.out.println(Student4.studentInfo());
        System.out.println(Student5.studentInfo());
    }
}
