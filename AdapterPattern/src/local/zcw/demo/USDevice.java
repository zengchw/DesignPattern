package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/8/30 16:35
 * 描述 美国的设备，都有一个开机操作，需要电源
 */
public interface USDevice {
    
    void open(Power power);
}
