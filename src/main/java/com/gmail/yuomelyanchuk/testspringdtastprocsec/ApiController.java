package com.gmail.yuomelyanchuk.testspringdtastprocsec;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    final UserInfoRepository userInfoRepository;

    public ApiController(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    @GetMapping("/member")
    public UserInfo getVisits() {
        return userInfoRepository.getMemberInfoByBarcode("0000000000001");
    }
}