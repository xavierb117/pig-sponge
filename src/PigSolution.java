/**
 * 
 * ONLY LOOK AT THIS FILE IF YOU ARE ASSIGNED
 * TO PRESENT (BE THE INTERVIEWER FOR) PIG.
 * 
 * 
 * Guide is way at the bottom.
 */
























































 public class PigSolution {

  // Main method to run the test cases
  public static void main(String[] args) {
      // Test cases
      assertEqual(1, pigLatin("something"), "omethingsay");
      assertEqual(2, pigLatin("awesome"), "awesome");
      assertEqual(3, pigLatin("latin is a hard language"), "atinlay is a ardhay anguagelay");
      assertEqual(4, pigLatin("y"), "yay");
      assertEqual(5, pigLatin("e"), "e");
  }

   /*
    * Create a method that takes a string consisting of one or more 
    * all-lowercase words separated by spaces. It should return a new string 
    * converted to "pig Latin," where each word has its first letter moved to 
    * the back and the letters "ay" are added to the end of the word. However, 
    * words starting with a vowel (a, e, i, o, or u) should not be altered.
    *
    * Examples:
    *
    * pigLatin("something")  should return "omethingsay"
    * pigLatin("awesome")    should return "awesome" (words starting with a vowel should not be altered)
    * pigLatin("latin is a hard language")  should return "atinlay is a ardhay anguagelay"
    * pigLatin("y")  should return "yay"
    * pigLatin("e")   should return "e"
    */
  public static String pigLatin(String sentence) {
      // Split the sentence into words
      String[] words = sentence.split(" ");
      // Initialize the result as an empty string
      String result = "";

      // Loop through each word in the sentence
      for (int i = 0; i < words.length; i++) {
          // Convert the word to Pig Latin and add it to the result
          result += pigLatinSingleWord(words[i]);
          result += " ";
      }

      // Remove the extra space at the end
      result = result.substring(0, result.length() - 1);

      // Return the result without any extra spaces
      return result;
  }

  // Helper method to convert a single word to Pig Latin
  // If the word starts with a vowel, it remains unchanged
  // If the word starts with a consonant, the first letter is moved to the end followed by "ay"
  private static String pigLatinSingleWord(String word) {
      // Check if the first letter is a vowel
      if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u') {
          return word; // Return the word unchanged if it starts with a vowel
      }
      // If it starts with a consonant, move the first letter to the end and add "ay"
      return word.substring(1) + word.charAt(0) + "ay";
  }

  // Method to help with testing, you do not need to read this.
  public static void assertEqual(int testNumber, String actual, String expected) {
      if (!actual.equals(expected)) {
          System.out.println("Test " + testNumber + " failed! Expected: '" + expected + "', but got: '" + actual + "'");
      } else {
          System.out.println("Test " + testNumber + " passed!");
      }
  }
}
