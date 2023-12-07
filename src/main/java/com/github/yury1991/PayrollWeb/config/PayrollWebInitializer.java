package com.github.yury1991.PayrollWeb.config;


import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;


import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class PayrollWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {		
		return null;
	}
	
	// Указание конфигурационного класса
	@Override
	protected Class<?>[] getServletConfigClasses() {		
		return new Class [] {PayrollConfig.class};
	}

	//Все запросы персылаются на dispatcherServlet
	@Override
	protected String[] getServletMappings() {		
		return new String [] {"/"};
	}
	
	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter filter = new CharacterEncodingFilter();
		filter.setEncoding("UTF-8");
		filter.setForceEncoding(true);
		return new Filter[] {filter};
	}	
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		//Реализация WebApplicationContext, которая принимает классы компонентов в качестве входных данных — в частности, классы @Configuration, 
		//но также и простые классы @Component.
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(PayrollConfig.class);
        context.setServletContext(servletContext);

        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");

        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);

        FilterRegistration.Dynamic filterRegistration = servletContext
                .addFilter("characterEncodingFilter", characterEncodingFilter);
        filterRegistration.addMappingForUrlPatterns(null, false, "/*");		
		registerHiddenFieldFilter(servletContext);
	}	
	
	private void registerHiddenFieldFilter(ServletContext aContext) {
		aContext.addFilter("hiddenHttpMethodFilter", 
				new HiddenHttpMethodFilter()).addMappingForUrlPatterns(null, true, "/*");
	}	
}
