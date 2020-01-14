package sample.data.mongo.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SystemOsLevelInfo {

  public void getMemoryInfo() throws IOException {

    Runtime runtime = Runtime.getRuntime();

    BufferedReader br = new BufferedReader(
        new InputStreamReader(runtime.exec("free -m").getInputStream()));

    String line;
    String memLine = "";
    int index = 0;
    while ((line = br.readLine()) != null) {
      if (index ==1) {
        memLine = line;
      }
      index++;
    }
//                  total        used        free      shared  buff/cache   available
//    Mem:          15933        3153        9683         310        3097       12148
//    Swap:          3814           0        3814

    List<String> memInfoList = Arrays.asList(memLine.split("\\s+"));
    int totalSystemMemory = Integer.parseInt(memInfoList.get(1));
    int totalSystemUsedMemory = Integer.parseInt(memInfoList.get(2));
    int totalSystemFreeMemory = Integer.parseInt(memInfoList.get(3));

    System.out.println("Total system memory in mb: " + totalSystemMemory);
    System.out.println("Total system used memory in mb: " + totalSystemUsedMemory);
    System.out.println("Total system free memory in mb: "   + totalSystemFreeMemory);

  }

  public void LoadAvg() throws IOException {
//    cat /proc/loadavg
    Runtime runtime = Runtime.getRuntime();

    BufferedReader br = new BufferedReader(
        new InputStreamReader(runtime.exec("cat /proc/loadavg").getInputStream()));

    String line;
    String avgLine = "";
    while ((line = br.readLine()) != null) {
        avgLine = line;
      System.out.println(line);

    }
    System.out.println(avgLine);
  }
}
