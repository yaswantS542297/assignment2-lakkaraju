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

public class ProblemThree {
    public static void groupReverse() {
        System.out.println("");
        LinkedList<Integer> rList = new LinkedList<>();
        LinkedList<Integer> fList = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        int size = scan.nextInt();
        System.out.print("List: ");
        for (int i = 0; i < size; i++)
        {
            rList.add(scan.nextInt());

 

        }
        System.out.println("k: ");
        int k = scan.nextInt();
        int count = 0;
        Iterator<Integer> it = rList.listIterator();
        LinkedList<Integer> temp = new LinkedList<>();
        while (it.hasNext())
        {
            count++;
            temp.add(it.next());
            if (count == k) {
                fList.addAll(reverse(temp));
                count = 0;
                temp.clear();
            }
        }
        if (!temp.isEmpty()) {
            fList.addAll(reverse(temp));
        }

 

        for (int i = 0; i < fList.size(); i++) {
            System.out.print(fList.get(i));
            if (i != fList.size() - 1) {
                System.out.print("->");
            }
        }
    }

 

    public static LinkedList<Integer> reverse(LinkedList<Integer> l) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = l.size() - 1; i >= 0; i--) {
            ll.add(l.get(i));
        }
        return ll;
    }
}
 




