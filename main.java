package poal2info.turingmachine;

public class main {

    public static void main(String[] args) {
        programme p = new programme();
        p.add(new instruction(1, false, "R", 1));
        p.add(new instruction(1, true, "R", 2));
        p.add(new instruction(2, true, "R", 2));
        p.add(new instruction(2, false, "WR", 3));
        p.add(new instruction(3, true, "R", 3));
        p.add(new instruction(3, false, "LE", 0));
        MachineTuring m = new MachineTuring("00111011111000");
        m.setCode(p);
        System.out.println(m);
        m.process();
        System.out.println(m);
    }
}
