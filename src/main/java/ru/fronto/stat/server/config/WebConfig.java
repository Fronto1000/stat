package ru.fronto.stat.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Alex on 08.03.2018.
 */

@Configuration
@EnableWebMvc
@ComponentScan("ru.fronto.stat.server")
public class WebConfig extends WebMvcConfigurerAdapter {
}
