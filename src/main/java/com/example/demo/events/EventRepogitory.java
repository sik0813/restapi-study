package com.example.demo.events;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepogitory extends JpaRepository<Event, Integer> {
}
