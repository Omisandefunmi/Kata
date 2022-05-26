package myersBriggsOOP;

public class Questionnaire {
    private int a1Counter;
    private int a2Counter;
    private int a3Counter;
    private int a4Counter;
    private int b1Counter;
    private int b2Counter;
    private int b3Counter;
    private int b4Counter;

    private final Question[] questions = new Question[20];
    private final String [] answers = new String[20];
    private int numberOfQuestion;
    private int numberOfAnswers;


    public void loadQuestion(int number, String query) {
        String header = number+"";
        Question question = new Question(header, query);
        questions[number - 1] = question;
        numberOfQuestion++;}

    public int checkNumberOfQuestions() {
        return numberOfQuestion;
    }

    public String serveQuestion(int number) {
        return questions[number-1].toString();
    }

    public void collectAnswers(int questionNumber, String answer) {
        if(answer.equalsIgnoreCase("A") || answer.equalsIgnoreCase("B")) {
            answers[questionNumber - 1] = answer.toUpperCase();
            numberOfAnswers++;}
        else {
            System.out.println("""
                    This input is invalid
                    Kindly re-take question\n""");
            serveQuestion(questionNumber);
            collectAnswers(questionNumber, answer);
        }
    }
    public int checkNumberOfAnswers() {return numberOfAnswers;}
    public void markAnswers() {
        for (int i = 0; i < numberOfAnswers; i++) {
            markAllA1(i);
            markAllB1(i);
            markAllA2(i);
            markAllB2(i);
            markAllA3(i);
            markAllB3(i);
            markAllA4(i);
            markAllB4(i);
        }
    }

    private void markAllA1(int count){
        if(count == 0 && answers[count].equals( "A")){a1Counter++;}
        if(count == 4 && answers[count].equals( "A")){a1Counter++;}
        if(count == 8 && answers[count].equals( "A")){a1Counter++;}
        if(count == 12 && answers[count].equals( "A")){a1Counter++;}
        if(count == 16 && answers[count].equals( "A")){a1Counter++;}
    }
    private void markAllB1(int count){
        if(count == 0 && answers[count].equals( "B")){b1Counter++;}
        if(count == 4 && answers[count].equals( "B")){b1Counter++;}
        if(count == 8 && answers[count].equals( "B")){b1Counter++;}
        if(count == 12 && answers[count].equals( "B")){b1Counter++;}
        if(count == 16 && answers[count].equals( "B")){b1Counter++;}
    }

    private void markAllA2(int count){
        if(count == 1 && answers[count].equals( "A")){a2Counter++;}
        if(count == 5 && answers[count].equals( "A")){a2Counter++;}
        if(count == 9 && answers[count].equals( "A")){a2Counter++;}
        if(count == 13 && answers[count].equals( "A")){a2Counter++;}
        if(count == 17 && answers[count].equals( "A")){a2Counter++;}
    }

    private void markAllB2(int count){
        if(count == 1 && answers[count].equals( "B")){b2Counter++;}
        if(count == 5 && answers[count].equals( "B")){b2Counter++;}
        if(count == 9 && answers[count].equals( "B")){b2Counter++;}
        if(count == 13 && answers[count].equals( "B")){b2Counter++;}
        if(count == 17 && answers[count].equals( "B")){b2Counter++;}
    }
    private void markAllA3(int count){
        if(count == 2 && answers[count].equals( "A")){a3Counter++;}
        if(count == 6 && answers[count].equals( "A")){a3Counter++;}
        if(count == 10 && answers[count].equals( "A")){a3Counter++;}
        if(count == 14 && answers[count].equals( "A")){a3Counter++;}
        if(count == 18 && answers[count].equals( "A")){a3Counter++;}
    }
    private void markAllB3(int count){
        if(count == 2 && answers[count].equals( "B")){b3Counter++;}
        if(count == 6 && answers[count].equals( "B")){b3Counter++;}
        if(count == 10 && answers[count].equals( "B")){b3Counter++;}
        if(count == 14 && answers[count].equals( "B")){b3Counter++;}
        if(count == 18 && answers[count].equals( "B")){b3Counter++;}
    }
    private void markAllA4(int count){
        if(count == 3 && answers[count].equals( "A")){a4Counter++;}
        if(count == 7 && answers[count].equals( "A")){a4Counter++;}
        if(count == 11 && answers[count].equals( "A")){a4Counter++;}
        if(count == 15 && answers[count].equals( "A")){b4Counter++;}
        if(count == 19 && answers[count].equals( "A")){a4Counter++;}
    }
    private void markAllB4(int count){
        if(count == 3 && answers[count].equals( "B")){b4Counter++;}
        if(count == 7 && answers[count].equals( "B")){b4Counter++;}
        if(count == 11 && answers[count].equals( "B")){b4Counter++;}
        if(count == 15 && answers[count].equals( "B")){b4Counter++;}
        if(count == 19 && answers[count].equals( "B")){b4Counter++;}
    }

    public void displayPersonalityType() {
        if (a1Counter > b1Counter)
            System.out.print("Extrovert,");
        else
            System.out.print("Introvert, ");

        if(a2Counter > b2Counter)
            System.out.print(" Sensor,");
        else
            System.out.print(" Intuitive,");
        if(a3Counter > b3Counter)
            System.out.print(" Thinker &");
        else
            System.out.print(" Feeler &");
        if(a4Counter > b4Counter)
            System.out.print(" Judger.");
        else
            System.out.print(" Perceiver.");
    }
}
