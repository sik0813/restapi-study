package com.example.demo.events;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {
    public Page<Event> findByBasePriceBetweenAndEventStatusIs(int startBasePrice, int endBasePrice, EventStatus eventStatus, Pageable pageable);
    
}
