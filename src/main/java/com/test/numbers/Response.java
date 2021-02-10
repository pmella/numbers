package com.test.numbers;

public class Response {

    private String path;

    private Long executionTime;


    public Response(String path, Long executionTime){
        this.path = path;
        this.executionTime = executionTime;
    }

    public String getPath() {
        return path;
    }

    public Long getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Long executionTime) {
        this.executionTime = executionTime;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
}
