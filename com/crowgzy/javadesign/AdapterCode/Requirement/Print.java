package com.crowgzy.javadesign.AdapterCode.Requirement;

/**
 * @className: Print
 * @author: crowgzy
 * @date: 2022/11/11
 * @apiNote  目标接口 其中具有实现目标的方法(在本例子中即为升压与降压)
 **/
public interface Print {
    public abstract void strengthen();
    public abstract void weaken();
}
