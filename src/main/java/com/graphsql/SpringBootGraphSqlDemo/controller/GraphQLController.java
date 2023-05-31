package com.graphsql.SpringBootGraphSqlDemo.controller;

import com.graphsql.SpringBootGraphSqlDemo.service.GraphQLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

public class GraphQLController {

    private GraphQLService graphQLService;
    @Autowired
    public GraphQLController(GraphQLService graphQLService) {
        this.graphQLService = graphQLService;
    }

    @RequestMapping(value = "/graphql",method = RequestMethod.POST)
    public Object handle(@RequestBody Map<String,String> query) {
        return graphQLService.resolve(query);
    }

}
