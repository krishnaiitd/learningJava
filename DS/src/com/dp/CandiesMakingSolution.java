package com.dp;

public class CandiesMakingSolution {

  public static long minimumPasses(long m, long w, long p, long n) {
    // Write your code here

    long pass = 0;
    long result = (long) Math.ceil(n/(m*w)); // Maximum number of passes;
    long resource = 0;

    while (pass < result) {
      // Calculation

      // Straight passes
      long st_pass = (long) Math.ceil(p-resource / (m*w));

      pass += st_pass;
      resource = m * w * st_pass;

      // bulk hiring
      if (Math.floor(resource/p) >= Math.abs(m-w)) {
        resource -= Math.abs(m-w)*p;
        if (m > w) {
          w = m;
        } else {
          m = w;
        }

      }



    }
    return 1l;
  }

  public static void main(String[] args) {

  }

}
