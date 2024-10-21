package org.jwt.graphQL.graphql.resolvers;

import graphql.kickstart.tools.GraphQLMutationResolver;
import org.jwt.graphQL.business.repositories.DbUserRepository;
import org.jwt.graphQL.models.entities.DbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class UserMutation implements GraphQLMutationResolver {

    @Autowired
    private DbUserRepository userRepository;

    public DbUser createUser(String username, String email, String password, String UF) {
        DbUser user = new DbUser();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);  // Você pode aplicar hashing aqui
        user.setUF(UF);
        user.setCreatedAt(LocalDateTime.now());

        return userRepository.save(user);
    }

}