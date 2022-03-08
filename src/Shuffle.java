import java.util.Arrays;
import java.util.Random;

public class Shuffle {
    public int [] Shuffler(int []A){


        //shuffle
        Random rand = new Random();


        for(int i=0;i< A.length;i++){
            int randomIndex= rand.nextInt(A.length);

            if(i!=randomIndex){
            int temp = A[randomIndex];
            A[randomIndex] = A[i];
            A[i] = temp;
            }
        }
        return A;
    }
}
