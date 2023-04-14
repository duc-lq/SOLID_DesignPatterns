package _1_solid._1_single_responsibility;

public class Pair {

    private String first;
    private String second;

    public Pair(String first, String second){
        this.first = first;
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';
    }

}
