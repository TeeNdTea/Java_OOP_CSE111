public class ABCServer {
    private String serName;
    private int memCap;
    private String[] mem;
    private String[] roles;
    private int total;
    public ABCServer() {
        this.serName = "Default";
        this.memCap = 10;
        this.mem = new String[10];
        this.roles = new String[10];
        this.total = 0;
    }
    public ABCServer(String serName, int memCap) {
        this.serName = serName;
        this.memCap = memCap;
        this.mem = new String[memCap];
        this.roles = new String[memCap];
        this.total = 0;
    }
    public void addMembers(String memberName) {
        addMembers(memberName, "Rising Hero");
    }
    public void addMembers(String memberName, String role) {
        if (total < memCap) {
            mem[total] = memberName;
            roles[total] = role;
            total++;
            System.out.println(role + " is added.");
        } 
        else {
            System.out.println("Sorry, maximum capacity exceed!");
        }
    }
    public void details() {
        System.out.println("Server Name: " + serName);
        System.out.println("Member Capacity: " + memCap);
        System.out.println("Total Members: " + total);
        System.out.println("Members:");
        for (int i = 0; i < total; i++) {
            System.out.println("Name:Role --> " + mem[i] + ":" + roles[i]);
        }
    }
}
