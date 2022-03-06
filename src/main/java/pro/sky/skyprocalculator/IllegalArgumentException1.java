package pro.sky.skyprocalculator;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class IllegalArgumentException1 extends RuntimeException {

    public IllegalArgumentException1() {
        super();
    }
}
