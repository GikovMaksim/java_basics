public class Arithmetic {
    int value1 = 0;
    int value2 = 0;
    int result = 0;

    public Arithmetic() {

    }

    public Arithmetic(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void sum() {
        result = value1 + value2;
    }

    public void difference() {
        result = value1 - value2;
    }

    public void multiplication() {
        result = value1 * value2;
    }

    public void middleValue() {
        result = (value1 + value2)/2;
    }

    public void minValue(){
        if (value1 < value2) {
            result = value1;
        } else {
            result = value2;
        }
    }

    public void maxValue(){
        if (value1 > value2) {
            result = value1;
        } else {
            result = value2;
        }
    }

    public int getResult (){
        return result;
    }
}
