package com.Exilant;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Ename
{
  public static void main(String[] args)
  {
    String[] employees = {"Mary Aja Wong", "Mike Wong", "Menta Wong", "Sara Subo William", "Peter Sweet Man", "uSanto Ellis", "Usan Edward Lee", "Badle- middle Huffman"};
    String domain = "exilant.com";
    for (String employee : employees) {
      String[] employeeName = employee.toLowerCase().split(" ");
      List<String> employeeNameAsList = new ArrayList<String>();
      for (int i = 0; i < employeeName.length; i++) {
        if (i == 0) {
          employeeNameAsList.add(employeeName[i]);
        } else {
          employeeNameAsList.add(Character.toString(employeeName[i].charAt(0)));
        }
	    }
      String employeeNameWithDomain = String.join("_", employeeNameAsList) + "@" + domain;
      System.out.println(employeeNameWithDomain);
    }
  }
}

