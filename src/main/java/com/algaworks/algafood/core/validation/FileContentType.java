package com.algaworks.algafood.core.validation;

import java.lang.annotation.Target;

import java.lang.annotation.ElementType;

import javax.validation.Payload;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_PARAMETER})
public @interface FileContentType {

	String message() default "arquivo inválido";
	
	Class<?>[] groups() default { };
	
	Class<? extends Payload>[] payload() default { };
	
	String[] allowed();
}
