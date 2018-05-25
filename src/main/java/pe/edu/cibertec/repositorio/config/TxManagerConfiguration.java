package pe.edu.cibertec.repositorio.config;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class TxManagerConfiguration {

    @Value("${database.driver}")
    private String dbDriver;
    @Value("${database.url}")
    private String dbUrl;
    @Value("${database.username}")
    private String dbUser;
    @Value("${database.password}")
    private String dbPassword;
    
    @Value("classpath:mybatis-config.xml")
    private Resource mybatisConfiguration;

    @Bean
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(dbDriver);
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(dbUser);
        dataSource.setPassword(dbPassword);
        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        ssfb.setDataSource(dataSource);
        ssfb.setConfigLocation(mybatisConfiguration);
        return ssfb.getObject();
    }
    
    @Bean
    @Scope("prototype")
    public SqlSession sqlSession(SqlSessionFactory sqlSessionFactory){
        return sqlSessionFactory.openSession();
    }

    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
