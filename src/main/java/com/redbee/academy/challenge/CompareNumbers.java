package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareNumbers {

  /**
   * Method that receives two numbers and returns the
   * max of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @param c - Another Integer Number
   * @return The max of a, b and c
   */
  public static Integer max(Integer a, Integer b, Integer c) {
	List<Integer> list = new ArrayList<Integer>();
	addNumbers(a, list);
	addNumbers(b, list);
	addNumbers(c, list);
    return list.isEmpty() ? 0 : Collections.max(list);
  }
  
  public static void addNumbers(Integer x, List<Integer> list) {
	  if(x!=null) {
		  list.add(x);
	  }
  }
}
