package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/27 12:16
 * 版本 1.0.0
 * 描述 TODO
 */
public class AObserver extends Observer{

    public AObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("AObserver received");
    }
}
