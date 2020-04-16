package com.hsshy.beam.listen;
import com.hsshy.beam.common.utils.RedisUtil;
import com.hsshy.beam.modular.common.service.ISysConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class StartListener implements ApplicationListener<ContextRefreshedEvent> {

    protected Logger logger = LoggerFactory.getLogger(getClass());


    @Autowired
    private ISysConfigService sysConfigService;

    @Autowired
    private RedisUtil redisUtil;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {


        logger.info("项目启动成功---------------------------------------------------");
    }
}
