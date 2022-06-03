package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 6", 23)
        };
        Comparator<Attachment> comparator = (left, right) -> Integer.compare(left.getSize(), right.getSize());
        /**
         * Компаратор cmpText сравнивает имена из Attachments по возрастанию
         */
        Comparator<String> cmpText = (left, right) -> left.compareTo(right);
        /**
         * Компаратор cmpDescSize сравнивает длины строк по убыванию
         */
        Comparator<String> cmpDescSize = (left, right) -> Integer.compare(right.length(), left.length());

    }
}