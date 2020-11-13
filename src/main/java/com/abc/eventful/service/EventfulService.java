package com.abc.eventful.service;

import com.abc.eventful.model.Categories;
import com.abc.eventful.model.EventsResponse;

import java.util.List;

public interface EventfulService {
    Categories getCategories();

    EventsResponse getEvents(String location, String sortOrder);

    EventsResponse getEvents(String category, String location, String sortOrder);
}
