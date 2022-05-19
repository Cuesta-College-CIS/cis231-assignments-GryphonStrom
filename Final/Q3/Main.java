import java.util.ArrayList;

public class Main {
    public static ArrayList<Student> fillupStudent() {

        ArrayList<Student> slist = new ArrayList<Student>();

        ArrayList<Course> list1 = new ArrayList<Course>();
        list1.add(new Course("CIS01", "Stats", 90));
        list1.add(new Course("CIS02", "Snakes", 76));
        list1.add(new Course("CIS231", "Shakes", 97));
        slist.add(new Student("Jack", "02/02/2002", "1001", 9, list1));

        ArrayList<Course> list2 = new ArrayList<Course>();
        list2.add(new Course("CIS65", "C++", 92));
        list2.add(new Course("CIS32", "C#.", 59));
        list2.add(new Course("CIS22", "C$", 54));
        list2.add(new Course("CNT02", "Cfood", 80));
        slist.add(new Student("Jaques", "11/13/1997", "1002", 12, list2));

        ArrayList<Course> list3 = new ArrayList<Course>();
        list3.add(new Course("CIS01", "C++", 71));
        list3.add(new Course("CIS232", "CS4Dummy", 88));
        slist.add(new Student("Shaq", "01/02/1992", "1003", 6, list3));

        return slist;
    }

    public static void printStudent(ArrayList<Student> slist) {
        for (int i = 0; i < slist.size(); i++)
            (slist.get(i)).printPerson();
    }

    public static void main(String[] args) {
        ArrayList<Student> slist;
        slist = fillupStudent();
        printStudent(slist);
    }
}