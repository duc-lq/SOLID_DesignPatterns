package _1_solid_principles._2_open_closed_principle;

import _1_solid_principles._2_open_closed_principle._1_before.AlgorithmsInterviewQuestion1;
import _1_solid_principles._2_open_closed_principle._1_before.InterviewQuestionProcessor_Before;
import _1_solid_principles._2_open_closed_principle._2_after.FinanceInterviewQuestion2;
import _1_solid_principles._2_open_closed_principle._2_after.InterviewQuestion2;
import _1_solid_principles._2_open_closed_principle._2_after.InterviewQuestionProcessor_After;

public class OpenClosedPrincipleMain {

    /*
        OPEN CLOSED PRINCIPLE

        => "Software entities should be open for extension, but closed for modification"

        - Design and writing of the code should be done in a way that new functionality should be added with minimum changes in the existing code
        - SHOULD KEEP AS MUCH EXISTING CODE UNCHANGED AS POSSIBLE
    */

    public static void run(){

        InterviewQuestionProcessor_Before.process(new AlgorithmsInterviewQuestion1());

        InterviewQuestion2 question = new FinanceInterviewQuestion2();
        InterviewQuestionProcessor_After.process(question);

    }
}
