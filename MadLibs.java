import java.util.Scanner;

public class MadLibs
{
  public static void main(String[] args)
  {
    String incompleteMadLib = new String("I went to the animal <noun>, the <plural noun> and the <number> beasts were there.");
    /* String incompleteMadLib = new String("Once upon a time in a <adjective> land, a <noun> <adverb> grew.");
    String incompleteMadLib = new String("I am not <adjective>, <conjunction> I'm not going to <verb> yet."); */

    Scanner sc = new Scanner(System.in);

    String madLib = new String(incompleteMadLib);

    int openBracket = madLib.indexOf("<");
    int closeBracket = madLib.indexOf(">");
    String restOfMadLib1 = madLib.substring(closeBracket + 1, madLib.length());
    String partOfSpeech1 = madLib.substring(openBracket + 1, closeBracket);
    System.out.print("Enter a " + partOfSpeech1 + ": ");
    String missingWord1 = new String(sc.nextLine());
    String substring1 = new String(madLib.substring(0, openBracket) + missingWord1);

    openBracket = restOfMadLib1.indexOf("<");
    closeBracket = restOfMadLib1.indexOf(">");
    String restOfMadLib2 = restOfMadLib1.substring(closeBracket + 1, restOfMadLib1.length());
    String partOfSpeech2 = restOfMadLib1.substring(openBracket + 1, closeBracket);
    System.out.print("Enter a " + partOfSpeech2 + ": ");
    String missingWord2 = new String(sc.nextLine());
    String substring2 = new String(restOfMadLib1.substring(0, openBracket) + missingWord2);

    openBracket = restOfMadLib2.indexOf("<");
    closeBracket = restOfMadLib2.indexOf(">");
    String restOfMadLib3 = restOfMadLib2.substring(closeBracket + 1, restOfMadLib2.length());
    String partOfSpeech3 = restOfMadLib2.substring(openBracket + 1, closeBracket);
    System.out.print("Enter a " + partOfSpeech3 + ": ");
    String missingWord3 = new String(sc.nextLine());
    String substring3 = new String(restOfMadLib2.substring(0, openBracket) + missingWord3);

    String substring4 = new String(restOfMadLib3.substring(0, restOfMadLib3.length()));

    System.out.print(substring1 + substring2 + substring3 + substring4);
  }
}