package com.example.fruitapp.model;

public class Root {
    private String name;
    private String family;
    private String order;
    private String genus;
    private Nutritions nutritions;

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getFamily() { return family; }
    public void setFamily(String family) { this.family = family; }
    public String getOrder() { return order; }
    public void setOrder(String order) { this.order = order; }
    public String getGenus() { return genus; }
    public void setGenus(String genus) { this.genus = genus; }
    public Nutritions getNutritions() { return nutritions; }
    public void setNutritions(Nutritions nutritions) { this.nutritions = nutritions; }
}
