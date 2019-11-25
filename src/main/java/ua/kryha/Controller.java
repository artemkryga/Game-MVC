package ua.kryha;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        view.printMessage(View.GREETING);
        view.printMessage(View.SET_RANGE_OF_GAME);

        while (true) {
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
        model.setRandomValue();
        while (model.checkValue(inputIntValueWithRange(sc)));

    }

    private int inputIntValueFromUserForCheckKey(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_DATA);
            scanner.next();
        }
        return scanner.nextInt();
    }
    private int inputIntValue(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_DATA + View.SPACE + View.LIMITS_OF_INT);
            scanner.next();
        }
        return scanner.nextInt();
    }

    private int inputIntValueWithRange(Scanner scanner) {
          int result = 0;

          while (true) {
              result = inputIntValueFromUserForCheckKey(scanner);
              if (result > model.getMinBorder() && result < model.getMaxBorder()) {
                return result;
              }
              else {
                  view.printLimits(model.getMinBorder() , model.getMaxBorder());
              }

          }
    }




}