package com.ohgiraffers.section01.aop;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)  // proxyTargetClass -> LoggingAspect에서 execution(* com.ohgiraffers.section01.aop.*Service.*(..)) 를 뜻함
public class ContextConfiguration {
}
