package com.example.client.schedule

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class Scheduler {
    var logger: Logger = LoggerFactory.getLogger(Scheduler::class.java)

    @Scheduled(fixedDelay = 2000)
    fun getInfo() {
        logger.info("An INFO Message")
    }

    @Scheduled(cron = "1 */1 * * * *")
    fun getError() {
        logger.error("An ERROR Message")
    }
}