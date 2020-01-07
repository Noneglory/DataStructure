package althgorim.expressionevaluation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * describe: 2+4/3-2表达式求值
 *中缀表达式：2+4/3-2
 * 后缀表达式：243/+2-
 *
 *思路：先将中缀表达式变成后缀表达式，后缀表达式依次添加在栈里进行处理。
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
     * 更与操作符进行相应操作
     * int转为char类型           char result=（char）（result+‘0’）
     * char转为int类型           int result = Integer.parse(String.valueOf(result));
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
     * 将中缀表达式变成后缀表达式
     * 从头到尾读取中缀表达式的每个对象，对不同对象按不同的情况处理，
     * 步骤：
     * 1：运算数：直接输出
     * 2：左括号：压入堆栈
     * 3：右括号：将栈顶的运算符弹出并输出，知道遇到左括号出栈，但不进行输出
     * 4：运算符：若优先级大于栈顶运算符时，则把他压栈
     *            若优先级小于等于栈顶运算符时，将栈顶运算符弹出并输出，在比较新的栈顶运算符，直到该运算符大于栈顶元素符优先级为止，然后将该运算符压栈
     * 5：若个对象处理完毕，则把堆栈中存留的运算符一并输出。
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
