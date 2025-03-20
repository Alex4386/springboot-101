package gcu.wa.calculator;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
@Tag(name = "계산기 (1)", description = "계산기 예제 API 1번 입니다")
public class CalculatorController {

    @PostMapping("/add")
    public ResponseEntity<Integer> add(
            @RequestBody Number number
    ) {
        return ResponseEntity.ok(number.getFirstNumber() + number.getSecondNumber());
    }

    @PostMapping("/subtract")
    public ResponseEntity<Integer> subtract(
            @RequestBody Number number
    ) {
        return ResponseEntity.ok(number.getFirstNumber() - number.getSecondNumber());
    }

    @PostMapping("/multiply")
    public ResponseEntity<Integer> multiply(
            @RequestBody Number number
    ) {
        return ResponseEntity.ok(number.getFirstNumber() * number.getSecondNumber());
    }

    @PostMapping("/divide")
    public ResponseEntity<Integer> divide(
            @RequestBody Number number
    ) {
        return ResponseEntity.ok(number.getFirstNumber() / number.getSecondNumber());
    }
}
