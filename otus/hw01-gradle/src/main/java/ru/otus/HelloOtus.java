package ru.otus;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;

@SuppressWarnings("java:S106")
public class HelloOtus {

    public static void main(String[] args) {
        List<String> words = Lists.newArrayList("door", "table", null, "apple", null);
        Iterables.removeIf(words, Objects::isNull);
        System.out.println(words.size());
    }
}
