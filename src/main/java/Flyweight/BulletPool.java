package Flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TF014268
 * @description 对象池
 * @since 2021/6/23 0023 17:13
 */
public class BulletPool {
    List<Bullet> bullets = new ArrayList<>();

    //内部方法
    {
        for(int i=0;i<5;i++){
            bullets.add(new Bullet());
        }
    }

    //获得对象的方法
    public Bullet getBullet(){
        for(int i=0;i<bullets.size();i++){
            Bullet b = bullets.get(i);
            if(!b.living){
                return b;
            }
        }
        return new Bullet();
    }
}
