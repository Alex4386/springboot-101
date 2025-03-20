package me.alex4386.gachon.sw14856.week03.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import me.alex4386.gachon.sw14856.week03.components.GradeStore;
import me.alex4386.gachon.sw14856.week03.models.GradeData;
import me.alex4386.gachon.sw14856.week03.models.ResponsePayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sungjuks/{id}")
@Tag(name = "성적 (다중)", description = "성적 다중처리 관련 API 입니다")
public class MultiGradeActionController {

    @Autowired
    private GradeStore store;

    @GetMapping
    public ResponseEntity<ResponsePayload> get(
            @PathVariable String id
    ) {
        GradeData data = this.store.get(id);
        if (data == null) {
            return ResponseEntity.status(404).body(new ResponsePayload(false, "성적 정보 조회에 실패했습니다."));
        }

        return ResponseEntity.ok(new ResponsePayload(true, data));
    }

    @PutMapping
    public ResponseEntity<ResponsePayload> update(
            @PathVariable String id,
            @RequestBody GradeData data
    ) {
        if (!this.store.exists(id)) {
            return ResponseEntity.status(404).body(new ResponsePayload(false, "성적 정보 조회에 실패했습니다."));
        }

        this.store.set(id, data);
        return ResponseEntity.ok(new ResponsePayload(true, "성적 정보 갱신에 성공했습니다."));
    }

    @GetMapping("/avg")
    public ResponseEntity<ResponsePayload> getAverage(
            @PathVariable String id
    ) {
        GradeData data = this.store.get(id);
        if (data == null) {
            return ResponseEntity.status(404).body(new ResponsePayload(false, "성적 정보 조회에 실패했습니다."));
        }

        return ResponseEntity.ok(new ResponsePayload(true, data.getAverage()));
    }

    @GetMapping("/total")
    public ResponseEntity<ResponsePayload> getTotal(
            @PathVariable String id
    ) {
        GradeData data = this.store.get(id);
        if (data == null) {
            return ResponseEntity.status(404).body(new ResponsePayload(false, "성적 정보 조회에 실패했습니다."));
        }

        return ResponseEntity.ok(new ResponsePayload(true, data.getTotal()));
    }

    @DeleteMapping
    public ResponseEntity<ResponsePayload> delete(
            @PathVariable String id
    ) {
        if (!this.store.exists(id)) {
            return ResponseEntity.status(404).body(new ResponsePayload(false, "성적 정보 조회에 실패했습니다."));
        }

        this.store.remove(id);
        return ResponseEntity.ok(new ResponsePayload(true, "성적 정보 삭제에 성공했습니다."));
    }
}
