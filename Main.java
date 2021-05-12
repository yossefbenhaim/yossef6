package com.company;

import javax.swing.text.html.HTMLDocument;
import java.awt.*;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        Iterator<Integer> key = map.keySet().iterator();
        Iterator<ArrayList<Integer>> veliu = map.values().iterator();

        map.put(1, init());
        map.put(2, init());
        map.put(3, init());
        map.put(4, init());
        map.put(5, init());


int cunter= 0 ,i,j;

        while (key.hasNext() ) {
            Integer k = key.next();
            ArrayList<Integer> arr = veliu.next();

                for (i = 0; i < k; i++) {

                    for (j = 0 ;j < arr.size();j++){
                        cunter++;
                    }
                    if ( cunter < 10) {

                        key.remove();
                        veliu.remove();
                    }
                }


        }
        System.out.println(cunter);
        System.out.println(map);



    }


    public static ArrayList init() {
        int Size;
        Random r = new Random();
        Size = r.nextInt(10) + 1;
        ArrayList<Integer> res = new ArrayList<>();
        while (Size > 0) {
            res.add(r.nextInt(1000));
            Size--;
        }
        return res;
    }


    public static ArrayList<Integer> isPrime(ArrayList<Integer> a) {
        Iterator<Integer> prime = a.iterator();
        int sum = prime.next();

        for (int i = 1; i < sum / 2; i++) {
            if (sum % i == 0) {
                prime.remove();
            }
        }

        return a;
    }




}

