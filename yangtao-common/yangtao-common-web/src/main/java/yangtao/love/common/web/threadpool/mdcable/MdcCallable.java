package yangtao.love.common.web.threadpool.mdcable;

import yangtao.love.common.web.trace.TraceIdContext;

import java.util.concurrent.Callable;

/**
 * @author: Henrik.Zhou
 * @date: 2023/7/20 15:45
 */
public class MdcCallable extends MdcAbstract implements Callable {

    private Callable callable;
    public MdcCallable(Callable callable) {
        traceId = TraceIdContext.getTraceId();
        this.callable = callable;
    }

    @Override
    public Object call() throws Exception {
        beforeRun();
        Object result = callable.call();
        afterRun();
        return result;
    }
}
