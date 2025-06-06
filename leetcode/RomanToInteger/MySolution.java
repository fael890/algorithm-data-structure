package leetcode.RomanToInteger;

import java.util.ArrayList;

public class MySolution {
    public int romanToInt(String s) {
        String[] splitedString = s.split("");
        ArrayList<Integer> convertedNumbers = new ArrayList<Integer>();

        for(int i = 0; i < splitedString.length; i++){
            switch(splitedString[i]){
                case "I":
                    convertedNumbers.add(1);
                break;
                case "V": 
                    convertedNumbers.add(5);
                break;
                case "X":
                    convertedNumbers.add(10);
                break;
                case "L":
                    convertedNumbers.add(50);
                break;
                case "C":
                    convertedNumbers.add(100);
                break;
                case "D":
                    convertedNumbers.add(500);
                break;
                case "M":
                    convertedNumbers.add(1000);
                break;
            }
        }

        int result = 0;
        int temp = 0;

        for(int i = convertedNumbers.size()-1; i >= 0; i--){
            if(convertedNumbers.get(i) >= temp) {
                result = result + convertedNumbers.get(i);
                temp = convertedNumbers.get(i);
            } else {
                result = result - convertedNumbers.get(i);
                temp = convertedNumbers.get(i);
            }
        }

        return result;
    }
}
