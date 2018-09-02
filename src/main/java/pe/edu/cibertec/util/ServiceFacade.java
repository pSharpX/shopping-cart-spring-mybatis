package pe.edu.cibertec.util;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Retention(RetentionPolicy.RUNTIME)
public @interface ServiceFacade {

}
