package com.example.demo.controller;

import com.example.demo.service.FKDirectorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/fkDirector")
public class FKDirectorController {
    private final FKDirectorService fkDirectorService;

    //get all movie on a director
    @GetMapping("/movie/{directorId}")
    public ResponseEntity<?> getMovieOnDirector(@PathVariable int directorId){
        return new ResponseEntity<>(fkDirectorService.getMovieDetailByDirectorId(directorId), HttpStatus.OK);
    }


    //get all director on a movie
    @GetMapping("/director/{movieId}")
    public ResponseEntity<?> getDirectorOnMovie(@PathVariable int movieId){
        return new ResponseEntity<>(fkDirectorService.getDirectorByMovieId(movieId), HttpStatus.OK);
    }
}
