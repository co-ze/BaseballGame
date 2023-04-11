import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameLauncher gameLauncher = new GameLauncher();
        gameLauncher.beginning();

        boolean continuePlay = false;
        while (!continuePlay) {
            try {
                continuePlay = gameLauncher.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}