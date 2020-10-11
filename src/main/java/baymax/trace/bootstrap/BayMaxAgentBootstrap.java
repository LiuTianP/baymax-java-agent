package baymax.trace.bootstrap;

import java.lang.instrument.Instrumentation;

/**
 * liutp
 * 2020/10/11 下午7:23
 * desc: bootstrap 启动类
 */
public class BayMaxAgentBootstrap {

    public static void premain(String args, Instrumentation instrumentation) {
        System.out.println(BayMaxAgentBootstrap.class.getName());
    }


}
