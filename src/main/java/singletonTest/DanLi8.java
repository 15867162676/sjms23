package singletonTest;
/**
 * 实现了单例
 * 还没有多线程访问的问题
 * 还可以防止反序列化（反射创建类的实例）
 *
 * 这种方法是Java的作者提供的
 * Effective Java 作者 Josh Bloch 提倡的方式
 * 它不仅能避免多线程同步问题，而且还自动支持序列化机制，
 * 防止反序列化重新创建新的对象，绝对防止多次实例化。
 * 不过，由于 JDK1.5 之后才加入 enum 特性，
 * 用这种方式写不免让人感觉生疏，在实际工作中，也很少用。
 * */
public enum DanLi8 {
    INSTANCE;

    /**
     *之所以没有反射创建实例的问题，是因为枚举没有构造方法
     * 但是经典用法饿汉式已经满足大家需求，
     * 如果真的有人创建多个实例，一定是破坏性攻击
     * */

    public void m(){}  //方法

    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            new Thread(() -> {
                System.out.println(DanLi8.INSTANCE.hashCode());
            }).start();
        }
    }
}
