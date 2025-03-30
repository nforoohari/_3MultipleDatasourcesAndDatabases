package ir.digixo.config;

import com.zaxxer.hikari.HikariDataSource;
import ir.digixo.employee.entity.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "employeeEntityManagerFactory",
        transactionManagerRef = "employeeTransactionManager",
        basePackages = {"ir.digixo.employee"})
public class EmployeeDatasourceConfig {
    @Bean(name = "employeeDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.employee")
    public DataSourceProperties employeeDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean(name = "employeeDataSource")
    public DataSource employeeDataSource() {
        return employeeDataSourceProperties().initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }


    @Bean(name = "employeeEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean employeeEntityManagerFactory(EntityManagerFactoryBuilder builder) {

        HashMap<String, String> employeeJpaProperties = new HashMap<>();
        employeeJpaProperties.put("hibernate.hbm2ddl.auto", "create");
      //  employeeJpaProperties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        employeeJpaProperties.put("show-sql", "true");
        employeeJpaProperties.put("hibernate.format_sql", "true");
        return builder
                .dataSource(employeeDataSource()).packages(Employee.class)
                .persistenceUnit("employeeDataSource")
                .properties(employeeJpaProperties).build();
    }

    @Bean(name = "employeeTransactionManager")
    public PlatformTransactionManager employeeTransactionManager(
            @Qualifier("employeeEntityManagerFactory") EntityManagerFactory employeeEntityManagerFactory) {
        return new JpaTransactionManager(employeeEntityManagerFactory);
    }

}
