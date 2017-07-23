package com.gmail.yuomelyanchuk.testspringdtastprocsec;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(name = "getMemberInfoByBarcode", procedureName = "get_memberinfo_by_barcode"
        ,parameters = {
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "barcode", type = String.class)
}
        ,resultClasses =UserInfo.class

)
@Data
@NoArgsConstructor
@Entity
public class UserInfo implements Serializable {
    @Id
    @Column(name="businessCardId")
    private long businessCardId;

    @Column(name="barcode")
    private String barcode;

    @Column(name="memberid")
    private long memberId;

    @Column(name="email")
    private String email;

    @Column(name="passwordHash")
    private String password;

    @Column(name="name")
    private String name;

    @Column(name="mainShoppingFilial")
    private Long mainShoppingFilial;



}