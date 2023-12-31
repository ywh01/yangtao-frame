package yangtao.love.common.web.threadpool.impl;

import yangtao.love.common.web.threadpool.ThreadPoolTaskDecorator;
import yangtao.love.common.web.trace.TraceIdContext;
import org.apache.commons.lang3.StringUtils;

/**
 * @author: Henrik.Zhou
 * @date: 2023/7/20 13:01
 */
public class TraceIdTaskDecorator implements ThreadPoolTaskDecorator {
    @Override
    public Runnable decorator(Runnable runnable) {
        String traceId = TraceIdContext.getTraceId();
        return () -> {
            if (StringUtils.isNotBlank(traceId)) {
                try {
                    TraceIdContext.setTraceId(traceId);
                    runnable.run();
                } finally {
                    TraceIdContext.clearTraceId();
                }
            } else {
                runnable.run();
            }
        };
    }
}
