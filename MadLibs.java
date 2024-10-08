import java.util.Scanner;

public class MadLibs
{
  public static void main(String[] args)
  {
    String madLib = new String("I went to the animal <noun>, the <plural noun> and the <number> beasts were there."); // shows incomplete Mad Lib
    /* String madLib = new String("Once upon a time in a <adjective> land, a <noun> <adverb> grew.");
    String madLib = new String("I am not <adjective>, <conjunction> I'm not going to <verb> yet."); */

    Scanner sc = new Scanner(System.in); // creates Scanner

    int openBracket = madLib.indexOf("<"); // before part of speech
    int closeBracket = madLib.indexOf(">"); // after part of speech
    String restOfMadLib1 = madLib.substring(closeBracket + 1, madLib.length()); // makes a substring for future use by cutting off the part from first character to last character of the missing word/number
    String partOfSpeech1 = madLib.substring(openBracket + 1, closeBracket); // finds the part of speech to replace
    System.out.print("Enter a " + partOfSpeech1 + ": "); // tells the user to fill in a word/number of a part of speech
    String missingWord1 = new String(sc.nextLine());
    String substring1 = new String(madLib.substring(0, openBracket) + missingWord1); // makes a substring from beginning to the end of the word/number

    openBracket = restOfMadLib1.indexOf("<"); // before part of speech
    closeBracket = restOfMadLib1.indexOf(">"); // after part of speech
    String restOfMadLib2 = restOfMadLib1.substring(closeBracket + 1, restOfMadLib1.length()); // makes a substring for future use by cutting off the part from first character to last character of the missing word/number
    String partOfSpeech2 = restOfMadLib1.substring(openBracket + 1, closeBracket); // finds the part of speech to replace
    System.out.print("Enter a " + partOfSpeech2 + ": "); // tells the user to fill in a word/number of a part of speech
    String missingWord2 = new String(sc.nextLine());
    String substring2 = new String(restOfMadLib1.substring(0, openBracket) + missingWord2); // makes a substring from beginning to the end of the word/number

    openBracket = restOfMadLib2.indexOf("<"); // before part of speech
    closeBracket = restOfMadLib2.indexOf(">"); // after part of speech
    String restOfMadLib3 = restOfMadLib2.substring(closeBracket + 1, restOfMadLib2.length()); // makes a substring for future use by cutting off the part from first character to last character of the missing word/number
    String partOfSpeech3 = restOfMadLib2.substring(openBracket + 1, closeBracket); // finds the part of speech to replace
    System.out.print("Enter a " + partOfSpeech3 + ": "); // tells the user to fill in a word/number of a part of speech
    String missingWord3 = new String(sc.nextLine());
    String substring3 = new String(restOfMadLib2.substring(0, openBracket) + missingWord3); // makes a substring from beginning to the end of the word/number

    String substring4 = new String(restOfMadLib3.substring(0, restOfMadLib3.length())); // makes a substring from beginning to the end of the restOfMadLib3 substring

    System.out.print(substring1 + substring2 + substring3 + substring4); // prints the whole solved Mad Lib
  }
}