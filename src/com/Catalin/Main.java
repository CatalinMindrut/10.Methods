package com.Catalin;

public class Main {

    public static void main(String[] args) {
        /** Methods are made of statements. The "main" is a method.
         * You can't have methods within methods.
         */
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        calculateScore(true, 800, 5, 100);
        /** Calling the method here means that the program will run the above variables then it will jump down to the
         * method that is being called, then continue with the variables below.
         * "true, 800, 5, 100" are the arguments used when calling the method.
         * "gameOver, score, levelCompleted, bonus" are the method parameters, used when the method was created.
         * So you are calling a method that has these parameters with these arguments.
         * If you have no arguments for the parameters you can just use the parameters (variable name):
         * calculateScore(true, 800, levelCompleted, 100).
         */

        int highScore = newCalculateScore(true, 600, 4, 10);
        System.out.println("Your Highscore was " + highScore);
        /**You can also assign a method to a variable, as a value. In the example above, the highScore integer will store
         * the value returned by newCalculateScore, using a given set of arguments.
          */

        /** The same can be done for the code below, the same method can be called again but with different arguments.
         */
        calculateScore(true, 10000, 8, 200);
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        if (gameOver){
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }
    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        /** Within the parentheses following the method name, you can set the method parameters. Type in the type of the
         * variable and then the name of the variable.
         * These parameters can be sent to a method when calling it: calculateScore(true, 800, 5, 100).
         * The values sent to the method are called arguments.
         */
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
        /** When setting up parameters for the method, Java actually creates those variables, with the appropriate data
         * types, that will be deleted once the method call was processed and the program continues with the rest of the code.
         */

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
        /** calculateScore is a method. Running it will process every line within that method.
         * Methods can be called by using their name + the parameters: calculateScore().
         * Light gray and underlined (dark theme) text means that the element is not being used anywhere.
         */
        /** The code has been reduced to 1 method and 2 calls.
         */
    }
    public static int newCalculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        /** VOID means: don't send any value back.
         * If you do want to send something then you need to change VOID to the data type that you want to send back.
         */
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
            /** If a methods sends something back, in this case an integer, besides stating that it will send something, you
             * must also define what is being sent. To do this you are using the return.
             */
        } else return -1;
        /** Stating that the method will return an integer, means that it will always return an integer, no matter what.
         * So in order to avoid an error you must take into account that gamOver might also be false, not always true.
         * That is why we use the else, meaning that the method will return the finalScore if gameOver is true and in any
         * other case, the method will return -1.
         */
        //return -1;
        /** You can also place the return here, with no else. This means that when the method is called, the codeblock is
         * processed and only if the "if" was not true, the process will continue with the return. Both methods are valid.
         * Why we are returning a -1? Well in programming terms -1 is conventionally used to indicate an error.
         */
    }
}