package com.test2;

public class Test {
    public static void main(String[] args) {
        /*
          创建类型为“竞技”，名称为“王者荣耀”的手游类(MobileGame)对象 ，
          实现要求：依次调用play方法和prepare方法。;
        */
        Game game = new MobileGame("竞技","王者荣耀");
        game.play();
        if(game instanceof MobileGame){
            MobileGame mobileGame = (MobileGame) game;
            mobileGame.prepare();
        }
    }
}
