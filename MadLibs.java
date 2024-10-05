import java.util.Scanner;

public class MadLibs
{
  public static void main(String[] args)
  {
    String incompleteMadLib1 = new String("I went to the animal <noun>, the <plural_noun> and the <number> beasts were there."); // Mad Lib 1
    String incompleteMadLib2 = new String("Once upon a time in a <adjective> land, a <noun> <adverb> grew."); // Mad Lib 2
    String incompleteMadLib3 = new String("I am not <adjective>, <conjunction> I'm not going to <verb> yet."); // Mad Lib 3

    Scanner sc = new Scanner(System.in);
    System.out.print("Prompts:\n1. Going to Disneyland\n2. Fairytale\n3. Time to Eat!\n"); // the user chooses a prompt
    String promptChoice = new String(sc.nextLine());

    if (promptChoice.equals("1")) { // If the user chooses prompt 1, he/she will choose a noun, a plural noun, and a number.
      System.out.print("Noun: ");
      String noun = new String(sc.nextLine());
      System.out.print("Plural Noun: ");
      String pluralNoun = new String(sc.nextLine());
      System.out.print("Number: ");
      String number = new String(sc.nextLine());
      String substring1 = incompleteMadLib1.substring(0, 21);
      String substring2 = incompleteMadLib1.substring(27, 33);
      String substring3 = incompleteMadLib1.substring(46, 55);
      String substring4 = incompleteMadLib1.substring(63, incompleteMadLib1.length());
      System.out.print(substring1 + noun + substring2 + pluralNoun + substring3 + number + substring4);
    }

    if (promptChoice.equals("2")) { // If the user chooses prompt 2, he/she will choose an adjective, a noun, and an adverb.
      System.out.print("Adjective: ");
      String adjective = new String(sc.nextLine());
      System.out.print("Noun: ");
      String noun = new String(sc.nextLine());
      System.out.print("Adverb: ");
      String adverb = new String(sc.nextLine());
      String substring1 = incompleteMadLib2.substring(0, 22);
      String substring2 = incompleteMadLib2.substring(33, 42);
      String substring3 = incompleteMadLib2.substring(57, incompleteMadLib2.length());
      System.out.print(substring1 + adjective + substring2 + noun + " " + adverb + substring3);
    }

    if (promptChoice.equals("3")) { // If the user chooses prompt 3, he/she will choose an adjective, a conjunction, and a verb.
      System.out.print("Adjective: ");
      String adjective = new String(sc.nextLine());
      System.out.print("Conjunction: ");
      String conjunction = new String(sc.nextLine());
      System.out.print("Verb: ");
      String verb = new String(sc.nextLine());
      String substring1 = incompleteMadLib3.substring(0, 9);
      String substring2 = incompleteMadLib3.substring(35, 53);
      String substring3 = incompleteMadLib3.substring(59, incompleteMadLib3.length());
      System.out.print(substring1 + adjective + ", " + conjunction + substring2 + verb + substring3);
    }
  }
}