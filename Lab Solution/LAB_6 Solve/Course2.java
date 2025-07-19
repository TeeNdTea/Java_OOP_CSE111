public class Course2 {
    public String courseName;
    public String courseCode;
    public String[] syllabus;
    public int contentCount;

    public Course2() {
        syllabus = new String[4];
        contentCount = 0;
    }

    public void createCourse(String name, String code) {
        courseName = name;
        courseCode = code;
    }

    public void addContent(String content) {
        if (contentCount < syllabus.length) {
            syllabus[contentCount] = content;
            contentCount++;
            System.out.println(content + " was added.");
        } 
        else {
            System.out.println("Cannot add more content");
        }
    }

    public void addContent(String content1, String content2) {
        addContent(content1);
        addContent(content2);
    }

    public void printDetails() {
        System.out.println("Course details:");
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.print("Course Syllabus: ");
        if (contentCount == 0) {
            System.out.println("No content yet.");
        } 
        else {
            for (int i = 0; i < contentCount; i++) {
                System.out.print(syllabus[i]);
                if (i < contentCount - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}

//the difference is in parameter handling
//task-6 handled one and two content additions separately with different methods.
//task-7 uses method overloading to handle adding one or two contents in the same method addContent().