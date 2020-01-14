package javaStrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWordFilters {

  public static void main(String[] args) {
    String input = "This This is text text another another";

    String originalText = input;
    String output = "";
    Pattern p = Pattern.compile(
        "\\b"
            + "(\\w+)"
            + "(\\s+\\1\\b)*",
        Pattern.MULTILINE + Pattern.CASE_INSENSITIVE);
    //\b : is a word boundary
    //(\w+)  : Any number of word characters
    //(\s+\1\b)* : Any number of space followed by word which matches the
    // previous word and ends the word boundary. Whole thing wrapped in * helps to find more than one repetitions.
    Matcher m = p.matcher(input);
    System.out.println(input);

    if (!m.find()) {
      System.out.println("No duplicates");
    } else {
      while (m.find()) {
        input = input.replaceAll(m.group(), m.group(1));
//        System.out.println(m.group());
//        System.out.println(m.group(1));
      }
    }
    System.out.println(input);
  }
}
