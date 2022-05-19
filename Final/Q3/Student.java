import java.util.ArrayList;

class Student extends Person {
    String sid;
    Integer credits;
    ArrayList<Course> clist;

    public Student(String n, String b, String id, Integer c, ArrayList<Course> list) {
        name = n;
        DOB = b;
        sid = id;
        credits = c;
        clist = list;
    }
    

    public void printPerson() {
        System.out.println("\nName: \t" + name + "\tDOB: \t" + DOB + "\nID: \t" + sid + "\tCredits: \t" + credits);
        for (int i = 0; i < clist.size(); i++)
            (clist.get(i)).printCourseInfo();
    }
    
}
