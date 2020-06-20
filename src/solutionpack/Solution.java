package solutionpack;

public class Solution {
    public static int[] classArray;
    public static int solution(int N) {
//        String stringRepOfN = integerArraySetter(N);
        //Integer converted into Binary String
        String NBinaryConversion = Integer.toBinaryString(N);
        //String Array created according regex
        String[] binaryStringArray = NBinaryConversion.split("");
        System.out.println("The Binary String is: " + NBinaryConversion);
        //Create integer array according to String Array
        //This will be used to fill the classarray for access from other methods
        int[] parserArray = new int[NBinaryConversion.length()];
        //Populate integer array with Binary String Array Contents
        for (int i = 0; i < NBinaryConversion.length(); i++) {
            parserArray[i] = Integer.parseInt(binaryStringArray[i]);
        }
        System.out.println("parserarray : " + parserArray.toString());
        //Provide data to the class array for access from other methods
        classArray = parserArray;
        System.out.println("classarray : " + classArray.toString());
        int finalAnswer = countMaxZeroes();
        System.out.println("The Final Answer: " + finalAnswer);
        return (finalAnswer);
    }

    public static int countMaxZeroes(){
        int counter = 0;
        int localCounter = 0;
        for(int y = 0; y < classArray.length; y++){
            int yVal = classArray[y];
            System.out.println("The Y values of the class array: " + yVal);
            if(yVal == 1){
                System.out.println("A one was found");
                for (int z = y + 1; z < classArray.length; z++){

                    if(classArray[z] == 0){
                        localCounter += 1;
                        System.out.println("LocalCounter Incremented");
                    }
                    else{
                        break;
                    }

                }
                if(localCounter > counter){
                    counter = localCounter;
                    localCounter = 0;
                }
            }
        }
        System.out.println("The counter is: " + counter);
        return (counter);
    }

    //Unused Method
    //Integer converted into Binary String
    public static String integerArraySetter(int N){
        //Convert N to binary string
        String NBinaryConversion = Integer.toBinaryString(N);
        String[] binaryStringArray = NBinaryConversion.split("");
        System.out.println("The Binary String is: " + NBinaryConversion);
        return (NBinaryConversion);
    }
}










