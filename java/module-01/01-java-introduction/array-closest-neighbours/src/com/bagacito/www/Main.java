package com.bagacito.www;

public class Main {
    public static void main(String[] args) {

        int[] myArray = {0, 5, 1209, 6, 2, 111, 112, 33};
        int[] result = findClosest(myArray);
    }

    private static int[] findClosest(int[] numbers){

        int holderValue = Math.abs(numbers[0] - numbers[1]);
        int holderPosition = 0;

        for(int i = 0; i < numbers.length - 1; i++){
            int currentValue = Math.abs(numbers[i] - numbers[i +1]);

            if(currentValue < holderValue){
                holderValue = currentValue;
                holderPosition = i;
            }
        }

        int [] results = {numbers[holderPosition], numbers[holderPosition + 1]};

        System.out.println("The closest neighbours are found at position " + holderPosition + " and position " + (holderPosition + 1) + " of the array");
        System.out.println("The numbers were " + results[0] + " and " + results[1]);

        return results;
    }
}
