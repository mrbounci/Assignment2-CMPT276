package com.local.asn2.models;

public class StaffRating {
    public int id;
    private String name;
    private String email;
    private RoleType roleType;
    private int clarity;
    private int niceness;
    private int knowledgeableScore;
    private String comment;

    public StaffRating(int id, String name, String email, RoleType roleType, int clarity, int niceness,
            int knowledgeableScore, String comment) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.roleType = roleType;
        this.clarity = clarity;
        this.niceness = niceness;
        this.knowledgeableScore = knowledgeableScore;
        this.comment = comment;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public RoleType getRoleType() { return roleType; }
    public int getClarity() { return clarity; }
    public int getNiceness() { return niceness; }
    public int getKnowledgeableScore() { return knowledgeableScore; }
    public String getComment() { return comment; }
}