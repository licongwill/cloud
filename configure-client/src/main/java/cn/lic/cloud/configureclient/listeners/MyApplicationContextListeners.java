package cn.lic.cloud.configureclient.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author licong
 * @version 1.0
 * @date 2020/7/6 17:52
 */
/*@Component*/
public class MyApplicationContextListeners implements ApplicationListener<ContextRefreshedEvent> {
    private static final Logger logger = LoggerFactory.getLogger(MyApplicationContextListeners.class);
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        ApplicationContext applicationContext = contextRefreshedEvent.getApplicationContext();
        logger.info("applicationContext is {}",applicationContext.getApplicationName());
    }

    @EventListener(classes = {ApplicationEvent.class})
    public void listen(ApplicationEvent applicationEvent){
        Object source = applicationEvent.getSource();
        logger.info("source is {}",source);
    }
}
