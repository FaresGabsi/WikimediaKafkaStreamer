package com.fares.wikimedia.consumer.Consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class WikimediaConsumer {
    @KafkaListener(topics = "wikimedia-stream",groupId = "myGroup")
    public void consumeMsg(String msg){
        log.info(String.format("Consuming the message from wikimedia-stream:: %s",msg));
    }
}
