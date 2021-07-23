package ChainOfResponsipility.Demo2;

/**
 * @author TF014268
 * @description msg页面传输字符串
 * @since 2021/7/14 0014 17:09
 */
public class Msg {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
