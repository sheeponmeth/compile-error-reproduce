package org.example;

import org.apache.log4j.Logger;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedOptions;
import javax.lang.model.element.TypeElement;
import java.util.Set;

@SupportedOptions({"debug", "verify"})
@SupportedAnnotationTypes({"org.example.MyAnnotation"})
public class MyAnnotationProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        org.apache.log4j.Logger logger = Logger.getLogger(MyAnnotationProcessor.class);
        logger.removeAllAppenders();
        return true;
    }
}
