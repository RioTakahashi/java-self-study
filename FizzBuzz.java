/**
 * FizzBuzz on Java
 */
public class FizzBuzz {
    /**
     * FizzBuzzのlogic部分
     * @param numEval 評価回数
     */
    public void logic(int numEval) {
        String out = "";
        for (int i = 1; i <= numEval; i++) {
            if (i % 3 == 0) {
                out = "Fizz";
            }
            if (i % 5 == 0) {
                out += "Buzz";
            }
            if (out == "") {
                out = String.valueOf(i);
            }
            System.out.println(out);
            out = "";
        }
    }
    /**
     * 出力用
     */
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.logic(/* numEval = */ 100);
    }
}
