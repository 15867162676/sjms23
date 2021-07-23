package Flyweight;

import java.util.UUID;

/**
 * @author TF014268
 * @description 享元模式
 * @since 2021/6/23 0023 16:38
 */
public class Bullet {
    public UUID id = UUID.randomUUID();
    boolean living = true;

    @Override
    public String toString() {
        return "Bullet{" +
                "id=" + id +
                ", living=" + living +
                '}';
    }
}
