/*
package ir.digixo.config;

import ir.digixo.product.entity.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Objects;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = {},
        //basePackageClasses = Product.class,
        entityManagerFactoryRef = "productEntityManagerFactory",
        transactionManagerRef = "productTransactionManager"
)
public class Product2DataSourceConfig {

    @Bean
    public LocalContainerEntityManagerFactoryBean product2EntityManagerFactory(
            @Qualifier("productDataSource") DataSource dataSource,
            EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(dataSource)
                .packages(Product.class)
                .build();
    }

    @Bean
    public PlatformTransactionManager product2TransactionManager(
            @Qualifier("product2EntityManagerFactory") LocalContainerEntityManagerFactoryBean product2EntityManagerFactory) {
        return new JpaTransactionManager(Objects.requireNonNull(product2EntityManagerFactory.getObject()));
    }

}
*/
