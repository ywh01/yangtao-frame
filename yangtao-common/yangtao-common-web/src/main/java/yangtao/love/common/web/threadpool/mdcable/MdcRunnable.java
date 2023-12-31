package yangtao.love.common.web.threadpool.mdcable;

import yangtao.love.common.web.trace.TraceIdContext;

/**
 * @author: Henrik.Zhou
 * @date: 2023/7/20 15:45
 */
public class MdcRunnable extends MdcAbstract implements Runnable{

    private Runnable runnable;
    public MdcRunnable(Runnable runnable) {
        traceId = TraceIdContext.getTraceId();
        this.runnable = runnable;
    }

    @Override
    public void run() {
        beforeRun();
        runnable.run();
        afterRun();
    }
}
