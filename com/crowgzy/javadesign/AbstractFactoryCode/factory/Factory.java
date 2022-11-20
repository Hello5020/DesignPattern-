package com.crowgzy.javadesign.AbstractFactoryCode.factory;

/**
 * @className: Factory
 * @author: crowgzy
 * @date: 2022/11/20
 * @apiNote 表示抽象工厂类,用于制作抽象零件
 **/
public abstract class Factory {
    public static Factory getFactory(String className){
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("没有找到"+ className + "类");
        }
        return factory;
    }

    public abstract Link createLink(String caption,String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title,String author);
}
