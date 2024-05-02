package org.example;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        RandomDTOGenerator generator = new RandomDTOGenerator();
        DTO randomDto = generator.generateDTO(DTO.class);

        System.out.println("Random String: " + randomDto.getStringField());
        System.out.println("Random Integer: " + randomDto.getIntField());
        System.out.println("Random Long: " + randomDto.getLongField());
        System.out.println("Random Short: " + randomDto.getShortField());
        System.out.println("Random Byte: " + randomDto.getByteField());
        System.out.println("Random Float: " + randomDto.getFloatField());
        System.out.println("Random Double: " + randomDto.getDoubleField());
        System.out.println("Random Boolean: " + randomDto.isBooleanField());
        System.out.println("Random Char: " + randomDto.getCharField());

    }
}