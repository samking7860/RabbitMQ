package com.rabbitmq.rabbitmq;

public class SimpleMessage {
    private String name;
    private String description;

    public SimpleMessage(){
        name=null;
        description=null;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public String toString() {
        return "SimpleMessage{"+
                "name='" + name + '\''+
                ", description='" + description + '\''+
                '}';
    }
}
