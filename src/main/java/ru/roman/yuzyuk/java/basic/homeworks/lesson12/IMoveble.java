package ru.roman.yuzyuk.java.basic.homeworks.lesson12;

import ru.roman.yuzyuk.java.basic.homeworks.lesson12.terrain.Terrain;

public interface IMoveble {
    public boolean move(Terrain terrain);
    public boolean canMove();
}
