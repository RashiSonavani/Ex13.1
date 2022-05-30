package com.company;

import java.util.List;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Task_1 {
    public static void main(String[] args) throws IOException {
        List<String> t1 = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader("emplye.txt"))) {

            String ln;

            while ((ln = bf.readLine()) != null) {
                t1.add(ln);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Collection size :" + t1.size());
        System.out.println("For Loop: ");

        for (int i = 0; i < t1.size(); i++) {
            System.out.println(t1.get(1));
        }

        System.out.println("FOR EACH LOOP : ");

        for (String employee : t1) {
            System.out.println(employee);
        }

        System.out.println("ITERATOR INTERFACE : ");

        Iterator<String> itret = t1.iterator();

        while (itret.hasNext()) {
            System.out.println(itret.next());
        }

    }}
