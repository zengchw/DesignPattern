package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/8/30 16:37
 * 描述 美国的电脑，在国内使用需要适配器
 */
public class USPc implements USDevice {
    @Override
    public void open(Power power) {
        if (power.output() == 110) {
            System.out.println("us pc open");
        } else {
            System.err.println("us pc error");
        }
    }
}
