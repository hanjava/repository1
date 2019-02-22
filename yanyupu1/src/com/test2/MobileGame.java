package com.test2;

public class MobileGame extends Game {
    /*
    定义手游类（MobileGame) 继承 Game，包含空参、满参构造

       定义私有方法:void efforts() 要求输出：“晚上不睡觉玩 XXX”

       定义私有方法：void damage() 要求输出：“导致白天上课困，毕业后找不到工作”

       实现抽象方法：

       void play()  输出格式: “名称为XXX的YYY类游戏非常流行。”

       定义方法:void prepare(),依次调用efforts(),damage()

       Ps:XXX为变量name的值，YYY为type的值
     */

    public MobileGame() {
    }

    public MobileGame(String type, String name) {
        super(type, name);
    }

    @Override
    public void play() {
        System.out.println("名称为"+ this.getName() +"的" + this.getType() +"类游戏非常流行。");
    }

    private void efforts() {
        System.out.println("晚上不睡觉玩" + this.getName());
    }

    private void damage() {
        System.out.println("导致白天上课困，毕业后找不到工作");
    }

    public void prepare(){
        efforts();
        damage();
    }
}
