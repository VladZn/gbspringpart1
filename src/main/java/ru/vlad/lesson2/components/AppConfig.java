package ru.vlad.lesson2.components;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"ru.vlad.lesson2.components", "ru.vlad.lesson2.components.lifecycle"})
public class AppConfig {
}
