
/**
  * Happy Meal Algorithm to determine what toy user receives.
  * Holds list of possible toys user may receive.
  * MAINLY TO CHEESE REQUIREMENTS
  */
public class HappyMeal {
    private static String[] toys = { "Donald McRonald Doll", "McWrist Wallet", "Diener Keshi Figures", "McDonaldland Cookies",
            "McNugget Buddies", "Berenstain Bears", "Chip 'n Dale Rescue Rangers","Ronald McDonald Doll", "Muppet Babies",
            "Mickey's Birthdayland Racers", "Ty Teenie Beanie Babies", "Power Rangers Action Figures", "Hot Wheels"};

    /**
      * Happy Meal Secret Algorithm A.K.A Cheesing REQUIREMENTS
      */
    public static void getToy() {
        String mode = getMode(toys);
        String longest = getLongestString(toys);
        String shortest = getShortestString(toys);
        boolean contains = doesContain(toys, "Hot Wheels");
        String [] shiftedToys = shiftToRight(toys);
        String [] reversedToys = reverse(toys);
        int[] cheeseReqs = {mode.length(), shiftedToys.length, longest.length(), shortest.length()};
        int maxCheese = getMax(cheeseReqs);
        int minCheese = getMin(cheeseReqs);
        int sumOfReqs = getSum(cheeseReqs);
        boolean divisble = isDivisble(cheeseReqs[1], cheeseReqs[2]);
        boolean hasDuplicate = hasDuplicate(toys);
        boolean isAscending = isAscending(cheeseReqs);
        double mean = getMean(cheeseReqs);
        int randomvalue = (int)(Math.random() * ((toys.length - 1) + 1));

        if (divisble && hasDuplicate && isAscending) {
          System.out.println("Our advanced Happy Meal algorithm has determined that you have unlocked a toy!");
          System.out.println("Donald McRonald awards you with " + correctPlurality(toys[randomvalue]));
          drawDog();
        } else {
            int strangeNumber = (int)((mean + sumOfReqs + maxCheese + minCheese)/(randomvalue + 1));

            if (strangeNumber < 15) {
                System.out.println("Our advanced Happy Meal algorithm has determined that you have unlocked a toy!");
                System.out.println("Donald McRonald awards you with " + correctPlurality(toys[0]) + ".");
                drawDog();
            } else if (strangeNumber < 30) {
                System.out.println("Our advanced Happy Meal algorithm has determined that you have unlocked a toy!");
                System.out.println("Donald McRonald awards you with " + correctPlurality(toys[toys.length / 2]) + ".");
                drawDog();
            } else {
                System.out.println("Our advanced Happy Meal algorithm has determined that you have unlocked a toy!");
                System.out.println("Donald McRonald awards you with " + correctPlurality(toys[toys.length - 1]) + ".");
                drawDog();
            }
        }
    }


    /**
      * Returns word with "a" in front of it if it is singular, else, returns the string.
      * @param s A string
      * @return "a " + the string if singular, else just string if plural.
      */ 
    private static String correctPlurality(String s) {
        if (s.endsWith("s")) {
            return s;
        } else {
            return "a " + s;
        }
    }
    
    /**
      * Returns true if an array contains a specific string.
      * @param arr A String array.
      * @param val A specific string.
      * @return true if a specific string is found in an array of strings.
      */
    public static boolean doesContain(String[] arr, String val) {
        for (String n : arr) {
            if (n == val)
                return true;
        }

        return false;
    }

    /**
      * Returns true if a number is divisible by another number.
      * @param a Integer quotient.
      * @param b Integer divsor.
      * @return true if a is evenly divisble by b.
      */
    private static boolean isDivisble(int a, int b) {
        return a % b == 0;
    }

