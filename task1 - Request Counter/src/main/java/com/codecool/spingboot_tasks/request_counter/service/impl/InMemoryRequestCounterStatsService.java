package com.codecool.spingboot_tasks.request_counter.service.impl;

import com.codecool.spingboot_tasks.request_counter.model.Statistics;
import com.codecool.spingboot_tasks.request_counter.service.api.RequestCounterStatsService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
class InMemoryRequestCounterStatsService implements RequestCounterStatsService {
    /*
     * Map holding statistics of methods execution. key is method name: GET,PUT etc.
     * value is and integer number representing number of executions
     */
    private final Map<HTTPMethod, Integer> stats = new HashMap<>();

    @Override
    public void increaseCounter(HTTPMethod method) throws Exception {
        stats.put(method, stats.getOrDefault(method, 0) + 1);
        System.out.println(stats);
        //throw new RuntimeException("Not implemented");
    }

    @Override
    public List<Statistics> getStatistics() throws Exception{

        throw new RuntimeException("Not implemented");
    }
}


