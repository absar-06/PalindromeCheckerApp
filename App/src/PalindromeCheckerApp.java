public class PalindromeCheckerApp {

    public static void main(String[] args) {
                String str = "radar";
                char[] ch = str.toCharArray();
                boolean isPalindrome = true;
                for (int i = 0; i < ch.length / 2; i++) {
                    if (ch[i] != ch[ch.length - 1 - i]) {
                        isPalindrome = false;
                        break;
                    }
                }
                System.out.println("Is Palindrome: " + isPalindrome);
            }
        }