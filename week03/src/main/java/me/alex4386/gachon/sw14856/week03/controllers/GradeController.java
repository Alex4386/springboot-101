package me.alex4386.gachon.sw14856.week03.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import me.alex4386.gachon.sw14856.week03.models.GradeData;
import me.alex4386.gachon.sw14856.week03.models.ResponsePayload;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sungjuk")
@Tag(name = "성적", description = "성적 처리 관련 API 입니다")
public class GradeController {
    GradeData data = new GradeData();

    @GetMapping
    public ResponseEntity<ResponsePayload> get() {
        return ResponseEntity.ok(new ResponsePayload(true, this.data));
    }

    @PostMapping
    public ResponseEntity<ResponsePayload> setup(
            @RequestBody GradeData data
    ) {
        this.data.transferData(data);
        return ResponseEntity.ok(new ResponsePayload(true, "Grades are set!"));
    }

    @GetMapping("/avg")
    public ResponseEntity<ResponsePayload> getAverage() {
        return ResponseEntity.ok(new ResponsePayload(true, this.data.getAverage()));
    }

    @GetMapping("/total")
    public ResponseEntity<ResponsePayload> getTotal() {
        return ResponseEntity.ok(new ResponsePayload(true, this.data.getTotal()));
    }
}
