package dev.patika.movie.controller;

import dev.patika.movie.entity.Puan;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("puan")
public class MemberController {

    @PostMapping("/movies")
    public ResponseEntity<Puan> puanMovie(@RequestParam Long id,@RequestParam Long point,){


    }

}
