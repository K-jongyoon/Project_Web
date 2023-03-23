package WebCock.Project_Web.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name="member_id")
    private Long id;                // id

    private String name;            // 회원명

    private String member_pw;       // 패스워드

    private String member_phone;      // 전화번호

    private String member_email;    // 이메일

    @OneToMany(mappedBy="member")
    private List<Board> board = new ArrayList<>();
}
