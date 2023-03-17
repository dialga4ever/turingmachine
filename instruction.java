package poal2info.turingmachine;

/**
 * It's a class that represents a single instruction in a Turing machine
 */
public class instruction {
    private int etatcourant;
    private boolean symbole;
    private String operation;
    private int etatsfutur;
    
    instruction(int etatcourant, boolean symbole, String operation, int etatsfutur) {
        this.etatcourant = etatcourant;
        this.symbole = symbole;
        this.operation = operation;
        this.etatsfutur = etatsfutur;
    }
    /**
     * This function returns the current state of the Turing machine
     * 
     * @return The current state of the game.
     */
    public int getEtatcourant() {
        return etatcourant;
    }

    /**
     * This function sets the current state of the game
     * 
     * @param etatcourant the current state of the automaton
     */
    public void setEtatcourant(int etatcourant) {
        this.etatcourant = etatcourant;
    }

    /**
     * This function returns the value of the boolean variable symbole
     * 
     * @return The boolean value of the variable symbole.
     */
    public boolean getSymbole() {
        return this.symbole;
    }

    /**
     * This function sets the value of the boolean variable symbole to the value of the boolean
     * variable symbole
     * 
     * @param symbole This is a boolean value that determines whether the symbol is displayed or not.
     */
    public void setSymbole(boolean symbole) {
        this.symbole = symbole;
    }

    /**
     * This function returns the operation of the calculator
     * 
     * @return The operation is being returned.
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * This function sets the operation to the given operation
     * 
     * @param operation The operation to perform.
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * This function returns the value of the variable etatsfutur
     * 
     * @return The etatsfutur variable is being returned.
     */
    public int getetatsfutur() {
        return this.etatsfutur;
    }

    /**
     * This function sets the value of the variable etatsfutur to the value of the parameter etatsfutur
     * 
     * @param etatsfutur The future state of the cell
     */
    public void set(int etatsfutur) {
        this.etatsfutur = etatsfutur;
    }

    

    /**
     * This function returns a string that contains the current state, the symbol, the operation, and
     * the future state
     * 
     * @return The transition is being returned.
     */
    @Override
    public String toString() {
        return "<" + this.etatcourant + "," + this.symbole + "," + this.operation + "," + this.etatsfutur + ">";
    }
}