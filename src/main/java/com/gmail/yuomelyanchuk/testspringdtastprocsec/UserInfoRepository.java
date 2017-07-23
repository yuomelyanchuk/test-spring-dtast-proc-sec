package com.gmail.yuomelyanchuk.testspringdtastprocsec;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserInfoRepository  {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public UserInfo getMemberInfoByBarcode(@Param("barcode") String barcode) {

        String sql = " EXEC [get_memberinfo_by_barcode] :barcode";
        MapSqlParameterSource namedParameters = new MapSqlParameterSource("barcode", barcode);
        UserInfo result = (UserInfo)jdbcTemplate.queryForObject(
                sql, namedParameters, new UserInfoMapper());

        return result;

    }

}
