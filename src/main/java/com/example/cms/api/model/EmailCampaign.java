package com.example.cms.api.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class EmailCampaign {
    @Id
    private String campaignId;
    private String title;
    private String content;
    private String targetSegment;
    private String status;
    private String createdAt;

    private EmailCampaign() {
        // Default constructor
    }
}
