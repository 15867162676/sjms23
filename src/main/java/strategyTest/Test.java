package strategyTest;

public class Test {

    public static void main(String[] args) {
        JiSuan jiSuan;

        jiSuan = new JiSuan(new BiA());
        jiSuan.heXin();

        jiSuan = new JiSuan(new BiB());
        jiSuan.heXin();

        jiSuan = new JiSuan(new BiC());
        jiSuan.heXin();
    }



}
