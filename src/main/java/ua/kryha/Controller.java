package ua.kryha;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    private int inputIntValue(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_DATA + View.SPACE + View.LIMITS_OF_GAME);
            scanner.next();
        }

        return scanner.nextInt();
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        view.printMessage(View.GREETING);
        view.printMessage(View.SET_RANGE_OF_GAME);

        while (!model.getTrueRange(model.getMinBorder() , model.getMaxBorder())) {
            view.printMessage(View.SET_MIN_RANGE);
            model.setMinBorder(inputIntValue(sc));
            view.printMessage(View.SET_MAX_RANGE);
            model.setMaxBorder(inputIntValue(sc));

            if (model.getTrueRange(model.getMinBorder() , model.getMaxBorder())) {
                break;
            }
            else {
                view.printMessage(View.WRONG_LIMITS);
            }
        }

        view.printMessage(View.INPUT_INT_VARIABLE);
        while (model.checkValue(inputIntValue(sc)));






    }



}