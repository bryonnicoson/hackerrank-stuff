import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        Calendar c = Calendar.getInstance();
        c.set(Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(day));
        SimpleDateFormat f = new SimpleDateFormat("EEEEE");
        System.out.println(f.format(c.get(Calendar.DAY_OF_WEEK)).toUpperCase());
        System.out.println(c.getTime());
    }
}