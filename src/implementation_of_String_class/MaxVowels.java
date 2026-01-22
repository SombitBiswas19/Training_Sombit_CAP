package implementation_of_String_class;

public class MaxVowels {
    public static void main(String[] args) {
        String s = "I love programming";
        String[] words = s.split(" ");
        String vowels = "aeiouAEIOU";
        int max = 0;
        String result = "";

        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if (vowels.indexOf(words[i].charAt(j)) != -1) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                result = words[i];
            }
        }
        System.out.println(result);
    }
}


