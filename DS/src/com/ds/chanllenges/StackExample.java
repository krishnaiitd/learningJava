package com.ds.chanllenges;

import java.util.Scanner;
import java.util.Stack;

public class StackExample {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNext()) {
      String input=sc.next();
      //Complete the code
      System.out.println(isBalancedTree(input));

    }


  }

//  [({})(())]
//(({()})))[[
//({(){}()})()({(){}()})(){()}{}((()))
//{}()))(()()({}}{}
//}}}}
//))))
//{{{
//(((
//{}(){()}((())){{{}}}{()()}{{}{}}
//{{{{{{{)))))))))))))))))))
//{}{}(
//{}}}{}
//()()()())))
//(((((()()()
//(){}{{}}()(()){{()()}}
//{}{{{}}}{{{((()))}}}
//((()))[]
//{{}}(()[])

  public static boolean isBalancedTree(String ss) {

    if (ss.isEmpty()) {
      return true;
    }

    Stack<Character> s = new Stack<Character>();

    for (int i = 0; i < ss.length(); i++) {
      char current = ss.charAt(i);

      if (current == '(' || current == '{' || current == '['
          || current == ')' || current == '}' || current == ']'
      ) {

        if (current == '(' || current == '{' || current == '[') {
          s.push(current);
        }


        if (current == ')' || current == '}' || current == ']') {
          if (s.empty()) {
            return false;
          }
          char last = s.peek();
          if ( (last == '(' && current == ')') || (last == '{' && current == '}')  || (last == '[' && current == ']') ) {
            s.pop();
          }
        }
      }
    }
    if (s.empty()) {
      return true;
    }

    return false;
  }

}
