package com.fares.wikimedia.producer.Controller;

import com.fares.wikimedia.producer.Stream.WikimediaStreamConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/wikimedia")
@RequiredArgsConstructor
public class WikimediaController {
    private final WikimediaStreamConsumer streamConsumer;
    @GetMapping
    public void startPublishing(){
        streamConsumer.consumeStreamAndPublish();
    }
}
