public class Student {
    String name;
    String prog;
    public Student(String name, String prog) {
        this.name = name;
        this.prog = prog;
    }
    public void updateName(String newName) {
        this.name = newName;
    }
    public String accessName() {
        return this.name;
    }
    public void updateProgram(String newProg) {
        this.prog = newProg;
    }
    public String accessProgram() {
        return this.prog;
    }
}
