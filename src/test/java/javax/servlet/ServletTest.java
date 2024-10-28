package javax.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
@RestController
public class ServletTest {
    public static void main(String... args) {
        SpringApplication.run(ServletTest.class, args);
    }

    @GetMapping
    public ResponseEntity<String> hi() {
        return ResponseEntity.ok("Hello, it is " + DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.now()));
    }
}
