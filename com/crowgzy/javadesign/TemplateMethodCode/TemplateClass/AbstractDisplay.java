package com.crowgzy.javadesign.TemplateMethodCode.TemplateClass;

/**
 * @className: AbstractDisplay
 * @author: crowgzy
 * @date: 2022/11/12
 **/
public abstract class  AbstractDisplay {

    public abstract void open();

    public abstract void close();

    public abstract void print();

    /**
     * final 可以修饰类、属性、方法和局部变量.
     *
     * 1.当不希望类被继承时,可以用final修饰。
     *
     * final class A{ } //不可被继承
     * 2.当不希望父类的某个方法被子类覆盖/重写(override)时,可以用final关键字修饰。
     *
     * public final void hi(){} //不可重写的方法
     * 3.当不希望类的的某个属性的值被修改,可以用final修饰．
     *
     * public final double NUM = 0.7; //值不能修改
     * 4.当不希望局部变量被修改，可以使用final修饰
     *
     * public void hi(){
     *     final double NUM = 0.7; //局部变量不能被修改
     * }
     */
    public final void display(){
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
