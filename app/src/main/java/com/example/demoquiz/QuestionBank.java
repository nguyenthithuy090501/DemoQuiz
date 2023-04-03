package com.example.demoquiz;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    private static List<QuestionsList> topic1Questions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();
        //create object of QuestionList class anh pass a question along with option and answer
        final QuestionsList question1 = new QuestionsList("Hello Minh", "Hi Lan See you later"
        ,"How old are you?","Yeah", "What is this?","Hi Lan See you later");
        final QuestionsList question2 = new QuestionsList("Hello Minh", "Hi Lan See you later"
                ,"How old are you?","Yeah", "What is this?","Hi Lan See you later");
        final QuestionsList question3 = new QuestionsList("Hello Minh", "Hi Lan See you later"
                ,"How old are you?","Yeah", "What is this?","Hi Lan See you later");
        final QuestionsList question4 = new QuestionsList("Hello Minh", "Hi Lan See you later"
                ,"How old are you?","Yeah", "What is this?","Hi Lan See you later");
        final QuestionsList question5 = new QuestionsList("Hello Minh", "Hi Lan See you later"
                ,"How old are you?","Yeah", "What is this?","Hi Lan See you later");
   //add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        return questionsLists;
    }
    private static List<QuestionsList> topic2Questions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();
        //create object of QuestionList class anh pass a question along with option and answer
        final QuestionsList question1 = new QuestionsList("Hello Minh", "Hi Lan See you later"
                ,"How old are you?","Yeah", "What is this?","Hi Lan See you later");
        final QuestionsList question2 = new QuestionsList("Hello Minh", "Hi Lan See you later"
                ,"How old are you?","Yeah", "What is this?","Hi Lan See you later");
        final QuestionsList question3 = new QuestionsList("Hello Minh", "Hi Lan See you later"
                ,"How old are you?","Yeah", "What is this?","Hi Lan See you later");
        final QuestionsList question4 = new QuestionsList("Hello Minh", "Hi Lan See you later"
                ,"How old are you?","Yeah", "What is this?","Hi Lan See you later");
        final QuestionsList question5 = new QuestionsList("Hello Minh", "Hi Lan See you later"
                ,"How old are you?","Yeah", "What is this?","Hi Lan See you later");
        //add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        return questionsLists;
    }
    private static List<QuestionsList> topic3Questions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();
        //create object of QuestionList class anh pass a question along with option and answer
        final QuestionsList question1 = new QuestionsList("Hello Minh", "Hi Lan See you later"
                ,"How old are you?","Yeah", "What is this?","Hi Lan See you later");
        final QuestionsList question2 = new QuestionsList("Hello Minh", "Hi Lan See you later"
                ,"How old are you?","Yeah", "What is this?","Hi Lan See you later");
        final QuestionsList question3 = new QuestionsList("Hello Minh", "Hi Lan See you later"
                ,"How old are you?","Yeah", "What is this?","Hi Lan See you later");
        final QuestionsList question4 = new QuestionsList("Hello Minh", "Hi Lan See you later"
                ,"How old are you?","Yeah", "What is this?","Hi Lan See you later");
        final QuestionsList question5 = new QuestionsList("Hello Minh", "Hi Lan See you later"
                ,"How old are you?","Yeah", "What is this?","Hi Lan See you later");
        //add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        return questionsLists;
    }
    private static List<QuestionsList> topic4Questions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();
        //create object of QuestionList class anh pass a question along with option and answer
        final QuestionsList question1 = new QuestionsList("Hello Minh", "Hi Lan See you later"
                ,"How old are you?","Yeah", "What is this?","Hi Lan See you later");
        final QuestionsList question2 = new QuestionsList("Hello Minh", "Hi Lan See you later"
                ,"How old are you?","Yeah", "What is this?","Hi Lan See you later");
        final QuestionsList question3 = new QuestionsList("Hello Minh", "Hi Lan See you later"
                ,"How old are you?","Yeah", "What is this?","Hi Lan See you later");
        final QuestionsList question4 = new QuestionsList("Hello Minh", "Hi Lan See you later"
                ,"How old are you?","Yeah", "What is this?","Hi Lan See you later");
        final QuestionsList question5 = new QuestionsList("Hello Minh", "Hi Lan See you later"
                ,"How old are you?","Yeah", "What is this?","Hi Lan See you later");
        //add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        return questionsLists;
    }
    //chọn chủ đề để trắc nghiệm
    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "topic1":
                return topic1Questions();
            case "topic2":
                return topic2Questions();
            case "topic3":
                return topic3Questions();
            default:
                return topic4Questions();
        }
    }
}
