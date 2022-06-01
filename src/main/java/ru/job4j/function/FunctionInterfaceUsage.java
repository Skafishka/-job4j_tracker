package ru.job4j.function;

import ru.job4j.tracker.StubOutput;

import java.util.HashSet;
import java.util.List;
import java.util.function.*;
import java.util.Set;

public class FunctionInterfaceUsage {
    public static void main(String[] args) {
        Supplier<String> sup = () -> "New String For Interface";
        BiConsumer<String, String> consumer = (s, s1) -> System.out.println(s + s1);
        consumer.accept(sup.get(), " and Second String");

        List<String> list = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> sup1 = () -> new HashSet<>(list);
        BiConsumer<Integer, String> consumer1 = (s, s1) -> System.out.println(s + s1);
        Set<String> strings = sup1.get();
        int i = 1;
        for (String s : strings) {
            consumer1.accept(i++, " is " + s);
        }

        Predicate<String> pred = s -> s.isEmpty();
        System.out.println("Строка пустая: " + pred.test(""));
        System.out.println("Строка пустая: " + pred.test("test"));

        BiPredicate<String, Integer> cond = (s, q) -> s.contains(q.toString());
        System.out.println("Строка содержит подстроку: " + cond.test("Name123", 123));
        System.out.println("Строка содержить подстроку: " + cond.test("Name", 123));

        Function<String, Character> func = s -> s.charAt(2);
        System.out.println("Третий симовол в строке: " + func.apply("first"));
        System.out.println("Третий символ в строке: " + func.apply("second"));

        BiFunction<String, Integer, String> biFunc = (s, e) -> s.concat(" ").concat(e.toString());
        System.out.println("Результат работы бифункции: " + biFunc.apply("Name", 123));
        System.out.println("Результат работы бифункции: " + biFunc.apply("String number", 12345));

        UnaryOperator<StringBuilder> builder = b -> b.reverse();
        System.out.println("Строка после реверса: " + builder.apply(new StringBuilder("String for test")));
        System.out.println("Строка после реверса: " + builder.apply(new StringBuilder("tset rof qnirtS")));

        BinaryOperator<StringBuilder> builder1 = (b1, b2) -> b1.append(" ").append(b2);
        System.out.println(
                "Строка после объединения: " + builder1.apply(
                        new StringBuilder("First string"),
                        new StringBuilder("Second string")
                )
        );
    }
}
