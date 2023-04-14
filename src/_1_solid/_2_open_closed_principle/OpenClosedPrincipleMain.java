package _1_solid._2_open_closed_principle;

import _1_solid._2_open_closed_principle._1_before.AlgorithmsInterviewQuestion1;
import _1_solid._2_open_closed_principle._1_before.InterviewQuestionProcessor_Before;
import _1_solid._2_open_closed_principle._2_after.FinanceInterviewQuestion2;
import _1_solid._2_open_closed_principle._2_after.InterviewQuestion2;
import _1_solid._2_open_closed_principle._2_after.InterviewQuestionProcessor_After;

public class OpenClosedPrincipleMain {

    public static void run(){

        InterviewQuestionProcessor_Before.process(new AlgorithmsInterviewQuestion1());

        InterviewQuestion2 question = new FinanceInterviewQuestion2();
        InterviewQuestionProcessor_After.process(question);

    }
}
