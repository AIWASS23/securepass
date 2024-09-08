package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import services.checker.PasswordCheckerService;
import services.generator.PasswordGeneratorService;
import records.checker.PasswordCheckerRequestRecord;
import records.checker.PasswordCheckerResponseRecord;
import records.generator.PasswordGeneratorResponseRecord;

@RestController
@RequestMapping("/utils")
public class UtilsController {

    @Autowired
    private PasswordCheckerService passwordCheckerService;

    @Autowired
    private PasswordGeneratorService passwordGeneratorService;

    @PostMapping("/checker")
    public ResponseEntity<PasswordCheckerResponseRecord> checkPassword(
            @RequestBody PasswordCheckerRequestRecord passwordCheckerRequestRecord) {
        return ResponseEntity.ok(passwordCheckerService.checkPassword(passwordCheckerRequestRecord));
    }

    @GetMapping("/generator")
    public ResponseEntity<PasswordGeneratorResponseRecord> generatePassword(
            @RequestParam(defaultValue = "12") int length,
            @RequestParam(defaultValue = "true") boolean uppercase,
            @RequestParam(defaultValue = "true") boolean lowercase,
            @RequestParam(defaultValue = "true") boolean numbers,
            @RequestParam(defaultValue = "true") boolean special) {
        return ResponseEntity
                .ok(passwordGeneratorService.generatePassword(length, uppercase, lowercase, numbers, special));
    }

}
