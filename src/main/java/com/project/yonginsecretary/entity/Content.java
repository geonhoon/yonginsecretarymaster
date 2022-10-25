package com.project.yonginsecretary.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "content_id")

    private Long id;
    private String title;
    private String uploadDate;
    private String texts;
    // 1: 공지사항   2: 자유게시판
    private int category;
    private Integer likeCount;

    @OneToMany(mappedBy = "content", cascade = CascadeType.ALL) // 상위 엔터티에서 하위 엔터티로 모든 작업을 전파
    private List<UploadFile> imageFiles = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY) //지연 입력
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "content", cascade = CascadeType.ALL)
    private List<UserLike> userLikes = new ArrayList<>();

    public void setUser(User user) {
        this.user = user;
        user.getContents().add(this);
    }
}