public class InitTests {
    private Integer repetitions, arraySize;

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
    public void setRepetitions(Integer repetitions) {this.repetitions = repetitions;}
    public void setArraySize(Integer arraySize) {this.arraySize = arraySize;}
}
