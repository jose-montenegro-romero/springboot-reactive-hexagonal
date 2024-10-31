package com.example.SpringHexagonal.posts.domain.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PostCommand {
    private Long userId;
    private String body;
    private String title;
}
