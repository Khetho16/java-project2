import java.util.Scanner;

public class Longest {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter multiple names");
            String name = input.nextLine();
            while(name != null){
                System.out.println("Enter multiple names");
                String name = input.nextLine();
            }
//            //String[] words = {"the", "quick", "brown", "fox", "ate", "my","chicken", "Khethokuhle"};
            String[] words = {name};
            //name = words;
            longest(words);
        }

        public static void longest(String[] words) {

            String longest = words[0];
            for (int i = 1; i < words.length; i++) {
                if (words[i].length() > longest.length()) {
                    longest = words[i];
                }else if(words.length == 0){
                    System.out.println("The are no words in the array");
                }
            }

            System.out.println("Longest word: " + longest);
        }

}
