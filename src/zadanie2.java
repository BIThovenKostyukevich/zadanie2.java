import java.io.IOException;
import java.util.ArrayList;

public class zadanie2 {
    public static void main (String [] args) throws IOException{
        int [] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < data.length; i++) {
            list.add(data[i]);
        }
        ArrayList<Integer> even = new ArrayList<Integer>();

        for(int i=0; i < list.size(); i++) {
            int x = list.get(i);
            if(x % 2 == 0)
                even.add(x);

        }


        System.out.println(even);
    }
}