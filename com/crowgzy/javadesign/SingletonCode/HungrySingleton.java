package com.crowgzy.javadesign.SingletonCode;

/**
 * @className: Singleton
 * @author: crowgzy
 * @date: 2022/11/14
 * 饿汉式单例
 * 该模式的特点是类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了。
 *饿汉式单例在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，
 * 所以是线程安全的，可以直接用于多线程而不会出现问题。
 **/
public class HungrySingleton {
    //static范围
    //使用范围：java static关键字可以用在变量、方法、代码块和嵌套类伤。
//    静态方法与实例方法的区别：
//
//    静态方法，属于类，而不属于类的对象。
//            1）它通过类直接被调用，无需创建类的对象。
//            2）静态方法中，不能使用 this 关键字，也不能直接访问所属类的实例变量和实例方法；
//            3）静态方法中，可以直接访问所属类的静态变量和静态方法。
//            4）同this 关键字，super 关键字也与类的实例相关，静态方法中不能使用 super 关键字。
//    实例方法，可直接访问所属类的静态变量、静态方法、实例变量和实例方法。
//    静态变量与实例变量的区别如下：
//    静态方法与静态变量好处：
//
//            1. 属于类级别，无需创建对象就即可直接使用，使用方便。
//
//            2. 全局唯一，内存中唯一，静态变量可以唯一标识某些状态。
//
//            3. 类加载时候初始化，常驻在内存，调用快捷方便。
//
//    静态方法与静态变量缺点：
//
//            1. 静态方法不能调用非静态的方法和变量。
//
//            2.不能使用this和super关键字。
//
//    静态方法与静态变量适用场景：
//
//            1. 静态方法，最适合工具类中方法的定义；比如文件操作，日期处理方法等。
//
//            2.静态方法，适合入口方法定义；比如单例模式，因从外部拿不到构造函数，所以定义一个静态的方法获取对象非常有必要。
//
//            3.静态变量适合全局变量的定义；举例：用一个布尔型静态成员变量做控制标志。

//            1）静态变量
//
//    运行时，Java 虚拟机只为静态变量分配一次内存，加载类过程中完成静态变量的内存分配。
//    在类的内部，可以在任何方法内直接访问静态变量。
//    在其他类中，可以通过类名访问该类中的静态变量。
//            2）实例变量
//
//    每创建一个实例，Java 虚拟机就会为实例变量分配一次内存。
//    在类的内部，可以在非静态方法中直接访问实例变量。
//    在本类的静态方法或其他类中则需要通过类的实例对象进行访问。
//    静态变量在类中的作用如下：
//
//    静态变量可以被类的所有实例共享，因此静态变量可以作为实例之间的共享数据，增加实例之间的交互性。
//    如果类的所有实例都包含一个相同的常量属性，则可以把这个属性定义为静态常量类型，从而节省内存空间。例如，在类中定义一个静态常量 PI。

    private static HungrySingleton singleton = new HungrySingleton();

    public HungrySingleton() {
        System.out.println("生成了一个实例.");
    }
    public static HungrySingleton getInstance(){
        return singleton;
    }
}
