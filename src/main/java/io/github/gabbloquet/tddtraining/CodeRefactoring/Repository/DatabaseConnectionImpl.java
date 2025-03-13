package io.github.gabbloquet.tddtraining.CodeRefactoring.Repository;

import org.springframework.stereotype.Service;

@Service
public class DatabaseConnectionImpl implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to database...");
    }
}
