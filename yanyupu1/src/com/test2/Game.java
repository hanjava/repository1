package com.test2;

public abstract class Game {
    /*
    定义游戏类别的抽象类(Game)，包含空参、满参构造和以下成员变量

        游戏类型type （String类型）

        游戏名称name (String类型)

        生成所有成员变量set/get方法

        抽象方法：  void play()
     */

    private String type;
    private String name;

    public Game() {
    }

    public Game(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void play();
}
