package althgorim.expressionevaluation;

import java.util.Arrays;
import java.util.List;

/**
 * describe:
 *
 * @author leijiang
 * @date 2020/01/07
 */
public enum Operation {
    MUl('*',4),
    DIV('/',4),
    SUB('-',2),
    ADD('+',2);
    private char operate;
    private int level;

    Operation(char operate, int level) {
        this.operate = operate;
        this.level = level;
    }

    /**
     * ͨ���ַ�����ȡ��Ӧ��Operaiton����
     * @param character
     * @return
     */
    public static Operation which(char character)
    {
        for(Operation ope :Operation.values()){
            if(ope.operate==character){
                return ope;
            }
        }
        return null;
    }

    /**
     * ��ȡ��Ӧ�ַ������ȼ�
     * @param character
     * @return
     */
    public static int  getLevel(char character){
        for(Operation ope:Operation.values()){
            if(ope.operate==character){
                return  ope.level;
            }
        }
        return 0;
    }

    /**
     * ��ȡö���б�
     * @return
     */
    public static List<Operation> effects(){
        return Arrays.asList(MUl,DIV,SUB,ADD);
    }


}
