class Course implements CourseActivity {
    String cid;
    String coursename;
    Integer score;
    String grade;

    public Course(String id, String cname, Integer sc) {
        cid = id;
        coursename = cname;
        score = sc;
        grade = decideGrade();
    }
    
    public String decideGrade() {

        if (score >= 90)
            grade = "A";
        else if (score >= 80)
            grade = "B";
        else if (score >= 70)
            grade = "C";
        else if (score >= 60)
            grade = "D";
        else
            grade = "F";
            return grade;
    }
    
    public void printCourseInfo() {
        System.out.println("CourseID \t" + cid + "\tName: " + coursename + "\t Score: " + score
                + "\t Grade: " + grade + "\t");
    }

}