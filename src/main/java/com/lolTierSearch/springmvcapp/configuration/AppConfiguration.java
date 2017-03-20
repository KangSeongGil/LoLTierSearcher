package com.lolTierSearch.springmvcapp.configuration;

/**
 * Created by KangSeongGil on 2017. 3. 20..
 */

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.tiles2.TilesConfigurer;
import org.springframework.web.servlet.view.velocity.VelocityConfig;
import org.springframework.web.servlet.view.velocity.VelocityConfigurer;
import org.springframework.web.servlet.view.velocity.VelocityToolboxView;
import org.springframework.web.servlet.view.velocity.VelocityViewResolver;

import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "com.lolTierSearch.springmvcapp")

public class AppConfiguration implements ApplicationContextAware {
    private ApplicationContext context;

    public void setApplicationContext(ApplicationContext context)
            throws BeansException {
        this.context = context;
    }

    @Bean
    public VelocityConfig velocityConfig() {
        VelocityConfigurer cfg = new VelocityConfigurer();
        cfg.setResourceLoaderPath("/WEB-INF/views/");
        cfg.setConfigLocation(context.getResource("/WEB-INF/resource/velocity/velocity.properties"));

        Properties properties = new Properties();
        properties.setProperty("input.encoding", "UTF-8");
        properties.setProperty("output.encoding", "UTF-8");
        cfg.setVelocityProperties(properties);
        return cfg;
    }

    @Bean
    public TilesConfigurer tilesConfigurer() {
        TilesConfigurer cfg = new TilesConfigurer();
        cfg.setTilesInitializer(new VelocityTilesInitializer(velocityConfig()));
        return cfg;
    }

    @Bean
    public ViewResolver viewResolver() {
        VelocityViewResolver resolver = new VelocityViewResolver();
        resolver.setViewClass(MyVelocityToolboxView.class);
        resolver.setSuffix(".vm");
        return resolver;
    }
}