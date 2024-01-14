public class recursionlec7 {

    static String remove_all_asinglecharacter(String str, int index, StringBuilder ans, char target) {
        if (index >= str.length())
            return ans.toString();

        if (str.charAt(index) != (target)) {
            ans.append(str.charAt(index));
        }

        return remove_all_asinglecharacter(str, index + 1, ans, target);

    }

    static String remove_all_asinglecharacter_part2(String str, int index, char target) {
        if (index >= str.length())
            return "";

        if (str.charAt(index) == target)
            return remove_all_asinglecharacter_part2(str, index + 1, target);
        else
            return str.charAt(index) + remove_all_asinglecharacter_part2(str, index + 1, target);

    }

    static String remove_all_asinglecharacter_part3(String str, int index, String ans, char target) {
        if (index >= str.length())
            return ans;

        if (str.charAt(index) != (target)) {
            ans += str.charAt(index);
        }

        return remove_all_asinglecharacter_part3(str, index + 1, ans, target);

    }

    static String reverse(String str, int index, String ans) {
        if (index < 0)
            return "";

        return str.charAt(index) + reverse(str, index - 1, ans);
    }

    static String reverse_part2(String str, int index, String ans) {
        if (index >= str.length())
            return "";

        return reverse_part2(str, index + 1, ans) + str.charAt(index);
    }

    static boolean palindrome_string(String str, int left, int right) {
        if (left >= right)
            return true;

        if (str.charAt(left) == str.charAt(right)) {
            return palindrome_string(str, left + 1, right - 1);
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        String sen = "ssssssssssaaaaaaaaasssssssabsv";
        String sen2 = "malayalam";
        char target = 's';
        System.out.println(remove_all_asinglecharacter(sen, 0, new StringBuilder(), target));
        System.out.println(remove_all_asinglecharacter_part2(sen, 0, target));
        System.out.println(remove_all_asinglecharacter_part3(sen, 0, "", target));

        System.out.println(reverse(sen, sen.length() - 1, ""));
        System.out.println(reverse_part2(sen, 0, ""));

        String str2 = reverse_part2(sen, 0, "");
        if (str2.equalsIgnoreCase(sen))
            System.out.println("yes palindrome");
        else
            System.out.println("not palindrome");

        System.out.println(palindrome_string(sen2, 0, sen2.length() - 1));

    }

}
