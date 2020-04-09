package lect7;

import org.omg.PortableInterceptor.INACTIVE;

import javax.print.attribute.SetOfIntegerSyntax;
import java.awt.*;
import java.util.*;
import java.util.List;

public class MyCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(98);
        list.add(82);
        list.add(7);
        list.add(16);
        list.add(65);
        list.add(26);
        list.add(9);
        list.add(3);
        list.add(2, 1);
        list.add(8, -3);
        list.add(5, -4);

        list.removeIf(integer -> integer > 20);
        for (Integer i : list) {
            System.out.println(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " index: " + i);
        }

        List<Integer> copy = new ArrayList<>();
        copy.addAll(list);
        copy.removeIf(integer -> integer < 5);
        for (Integer i : copy) {
            System.out.println(i);
        }
        Collections.sort(list);
        for (Integer i : list) {
            System.out.println(i); Collections.sort(list);
            for (Integer i : list) {
                System.out.println(i);
        }
    }
}
