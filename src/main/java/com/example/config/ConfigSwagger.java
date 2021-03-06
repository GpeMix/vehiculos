package com.example.config;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

/**
 * The Class ConfigSwagger.
 */
@Configuration
@EnableSwagger2
public class ConfigSwagger {
    /**
     * Posts api.
     *
     * @return the docket
     */
    @Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().paths(postPaths()).build();
    }

    /**
     * Post paths.
     *
     * @return the predicate
     */
    private static Predicate<String> postPaths() {
        @SuppressWarnings("unchecked")
        Predicate<String> or = or(regex("/vehiculos.*"));
        return or;
    }

    /**
     * Api info.
     *
     * @return the api info
     */
    private static ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("WSP-Vehiculos").description("Referencia Documentacion Servicio Vehiculos")
                .termsOfServiceUrl("http://www.gnp.com.mx").version("1.0").build();
    }
}
