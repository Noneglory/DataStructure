package althgorim.expressionevaluation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * describe: 2+4/3-2���ʽ��ֵ
 *��׺���ʽ��2+4/3-2
 * ��׺���ʽ��243/+2-
 *
 *˼·���Ƚ���׺���ʽ��ɺ�׺���ʽ����׺���ʽ���������ջ����д���
 * @author leijiang
 * @date 2020/01/07
 */
public class Calculate {
    public int getResult(String expression){

        List<Character> list = middleToSuffix(expression);
        Stack<Character> characters = new Stack<Character>();
        for(int i =0;i<list.size();i++){
            if(list.get(i)>'0' && list.get(i)<'9'){
                characters.push(list.get(i));
            }else{
                doOperation(characters,list.get(i));
            }
        }
        return Integer.parseInt(String.valueOf(characters.pop()));
    }

    /**
     * ���������������Ӧ����
     * intתΪchar����           char result=��char����result+��0����
     * charתΪint����           int result = Integer.parse(String.valueOf(result));
     * @param characters
     * @param operation
     */
    private void doOperation(Stack<Character> characters, Character operation) {
        int number2 = Integer.parseInt(String.valueOf(characters.pop()));
        int number1 = Integer.parseInt(String.valueOf(characters.pop()));
        int result=0;
        switch (operation) {
            case '-':result=number1-number2;break;
            case '+':result=number1+number2;break;
            case '*':result=number1*number2;break;
            case '/':result=number1/number2;break;
        }
        char cNumber= (char) (result+'0');
        characters.push(cNumber);
    }

    /**
     * ����׺���ʽ��ɺ�׺���ʽ
     * ��ͷ��β��ȡ��׺���ʽ��ÿ�����󣬶Բ�ͬ���󰴲�ͬ���������
     * ���裺
     * 1����������ֱ�����
     * 2�������ţ�ѹ���ջ
     * 3�������ţ���ջ��������������������֪�����������ų�ջ�������������
     * 4��������������ȼ�����ջ�������ʱ�������ѹջ
     *            �����ȼ�С�ڵ���ջ�������ʱ����ջ�������������������ڱȽ��µ�ջ���������ֱ�������������ջ��Ԫ�ط����ȼ�Ϊֹ��Ȼ�󽫸������ѹջ
     * 5��������������ϣ���Ѷ�ջ�д����������һ�������
     *
     * @param expression
     * @return
     */
    public List middleToSuffix(String expression)
    {

        if(expression==null || "".equals(expression)){
            System.out.println("expresion is invalid");
            return null;
        }
        char[] chars = expression.toCharArray();
        List<Character> charactersList = new ArrayList<>();
        Stack<Character> stack = new Stack<Character>();
        for(int i =0;i<chars.length;i++){
            char number = chars[i];
            if(number > '0' && number< '9' ){
                charactersList.add(number);
            }else{
                while(true)
                {
                    if(stack.isEmpty()){
                        stack.push(number);
                        break;
                    }else{
                            char topChar = stack.pop();
                            if (Operation.getLevel(topChar) < Operation.getLevel(number)) {
                                stack.push(topChar);
                                stack.push(number);
                                break;
                            } else {
                                charactersList.add(topChar);
                            }
                        }
                    }
                }
        }

        while(!stack.isEmpty()){
            charactersList.add(stack.pop());
        }
        return  charactersList;
    }


}
