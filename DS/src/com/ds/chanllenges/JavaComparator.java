package com.ds.chanllenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Write your Checker class here

class Checker implements Comparator {

  int compare1(Player a, Player b) {

    if (a.score > b.score) {
      return -1;
    } else if (a.score < b.score) {
      return 1;
    }

    if (a.name.compareTo(b.name) > 0) {
      return 1;
    }

    return -1;
  }


  @Override
  public int compare(Object o1, Object o2) {
    return compare1((Player) o1, (Player) o2);
  }
}

class Player {

  String name;
  int score;

  Player(String name, int score) {
    this.name = name;
    this.score = score;
  }
}

class JavaComparator {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    Player[] player = new Player[n];
    Checker checker = new Checker();

    for (int i = 0; i < n; i++) {
      player[i] = new Player(scan.next(), scan.nextInt());
    }
    scan.close();

    Arrays.sort(player, checker);
    for (int i = 0; i < player.length; i++) {
      System.out.printf("%s %s\n", player[i].name, player[i].score);
    }
  }
}