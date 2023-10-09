package com.company;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("24_demo.txt"));
        Pattern pattern = Pattern.compile("X{1,}", Pattern.DOTALL);

        int c;
        StringBuilder text = new StringBuilder();

        while ((c = reader.read()) != -1) {
            text.append((char) c);
        }

        Matcher matcher = pattern.matcher(text);

        int math;
        int mathMax = 0;

        while (matcher.find()){
            math = (matcher.group()).length();
            if(math > mathMax){
                mathMax = math;
            }
        }
        System.out.println(mathMax);
    }
}