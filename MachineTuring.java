package poal2info.turingmachine;

/**
 * This class is the main class of the program. It contains the tape, the state and the program
 */
public class MachineTuring {
    private static int MAX_INSTRUCTION = 1000;

    private Tape ruban;
    private int etat;
    private programme code;

    MachineTuring(int tailleRuban) {
        ruban = new Tape(tailleRuban);
        etat = 1;
        code = new programme();
    }

    MachineTuring() {
        ruban = new Tape();
        etat = 1;
        code = new programme();
    }

    MachineTuring(String ru) {
        ruban = new Tape(ru.length());
        etat = 1;
        for (int i = 0; i < ru.length(); i++) {
            if (ru.charAt(i) == '1') {
                ruban.write();
            }
            ruban.goRight();
        }
        for (int i = 0; i < ru.length(); i++) {
            ruban.goLeft();
        }
        code = new programme();
    }

    /**
     * The function execute() is used to execute the instructions of the Turing machine
     */
    public void execute() {
        instruction ins = code.getInstruction(etat, ruban.read());
        if (ins.getOperation() == "R") {
            ruban.goRight();
        } else if (ins.getOperation() == "L") {
            ruban.goLeft();
        } else if (ins.getOperation() == "WR") {
            ruban.write();
            ruban.goRight();
        } else if (ins.getOperation() == "WL") {
            ruban.write();
            ruban.goLeft();
        } else if (ins.getOperation() == "LE") {
            ruban.goLeft();
            ruban.erase();

        } else if (ins.getOperation() == "RE") {
            ruban.goRight();
            ruban.erase();
        }
        etat = ins.getetatsfutur();
    }

    /**
     * "While the state is not zero, execute the function."
     * 
     * The state is a variable that is set to zero when the program is finished
     */
    public void process() {
        while (etat != 0) {
            execute();

        }
    }

    /**
     * It returns a string representation of the object
     * 
     * @return The toString() method of the ruban object.
     */
    @Override
    public String toString() {
        return ruban.toString();
    }

    /**
     * @return Tape return the ruban
     */
    public Tape getRuban() {
        return ruban;
    }

    /**
     * @param ruban the ruban to set
     */
    public void setRuban(Tape ruban) {
        this.ruban = ruban;
    }

    /**
     * @param etat the etat to set
     */
    public void setEtat(int etat) {
        this.etat = etat;
    }

    /**
     * @return programme return the code
     */
    public programme getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(programme code) {
        this.code = code;
    }

}
