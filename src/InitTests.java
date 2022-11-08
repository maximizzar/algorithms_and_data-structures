public class InitTests {
    private Integer repetitions, arraySize;
    private Long testStart;

    public InitTests(Integer repetitions, Integer arraySize) {
        setRepetitions(repetitions);
        setArraySize(arraySize);
    }

    @Override
    public String toString() {
        return "{" +
                "repetitions=" + getRepetitions() +
                ", arraySize=" + getArraySize() +
                '}';
    }

    /*
        Getter and Setter section!
     */

    public Integer getRepetitions() {return repetitions;}
    public Integer getArraySize() {return arraySize;}
    public Long getTestStart() {return testStart;}
    public void setRepetitions(Integer repetitions) {this.repetitions = repetitions;}
    public void setArraySize(Integer arraySize) {this.arraySize = arraySize;}
    public void setTestStart() {this.testStart = System.nanoTime();}
}
