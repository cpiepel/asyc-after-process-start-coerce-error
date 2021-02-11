mvn spring-boot:run

Start Process
    
    curl http://localhost:8080/startProcess 

Start Process Error
    
    curl http://localhost:8080/startProcessError

Result:

Process instance is started asynchron... but

```java
    2021-02-11 14:43:10.875  WARN 26700 --- [aTaskExecutor-3] org.camunda.bpm.engine.jobexecutor       : ENGINE-14006 Exception while executing job 14a10a8a-6c6f-11eb-bf4c-02424d973839:

    org.camunda.bpm.engine.ProcessEngineException: Error while evaluating expression: ${sampleService.doSomething(belegInput)}. Cause: Cannot coerce from class de.lvm.workflow.service.to.TOInputManagementBeleg to class de.lvm.workflow.service.to.TOInputManagementBeleg
    at org.camunda.bpm.engine.impl.el.JuelExpression.getValue(JuelExpression.java:67) ~[camunda-engine-7.14.0.jar:7.14.0]
    at org.camunda.bpm.engine.impl.el.JuelExpression.getValue(JuelExpression.java:51) ~[camunda-engine-7.14.0.jar:7.14.0]
```


