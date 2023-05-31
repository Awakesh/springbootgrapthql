package com.graphsql.SpringBootGraphSqlDemo.configuration;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphsql.SpringBootGraphSqlDemo.resolver.Mutation;
import com.graphsql.SpringBootGraphSqlDemo.resolver.Query;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import static com.coxautodev.graphql.tools.SchemaParser.newParser;
public class GraphQLConfiguration {
    @Autowired
    private Query query;

    @Autowired
    private Mutation mutation;

    @Bean
    public GraphQL graphQL() {
        return GraphQL.newGraphQL(graphQLSchema())
                .build();
    }

    @Bean
    public GraphQLSchema graphQLSchema() {
        return newParser()
                .file("schema.graphqls")
                .resolvers((GraphQLResolver<?>) query, (GraphQLResolver<?>) mutation)
                .build()
                .makeExecutableSchema();
    }

}
