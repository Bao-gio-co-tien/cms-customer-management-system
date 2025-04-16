package com.example.cms.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class EmailCampaign {
    @Id
    private String id;
    private String title;
    private String content;
    private String targetSegment;
    private String status;
    private String createdAt;
    private LocalDateTime scheduledAt;
    private int openCount;
    private int clickCount;
    private int bounceCount;
    private int sendCount;
}
