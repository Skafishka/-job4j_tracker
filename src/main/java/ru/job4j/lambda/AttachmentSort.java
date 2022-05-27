package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );
        Comparator<Attachment> comparatorSize =  new Comparator<>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return Integer.compare(o1.getSize(), o2.getSize());
            }
        };
        attachments.sort(comparatorSize);
        System.out.println(attachments);
        Comparator<Attachment> comparatorName = new Comparator<>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                String[] rslO1 = o1.getName().split("");
                String[] rslO2 = o2.getName().split("");
                int q = Math.min(rslO2.length, rslO1.length);
                int rsl = Integer.compare(rslO1.length, rslO2.length);
                for (int i = 0; i < q; i++) {
                    rsl = rslO1[i].compareTo(rslO2[i]);
                }
                return rsl;
            }
        };
        attachments.sort(comparatorName);
        System.out.println(attachments);
    }
}