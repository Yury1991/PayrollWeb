package com.github.yury1991.PayrollWeb.config;

import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;


import com.mchange.v2.c3p0.ComboPooledDataSource;

// Аннотация Configuration указывает, что данный класс содержит определение компонентов. 
@Configuration
@ComponentScan("com.github.yury1991.PayrollWeb")
@EnableWebMvc
@EnableTransactionManagement
//@PropertySource("classpath:payment.properties")
public class PayrollConfig implements WebMvcConfigurer {
	
	private final ApplicationContext applicationContext;	
	
	@Autowired
	public PayrollConfig(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}	
	
// ------------------- Thymeleaf -----------------------------------------
	@Bean
	public SpringResourceTemplateResolver templateResolver(){	   
	    SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
	    templateResolver.setApplicationContext(this.applicationContext);
	    templateResolver.setPrefix("/WEB-INF/templates/");
	    templateResolver.setSuffix(".html");	   
	    templateResolver.setTemplateMode(TemplateMode.HTML);	    
	    templateResolver.setCharacterEncoding("UTF-8");
	    templateResolver.setCacheable(true);
	    return templateResolver;
	}
	
	@Bean
	public SpringTemplateEngine templateEngine(){	   
	    SpringTemplateEngine templateEngine = new SpringTemplateEngine();
	    templateEngine.setTemplateResolver(templateResolver());	  
	    templateEngine.setEnableSpringELCompiler(true);
	    return templateEngine;    
	}	
	
	 @Bean
	 public  ThymeleafViewResolver thymeleafViewResolver(){
		ThymeleafViewResolver resolver = new ThymeleafViewResolver();
	    resolver.setTemplateEngine(templateEngine());	
	    resolver.setCharacterEncoding("UTF-8");	        
	    return resolver;
	 }
	 
	 @Bean
	 public static PropertySourcesPlaceholderConfigurer properties() {
	     PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
	     configurer.setIgnoreUnresolvablePlaceholders(true);
	     configurer.setIgnoreResourceNotFound(true);
	     return configurer;
	 }
	 
	
	 
// ------------------ Hibernate -------------------------------------------------------
	 @Bean
	 public DataSource dataSource() {
			ComboPooledDataSource dataSource = new ComboPooledDataSource();				
			try {				
				dataSource.setDriverClass("org.postgresql.Driver");
				dataSource.setJdbcUrl("jdbc:postgresql://localhost:5432/payroll_db");
				dataSource.setUser("postgres");
				dataSource.setPassword("postgres");
			} catch (PropertyVetoException e) {				
				e.printStackTrace();
			}
			return dataSource;		
		}
		
		@Bean
		public LocalSessionFactoryBean sessionFactory() {
			LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
			sessionFactory.setDataSource(dataSource());
			sessionFactory.setPackagesToScan("com.github.yury1991.PayrollWeb.models");
			Properties props = new Properties();
			props.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
			props.setProperty("hibernate.show_sql", "true");
			sessionFactory.setHibernateProperties(props);
			return sessionFactory;
		}		
		
		@Bean
		public HibernateTransactionManager transactionManager() {
			HibernateTransactionManager transactionManager = new HibernateTransactionManager();
			transactionManager.setSessionFactory(sessionFactory().getObject());
			return transactionManager;
		}
		
		
		
		//Регистрация обработчиков для обслуживания статических ресурсов 
		 @Override
		    public void addResourceHandlers(ResourceHandlerRegistry registry) {
			 	registry.addResourceHandler("/css/**")
		                .addResourceLocations("/WEB-INF/css/");	
			 	registry.addResourceHandler("/resources/**")
			 			.addResourceLocations("/resources/");
		    }

// - ------------ Комментарии -----------------------		 
		 
		 // Добавление локализации 
		 /*	 @Bean
		 	 public LocaleResolver localeResolver() {
		 		 SessionLocaleResolver localeResolver = new SessionLocaleResolver();
		 		 localeResolver.setDefaultLocale(new Locale("ru"));
		 		 return localeResolver;		 
		 	 }
		 	 
		 	 @Bean
		 	  public LocaleChangeInterceptor localeChangeInterceptor() {
		 	     LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
		 	     localeChangeInterceptor.setParamName("lang");
		 	      return localeChangeInterceptor;
		 	  }

		 	  @Override
		 	  public void addInterceptors(InterceptorRegistry registry) {
		 	      registry.addInterceptor(localeChangeInterceptor());
		 	  } */
//----------------Spring REST ----------------------
/*		 public RestTemplate restTemplate() {
			 RestTemplate restTemplate = new RestTemplate();
			 return restTemplate;
		 }*/
}