    /**
      * Returns true if an array has a duplicate element.
      * @param arr An array of strings.
      * @return true if array has a duplicate element.
      */
    private static boolean hasDuplicate(String[] arr) {
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[j].equals(arr[i]))
                    return true;
            }
        }

        return false;
    }

    /**
      * Returns true if integer array is in ascending order.
      * @param arr An array of integers.
      * @returns true if array is in ascending order.
      */
    private static boolean isAscending(int[] arr) {
        int len = arr.length;

        for (int i = 1; i < len; i++) {
            if (!(arr[i] > arr[i - 1]))
                return false;
        }

        return true;
    }

    /**
      * Returns the average value of an array.
      * @param arr An array of integers.
      * @return the average value of an array.
      */
    private static double getMean(int[] arr) {
        return (double) getSum(arr) / arr.length;
    }

     private static int getMin(int[] arr) {
        int min = arr[0];

        for (int n : arr) {
            if (n < min)
                min = n;
        }

        return min;
    }
    
    /**
      * Returns maximum integer in array.
      * @param arr An array of integers.
      * @return maximum integer in array.
      */
    private static int getMax(int[] arr) {
        int max = arr[0];

        for (int n : arr) {
            if (n > max)
                max = n;
        }

        return max;
    }
    
    /**
      * Returns the sum of the integers in an array.
      * @param arr An array of integers.
      * @return sum of the integers in the array.
      */
    private static int getSum(int[] arr) {
        int total = 0;

        for (int n : arr) {
            total += n;
        }

        return total;
    }

     /**
      * Returns the sum of the doubles in an array.
      * @param arr An array of doubles.
      * @return sum of the doubles in the array.
      */
    private static double getSum(double[] arr) {
        double total = 0;

        for (double n : arr) {
            total += n;
        }

        return total;
    }

    /**
      * Returns the mean of the doubles in an array.
      * @param arr An array of doubles.
      * @return mean of the doubles in the array.
      */
    private static double getMean(double[] arr) {
        return (double) getSum(arr) / arr.length;
    }

    /**
      * Returns the mode of the strings in an array.
      * @param arr An array of strings.
      * @return mode of the strings in the array.
      */
    private static String getMode(String[] arr) {
        String mode = arr[0];
        int freq = 1;
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            int currentFreq = 0;

            for (int j = i; j < len; j++) {
                if (arr[j] == arr[i]) {
                    currentFreq++;
                    if (currentFreq > freq) {
                        freq = currentFreq;
                        mode = arr[i];
                    }
                }
            }
        }

        return mode;
    }

    /**
      * Returns the longest string in an array.
      * @param arr An array of strings.
      * @return the longest string in the array.
      */
    private static String getLongestString(String[] arr) {
        String longest = arr[0];
        int longestLen = arr[0].length();
        int len = arr.length;

        for (String s : arr) {
            if (s.length() > longestLen) {
                longestLen = s.length();
                longest = s;
            }
        }

        return longest;
    }

    /**
      * Returns the shortest string in an array.
      * @param arr An array of strings.
      * @return the shortest string in the array.
      */
    private static String getShortestString(String[] arr) {
        String shortest = arr[0];
        int shortestLen = arr[0].length();
        int len = arr.length;

        for (String s : arr) {
            if (s.length() < shortestLen) {
                shortestLen = s.length();
                shortest = s;
            }
        }

        return shortest;
    }

    /**
      * Returns an array with elements shifted one unit to the right.
      * @param arr An array of strings.
      * @return an array with elements shifted one unit to the right.
      */
    private static String[] shiftToRight(String[] str) {
       String [] temp = new String [str.length];
        for(int i = 0; i < str.length -1; i++)
        {
           temp[i+1] = str[i];
        }
          temp[0] = str[str.length-1];
          return temp;
    }

    /**
      * Returns an array with elements reversed.
      * @param arr An array of strings.
      * @returns a reversed array of strings.
      */
    private static String[] reverse(String[] arr) {
        String[] newArr = new String[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[arr.length - 1 - i] = arr[i];
        }

        return newArr;
    }

    /**
      * Prints dog
      */
    private static void drawDog() {
        System.out.println("─────────▄──────────────▄");
        System.out.println("─────────▄──────────────▄");
        System.out.println("────────▌▒█───────────▄▀▒▌");
        System.out.println("────────▌▒▒▀▄───────▄▀▒▒▒▐");
        System.out.println("───────▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐");
        System.out.println("───▄▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▀██▀▒▌");
        System.out.println("──▐▒▒▒▄▄▄▒▒▒▒▒▒▒▒▒▒▒▒▒▀▄▒▒▌");
        System.out.println("──▌▒▒▐▄█▀▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐");
        System.out.println("─▐▒▒▒▒▒▒▒▒▒▒▒▌██▀▒▒▒▒▒▒▒▒▀▄▌");
        System.out.println("─▌▒▀▄██▄▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒▌");
        System.out.println("─▌▀▐▄█▄█▌▄▒▀▒▒▒▒▒▒░░░░░░▒▒▒▐");
        System.out.println("▐▒▀▐▀▐▀▒▒▄▄▒▄▒▒▒▒▒░░░░░░▒▒▒▒▌");
        System.out.println("▐▒▒▒▀▀▄▄▒▒▒▄▒▒▒▒▒▒░░░░░░▒▒▒▐");
        System.out.println("─▌▒▒▒▒▒▒▀▀▀▒▒▒▒▒▒▒▒░░░░▒▒▒▒▌");
        System.out.println("─▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▐");
        System.out.println("──▀▄▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▄▒▒▒▒▌");
        System.out.println("────▀▄▒▒▒▒▒▒▒▒▒▒▄▄▄▀▒▒▒▒▄▀");
        System.out.println("───▐▀▒▀▄▄▄▄▄▄▀▀▀▒▒▒▒▒▄▄▀");
        System.out.println("──▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▀▀");
    }
}