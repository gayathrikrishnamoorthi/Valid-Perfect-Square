package sample;

public class square {
	    public static boolean isPerfectSquare(int num) {
	        int i = 1;
	        int square = 1;

	        while (square <= num) {
	            if (square == num) {
	                return true;
	            }

	            i += 2;
	            square = i * i;
	        }

	        return false;
	    }

	    public static void main(String[] args) {
	        int num1 = 16;
	        int num2 = 14;

	        System.out.println(isPerfectSquare(num1));  
	        System.out.println(isPerfectSquare(num2));  
	    }
	}


