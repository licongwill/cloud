package cn.lic.cloud.configureclient.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.serviceregistry.ServiceRegistry;
import org.springframework.context.annotation.Configuration;

/**
 * @author licong
 * @version 1.0
 * @date 2020/7/8 17:26
 */
@Configuration
@EnableDiscoveryClient(autoRegister = false)
public class MyConfiguration {

    private ServiceRegistry serviceRegistry;

    public void register(){

    }
}
