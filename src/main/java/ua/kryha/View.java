package ua.kryha;

import java.util.List;

public class View {


    public static final String COMMA_AND_DOT = ";";
    public static final String SPACE = " ";
    public static final String GREETING = "Hello my friend! Let's start the game";
    public static final String WRONG_LIMITS = "Your min value must be two less than the max value. Set the borders again!";
    public static final String INPUT_INT_VARIABLE = "The program guessed the number! Please , input your value!";
    public static final String SET_RANGE_OF_GAME = "Now we will be set range of our game..";
    public static final String LIMITS_OF_INT = "Your limits would be from -2147483648 to 2147483647";
    public static final String LIMITS_OF_GAME = "Your limits would be from %d to %d not inclusive";
    public static final String SET_MIN_RANGE = "Set minimal border!";
    public static final String SET_MAX_RANGE = "Set maximal border!";
    public static final String WRONG_INPUT_DATA = "Ohh it's not a value .. Try again!";
    public static final String CONGRATULATION = "Well done! You are the best , the secret value was:";
    public static final String LOGGER = "Look at your attempts:";
    public static final String TRY_VALUE_MORE = "Try more value!";
    public static final String TRY_VALUE_LESS = "Try less value!";
    public static final String COUNT_OF_ATTEMPTS = "Count of your attempts:";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printLimits(int min, int max) {
        System.out.println(String.format(LIMITS_OF_GAME, min, max));
    }

    public void printMessageInLine(String message) {
        System.out.print(message);
    }


}
