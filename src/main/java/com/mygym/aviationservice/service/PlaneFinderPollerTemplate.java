package com.mygym.aviationservice.service;

import com.mygym.aviationservice.persistance.entity.Aircraft;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@EnableScheduling
@Component
@RequiredArgsConstructor
public class PlaneFinderPollerTemplate {

//    private WebClient client = WebClient.create("http://localhost:7634/aircraft");
//
//    private final RedisConnectionFactory connectionFactory;
//    private final RedisOperations<String, Aircraft> redisOperations;
//
//    @Scheduled(fixedRate = 1000)
//    private void pullPlanes() {
//        connectionFactory.getConnection().serverCommands().flushDb();
//
//        client.get()
//                .retrieve()
//                .bodyToFlux(Aircraft.class)
//                .filter(plane -> !plane.getReg().isEmpty())
//                .toStream()
//                .forEach(ac -> redisOperations.opsForValue().set(ac.getReg(), ac));
//
//        redisOperations.opsForValue()
//                .getOperations()
//                .keys("*")
//                .forEach(ac -> System.out.println(redisOperations.opsForValue().get(ac)));
//    }

}
