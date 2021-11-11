public class Palindrome {
 public static void main(String[] args) {
 for (int i = 0; i < args.length; i++) {
 String s = args[i];
 System.out.println(s+" "+ isPalindrome(s));

}
}
  public static String reverseString(String s) {
  String res= "";
  for (int i=0; i<s.length(); i++) {
  res = s.charAt(i)+res;
  }
  return res;
}
public static boolean isPalindrome(String s) {
        String reverse_s=reverseString(s);
        return reverse_s.equals(s);
}
}

