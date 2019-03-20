package ac.ks.bbs.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table

public class Boaed {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx; //객체 타입 Long 사용

    @Column
    private String title;

    @Column
    private String subTitle;

    @Column
    private String content;

    @Column
    @Enumerated(EnumType.STRING)
    private BoardType boardType;

    @Column
    private LocalDateTime createdDate;

    @Column
    private LocalDateTime updatedDate;

}
