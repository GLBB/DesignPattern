package composite;


public class Main {

    public static void main(String[] args) {
        System.out.println("Making root entries");
        Directory rootdir = new Directory("root");
        Directory bindir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");

        rootdir.add(bindir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);

        bindir.add(new File("vi", 10));
        bindir.add(new File("latex", 20));

        rootdir.printList();

        System.out.println("");

        System.out.println("Making user entries...");
        Directory yuki = new Directory("yuki");
    }
}
