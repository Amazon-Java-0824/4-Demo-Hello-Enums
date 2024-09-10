package com.ironhack;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//      ENUMS
        for (TeaType type : TeaType.values()) {
            System.out.println(type);
        }


        var tea1 = new Tea(TeaType.OOLONG,
                "India");

//       HASHMAP
        var phonebook = new HashMap<String, String>();
        phonebook.put("John Doe", "555-432-678");
        phonebook.put("Mary Rey", "555-874-001");

        var maryNumber = phonebook.get("Mary Rey");
        System.out.println(maryNumber);


        var det1 = new PhoneDetails("John Doe", "555-432-678");
        var det2 = new PhoneDetails("Mary Rey", "555-874-001");
        var list = new ArrayList<PhoneDetails>();
        list.add(det1);
        list.add(det2);
        String maryNumber2 = "";
        String numberToFind = det1.getName();
        for (PhoneDetails phone : list) {
            if (phone.getName().equals(numberToFind)) {
                maryNumber2 = phone.getNumber();
            }
        }
        System.out.println(maryNumber2);


//        given a word count how many unique characters are in it.
//        for example:
//        Hello = 4
//        casa = 3
//        tornado = 6


        String word1 = "Hello";
        String word2 = "casa";
        String word3 = "tornado";
        String word4 = "ingredients";
        var expe1 = 4;
        var expe2 = 3;
        var expe3 = 6;


        int result = calculateHowManyUniqueCharacters(word4);
        System.out.println(result == expe2);
        System.out.println(result);


        List<String> names = new ArrayList<>(List.of("Mary", "John", "Rey", "Mary Rey", "Paco", "Fer", "Mary", "John", "Rey", "Mary Rey", "Paco", "Fer", "Xavi", "Mary", "John", "Rey", "Mary Rey", "Paco", "Fer","Mary", "John", "Rey", "Mary Rey", "Paco", "Fer"));
        Set<String> uniqueName = new HashSet<>();
        for( String name : names) {
            uniqueName.add(name);
        }
        System.out.println("How many unique names? "+ uniqueName.size());
    }

    private static int calculateHowManyUniqueCharacters(String word) {
//        char[] wordAsChars = word.toCharArray();
//        List<Character> foundChars = new ArrayList<>();
//        for (char c : wordAsChars) {
//            if (!foundChars.contains(c)) {
//                foundChars.add(c);
//            }
//        }
//        return foundChars.size();

        Set<Character> uniqueValues = new HashSet<>();
        char[] wordAsChars = word.toCharArray();
        for (Character c : wordAsChars) {
            uniqueValues.add(c);
        }
        return uniqueValues.size();

    }
}