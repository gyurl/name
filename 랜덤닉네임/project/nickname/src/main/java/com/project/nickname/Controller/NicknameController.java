package com.project.nickname.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.nickname.Generator.NicknameGenerator;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/nickname")
public class NicknameController {

    @GetMapping("/random")
    public String getRandomNickname() {
        return NicknameGenerator.generateRandomNickname();  // 유사한 닉네임 반환
    }
}
