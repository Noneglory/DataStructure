package althgorim.expressionevaluation;

/**
 * describe:≤‚ ‘¿‡
 *
 * @author leijiang
 * @date 2020/01/07
 */
public class Test {
    public static void main(String args[]){
        Calculate calculate = new Calculate() ;
        System.out.println(calculate.middleToSuffix("3+4/2-1"));
        int result = calculate.getResult("3+6/2-1*4/2");
        System.out.println(result);
    }
}
