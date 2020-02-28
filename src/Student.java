public class Student extends Person {
    //properties
    private Section[] sections = new Section[10];
    private int grade;
    private int sectionCount;

    //constructor
    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    //methods
    public Section[] getSections() {
        return sections;
    }

    public void setSections(Section[] sections) {
        this.sections = sections;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    public void setSectionCount(int sectionCount) {
        this.sectionCount = sectionCount;
    }

    public String studentInfo() {
    return(this.getName() + " is in " + this.getGrade()+ " grade and is enrolled in the following sections "
            + this.sectionExtension());
    };

    public void addStudent(Section s){
        sections[sectionCount] = s;
        sectionCount++;
    };

    public String sectionExtension() {
        String o = "";
        for (int i = 0; i < this.getSectionCount(); i++) {
            o += this.sections[i].getName() +  " (" + this.sections[i].getTeacher().getName() + ")";
        }
        return o;
    };


}