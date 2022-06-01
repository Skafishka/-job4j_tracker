package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings("checkstyle:EmptyLineSeparator")
public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 10),
                new Attachment("image 2", 34),
                new Attachment("image 3", 25)
        );
        System.out.println(attachments);
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
                return o1.getName().compareTo(o2.getName());
            }
        };
        attachments.sort(comparatorName);
        System.out.println(attachments);
    }
}
