import java.util.ArrayList;
import java.util.Collections;
public class AboutArrayList {
        public static void main(String[] args) {
            // Write your code here 💖
            //Created a new ArrayList
            ArrayList<String> games = new ArrayList<>();

            //Add elements into ArrayList
            games.add("Valorant");
            games.add("CS2");

            //Access elements in ArrayList
            System.out.println(games.get(0));
            System.out.println(games.get(1));

            //Modify and Update ArrayList
            games.set(1, "Marvel Rivals");
            //This can only set update the values that are already set in the arraylist if not set this will provide an overflow error
            // games.set(2, "CS2");
            System.out.println(games.get(1));

            //Remove element
            games.remove(1);
            //The element has been removed so this will provide an error
            //System.out.println(games.get(1));

            //Clear Arraylist
            games.clear();

            //Iterate through an arrayList
            ArrayList<String> magicTricks = new ArrayList<>();

            magicTricks.add("Missing");
            magicTricks.add("Levitation");
            magicTricks.add("Linking");

            //Use of .size() to get the length of arraylist
            // for (int i = 0; i < magicTricks.size(); i++) {
            //     System.out.println(magicTricks.get(i));
            // }

            //Can sort this arraylist by imorting collections and use sort()
            Collections.sort(magicTricks);
            System.out.println(magicTricks);

            //Other arraylist that can be defined
            ArrayList<Integer> lightYearsAway = new ArrayList<>();
            ArrayList<String> moonTypes = new ArrayList<>();
            ArrayList<Boolean> isAPlanet = new ArrayList<>();
            ArrayList<Character> planetLetter = new ArrayList<>();
            ArrayList<Double> planetWeight = new ArrayList<>();
        }
}
