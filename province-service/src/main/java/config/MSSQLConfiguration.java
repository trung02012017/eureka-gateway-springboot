package config;

import io.r2dbc.mssql.MssqlConnectionConfiguration;
import io.r2dbc.mssql.MssqlConnectionFactory;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@Configuration
@EnableR2dbcRepositories
//@PropertySource("application.properties")
public class MSSQLConfiguration extends AbstractR2dbcConfiguration {

//    @Value("${mssql.host}")
//    private String hostname;
//
//    @Value("${mssql.port}")
//    private Integer port;
//
//    @Value("${mssql.database}")
//    private String database;
//
//    @Value("${mssql.username}")
//    private String username;
//
//    @Value("${mssql.password}")
//    private String password;

    @Override
    @Bean
    public ConnectionFactory connectionFactory(){
        MssqlConnectionFactory connectionFactory = new MssqlConnectionFactory(
                MssqlConnectionConfiguration.builder()
                        .host("188.166.250.12")
                        .port(1533)
                        .username("datlt")
                        .password("0123456a@")
                        .database("los")
                        .build()
        );
        return  connectionFactory;
    }
}

