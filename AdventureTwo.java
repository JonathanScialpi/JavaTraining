import java.util.*;
public class AdventureTwo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("JON'S TINY ADVENTURE 2!");
        String answer = "";
        do {
            System.out.print("You are in a corn maze! Would you like to turn \"left\", \"right\" or go \"straight?\"");
            answer = keyboard.nextLine();
            if (answer.equals("left")) {
                System.out.print("You turn left and notice two road signs. The \"first\" mentions a fairy while the \"second\" warns about a crocodile infested lagoon." +
                        " Which do you choose? (OR You can go \"back\")");
                answer = keyboard.nextLine();
                if (answer.equals("first")){
                    System.out.print("You meet the Blue Fairy. She asks: What is..." +
                            "\r\n-Greater than God,  more evil than the Devil, the Rich have it, the Poor need it, and if you eat it you die?");
                    answer = keyboard.nextLine();
                    if(answer.equals("nothing")){
                        System.out.print("Blue Fairy says: \"You are wise. And for this, I have freed you from the maze!\"");
                    }else{
                        System.out.print("Blue Fairy says: \"That was not the correct answer. I will now keep you in this maze for the rest of your life!\"");
                    }
                }
                else if (answer.equals("second")){
                    System.out.print("You proceed to face the Crocodile Infested Lagoon. You may try to \"swim\" across or go \"back\"");
                    answer = keyboard.nextLine();
                    if(answer.equals("swim")){
                        System.out.print("You were torn to pieces by hungry Crocs!");
                    }
                }
            } else if (answer.equals("right")) {
                System.out.print("You turn right and notice two road signs. The \"first\" mentions batting practice while the \"second\" warns about a bull." +
                        " Which do you choose? (OR You can go \"back\")");
                answer = keyboard.nextLine();
                if (answer.equals("first")){
                    System.out.print("Upon entering, a sports announcer screams over the mic that you are next up to bat against ROGER CLEMENS! You may try to \"hit\" the pitch or \"hope\" he walks you...");
                    answer = keyboard.nextLine();
                    if (answer.equals("hit")){
                        System.out.print("You swing at what you thought was his fast ball and missed his split-finger-fast-ball! You're out and condemned to an eternity in the maze :( ");
                    }
                    else if(answer.equals("hope")){
                        System.out.print("Well he didn't walk you, but he didn't strike you out. You were hit by the pitch and get to leave the maze with a very sore shoulder.");
                    }
                }
                else if (answer.equals("second")){
                    System.out.print("You notice a SUV sized bull with large horns staring at you. You can \"wait\" till he gets sidetracked by some grass or \"run\" for the exit...");
                    answer = keyboard.nextLine();
                    if (answer.equals("wait")){
                        System.out.print("Well he did stop looking at you. But as soon as you though his guard was down and you went for the exit, he nailed you!");
                    }
                    else if(answer.equals("run")){
                        System.out.print("Good try, but he still got you :/");
                    }
                }
            }else if (answer.equals("straight")){
                System.out.print("You walk straight and notice two road signs. The \"first\" mentions a glass floor while the \"second\" warns about a mine field." +
                        " Which do you choose? (OR You can go \"back\")");
                answer = keyboard.nextLine();
                if (answer.equals("second")){
                    System.out.print("You see a grass yard that's supposedly littered with mines. Will you try to \"walk\" across or \"throw\" a rock?");
                    answer = keyboard.nextLine();
                    if(answer.equals("walk")){
                        System.out.print("You take a few steps and already step on a mine. It was a dud thank God! Proceed to exit the maze :)");
                    }
                    else if (answer.equals("throw")){
                        System.out.print("You threw a rock and hit mine! You caused a chain-reaction and the entire yard blew up...including you :(");
                    }
                }
                else if (answer.equals("first")){
                    System.out.print("You stand at the entrance of the next room peering down into a transparent floor. You may \"walk\" across or \"toss\" a stone...");
                    answer = keyboard.nextLine();
                    if (answer.equals("walk")){
                        System.out.print("You forgot to read the fine print. \"WARNING GLASS FLOOR has not been installed yet.\" Yeah, you fell :/");
                    }
                    else if (answer.equals("When you tossed the stone, you saw it dropped to the abyss where the floor should be. You turned around and tried another path..."));
                    answer ="back";
                }
            }
        } while (answer.equals("back"));
    }
}
