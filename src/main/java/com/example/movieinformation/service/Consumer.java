package com.example.movieinformation.service;

import com.example.movieinformation.model.Rating;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "movie_rating", groupId = "rating")
    public void consume(Rating rating) {
        System.out.println("consumed rating: " + rating );

    }
}
