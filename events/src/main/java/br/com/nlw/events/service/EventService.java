package br.com.nlw.events.service;

import br.com.nlw.events.repo.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @Autowired
    private EventRepo eventRepo;
}
