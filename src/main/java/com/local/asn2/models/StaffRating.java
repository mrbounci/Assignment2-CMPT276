package com.local.asn2.models;

import jakarta.persistence.*;


@Entity
@Table(name="staff_rating")
public class StaffRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int uid;
    private String name;
    private String email;
    private RoleType roleType;
    private int clarity;
    private int niceness;
    private int knowledgeableScore;
    private String comment;

    public StaffRating() {
    }

    public StaffRating(String name, String email, RoleType roleType, int clarity, int niceness,
            int knowledgeableScore, String comment) {
        this.name = name;
        this.email = email;
        this.roleType = roleType;
        this.clarity = clarity;
        this.niceness = niceness;
        this.knowledgeableScore = knowledgeableScore;
        this.comment = comment;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public RoleType getRoleType() { return roleType; }
    public int getClarity() { return clarity; }
    public int getNiceness() { return niceness; }
    public int getKnowledgeableScore() { return knowledgeableScore; }
    public String getComment() { return comment; }
    public int getUid() { return uid; }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public void setClarity(int clarity) {
        this.clarity = clarity;
    }

    public void setNiceness(int niceness) {
        this.niceness = niceness;
    }

    public void setKnowledgeableScore(int knowledgeableScore) {
        this.knowledgeableScore = knowledgeableScore;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}