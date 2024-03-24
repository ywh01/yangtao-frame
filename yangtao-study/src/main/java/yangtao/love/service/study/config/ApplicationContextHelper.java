package yangtao.love.service.study.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author net
 */
@Component("applicationContextHelper")
public class ApplicationContextHelper implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    public static <T> T popBean(String name, Class<T> clazz) {
        if (applicationContext == null) {
            return null;
        }
        return applicationContext.getBean(name, clazz);
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext = context;
    }

    public ApplicationContext getInstance() {
        return applicationContext;
    }
}
