package com.challenges;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

  public static void main(String[] args) throws ParseException {

    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();

        /* Create custom Locale for India.
          I used the "IANA Language Subtag Registry" to find India's country code */
    Locale indiaLocale = new Locale("en", "IN");

    /* Create NumberFormats using Locales */
    NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
    NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
    NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

    System.out.println(us.format(payment));
    System.out.println(india.format(payment));
    System.out.println(china.format(payment));
    System.out.println(france.format(payment));

  }
}
