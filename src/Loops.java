import java.util.*;
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Part 1
        // While loop demo (1)
//        int i = 0;
//        while (i < 5) {
//            System.out.println("X");
//            i++;
//        }
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        i=5;
//        // Do while loop demo (2)
//        do {
//            System.out.println("X");
//        } while (i < 5);
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        // For loop demo (3)
//        for (int j = 1; j < 11; j++){
//            System.out.print(j + " ");
//        }
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        for (int n = 10; n > 0; n--){
//            System.out.print(n + " ");
//        }
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        // Iteration through String demo (4)
//        System.out.println("Give me a String please:");
//        String string = sc.nextLine();
//        int count = string.length();
//        for (int k = 0; k < count; k++){
//            System.out.println(string.charAt(k));
//        }
//        System.out.println("");
//        System.out.println("");
//        // Loop inside loop (5)
//        int l, m, rows=10;
//        for(l = 0; l < rows; l++){
//            for (m = 0; m < l; m++){
//                System.out.print("* ");
//            }
//        System.out.println();
//        }
//
//
// Part 2
//        int o = 0;
//        while (o < 1) {
//            System.out.println("Hello, User! Can you please input a String for me?");
//            String string2 = sc.nextLine();
//            System.out.println(string2.toUpperCase());
//            System.out.println("Would you like to continue and try again? (Y/N)");
//            String answer = sc.nextLine();
//            answer = answer.toUpperCase();
//            if(answer.equals("Y")){
//                System.out.println("Sure thing!");
//            }
//            else{
//                System.out.println("Bye then!");
//                o++;
//            }
//        }
// Part 3 (Didn't work for me, have no idea why)
//        System.out.println("Hello, User! Can you please input a String for me?");
//        String string3 = sc.nextLine();
//        int count1 = string3.length();
//        for (int p = count1; p >= 0; p--){
//            System.out.println(string3.charAt(p));
//        }
// Part 4
        String newline = System.lineSeparator();
        boolean h = true;
        while (h = true) {
            System.out.println("Hello, User, what's your name?");
            String username = sc.nextLine();
            System.out.println("Nice to meet you, " + username + ". What's your favorite movie genre?");
            System.out.println("Here are some of the most popular genres: " + newline + "Horror" + newline + "Fantasy" + newline + "Sci-Fi" + newline + "Thriller" + newline + "Comedy");
            String genre = sc.nextLine();
            genre = genre.toUpperCase();
            System.out.println("And one more question: how old are you?");
            int userage = sc.nextInt();
            if (userage <= 15) {
                switch (genre) {
                    case "HORROR":
                        System.out.println("I wouldn't recommend you watching any horrors until 16.");
                        break;
                    case "FANTASY":
                        System.out.println("Charlie and the Chocolate Factory is a cool fantasy movie!");
                        break;
                    case "SCI-FI":
                        System.out.println("Buzz Lightyear is a cool sci-fi movie to watch!");
                        break;
                    case "THRILLER":
                        System.out.println("Nightmare before Christmas is a cool thriller movie to watch!");
                        break;
                    case "COMEDY":
                        System.out.println("Bad Guys is a cool comedy movie to watch!");
                        break;
                    default:
                        System.out.println("");
                }
            } else if (userage >= 16) {
                switch (genre) {
                    case "HORROR":
                        System.out.println("Time is a cool horror movie to watch!");
                        break;
                    case "FANTASY":
                        System.out.println("Doctor Strange is a cool fantasy movie!");
                        break;
                    case "SCI-FI":
                        System.out.println("Samaritan is a cool sci-fi movie to watch!");
                        break;
                    case "THRILLER":
                        System.out.println("Deep Waters is a cool thriller movie to watch!");
                        break;
                    case "COMEDY":
                        System.out.println("Man from Toronto is a cool comedy movie to watch!");
                        break;
                    default:
                        System.out.println("");
                }
            }
            sc.nextLine();
            System.out.println("Would you like to try again?");
            String answer5 = sc.nextLine();
            answer5 = answer5.toUpperCase();
            if (answer5.equals("Y")){
                System.out.println("Sure thing!");
            }
            else{
                System.out.println("Oh, alright!");
                System.exit(0);
            }

        }
    }
}
