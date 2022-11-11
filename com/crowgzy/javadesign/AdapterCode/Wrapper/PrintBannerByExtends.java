package com.crowgzy.javadesign.AdapterCode.Wrapper;

import com.crowgzy.javadesign.AdapterCode.Reality.Banner;
import com.crowgzy.javadesign.AdapterCode.Requirement.Print;

/**
 * @className: PrintBanner
 * @author: crowgzy
 * @date: 2022/11/11
 * @apiNote 适配器 OR 转换器(包装){此为类适配器模式(使用继承)}
 **/
public class PrintBannerByExtends extends Banner implements Print {

    @Override
    public void strengthen() {
            changeStrong();
    }

    @Override
    public void weaken() {
        changeWeak();
    }
}
