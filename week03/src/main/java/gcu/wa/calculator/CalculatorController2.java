package gcu.wa.calculator;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator2")
@Tag(name = "계산기 (2)", description = "계산기 예제 2번 API 입니다")
public class CalculatorController2 {

    Number myNumber = new Number();

    @PostMapping("/")
    public ResponseEntity<String> setup(
            @RequestBody Number numbers
    ) {
        myNumber.setFirstNumber(numbers.getFirstNumber());
        myNumber.setSecondNumber(numbers.getSecondNumber());
        return ResponseEntity.ok("Numbers are set!");
    }

    @GetMapping("/add")
    public ResponseEntity<Integer> add() {
        return ResponseEntity.ok(myNumber.add());
    }

    @GetMapping("/subtract")
    public ResponseEntity<Integer> subtract() {
        return ResponseEntity.ok(myNumber.subtract());
    }

    @GetMapping("/multiply")
    public ResponseEntity<Integer> multiply(
    ) {
        return ResponseEntity.ok(myNumber.multiply());
    }

    @GetMapping("/divide")
    public ResponseEntity<Double> divide(
    ) {
        return ResponseEntity.ok(myNumber.divide());
    }
}
