public class Student {
    private int id;
    private double cgpa;
    private String[] courses;
    private int courseCount;
    private boolean cgpaSet;

    public Student(int id) {
        this.id = id;
        this.cgpa = 0.0; 
        this.courses = new String[4]; 
        this.courseCount = 0;
        this.cgpaSet = false; 
    }

    public Student(int id, double cgpa) {
        this.id = id;
        this.cgpa = cgpa;
        this.courses = new String[4]; 
        this.courseCount = 0;
        this.cgpaSet = true; 
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setCG(double cgpa) {
        this.cgpa = cgpa;
        this.cgpaSet = true;
    }

    public void addCourse(String course) {
        if (!cgpaSet) {
            System.out.println("Failed to add " + course);
            System.out.println("Set CG first");
            return;
        }
        if (cgpa < 3.0 && courseCount >= 3) {
            System.out.println("Failed to add " + course);
            System.out.println("CG is low. Can't add more than 3 courses.");
            return;
        }
        if (courseCount >= 4) {
            System.out.println("Failed to add " + course);
            System.out.println("Maximum 4 courses allowed.");
            return;
        }
        courses[courseCount] = course;
        courseCount++;
    }

    public void addCourse(String[] courseArray) {
        if (!cgpaSet) {
            System.out.println("Failed to add courses");
            System.out.println("Set CG first");
            return;
        }
        if (courseArray != null) {
            for (int i = 0; i < courseArray.length; i++) {
                addCourse(courseArray[i]);
            }
        } 
        else {
            System.out.println("Course array is null.");
        }
    }

    public void rmAllCourse() {
        for (int i = 0; i < courseCount; i++) {
            courses[i] = null;
        }
        courseCount = 0;
    }

    public void showAdvisee() {
        System.out.println("Student ID: " + id + ", CGPA: " + cgpa);
        if (courseCount == 0) {
            System.out.println("No courses added.");
        } 
        else {
            System.out.print("Added courses are: ");
            for (int i = 0; i < courseCount; i++) {
                System.out.print(courses[i] + " ");
            }
            System.out.println();
        }
    }
}
