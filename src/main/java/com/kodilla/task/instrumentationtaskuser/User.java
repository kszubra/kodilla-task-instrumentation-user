package com.kodilla.task.instrumentationtaskuser;

import java.time.LocalDateTime;

public class User {

    void doSomething() {
        System.out.printf("[%s] User is doing something", LocalDateTime.now().toString());
    }
}
