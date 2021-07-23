package strategyTest;

public class JiSuan {
    private BiJiao biJiao;

    public JiSuan(BiJiao biJiao){
        this.biJiao = biJiao;
    }

    //计算
    public void heXin(){
        biJiao.biMethod();
    }
}
