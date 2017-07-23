package com.gmail.yuomelyanchuk.testspringdtastprocsec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo memberByBarcode(String barcode){
        return userInfoRepository.getMemberInfoByBarcode(barcode);
    }

}

