package leetcode.strings.simple;

import java.util.LinkedList;
import java.util.List;

public class test0412 {
    public List<String> fizzBuzz(int n) {
        List<String> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if(i%3==0&&i%5!=0)
                list.add(i-1,"Fizz");
            else if(i%5==0&&i%3!=0)
                list.add(i-1,"Buzz");
            else if(i%3==0&&i%5==0)
                list.add(i-1,"FizzBuzz");
            else
                list.add(i-1,String.valueOf(i));
        }
        return list;
    }
}
