package com.crowgzy.javadesign.BuilderCode;

/**
 * @className: Man
 * @author: crowgzy
 * @date: 2022/11/18
 * @apiNote 回顾经典builder的使用类，我们将builder抽象和具体实现类集成到产品中 ，
 * 将Director的功能省略，将组装逻辑转交给构建时。链式调用builder用到：
 * 产品类；
 * 产品内部类builder类；
 * 简化了经典builder，符合实际使用
 * 得失
 * 首先我们获得了：
 *
 * 不需要关系如何去构建对象的内部逻辑代码，只需要自行组装属性；
 * 解耦分离对象的构建和使用；
 * 符合开闭原则：对于扩展是开放的，但是对于修改是封闭的；
 * 优雅的构建类的方法，类似lambda语法糖；
 * 但是我们失去了：
 *
 * 参数过多，可能会形成超大的类（链式builder）；
 * 优雅往往是通过累加代码行数获得的；
 * 定制化Builder类，使得代码庞大；
 **/

public class Man {
    private final String name;
    private final String head;
    private final String hand;
    private String computer;
    private String phone;
    private String book;

    //必选构建属性
    public Man(Builder builder){
        this.name = builder.name;
        this.head = builder.head;
        this.hand = builder.hand;
    }

    public static class Builder{
        private String name;
        private String head;
        private String hand;
        private String computer;
        private String phone;
        private String book;

        public Builder(String name , String head , String hand){
            this.name = name;
            this.head = head;
            this.hand = hand;
        }

        //将属性作为步骤
        public Builder setComputer(String computer) {
            this.computer = computer;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setBook(String book) {
            this.book = book;
            return this;
        }

        //定义build方法最终返回，属性步骤后的结果
        public Man  build(){
            return new Man(this);
        }

    }

}

