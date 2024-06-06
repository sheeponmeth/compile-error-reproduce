step1.
```bash
cd MyAnnotationProcessor && mvn clean install
```
step2.
IntelliJ IDEA -> Build -> Build Project
```
java: java.lang.NoSuchMethodError: org.apache.log4j.Logger.removeAllAppenders()V
java.lang.RuntimeException: java.lang.NoSuchMethodError: org.apache.log4j.Logger.removeAllAppenders()V
	at com.sun.tools.javac.main.Main.compile(Main.java:553)
	at com.sun.tools.javac.api.JavacTaskImpl.doCall(JavacTaskImpl.java:129)
	at com.sun.tools.javac.api.JavacTaskImpl.call(JavacTaskImpl.java:138)
	at org.jetbrains.jps.javac.JavacMain.compile(JavacMain.java:239)
	at org.jetbrains.jps.javac.ExternalJavacProcess.compile(ExternalJavacProcess.java:189)
	at org.jetbrains.jps.javac.ExternalJavacProcess.access$400(ExternalJavacProcess.java:28)
	at org.jetbrains.jps.javac.ExternalJavacProcess$CompilationRequestsHandler$1.run(ExternalJavacProcess.java:262)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
Caused by: java.lang.NoSuchMethodError: org.apache.log4j.Logger.removeAllAppenders()V
	at org.example.MyAnnotationProcessor.process(MyAnnotationProcessor.java:18)
	at org.jetbrains.jps.javac.APIWrappers$ProcessorWrapper.process(APIWrappers.java:206)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jetbrains.jps.javac.APIWrappers$1.invoke(APIWrappers.java:362)
	at com.sun.proxy.$Proxy7.process(Unknown Source)
	at com.sun.tools.javac.processing.JavacProcessingEnvironment.callProcessor(JavacProcessingEnvironment.java:794)
	at com.sun.tools.javac.processing.JavacProcessingEnvironment.discoverAndRunProcs(JavacProcessingEnvironment.java:705)
	at com.sun.tools.javac.processing.JavacProcessingEnvironment.access$1800(JavacProcessingEnvironment.java:91)
	at com.sun.tools.javac.processing.JavacProcessingEnvironment$Round.run(JavacProcessingEnvironment.java:1035)
	at com.sun.tools.javac.processing.JavacProcessingEnvironment.doProcessing(JavacProcessingEnvironment.java:1176)
	at com.sun.tools.javac.main.JavaCompiler.processAnnotations(JavaCompiler.java:1170)
	at com.sun.tools.javac.main.JavaCompiler.compile(JavaCompiler.java:856)
	at com.sun.tools.javac.main.Main.compile(Main.java:523)
	... 9 more


```