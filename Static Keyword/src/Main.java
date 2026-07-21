public class Main {

    public static void main(String[] args) {

        // static = Makes a variable or methods belong to the class
        //          rather than to any specific object
        //          Commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("Felix");
        Friend friend2 = new Friend("Ezra");
        Friend friend3 = new Friend("Alice");
        Friend friend4 = new Friend("Selena");
        Friend friend5 = new Friend("Patrick");

        // System.out.println(Friend.numOfFriends); // static method
        /* System.out.println(friend1.numOfFriends);
           System.out.println(friend2.numOfFriends);
           System.out.println(friend3.numOfFriends);
         */

        Friend.showFriends();
    }
}