import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import java.util.Scanner;
//command for Guesser to Guess the Number
class GuesserG {
    int guessNum;
    int guessingNum(){
        System.out.println("Guesser!\nPlease Guess the Number:-");
        Scanner S=new Scanner(System.in);
        guessNum=S.nextInt();
        return guessNum;
    }
}

//command for players
class Players{
    int guessNum;
    int guessingNum(){
        System.out.println("Players! \nJaldi Number Guess karo:-");
        Scanner s=new Scanner(System.in);
        guessNum=s.nextInt();
        return guessNum;
    }
}

//now the umpire come into the role
class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;


    //umpire is collecting the number from Guesser
    void collectNumFromGuesser(){
        GuesserG g=new GuesserG();
        numFromGuesser=g.guessingNum();
    }


    //umpire is collecting the numbers from Players
    void collectNumFromPlayers(){
        Players p1=new Players();
        Players p2=new Players();
        Players p3=new Players();
        numFromPlayer1=p1.guessingNum();
        numFromPlayer2=p2.guessingNum();
        numFromPlayer3=p3.guessingNum();
    }


    //now decision making by the Umpire
    void decision(){
        if(numFromGuesser==numFromPlayer1){
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3){
                System.out.println("Game Tie! Aap Sabhi vijeta hain.");
                System.out.println("Now You have to try again");
                Umpire u=new Umpire();
                u.collectNumFromGuesser();
                u.collectNumFromPlayers();
                u.decision();
            }
            else if(numFromGuesser==numFromPlayer2){
                System.out.println("wow! \nPlayer 1 & Player 2 are Winners");
                int n=5;
                for(int i=0;i<n;i++){
                    System.out.print("                                       ");
                    for(int j=0;j<n;j++){
                        if(j-i<=(n-1)/2 && i+j>=(n-1)/2 && i-j<=(n-1)/2 && i+j<=(n-1)+(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print("           ");
                    for(int j=0;j<n;j++){
                        if(j==0 || j==n-1 || i==j && i>=(n-1)/2 || i+j==n-1 && i>=(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(i==0 || j==0 || i==n-1 || i==(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(j==0 || i==n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(j==0 || i==n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print("       ");
                    for(int j=0;j<n;j++){
                        if(j==0 || i==0 && j<n-1 || i==n-1 && j<n-1 || j==n-1 && i>0 && i<n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(j==0 && i>0 && i<n-1 || i==0 && j<n-1 && j>0 || i==n-1 && j<n-1 && j>0 || j==n-1 && i>0 && i<n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(j==0 || i==j || j==n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(i==0 || j==0 || i==n-1 || i==(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print("          ");
                    for(int j=0;j<n;j++){
                        if(j-i<=(n-1)/2 && i+j>=(n-1)/2 && i-j<=(n-1)/2 && i+j<=(n-1)+(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
            else if(numFromGuesser==numFromPlayer3){
                System.out.println("wow!\n Player 1 & Player 3 are Winners");
                int n=5;
                for(int i=0;i<n;i++){
                    System.out.print("                                       ");
                    for(int j=0;j<n;j++){
                        if(j-i<=(n-1)/2 && i+j>=(n-1)/2 && i-j<=(n-1)/2 && i+j<=(n-1)+(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print("           ");
                    for(int j=0;j<n;j++){
                        if(j==0 || j==n-1 || i==j && i>=(n-1)/2 || i+j==n-1 && i>=(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(i==0 || j==0 || i==n-1 || i==(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(j==0 || i==n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(j==0 || i==n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print("       ");
                    for(int j=0;j<n;j++){
                        if(j==0 || i==0 && j<n-1 || i==n-1 && j<n-1 || j==n-1 && i>0 && i<n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(j==0 && i>0 && i<n-1 || i==0 && j<n-1 && j>0 || i==n-1 && j<n-1 && j>0 || j==n-1 && i>0 && i<n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(j==0 || i==j || j==n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(i==0 || j==0 || i==n-1 || i==(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print("          ");
                    for(int j=0;j<n;j++){
                        if(j-i<=(n-1)/2 && i+j>=(n-1)/2 && i-j<=(n-1)/2 && i+j<=(n-1)+(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
            else{
                System.out.println("Lajawaw! \nPlayer 1 jeet Gaya.");
                int n=5;
                for(int i=0;i<n;i++){
                    System.out.print("                                       ");
                    for(int j=0;j<n;j++){
                        if(j-i<=(n-1)/2 && i+j>=(n-1)/2 && i-j<=(n-1)/2 && i+j<=(n-1)+(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print("           ");
                    for(int j=0;j<n;j++){
                        if(j==0 || j==n-1 || i==j && i>=(n-1)/2 || i+j==n-1 && i>=(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(i==0 || j==0 || i==n-1 || i==(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(j==0 || i==n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(j==0 || i==n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print("       ");
                    for(int j=0;j<n;j++){
                        if(j==0 || i==0 && j<n-1 || i==n-1 && j<n-1 || j==n-1 && i>0 && i<n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(j==0 && i>0 && i<n-1 || i==0 && j<n-1 && j>0 || i==n-1 && j<n-1 && j>0 || j==n-1 && i>0 && i<n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(j==0 || i==j || j==n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(i==0 || j==0 || i==n-1 || i==(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print("          ");
                    for(int j=0;j<n;j++){
                        if(j-i<=(n-1)/2 && i+j>=(n-1)/2 && i-j<=(n-1)/2 && i+j<=(n-1)+(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        }
        else if(numFromGuesser==numFromPlayer2){
            if(numFromGuesser==numFromPlayer3){
                System.out.println("wow!\n Player 2 & Player 3 are Winners");
                int n=5;
                for(int i=0;i<n;i++){
                    System.out.print("                                       ");
                    for(int j=0;j<n;j++){
                        if(j-i<=(n-1)/2 && i+j>=(n-1)/2 && i-j<=(n-1)/2 && i+j<=(n-1)+(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print("           ");
                    for(int j=0;j<n;j++){
                        if(j==0 || j==n-1 || i==j && i>=(n-1)/2 || i+j==n-1 && i>=(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(i==0 || j==0 || i==n-1 || i==(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(j==0 || i==n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(j==0 || i==n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print("       ");
                    for(int j=0;j<n;j++){
                        if(j==0 || i==0 && j<n-1 || i==n-1 && j<n-1 || j==n-1 && i>0 && i<n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(j==0 && i>0 && i<n-1 || i==0 && j<n-1 && j>0 || i==n-1 && j<n-1 && j>0 || j==n-1 && i>0 && i<n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(j==0 || i==j || j==n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(i==0 || j==0 || i==n-1 || i==(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print("          ");
                    for(int j=0;j<n;j++){
                        if(j-i<=(n-1)/2 && i+j>=(n-1)/2 && i-j<=(n-1)/2 && i+j<=(n-1)+(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
            else{
                System.out.println("Hurray!\n Player 3 won the match.");
                int n=5;
                for(int i=0;i<n;i++){
                    System.out.print("                                       ");
                    for(int j=0;j<n;j++){
                        if(j-i<=(n-1)/2 && i+j>=(n-1)/2 && i-j<=(n-1)/2 && i+j<=(n-1)+(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print("           ");
                    for(int j=0;j<n;j++){
                        if(j==0 || j==n-1 || i==j && i>=(n-1)/2 || i+j==n-1 && i>=(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(i==0 || j==0 || i==n-1 || i==(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(j==0 || i==n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(j==0 || i==n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print("       ");
                    for(int j=0;j<n;j++){
                        if(j==0 || i==0 && j<n-1 || i==n-1 && j<n-1 || j==n-1 && i>0 && i<n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(j==0 && i>0 && i<n-1 || i==0 && j<n-1 && j>0 || i==n-1 && j<n-1 && j>0 || j==n-1 && i>0 && i<n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(j==0 || i==j || j==n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(i==0 || j==0 || i==n-1 || i==(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print("          ");
                    for(int j=0;j<n;j++){
                        if(j-i<=(n-1)/2 && i+j>=(n-1)/2 && i-j<=(n-1)/2 && i+j<=(n-1)+(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        }
        else if(numFromGuesser==numFromPlayer2){
            System.out.println("Hurray!\n Player 2 won the match.");
            int n=5;
                for(int i=0;i<n;i++){
                    System.out.print("                                       ");
                    for(int j=0;j<n;j++){
                        if(j-i<=(n-1)/2 && i+j>=(n-1)/2 && i-j<=(n-1)/2 && i+j<=(n-1)+(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print("           ");
                    for(int j=0;j<n;j++){
                        if(j==0 || j==n-1 || i==j && i>=(n-1)/2 || i+j==n-1 && i>=(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(i==0 || j==0 || i==n-1 || i==(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(j==0 || i==n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(j==0 || i==n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print("       ");
                    for(int j=0;j<n;j++){
                        if(j==0 || i==0 && j<n-1 || i==n-1 && j<n-1 || j==n-1 && i>0 && i<n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(j==0 && i>0 && i<n-1 || i==0 && j<n-1 && j>0 || i==n-1 && j<n-1 && j>0 || j==n-1 && i>0 && i<n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(j==0 || i==j || j==n-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0;j<n;j++){
                        if(i==0 || j==0 || i==n-1 || i==(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print("          ");
                    for(int j=0;j<n;j++){
                        if(j-i<=(n-1)/2 && i+j>=(n-1)/2 && i-j<=(n-1)/2 && i+j<=(n-1)+(n-1)/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
        }
        else{
            System.out.println("Ohh no!\n Aap sabhi Game haar gaye");
            System.out.println("Would you like to try again??\nIf Yes-\t then Press '1'");
            Scanner s=new Scanner(System.in);
            int inp=s.nextInt();
            if(inp==1){
                Umpire u=new Umpire();
                u.collectNumFromGuesser();
                u.collectNumFromPlayers();
                u.decision();
            }
            else{
                System.out.println("Game Finished");
            }
            
        }
    }
}

//now linking all these things with the main method 
public class GuesserGame{
    public static void main(String[] args) {
        System.out.println("                                                Welcome to the Guesser Game");
        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.decision();
    }
}