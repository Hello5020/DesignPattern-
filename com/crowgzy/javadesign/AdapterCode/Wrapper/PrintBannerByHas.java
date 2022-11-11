package com.crowgzy.javadesign.AdapterCode.Wrapper;

import com.crowgzy.javadesign.AdapterCode.Reality.Banner;
import com.crowgzy.javadesign.AdapterCode.Requirement.Print;

/**
 * @className: PrintBannerByHas
 * @author: crowgzy
 * @date: 2022/11/11
 * @apiNote 适配器 OR 转换器(装包){此为对象适配器模式(使用委托)}
 **/
public class PrintBannerByHas implements Print {

    private Banner banner = new Banner();

    @Override
    public void strengthen() {
        banner.changeStrong();
    }

    @Override
    public void weaken() {
        banner.changeWeak();
    }
}
