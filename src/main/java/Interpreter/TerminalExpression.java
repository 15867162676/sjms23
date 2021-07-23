package Interpreter;

/**
 * @author TF014268
 * @description 实体类1
 * @since 2021/7/20 0020 14:42
 */
public class TerminalExpression implements Expression{
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
