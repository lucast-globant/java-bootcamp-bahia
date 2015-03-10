package topic8.highSchoolSpring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import topic8.highSchoolSpring.core.TemplatePackage;
import topic8.highSchoolSpring.repositories.RepositoryPackage;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackageClasses=RepositoryPackage.class)
@ComponentScan(basePackageClasses=TemplatePackage.class)
public class SpringMongoConfig extends AbstractMongoConfiguration {

	@Override
	public String getDatabaseName() {
		return "HighSchool";
	}

	@Override
	@Bean
	public Mongo mongo() throws Exception {
		return new MongoClient("127.0.0.1", 27017);
	}
	
	@Override
    protected String getMappingBasePackage() {
        return "topic8.highSchoolSpring.model";
    }

	@Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), getDatabaseName());
    }
}
