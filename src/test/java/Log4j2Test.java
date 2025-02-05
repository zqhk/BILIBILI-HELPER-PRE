import org.junit.Test;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Log4j2Test {

    // 打印各种级别的日志用于测试
    @Test
    public void logAll() throws Exception {
        log.trace("trace level log");
        log.debug("debug level log");
        log.info("info level log");
        log.error("error level log");
        log.fatal("fatal level log");
        // 设置休眠时间(单位ms)，控制日志打印速度
        Thread.sleep(3);
    }
}
