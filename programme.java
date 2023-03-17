package poal2info.turingmachine;

public class programme {
	private static int MAX_INSTRUCTION = 1000;
	private int etatcourant;
	private instruction[] code;
	private int nBinstruction;

	programme() {
		setnBinstruction(0);
		setnBinstruction(0);
		setEtatcourant(1);
		code = new instruction[MAX_INSTRUCTION];
	}

	/**
	 * This function returns the value of the constant MAX_INSTRUCTION
	 * 
	 * @return The value of the MAX_INSTRUCTION variable.
	 */
	public static int getMAX_INSTRUCTION() {
		return MAX_INSTRUCTION;
	}

	/**
	 * This function returns the instruction corresponding to the current state and the symbol read
	 * 
	 * @param etat the current state of the machine
	 * @param symbole the symbol that the head is currently on
	 * @return The instruction that matches the state and symbol.
	 */
	public instruction getInstruction(int etat, boolean symbole) {
		for (int i = 0; i < nBinstruction; i++) {
			if (code[i].getEtatcourant() == etat && code[i].getSymbole() == symbole) {
				return code[i];
			}
		}
		return null;
	}

	/**
	 * It returns the code of the method
	 * 
	 * @return The code array.
	 */
	public instruction[] getCode() {
		return code;
	}

	/**
	 * This function sets the code of the class to the code passed in
	 * 
	 * @param code The code of the program.
	 */
	public void setCode(instruction[] code) {
		this.code = code;
	}

	/**
	 * This function returns the current state of the game
	 * 
	 * @return The current state of the machine.
	 */
	public int getEtatcourant() {
		return etatcourant;
	}

	/**
	 * This function sets the current state of the automaton
	 * 
	 * @param etatcourant the current state of the automaton
	 */
	public void setEtatcourant(int etatcourant) {
		this.etatcourant = etatcourant;
	}

	
	/** 
	 * @return int
	 */
	public int getnBinstruction() {
		return nBinstruction;
	}

	/**
	 * This function sets the number of instructions in the B-instruction set
	 * 
	 * @param nBinstruction number of instructions in the basic block
	 */
	public void setnBinstruction(int nBinstruction) {
		this.nBinstruction = nBinstruction;
	}

	/**
	 * This function adds an instruction to the code array
	 * 
	 * @param ins instruction
	 * @return The boolean value of the if statement.
	 */
	public boolean add(instruction ins) {
		if (nBinstruction < MAX_INSTRUCTION) {
			code[nBinstruction] = ins;
			++nBinstruction;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @return int return the nBinstruction
	 */
	public int getNBinstruction() {
		return nBinstruction;
	}

	/**
	 * @param nBinstruction the nBinstruction to set
	 */
	public void setNBinstruction(int nBinstruction) {
		this.nBinstruction = nBinstruction;
	}

	/**
	 * This function iterates through the code array and prints out the instructions in the code array
	 * 
	 * @return The program is being returned.
	 */
	@Override
	public String toString() {
		String s = "Program : \n";
		// A for loop that iterates through the code array.
		for (int i = 0; i < nBinstruction; i++) {
			s += i + ": ";
			s += code[i].toString();
			s += "\n";
		}
		return s;
	}

}
