/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using
 * ASCII (American Standard Code for Information Interchange). Using the already
 * created file named `ASCIIArt.java` write a program that outputs your artwork
 * to the console. The goal of this project is to use ONLY what we have learned
 * in Unit 1 to create anything you would like so be creative (and school
 * appropriate). Artwork must also have a caption describing what it's
 * depicting.
 * 
 * For those of you who have dabbled in coding before, try to contain your code
 * to just what we have discussed in this unit.
 * 
 * @author Mr. Rasmussen
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void main(String[] args) {
		System.out.println("THIS IS MY ACII ART");
		System.out.println("\n");
		twoHuman();
		System.out.println("");
		twoHuman();
		tree();
		cat();

	}

	public static void face() {
		System.out.println(" (._.)    (._.)");
	}

	public static void body() {
		System.out.println("/(   )\\  /(   )\\");
	}

	public static void legs() {
		System.out.println(" /   \\    /   \\");
	}

	public static void tree() {
		System.out.println("\t\tx");
		System.out.println("\t       / \\");
		System.out.println("\t      /   \\");
		System.out.println("\t     /     \\");
		System.out.println("\t    ---------");
		System.out.println("\t    /       \\");
		System.out.println("\t   /         \\");
		System.out.println("\t  /           \\");
		System.out.println("\t  -------------");
		System.out.println("\t     |    |");
		System.out.println("\t     |    |");
		System.out.print("\t     ======");
	}

	public static void twoHuman() {
		face();
		body();
		legs();
	}

	public static void cat() {
		System.out.println("      /\\_/\\");
		System.out.println("\t\t\t >^,^<");
		System.out.println("\t\t\t  / \\");
		System.out.print("\t\t\t '(_)_");
	}
}