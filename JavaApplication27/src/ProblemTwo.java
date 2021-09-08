/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;

/**
 *
 * @author YaswantLakkaraju
 */
public class ProblemTwo {
    public static void equalList() {
        System.out.println("");
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
        var flag = true;
        Collections.sort(list1);
        Collections.sort(list2);
        for (Integer l1 : list1) 
        {
            if (!list2.contains(l1))
            {
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
 