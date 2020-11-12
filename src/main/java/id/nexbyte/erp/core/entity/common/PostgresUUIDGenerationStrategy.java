package id.nexbyte.erp.core.entity.common;

import org.hibernate.Session;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.UUIDGenerationStrategy;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.UUID;

public class PostgresUUIDGenerationStrategy implements UUIDGenerationStrategy {
    @Override
    public int getGeneratedVersion() {
        return 4;
    }

    @Override
    public UUID generateUUID(SharedSessionContractImplementor sharedSessionContractImplementor) {
        return ((Session) sharedSessionContractImplementor).doReturningWork(connection -> {
            try (
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(
                            "select uuid_generate_v4()"
                    );
            ) {
                if (resultSet.next()) {
                    return (UUID) resultSet.getObject(1);
                }
            }
            throw new IllegalArgumentException("Can't fetch a new UUID");
        });
    }
}
