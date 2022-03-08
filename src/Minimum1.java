import javax.swing.*;
import java.util.Arrays;

public class Minimum1 {

    public static int minValue(int[] arrayA, int[] arrayB, int n) {

        Shuffle obj = new Shuffle();

        int sum = 0;
        int length = n - 1;

        obj.Shuffler(arrayA); //Shuffles of the arrays, here its shuffling arrayA

        for (int i = 0; i < arrayA.length; i++) {


            sum += arrayA[i] * arrayB[length];
            --length;
        }

        return sum;
    }

    int[] getSums(int []X,int []Y, int [] sums){

        for (int i = 0; i < sums.length; i++) {

            sums[i] = Minimum1.minValue(X, Y, X.length);
        }
        return sums;
    }


public static void main (String[]args){

            int[] A = {3, 1, 1};
            int[] B = {5, 6, 4};
            int n = A.length;

            Minimum1 obj= new Minimum1();

            int [] temp= new int[n*4];

            obj.getSums(A,B,temp);

            System.out.print(Arrays.toString(temp));

            Arrays.sort(temp);

        JOptionPane.showMessageDialog(null, "The minimum sum: " + temp[0]);
        }
    }
