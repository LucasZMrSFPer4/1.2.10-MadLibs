import java.util.Scanner;

public class MadLibs
{
  public static void main(String[] args)
  {
    String incompleteMadLib1 = new String("I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.");
    String incompleteMadLib2 = new String("Once upon a time in a <adjective> land, a <noun> <adverb> grew.");

    Scanner sc = new Scanner(System.in);

    System.out.println("Adjective: ");
    String userInput = sc.nextLine();
  }
}