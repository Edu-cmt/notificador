package com.javanauta.notificador.controller;

import com.javanauta.notificador.business.EmailService;
import com.javanauta.notificador.business.dto.TarefasDTO;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/email")
public class EmailController {

    private final EmailService emailService;

    @SneakyThrows
    @PostMapping
    public ResponseEntity<Void> enviaEmail(@RequestBody TarefasDTO tarefasDTO){
        emailService.enviaEmail(tarefasDTO);
        return ResponseEntity.ok().build();
    }
}
