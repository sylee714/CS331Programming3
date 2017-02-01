/*
 * Finding intersection of two unsorted integer arrays using HashSet 
 * and TreeSet and intersection of two sorted integer arrays. Computes
 * CPU time for each method in milliseconds.
 */
package cs331Programming1;

import java.util.*;
import java.util.Arrays;

/**
 *
 * @author Seungyun Lee
 */
public class CS331Programming1 {
    // Run the main program. Print the result and compare.
    public static void main(String[] args) {
      Random rand = new Random();    
      //1,000
      int[] data01 = new int[1000];
      int[] data02 = new int[1000];
      for (int i = 0; i < data01.length; ++i) {
          data01[i] = rand.nextInt(1000) + 1;
      } 
      for (int i = 0; i < data02.length; ++i) {
          data02[i] = rand.nextInt(1000) + 1;
      } 
      int[] data0101 = new int[2000];
      int[] data0202 = new int[2000];
      for (int i = 0; i < data0101.length; ++i) {
          data0101[i] = rand.nextInt(2000) + 1;
      } 
      for (int i = 0; i < data0202.length; ++i) {
          data0202[i] = rand.nextInt(2000) + 1;
      }  
      int[] data010101 = new int[3000];
      int[] data020202 = new int[3000];
      for (int i = 0; i < data010101.length; ++i) {
          data010101[i] = rand.nextInt(3000) + 1;
      } 
      for (int i = 0; i < data020202.length; ++i) {
          data020202[i] = rand.nextInt(3000) + 1;
      } 
      //10,000
      int[] data1 = new int[10000];
      int[] data2 = new int[10000];
      for (int i = 0; i < data1.length; ++i) {
          data1[i] = rand.nextInt(10000) + 1;
      } 
      for (int i = 0; i < data2.length; ++i) {
          data2[i] = rand.nextInt(10000) + 1;
      }   
      int[] data11 = new int[20000];
      int[] data22 = new int[20000];
      for (int i = 0; i < data11.length; ++i) {
          data11[i] = rand.nextInt(20000) + 1;
      } 
      for (int i = 0; i < data22.length; ++i) {
          data22[i] = rand.nextInt(20000) + 1;
      }  
      int[] data111 = new int[30000];
      int[] data222 = new int[30000];
      for (int i = 0; i < data111.length; ++i) {
          data111[i] = rand.nextInt(30000) + 1;
      } 
      for (int i = 0; i < data222.length; ++i) {
          data222[i] = rand.nextInt(30000) + 1;
      }  
      //100,000
      int[] data3 = new int[100000];
      int[] data4 = new int[100000];
      for (int i = 0; i < data3.length; ++i) {
          data3[i] = rand.nextInt(100000) + 1;
      }
      for (int i = 0; i < data4.length; ++i) {
          data4[i] = rand.nextInt(100000) + 1;
      } 
      int[] data33 = new int[200000];
      int[] data44 = new int[200000];
      for (int i = 0; i < data33.length; ++i) {
          data33[i] = rand.nextInt(200000) + 1;
      }
      for (int i = 0; i < data44.length; ++i) {
          data44[i] = rand.nextInt(200000) + 1;
      }  
      int[] data333 = new int[200000];
      int[] data444 = new int[200000];
      for (int i = 0; i < data333.length; ++i) {
          data333[i] = rand.nextInt(300000) + 1;
      }
      for (int i = 0; i < data444.length; ++i) {
          data444[i] = rand.nextInt(300000) + 1;
      } 
      // 1,000,000
      int[] data5 = new int[1000000];
      int[] data6 = new int[1000000];
      for (int i = 0; i < data5.length; ++i) {
          data5[i] = rand.nextInt(1000000) + 1;
      }
      for (int i = 0; i < data6.length; ++i) {
          data6[i] = rand.nextInt(1000000) + 1;
      }
      int[] data55 = new int[2000000];
      int[] data66 = new int[2000000];
      for (int i = 0; i < data55.length; ++i) {
          data55[i] = rand.nextInt(2000000) + 1;
      }
      for (int i = 0; i < data66.length; ++i) {
          data66[i] = rand.nextInt(2000000) + 1;
      }
      int[] data555 = new int[3000000];
      int[] data666 = new int[3000000];
      for (int i = 0; i < data555.length; ++i) {
          data555[i] = rand.nextInt(3000000) + 1;
      }
      for (int i = 0; i < data666.length; ++i) {
          data666[i] = rand.nextInt(3000000) + 1;
      }
      //10,000,000
      int[] data7 = new int[10000000];
      int[] data8 = new int[10000000];
      for (int i = 0; i < data7.length; ++i) {
          data7[i] = rand.nextInt(10000000) + 1;
      }
      for (int i = 0; i < data8.length; ++i) {
          data8[i] = rand.nextInt(10000000) + 1;
      }
      int[] data77 = new int[20000000];
      int[] data88 = new int[20000000];
      for (int i = 0; i < data77.length; ++i) {
          data77[i] = rand.nextInt(20000000) + 1;
      }
      for (int i = 0; i < data88.length; ++i) {
          data88[i] = rand.nextInt(20000000) + 1;
      }
      int[] data777 = new int[30000000];
      int[] data888 = new int[30000000];
      for (int i = 0; i < data777.length; ++i) {
          data777[i] = rand.nextInt(30000000) + 1;
      }
      for (int i = 0; i < data888.length; ++i) {
          data888[i] = rand.nextInt(30000000) + 1;
      }    
      System.out.println("Finding intersection of two unsorted arrays of "
              + "integers"+ " using HashSet.");
        printHashResult(data01, data02);
        printHashResult(data0101, data0202);
        printHashResult(data010101, data020202);
        printHashResult(data1, data2);
        printHashResult(data11, data22);
        printHashResult(data111, data222);
        printHashResult(data3, data4);
        printHashResult(data33, data44);
        printHashResult(data333, data444);
        printHashResult(data5, data6);
        printHashResult(data55, data66);
        printHashResult(data555, data666);
        printHashResult(data7, data8);
        printHashResult(data77, data88);
        printHashResult(data777, data888);    
      System.out.println("Finding intersection of two unsorted arrays of "
              + "integers using TreeSet.");
        printTreeResult(data01, data02);
        printTreeResult(data0101, data0202);
        printTreeResult(data010101, data020202);
        printTreeResult(data1, data2);
        printTreeResult(data11, data22);
        printTreeResult(data111, data222);
        printTreeResult(data3, data4);
        printTreeResult(data33, data44);
        printTreeResult(data333, data444);
        printTreeResult(data5, data6);
        printTreeResult(data55, data66);
        printTreeResult(data555, data666);
        printTreeResult(data7, data8);
        printTreeResult(data77, data88);
        printTreeResult(data777, data888);
      System.out.println("Finding intersection of two sorted arrays "
              + "of integers.");
        printSortedResult(data01, data02);
        printSortedResult(data0101, data0202);
        printSortedResult(data010101, data020202);
        printSortedResult(data1, data2);
        printSortedResult(data11, data22);
        printSortedResult(data111, data222);
        printSortedResult(data3, data4);
        printSortedResult(data33, data44);
        printSortedResult(data333, data444);
        printSortedResult(data5, data6);
        printSortedResult(data55, data66);
        printSortedResult(data555, data666);
        printSortedResult(data7, data8);
        printSortedResult(data77, data88);
        printSortedResult(data777, data888);
    }
    // Find intersection of two sorted arrays of integers.
    public static TreeSet sorted(int[] array1, int[] array2, TreeSet 
            intersection) {
        int i = 0;
        int j = 0;   
        while (i < array1.length && j < array2.length) {
            if (array1[0] > array2[array2.length - 1])
                break;
            else if (array1[i] < array2[j])
                i++;
            else if (array1[i] > array2[j])
                j++;
            else {
                intersection.add(array1[i]);
                i++;
                j++;
            }          
        }    
       return intersection;
    }  
    // Find intersectino of two arrays of integers using TreeSet.
    public static TreeSet unsortedTreeSet(int[] array1, int[] array2, TreeSet
            intersection) { 
        TreeSet ts = new TreeSet();    
        for (int i = 0; i < array1.length; ++i) {
            ts.add(array1[i]);
        }   
        for (int i = 0; i < array2.length; ++i) {
            if (ts.contains(array2[i])) {
                intersection.add(array2[i]);
            }
        }
        return intersection;
    } 
    // Find intersection of two arrays of integers using HashSet.
    public static TreeSet unsortedHashSet(int[] array1, int[] array2, TreeSet
            intersection) {
        
        HashSet hs = new HashSet();
        for (int i = 0; i < array1.length; ++i) {
            hs.add(array1[i]);
        }
        for (int i = 0; i < array2.length; ++i) {
            if (hs.contains(array2[i])) {
                intersection.add(array2[i]);
            }
        }  
        return intersection;
    }
    // Print the result when using HashSet.
    public static void printHashResult(int[] arr1, int[] arr2) {
      TreeSet inter = new TreeSet();
      long startTime = System.currentTimeMillis();
      unsortedHashSet(arr1, arr2, inter);
      long endTime = System.currentTimeMillis();
      System.out.println("Size of first array: " + arr1.length);
      System.out.println("Size of second array: " + arr2.length);
      System.out.println("Time to find intersection: " + (endTime - startTime)
              + " milliseconds");
      System.out.println();
    }
    // Print the result when using TreeSet.
    public static void printTreeResult(int[] arr1, int[] arr2) {
      TreeSet inter = new TreeSet();
      long startTime = System.currentTimeMillis();
      unsortedTreeSet(arr1,arr2, inter);
      long endTime = System.currentTimeMillis();
      System.out.println("Size of first array: " + arr1.length);
      System.out.println("Size of second array: " + arr2.length);
      System.out.println("Time to find intersection: " + (endTime - startTime)
              + " milliseconds");
      System.out.println();
    }  
    // Print the result when using two sorted arrays.
    public static void printSortedResult(int[] arr1, int[] arr2) {
      System.out.println("Size of first array: " + arr1.length);
      System.out.println("Size of second array: " + arr2.length);
      long startTime = System.currentTimeMillis();
      Arrays.sort(arr1);
      long endTime = System.currentTimeMillis();
      System.out.println("Time to sort first array: " + (endTime - startTime)
              + " milliseconds");
      startTime = System.currentTimeMillis();
      Arrays.sort(arr2);
      endTime = System.currentTimeMillis();
      System.out.println("Time to sort second array: " + (endTime - startTime)
              + " milliseconds");   
      TreeSet inter = new TreeSet();
      startTime = System.currentTimeMillis();
      sorted(arr1, arr2, inter);
      endTime = System.currentTimeMillis();
      System.out.println("Time to find intersection: " + (endTime - startTime)
              + " milliseconds");
      System.out.println();
    }
}
