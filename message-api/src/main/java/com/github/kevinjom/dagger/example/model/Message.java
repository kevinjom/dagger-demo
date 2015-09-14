package com.github.kevinjom.dagger.example.model;

public class Message {
    private String consumerId;
    private String body;
    private String type;

    public String getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(String consumerId) {
        this.consumerId = consumerId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Message{" +
                "body='" + body + '\'' +
                '}';
    }

    public void setType(String type) {
        this.type = type;
    }
}
