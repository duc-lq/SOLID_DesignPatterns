package _1_solid_principles._2_open_closed_principle._1_before;

public class InterviewQuestionProcessor_Before {

    public static void process(InterviewQuestion1 question){
        if(question instanceof AlgorithmsInterviewQuestion1){
            AlgorithmsInterviewQuestion1 algorithms = (AlgorithmsInterviewQuestion1) question;
            algorithms.executeAlgorithms();
        }else if(question instanceof ComputerScienceInterviewQuestion1){
            ComputerScienceInterviewQuestion1 cs = (ComputerScienceInterviewQuestion1) question;
            cs.executeComputerScience();
        }else if(question instanceof FinanceInterviewQuestion1){
            FinanceInterviewQuestion1 finance = (FinanceInterviewQuestion1) question;
            finance.executeFinance();
        }
    }
}
