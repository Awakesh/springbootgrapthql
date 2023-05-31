package com.graphsql.SpringBootGraphSqlDemo.service;

import graphql.ExecutionResult;
import graphql.GraphQL;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class GraphQLService {

    private GraphQL graphQL;

    @Autowired
    public GraphQLService(GraphQL graphQL) {
        this.graphQL = graphQL;
    }

    public Object resolve(Map<String,String> query) {
        ExecutionResult executionResult = graphQL.execute(query.get("query"));
        return executionResult.getData();
    }
}

