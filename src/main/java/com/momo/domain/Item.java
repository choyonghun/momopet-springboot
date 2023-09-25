package com.momo.domain;

import com.momo.domain.member.Member;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member sitter;

    @Column(nullable = false)
    private int price; // 하루 일당

    private String introduction; //시터의 자기소개

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private String dog;
    private String cat;

    private String nickname;




}
