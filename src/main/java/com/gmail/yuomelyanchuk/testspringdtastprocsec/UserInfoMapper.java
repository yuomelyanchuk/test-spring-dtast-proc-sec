package com.gmail.yuomelyanchuk.testspringdtastprocsec;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserInfoMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        UserInfo userInfo = new UserInfo();
        userInfo.setBusinessCardId(resultSet.getLong("businessCardId"));
        userInfo.setBarcode(resultSet.getString("barcode"));
        userInfo.setMemberId(resultSet.getLong("memberid"));
        userInfo.setEmail(resultSet.getString("email"));
        userInfo.setPassword(resultSet.getString("passwordHash"));
        userInfo.setName(resultSet.getString("name"));
        userInfo.setMainShoppingFilial(resultSet.getLong("mainShoppingFilial"));

        return userInfo;
    }
}
