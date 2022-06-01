class baiTap {

    public static int arraySum(int[] array) {
        //Method 1
        int sum = 0;
        for (int integer : array) {
            sum += integer;
        }
        return sum;
    }


    public static char getMostFreqChar(String str) {
        //Method 2
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        int max = 0;
        char maxChar = ' ';
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                maxChar = (char) i;
            }
        }
        return maxChar;
    }


    public static int[] sortArray(int[] array) {
        //Method 3
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }


    public static boolean isPrime(int n) {
        //Method 4
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static Exception getTriangleException() {
        return new Exception("Invalid triangle");
    }


    public static double triangleArea(int a, int b, int c) throws Exception {
        //Method 5
        // check valid triangle if not throw exception
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw getTriangleException();
        }
        // calculate area
        double s = (double)(a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void printCircle(int radius) {
        //Method 6
        for(int row = 0; row <= 2*radius; row++) {
            for(int col = 0; col <= 2*radius; col++) {
                double distance = Math.sqrt((row-radius)*(row-radius) + (col-radius)*(col-radius));
                if(distance > radius - 0.5 && distance < radius + 0.5) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
