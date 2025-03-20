package me.alex4386.gachon.sw14856.week03.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import me.alex4386.gachon.sw14856.week03.components.GradeStore;
import me.alex4386.gachon.sw14856.week03.models.GradeData;
import me.alex4386.gachon.sw14856.week03.models.ResponsePayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/sungjuks")
@Tag(name = "성적 (다중)", description = "성적 다중처리 관련 API 입니다")
public class MultiGradeController {

    @Autowired
    private GradeStore store;

    @GetMapping
    public ResponseEntity<ResponsePayload<GradeData[]>> list() {
        return ResponseEntity.ok(new ResponsePayload<>(true, this.store.listAll()));
    }

    @PostMapping
    public ResponseEntity<ResponsePayload> add(
            @RequestBody GradeData data
    ) {
        UUID uuid = UUID.randomUUID();

        data.id = uuid.toString();
        this.store.set(uuid.toString(), data);

        return ResponseEntity.ok(new ResponsePayload(true, uuid.toString()));
    }

    @GetMapping("/avg")
    public ResponseEntity<ResponsePayload> getAverage() {
        return ResponseEntity.ok(new ResponsePayload<>(true, this.store.getAverage()));
    }

    @GetMapping("/total")
    public ResponseEntity<ResponsePayload> getTotal() {
        return ResponseEntity.ok(new ResponsePayload<>(true, this.store.getTotal()));
    }

}
