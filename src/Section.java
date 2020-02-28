public class Section {
    //properties
    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize = 0;

    //contructors
    public Section (String name) {
        this.name = name;
    }

    //methods
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public String sectionInfo() {
       return(this.getName() + " is taught by " + this.getTeacher().getName() + " and has " +
               this.getCurrentSize() + " students: " + this.sectionExtension());
    };

    public void addStudents(Student s){
        students[currentSize] = s;
        currentSize++;
    };

    public String sectionExtension() {
        String o = "";
        for (int i = 0; i < this.getCurrentSize(); i++) {
            o += this.students[i].getName() + " ";
        }
        return o;
    };

}
