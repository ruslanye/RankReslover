package com.github.ruslanye.RankResolver.Model.Domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contest {
    private final Map<String, Contestant> contestants;
    private final Map<String, Problem> problems;
    private final Map<String, Status> statuses;

    public Contest(){
        contestants = new HashMap<>();
        problems = new HashMap<>();
        statuses = new HashMap<>();
    }

    public Contestant getContestant(String id){
        return contestants.get(id);
    }

    public void addContestant(Contestant contestant){
        contestants.put(contestant.getName(), contestant);
    }

    public void addContestants(List<Contestant> contestants){
        contestants.forEach(this::addContestant);
    }

    public Problem getProblem(String id){
        return problems.get(id);
    }

    public void addProblem(Problem problem){
        problems.put(problem.getId(), problem);
    }

    public void addProblems(List<Problem> problems){
        problems.forEach(this::addProblem);
    }

    public Status getStatus(String id){
        return statuses.get(id);
    }

    public void addStatus(Status status){
        statuses.put(status.getStatus(), status);
    }

    public void addStatuses(List<Status> statuses){
        statuses.forEach(this::addStatus);
    }
}
