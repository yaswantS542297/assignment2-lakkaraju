/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author YaswantLakkaraju
 */

import java.util.*;

 

public class ProblemOne {
    public static void mergeList() {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the first list: ");
        int size = scan.nextInt();
        System.out.print("List one: ");
        for (int i = 0; i < size; i++) {
            list1.add(scan.nextInt());

 

        }
        System.out.print("Enter the size of the second list: ");
        size = scan.nextInt();
        System.out.print("List two: ");
        for (int i = 0; i < size; i++) {
            list2.add(scan.nextInt());

 

        }
        list2.addAll(list1);
        Collections.sort(list2);
        System.out.print("Merged List: " + list2);

 

    }
}