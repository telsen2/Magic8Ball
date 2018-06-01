package com.company;


import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Please enter your question ");
       // String question = Scanner.nextLine();

        String answer = "n";

        while (answer != "n") {
            int count = 1;
            while (count < 20) {
                System.out.println("Please enter your question ");
                //String question = Scanner.nextLine();
                System.out.println("It is certain");
                count++;

                if (count == 2) ;
                System.out.println("Please enter your question ");
                //String question = Scanner.nextLine();
                System.out.println("It is decidedly so");
                count++;

                System.out.println("Please enter your question ");
                //String question = Scanner.nextLine();
                if (count == 3)
                    System.out.println("Without a doubt");
                count++;

                System.out.println("Please enter your question ");
                //String question = Scanner.nextLine();
                if (count == 4)
                    System.out.println("Yes definitely");
                count++;

                System.out.println("Please enter your question ");
                //String question = Scanner.nextLine();
                if (count == 5)
                    System.out.println("You may rely on it");
                count++;

                System.out.println("Please enter your question ");
                //String question = Scanner.nextLine();
                if (count == 6)
                    System.out.println("As I see it, yes");
                count++;

                System.out.println("Please enter your question ");
                //String question = Scanner.nextLine();
                if (count == 7)
                    System.out.println("Most likely");
                count++;

                System.out.println("Please enter your question ");
                //String question = Scanner.nextLine();
                if (count == 8)
                    System.out.println("Outlook good");
                count++;

                System.out.println("Please enter your question ");
                //String question = Scanner.nextLine();
                if (count == 9)
                    System.out.println("Yes");
                count++;

                System.out.println("Please enter your question ");
                //String question = Scanner.nextLine();
                if (count == 10)
                    System.out.println("Signs point to yes");
                count++;

                System.out.println("Please enter your question ");
                //String question = Scanner.nextLine();
                if (count == 11)
                    System.out.println("Outlook not so good");
                count++;

                System.out.println("Please enter your question ");
                //String question = Scanner.nextLine();
                if (count == 12)
                    System.out.println("Reply hazy try again");
                count++;

                System.out.println("Please enter your question ");
                //String question = Scanner.nextLine();
                if (count == 13)
                    System.out.println("Ask again later");
                count++;


                System.out.println("Please enter your question ");
                //String question = Scanner.nextLine();
                if (count == 14)
                    System.out.println("Better not tell you now");
                count++;

                System.out.println("Please enter your question ");
                //String question = Scanner.nextLine();
                if (count == 15)
                    System.out.println("Cannot predict now");
                count++;

                System.out.println("Please enter your question ");
                //String question = Scanner.nextLine();
                if (count == 16)
                    System.out.println("Very doubtful");
                count++;

                System.out.println("Outlook not so good ");
                //String question = Scanner.nextLine();
                if (count == 17)
                    System.out.println("Concentrate and ask again");
                count++;

                System.out.println("Please enter your question ");
                //String question = Scanner.nextLine();
                if (count == 18)
                    System.out.println("Don't count on it");
                count++;

                System.out.println("Please enter your question ");
                //String question = Scanner.nextLine();
                if (count == 19)
                    System.out.println("My reply is no");
                count++;

                System.out.println("Please enter your question ");
                //String question = Scanner.nextLine();
                if (count == 20)
                    System.out.println("My sources say no");
                count++;

                System.out.println("Do you have another question for the Magic 8-Ball? (y/n)");
                 }

        }
    }
}
/*
            String answer = "y";

            String a = "It is certain";
            String b = "It is decidedly so";
            String c = "Without a doubt";
            String d = "Yes definitely";
            String e = "You may rely on it";
            String f = "As I see it, yes";
            String g = "Most likely";
            String h = "Outlook good";
            String i = "Yes";
            String j = "Signs point to yes";
            String k = "Reply hazy try again";
            String l = "Ask again later";
            String m = "Better not tell you now";
            String n = "Cannot predict now";
            String o = "Concentrate and ask again";
            String p = "Don't count on it";
            String q = "My reply is no";
            String r = "My sources say no";
            String s = "Outlook not so good";
            String t = "Very doubtful";

            //    while user does not enter no the loop it continues
            //    if the user enters a question that has a letter 'a'
            //    this will select the corresponding answer from the list

        System.out.println("Do you have another question for the Magic 8-Ball? (y/n) ");
        answer = Scanner.nextLine();
            while (answer != "n") {
                String[] arr;
                arr = new String[]{
                                     "It is certain";
                                     "It is decidedly so";
                                     "Without a doubt";
                                     "Yes definitely";
                                     "You may rely on it";
                                     "As I see it, yes";
                                     "Most likely";
                                     "Outlook good";
                                     "Yes";
                                     "Signs point to yes";
                                     "Reply hazy try again";
                                     "Ask again later";
                                     "Better not tell you now";
                                     "Cannot predict now";
                                     "Concentrate and ask again";
                                     "Don't count on it";
                                     "My reply is no";
                                     "My sources say no";
                                     "Outlook not so good";
                                     "Very doubtful";
                }
            };

                int getRandom(int[] arr);
                {
                    Random rn = new Random();
                    int x = 1 + rn.nextInt(20);

                int i = new Random(arr.length);
                 return arr[i]

                System.out.println(arr[rn]);
                    answer = Scanner.nextInt();
            }


            System.out.println("Do you have another question for the Magic 8-Ball? (y/n) ");
            //keyboard.close();
        }
    }
*/