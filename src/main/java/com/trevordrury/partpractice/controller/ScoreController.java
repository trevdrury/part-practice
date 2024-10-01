package com.trevordrury.partpractice.controller;

import com.trevordrury.partpractice.entities.Score;
import com.trevordrury.partpractice.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScoreController {

    @Autowired
    ScoreRepository scoreRepository;

    @GetMapping("/scores")
    public List<Score> getAllScores() {
        return scoreRepository.findAll();
    }

    @PostMapping("/scores")
    public Score createScore(@RequestBody Score score) {
        return scoreRepository.save(score);
    }
}
