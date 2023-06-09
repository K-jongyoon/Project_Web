package WebCock.Project_Web.domain;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter @Setter
public class Board{

    @Id @GeneratedValue
    @Column(name="board_id")
    private Long id;

    @ManyToOne(fetch= LAZY)
    @JoinColumn(name="member_id")
    private Member member;

    @JoinColumn(name="member_name")
    private String board_name;

    private String board_number;



}
