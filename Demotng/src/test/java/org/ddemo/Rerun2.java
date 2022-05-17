package org.ddemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class Rerun2 implements IAnnotationTransformer {

	public void transform(ITestAnnotation a, Class testclass, Constructor testConstructor, Method testMethod)
		 {
		IRetryAnalyzer d=a.getRetryAnalyzer();
		if(d==null) {
			a.setRetryAnalyzer(Rerun.class);
		}
		
	}

}
