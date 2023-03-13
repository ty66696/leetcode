package leetcode.strings.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class test0929 {
    public static void main(String[] args) {
        String[] emails ={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        numUniqueEmails(emails);
    }
    public static int numUniqueEmails(String[] emails) {

        for (int i = 0; i < emails.length; i++) {
            String s = emails[i].split("@")[0];
            String s2 = emails[i].split("@")[1];
            s=s.replace(".","");
            s=s.split("[+]")[0];
            emails[i]=s+"@"+s2;
        }
        HashSet<String> hs = new HashSet<>();
        hs.addAll(Arrays.asList(emails));
        return hs.size();

    }
}
