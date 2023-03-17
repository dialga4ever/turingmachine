package poal2info.turingmachine;

/**
 * The Tape class is a class that represents a tape for a Turing machine
 */
public class Tape {
    private boolean tape[];
    private int head;

    // It's a constructor.
    Tape(int sizeTruc) {
        tape = new boolean[sizeTruc];
        head = 0;
    }

    // It's a constructor.
    Tape() {
        tape = new boolean[1000];
        head = 0;

    }

    
    /** 
     * @return boolean
     */
    boolean goRight() {
        if (head < tape.length - 1) {
            head++;
            return true;
        }
        return false;
    }

    
    /** 
     * @return boolean
     */
    boolean goLeft() {
        if (head > 0) {
            head--;
            return true;
        }
        return false;
    }


    /**
     * Write a 1 to the current cell.
     */
    void write() {
        tape[head] = true;
    }


    /**
     * Erase() sets the value of the cell under the head to false.
     */
    void erase() {
        tape[head] = false;
    }

    
    /**
     * The function returns the value of the tape at the current head position
     * 
     * @return The value of the tape at the head.
     */
    boolean read() {
        return tape[head];
    }

    /**
    * If the head is at the current index, print a 1 or _ in brackets, otherwise print a 1 or _ without
    * brackets
    * 
    * @return The tape is being returned as a string.
    */
    @Override
    public String toString() {
        String s = new String();
        for (int i = 0; i < tape.length; i++) {
            if (i == head) {
                s += tape[i] == true ? "[1]" : "[_]";
            } else {

                s += tape[i] == true ? "1" : "_";
            }
        }
        return s;
    }
}