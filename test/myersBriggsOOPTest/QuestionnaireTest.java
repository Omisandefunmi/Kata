package myersBriggsOOPTest;

import myersBriggsOOP.Questionnaire;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class QuestionnaireTest {

    private Questionnaire questionnaire;

    @BeforeEach
    public void alwaysStartWith() {
        questionnaire = new Questionnaire();
    }

    @Test
    public void testThatQuestionnaireExists() {
        assertNotNull(questionnaire);
    }

    @Test
    public void testThatQuestionnaireCanLoadQuestions(){
        questionnaire.loadQuestion(1, """
                A: Interpret literally
                B: Look for meaning and possibilities""");
        assertEquals(1, questionnaire.checkNumberOfQuestions());
    }

    @Test
    public void testThatQuestionnaireCanServeQuestions() {
        questionnaire.loadQuestion(1, """
                A: Expend energy, enjoy groups
                B: Conserve energy, enjoy one-on-one""");
        questionnaire.serveQuestion(1);
    }

    @Test
    public void testThatQuestionnaireCanCollectAnswers(){
        generateSampleForTest();
        questionnaire.collectAnswers(1, "b");
        assertEquals(1, questionnaire.checkNumberOfAnswers());
    }

    @Test
    public void testThatQuestionnaireCanMarkAnswers(){
        generateMoreSamples();
        questionnaire.serveQuestion(1);
        questionnaire.serveQuestion(2);
        questionnaire.serveQuestion(3);
        questionnaire.serveQuestion(4);
        questionnaire.serveQuestion(5);

        questionnaire.markAnswers();
    }

    @Test
    public void testThatQuestionnaireCanDisplayPersonalityType(){
        generateMoreSamples();
        analyzeSamples();

        questionnaire.markAnswers();
        questionnaire.displayPersonalityType();

    }

    private void analyzeSamples() {
        questionnaire.serveQuestion(1);
        questionnaire.serveQuestion(2);
        questionnaire.serveQuestion(3);
        questionnaire.serveQuestion(4);
        questionnaire.serveQuestion(5);
        questionnaire.serveQuestion(6);
        questionnaire.serveQuestion(7);
        questionnaire.serveQuestion(8);

        questionnaire.collectAnswers(1, "b");
        questionnaire.collectAnswers(2, "a");
        questionnaire.collectAnswers(3, "a");
        questionnaire.collectAnswers(4, "a");
        questionnaire.collectAnswers(5, "a");
        questionnaire.collectAnswers(6, "a");
        questionnaire.collectAnswers(7, "b");
        questionnaire.collectAnswers(8, "a");
    }

    private void generateSampleForTest() {
        questionnaire.loadQuestion(1, """
                A: Interpret literally
                B: Look for meaning and possibilities""");
        questionnaire.serveQuestion(1);
    }

    private void generateMoreSamples(){
        questionnaire.loadQuestion(1, """
                A: Interpret literally
                B: Look for meaning and possibilities""");
        questionnaire.loadQuestion(2, """
                A: Interpret literally
                B: Look for meaning and possibilities""");
        questionnaire.loadQuestion(3, """
                A: logical, thinking, questioning
                B: empathetic, feeling, accommodating""");
        questionnaire.loadQuestion(4, """
                A: organised, orderly
                B: flexible, adaptable""");
        questionnaire.loadQuestion(5, """
                A: more outgoing, think out loud
                B: more reserved, think to yourself""");
        questionnaire.loadQuestion(6, """
                A: practical, realistic, experiential
                B: imaginative, innovative, theoretical""");
        questionnaire.loadQuestion(7, """
                A: candid, straight forward, frank
                B: tactful, kind, encouraging""");
        questionnaire.loadQuestion(8, """
                A: plan, schedule
                B: unplanned, spontaneous""");
    }
}

